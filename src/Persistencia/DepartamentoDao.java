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
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Yeni
 */
public class DepartamentoDao {
    private String nombreArchivo;
    private BufferedWriter bw;
    private BufferedReader br;

    public DepartamentoDao() {
        nombreArchivo = "departamento.txt";
    }
    
    public String insertarDepartamento(Departamento departamento){
        String mensaje="";
        try{
            bw = new BufferedWriter(new FileWriter(nombreArchivo,true));
            bw.write(departamento.getDepartamento());
            bw.newLine();
            bw.flush();
            mensaje = "El departamento se adicionó con éxito.";
        }catch(IOException ex){
            mensaje= "Error al guardar departamento."+ ex.getMessage();
        }
        return mensaje;
    }
    
    public List listarDepartamentos(){
        List<Departamento> listaDepartamentos = new ArrayList();
        Departamento departamento;
        String linea = "";
        try{
            br = new BufferedReader(new FileReader(nombreArchivo));
            linea = br.readLine();
            while(linea != null){
                departamento = convertirDepartamento(linea);
                listaDepartamentos.add(departamento);
                linea = br.readLine();
            }
            br.close();
        }catch(IOException ex){
            System.out.println("Error de lectura "+ex.getMessage());
        }
        return listaDepartamentos;
    }
    
    public void guardarDepartamento(List departamentos){
        try{
            bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for(int i=0;i<departamentos.size();i++){
                Departamento departamento= (Departamento) departamentos.get(i);
                bw.append(departamento.getDepartamento());
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            System.out.println("Error al guardar el archivo.");
        }
    }

    private Departamento convertirDepartamento(String linea) {
        Departamento departamento = new Departamento();
        StringTokenizer st = new StringTokenizer(linea,",");
        departamento.setId(Integer.parseInt(st.nextToken()));
        departamento.setNombre(st.nextToken());
        return departamento;
    }
}
   
