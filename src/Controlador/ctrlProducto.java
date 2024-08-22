
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
    
    vista.jtbProductos.addMouseListener(this);
    vista.btn_eliminar.addMouseListener(this);
    modelo.Mostrar(vista.jtbProductos);
    vista.btn_Actualizar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==vista.btn_Guardar){
            modelo.setNombre(vista.txt_Nombre.getText());
            modelo.setPrecio(Double.parseDouble (vista.txt_Precio.getText()));
            modelo.setCategoria(vista.txt_Categoria.getText());
            
            modelo.Guardar();
            modelo.Mostrar(vista.jtbProductos);
            
            ClearData();
            
        }
        
        if (e.getSource()==vista.btn_eliminar){
            modelo.Eliminar(vista.jtbProductos);
            modelo.Mostrar(vista.jtbProductos);
        }
        
        if(e.getSource()==vista.jtbProductos){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource()== vista.btn_Actualizar){
            modelo.setNombre(vista.txt_Nombre.getText());
            modelo.setPrecio(Double.parseDouble(vista.txt_Precio.getText()));
            modelo.setCategoria(vista.txt_Categoria.getText());
            
            modelo.Actualizar(vista.jtbProductos);
            modelo.Mostrar(vista.jtbProductos);
        }
    }

    private void ClearData(){
        vista.txt_Categoria.setText("");
            vista.txt_Nombre.setText("");
            vista.txt_Precio.setText("");
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
