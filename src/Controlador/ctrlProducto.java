
package Controlador;

import Modelo.Producto;
import Vista.frmProductos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ctrlProducto implements MouseListener{
  
    //llamar a las otras capas(modelo/vista)
    
    private frmProductos vista;
    private Producto modelo;
    
    //crear el constructor de la clase 
    
    public ctrlProducto(frmProductos Vista , Producto Modelo ){
    this.vista = Vista ;
    this.modelo = Modelo;
    
    vista.btn_Guardar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==vista.btn_Guardar){
            modelo.setNombre(vista.txt_Nombre.getText());
            modelo.setPrecio(Double.parseDouble (vista.txt_Precio.getText()));
            modelo.setCategoria(vista.txt_Categoria.getText());
            
            modelo.Guardar();
        }
    }

    
    @Override
    public void mousePressed(MouseEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
