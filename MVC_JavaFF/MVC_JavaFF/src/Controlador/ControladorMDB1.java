/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Vista.FrmVista;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import Modelo.MDB;
import Vista.FrmVista1;
import java.awt.event.ActionListener;

/**
 *
 * @author hdela
 */
    public class ControladorMDB1 implements ActionListener{
  //private FrmVista _view; //para el formulario de tbusuarios     
    private FrmVista1 _view; //para el formulario de seguimiento_clientes
    private MDB _model;//el manejador de bases de datos

    
    //public ControladorMDB(FrmVista view, MDB model){
  public ControladorMDB1(FrmVista1 view, MDB model){ //para el formulario de tbusuarios     
       this._model=model;
       this._view=view;
        //this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario //para el formulario de tbusuarios 
        this._view.comandSubir.addActionListener(this); //para el formulario de seguimiento_clientes
        //this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar //para el formulario de tbusuarios 
        this._view.comandEliminar.addActionListener(this); //para el formulario de seguimiento_clientes
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql
        //if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta //para el formulario de tbusuarios 
        if (e.getSource()==_view.comandSubir){ //Si el botón presionado fue el de alta //para el formulario de seguimiento_clientes 
         // System.out.print("paso");
         
        //leyenda=_model.registrarAlta("tbusuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtUsuario.getText() +" ', "+_view.txtpsw.getText() ); //para el formulario de tbusuarios 
        
        leyenda=_model.registrarAlta("clientes",_view.jTextField1.getText()+" ,' "+_view.jTextField2.getText()+" ',' "+_view.jTextField3.getText() +" ',' "+_view.jTextField4.getText() +" ',' "+_view.jTextField5.getText()
                +" ',' "+_view.jTextField6.getText() +" ',' "+_view.jTextField7.getText()+" ',' "+_view.jTextField8.getText() +" ', "+_view.txtTelResidencial.getText() +" , "+_view.txtTelTrabajo.getText() +" , "
                +_view.txtNumFactura.getText() +" ,' "+_view.txtFechaCredito.getText()+" ',' "+_view.txtTipoCartera.getText() +" ', "+_view.txtValorCredito.getText() +" , "+_view.txtNumCuotas.getText());//para el formulario de seguimiento_clientes
        
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();
}

}
    public void iniciar(){
    _view.setTitle("MVC_Visual");
    }
    public void limpiar(){
    
    //_view.txtNombre.setText(null); 
    //_view.txtUsuario.setText(null);  
    //_view.txtpsw.setText(null);  
    
    
   _view.jTextField1.setText(null);
   _view.jTextField2.setText(null);
   _view.jTextField3.setText(null);
   _view.jTextField4.setText(null);
   _view.jTextField5.setText(null);
   _view.jTextField6.setText(null);
   _view.jTextField7.setText(null);
   _view.jTextField8.setText(null);
   _view.txtTelResidencial.setText(null);
   _view.txtTelTrabajo.setText(null);
   _view.txtNumFactura.setText(null);
   _view.txtFechaCredito.setText(null);
   _view.txtTipoCartera.setText(null);
   _view.txtValorCredito.setText(null);
   _view.txtNumCuotas.setText(null);
   

   
   

    }
    
    
    
}
