/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilbe
 */
public class Tester2 {
    public static void main(String[] args) {        
        int i,j;        
	MDB administradorBD =  new MDB();                
	List<ArrayList<String>> datosObtenidos= new ArrayList<ArrayList<String>>();
	ArrayList<String> renglonObtenido = new ArrayList<String>();
	String leyenda;
        //insertar                
        leyenda= administradorBD.registrarAlta("seguimiento_clientes", "null, 2,'Puebla','Pedro','Licenciado','Calle1','Pachuca','12','jose@usuario',551121110,778815227,02,'Unica','2022-01-21',10,125.25,500.25,10,375.0,'Mensual','2021-01-21 18:00:00','Realizado','2021-01-31 18:00:00','Realizado','2021-02-10 18:00:00','Realizado','2021-02-21 18:00:00','Pendiente'");                
        System.out.println(leyenda);        
    }
    
}
