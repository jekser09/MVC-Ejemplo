/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

//Esta la calse que me sirev para modelar la tabla de ConsulatrEmpleadoXDeptoView

import Modelo.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class DepartamentoEmpleado extends AbstractTableModel{
    
    private List <Empleado> empleados;
    private List <String> titulos;

    public DepartamentoEmpleado(List<Empleado> empleados) {
        this.empleados = empleados;
        this.titulos = new ArrayList();
        titulos.add("Cedula");
        titulos.add("Nombre");
        titulos.add("Salario");
        titulos.add("Edad");
    }
    
    
    
    @Override
    public int getRowCount() {
        return empleados.size();
    }

    @Override
    public int getColumnCount() {
        return titulos.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado empleado = empleados.get(rowIndex);
        switch(columnIndex){
            case 0:
                return empleado.getCedula();
            case 1:
                return empleado.getNombre();
            case 2:
                return empleado.getSalario();
            case 3:
                return empleado.getEdad();
            default: 
                return null;
        }
    }
    
    public Object getValueAT(int rowIndex){
        Empleado empleado = empleados.get(rowIndex);
        return empleado;
    }
    
    @Override
    public String getColumnName(int colIndex){
        return titulos.get(colIndex);
    }
    
}
