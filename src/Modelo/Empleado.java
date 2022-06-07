/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author P201
 */
public class Empleado {
    private int id;
    private String cedula;
    private String nombre;
    private double salario;
    private int edad;
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(int id, String cedula, String nombre, double salario, int edad, Departamento departamento) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getEmpleado(){
        return id + "," + cedula + "," + nombre + "," + salario + "," + edad + "," + departamento.getId();
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    
}
