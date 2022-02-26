/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

//import Controlador.ControladorMDB;
import Controlador.ControladorMDB1;
//import Controlador.ControladorMDB2;
import Modelo.MDB;
import Vista.FrmVista1;
//import Vista.FrmVista;
//import Vista.FrmVista; //para el formulario de tbusuarios 
//import Vista.FrmVista2;//para el formulario de seguimiento_clientes

/**
 *
 * @author Stevia
 */
public class MVC_Java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista1 objVista=new FrmVista1();//para el formulario de tbusuarios 
        //FrmVista2 objVista=new FrmVista2();//para el formulario de seguimiento_clientes
        ControladorMDB1 objController;
        
      
        objController = new ControladorMDB1(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        
        
    }
    
}
