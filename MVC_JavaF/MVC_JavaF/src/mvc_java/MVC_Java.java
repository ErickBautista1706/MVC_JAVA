/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorMDB;
import Modelo.MDB;
//import Vista.FrmVista; //para el formulario de tbusuarios 
import Vista.FrmVista2;//para el formulario de seguimiento_clientes

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        //FrmVista objVista=new FrmVista();//para el formulario de tbusuarios 
        FrmVista2 objVista=new FrmVista2();//para el formulario de seguimiento_clientes
        ControladorMDB objController;
        
      
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        
        
    }
    
}