/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
//import Vista.FrmVista;
import Vista.FrmVista2;//Agregado por Gil
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.View;

public class ControladorMDB2 implements ActionListener{
  //private FrmVista _view; //para el formulario de tbusuarios     
    private FrmVista2 _view; //para el formulario de seguimiento_clientes
  private MDB _model;//el manejador de bases de datos

    
    //public ControladorMDB(FrmVista view, MDB model){
  public ControladorMDB2(FrmVista2 view, MDB model){ //para el formulario de tbusuarios     
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
        
        leyenda=_model.registrarAlta("seguimiento_clientes"," null, "+_view.textCedula.getText()+" ,' "+_view.textExpedicion.getText()+" ',' "+_view.textNombre.getText() +" ',' "+_view.TextProfesion.getText() +" ',' "+_view.TextDResidencia.getText()
                +" ',' "+_view.TextCiudad.getText() +" ',' "+_view.TextDepartamento.getText()+" ',' "+_view.TextEmail.getText() +" ', "+_view.TextTResidencia.getText() +" , "+_view.TextTTrabajo.getText() +" , "
                +_view.TextNFactura.getText() +" ,' "+_view.TextTCartera.getText()+" ',' "+_view.TextFechaM.getText() +" ', "+_view.TextDiasM.getText() +" , "+_view.TextValM.getText() +" , "+_view.TextVSeguro.getText() 
                +" , "+_view.TextInteresM.getText() +" , "+_view.TextSRestaurant.getText() +" ,' "+_view.TextTCobro.getText() +" ',' "+_view.textFAUno.getText() +" ',' "+_view.textAUno.getText() +" ',' "
                +_view.textFADos.getText() +" ',' " +_view.textADos.getText() +" ',' "+_view.textFATres.getText() +" ',' "+_view.textATres.getText() +" ',' "+_view.textFACuatro.getText()+" ',' "+_view.textACuatro.getText()+" ' ");//para el formulario de seguimiento_clientes
        
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
        }
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
    
//_view.txtNombre.setText(null); //para el formulario de tbusuarios
//_view.txtUsuario.setText(null); //para el formulario de tbusuarios
//_view.txtpsw.setText(null); //para el formulario de tbusuarios

_view.textCedula.setText(null);
_view.textExpedicion.setText(null);
_view.textNombre.setText(null);
_view.TextProfesion.setText(null);
_view.TextDResidencia.setText(null);
_view.TextCiudad.setText(null);
_view.TextDepartamento.setText(null);
_view.TextEmail.setText(null);
_view.TextTResidencia.setText(null);
_view.TextTTrabajo.setText(null);
_view.TextNFactura.setText(null);
_view.TextTCartera.setText(null);
_view.TextFechaM.setText(null);
_view.TextDiasM.setText(null);
_view.TextValM.setText(null);
_view.TextVSeguro.setText(null);
_view.TextInteresM.setText(null);
_view.TextSRestaurant.setText(null);
_view.TextTCobro.setText(null);
_view.textFAUno.setText(null);
_view.textAUno.setText(null);
_view.textFADos.setText(null);
_view.textADos.setText(null);
_view.textFATres.setText(null);
_view.textATres.setText(null);
_view.textFACuatro.setText(null);
_view.textACuatro.setText(null);
}
}
