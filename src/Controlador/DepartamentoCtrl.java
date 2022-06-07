/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Departamento;
import Persistencia.DepartamentoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Yeni
 */
public class DepartamentoCtrl {
    private Departamento departamento;
    private List<Departamento> departamentos;
    private DepartamentoDao departamentoDao;
    private DefaultListModel modelo;
    
    public DepartamentoCtrl() {
        departamentos = new ArrayList();
        departamentoDao = new DepartamentoDao();
        departamentos = departamentoDao.listarDepartamentos();
        if(departamentos == null){
            departamentos = new ArrayList();
        }
    }
    
    public String crearDepartamento(int id,String nombre){
       departamento = new Departamento(id,nombre);
       String mensaje = departamentoDao.insertarDepartamento(departamento);
       return mensaje;
    }
    
    public List getDepartamentos(){
        departamentos = departamentoDao.listarDepartamentos();
        return departamentos;
    }
    
    public void adicionarDepatamento(int id,String nombre){
        departamento = new Departamento(id,nombre);
        departamentos.add(departamento);
    }
    
    public Departamento buscarDepartamento (int id){
        departamento = departamentos.get(id);
        return departamento;
    }
    
    public void eliminarDepartamento(int i){
            departamentos.remove(i);
    }
    
    public DefaultListModel getModel(){
        modelo= new DefaultListModel();
        for(int i=0; i<departamentos.size();i++){        
        modelo.addElement(departamentos.get(i));
        }
        return modelo;
    }
    
    public void guardarDepartamentos() {
        departamentoDao.guardarDepartamento(departamentos);
    }
    
    public Departamento getDepartamento(int i){
        return departamentos.get(i);
    }
    
    public void modificarDepartamento(int id,String nombre){
        departamento.setId(id);
        departamento.setNombre(nombre);
    }
    
    public DefaultComboBoxModel getModeloCombo(){
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(departamentos.toArray());
        return modeloCombo;
    }
}
