/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Empleado;
import Persistencia.EmpleadoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author P201
 */
public class EmpleadoCtrl {
    private Empleado empleado;
    private List<Empleado> empleados;
    private List <Empleado> empleadosXDepto;
    private EmpleadoDao empleadoDao;
    private DefaultListModel modelo;
    private DepartamentoEmpleado de;

    public EmpleadoCtrl() {
        empleados = new ArrayList();
        empleadoDao = new EmpleadoDao();
        empleados = empleadoDao.listarEmpleados();
        if(empleados == null){
            empleados = new ArrayList();
        }        
    }
    
    
    public String crearEmpleado(String cedula,String nombre,double salario,int edad, Departamento departamento){
       empleado = new Empleado(empleados.size()+1,cedula,nombre,salario,edad, departamento);
       String mensaje = empleadoDao.insertarEmpleado(empleado);
       return mensaje;
    }
    
    public List getEmpleados(){
        empleados = empleadoDao.listarEmpleados();
        return empleados;
    }
    
    public void adicionarEmpleado(String cedula,String nombre,double salario,int edad, Departamento departamento){
        empleado = new Empleado(empleados.size()+1,cedula,nombre,salario,edad, departamento);
        empleados.add(empleado);
    }
    
    public Empleado buscarEmpleado (String cedula){
        empleado = null;
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getCedula().equals(cedula)){
                empleado = empleados.get(i);
            }else{
                System.out.println("Empleado no encontrado.");
            }
        }
        return empleado;
    }
    
    public void eliminarEmpleado(String cedula){
        empleado = buscarEmpleado(cedula);
            if(empleado != null){
                empleados.remove(empleado);
            }
    }
    
    public DefaultListModel getModel(){
        modelo= new DefaultListModel();
        for(int i=0; i< empleados.size();i++){        
        modelo.addElement(empleados.get(i));
    }
        /*lstPersonas.setModel(modelo);
        lstPersonas.updateUI();*/
        return modelo;
    }

    public void guardarEmpleados() {
        empleadoDao.guardarEmpleado(empleados);
    }
    
    public void eliminarEmpleado(int i){
        empleados.remove(i);
    }
    
    public Empleado getEmpleado(int i){
        empleado= empleados.get(i);
        return empleado;
    }
    
    public void modificarEmpleado(int posicion,String cedula,String nombre,double salario,int edad, Departamento departamento){
        empleado = empleados.get(posicion);
        empleado.setCedula(cedula);
        empleado.setNombre(nombre);
        empleado.setSalario(salario);
        empleado.setEdad(edad);
        empleado.setDepartamento(departamento);
    }
    
    public List buscarEmpleadosXDepto(Departamento departamento){
        empleadosXDepto = new ArrayList();        
        for(Empleado empleado1: empleados){
            if(empleado1.getDepartamento().getId()==departamento.getId()){
                empleadosXDepto.add(empleado1);               
            }
        }
        return empleadosXDepto;
    }
    
    public double sumaSalarios(Departamento departamento){
        double salarios=0;
        for(Empleado empleado1: empleados){
            if(empleado1.getDepartamento().getId()==departamento.getId()){                
                salarios=salarios+empleado1.getSalario();                
            }
        }
        return salarios;       
    }
    
    public DepartamentoEmpleado getModeloTabla(Departamento departamento){
        List<Empleado> lista=buscarEmpleadosXDepto(departamento);
        de=new DepartamentoEmpleado(lista);
        return de;
    }
    
    public String getEmpleadoTabla(int row){
        empleado=(Empleado)de.getValueAT(row);
        return empleado.getEmpleado();
    }
    public Object getCampoempleadoTabla(int row, int column){
        Object campo=de.getValueAt(row, column);
        return campo;
    }
}
