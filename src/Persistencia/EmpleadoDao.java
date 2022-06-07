/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Departamento;
import Modelo.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author P201
 */
public class EmpleadoDao {
    private final String nombreArchivo;
    private Map<Integer, Departamento> departamentos;
    private BufferedWriter bw;
    private BufferedReader br;
    

    public EmpleadoDao() {
        nombreArchivo = "empleado.txt";
        departamentos = cargarDepartamentos();
    }
    
    public String insertarEmpleado(Empleado empleado){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(nombreArchivo,true));
            bw.write(empleado.getEmpleado());
            bw.newLine();
            bw.flush();
            
            mensaje = "El empleado se adicionó con éxito.";
        }catch(IOException ex){
            mensaje= "Error al guardar empleado."+ ex.getMessage();
        }
        return mensaje;
    }
    
    public List listarEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList();
        Empleado empleado;
        String linea = "";
        try{
            br = new BufferedReader(new FileReader(nombreArchivo));
            linea = br.readLine();
            while(linea != null){
                empleado = convertirEmpleado(linea);
                listaEmpleados.add(empleado);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ex){
            System.out.println("Error de lectura "+ex.getMessage());
        }
        return listaEmpleados;
    }
    
    public void guardarEmpleado(List empleados){
        try{
            bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<empleados.size();i++){
                Empleado empleado= (Empleado) empleados.get(i);
                bw.append(empleado.getEmpleado());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            System.out.println("Error al guardar el archivo"+e.getMessage());
        }
    }

    private Empleado convertirEmpleado(String linea) {
        Empleado empleado = new Empleado();
        StringTokenizer st = new StringTokenizer(linea,",");
        empleado.setId(Integer.parseInt(st.nextToken()));
        empleado.setCedula(st.nextToken());
        empleado.setNombre(st.nextToken());
        empleado.setSalario(Double.parseDouble(st.nextToken()));
        empleado.setEdad(Integer.parseInt(st.nextToken()));
        empleado.setDepartamento(departamentos.get(Integer.parseInt(st.nextToken())));
        return empleado;
    }

    private Map<Integer,Departamento> cargarDepartamentos() {
        Map<Integer,Departamento> listaDepartamentos = new HashMap();
        Departamento departamento;
        String linea = "";
        try{
            br = new BufferedReader(new FileReader("departamento.txt"));
            linea = br.readLine();
            while(linea != null){
                departamento = convertirDepartamento(linea);
                listaDepartamentos.put(departamento.getId(),departamento);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ex){
            System.out.println("Error de lectura "+ex.getMessage());
        }
        return listaDepartamentos;
    }

    private Departamento convertirDepartamento(String linea) {
        Departamento departamento = new Departamento();
        StringTokenizer st = new StringTokenizer(linea,",");
        departamento.setId(Integer.parseInt(st.nextToken()));
        departamento.setNombre(st.nextToken());
        return departamento;
    }
}
