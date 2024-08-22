
package Modelo;

import Vista.frmProductos;
import java.sql.*;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Producto {
    
    //parametros 
    String UUID_Producto;
    String Nombre;
    double Precio;
    String Categoria;
    
    //getters y setters 

    public String getUUID_Producto() {
        return UUID_Producto;
    }

    public void setUUID_Producto(String UUID_Producto) {
        this.UUID_Producto = UUID_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    //3 funciones (Guardar , Mostrar ,Eliminar ,Actualizar)
    
    public void Guardar() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement addProducto = conexion.prepareStatement("INSERT INTO tb_Productos(UUID_producto, Nombre, precio, categoria) VALUES (?, ?, ?, ?)");
            //Establecer valores de la consulta SQL
            addProducto.setString(1, UUID.randomUUID().toString());
            addProducto.setString(2, getNombre());
            addProducto.setDouble(3, getPrecio());
            addProducto.setString(4, getCategoria());
 
            //Ejecutar la consulta
            addProducto.executeUpdate();
 
        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
    
    public void Mostrar(JTable tabla) {
        //Creamos una variable de la clase de conexion
        Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modeloPinulito = new DefaultTableModel();
        modeloPinulito.setColumnIdentifiers(new Object[]{"UUID_producto", "Nombre", "Precio", "Categoria"});
        try {
            //Creamos un Statement
            Statement statement = conexion.createStatement();
            //Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM TB_Productos");
            //Recorremos el ResultSet
            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modeloPinulito.addRow(new Object[]{rs.getString("UUID_producto"), 
                    rs.getString("nombre"), 
                    rs.getDouble("precio"), 
                    rs.getString("categoria")});
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modeloPinulito);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    public void Eliminar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
 
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        //Obtenemos el id de la fila seleccionada
        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            PreparedStatement deleteEstudiante = conexion.prepareStatement("delete from TB_Productos where UUID_producto = ?");
            deleteEstudiante.setString(1, miId);
            deleteEstudiante.executeUpdate();
        } catch (Exception e) {
            System.out.println("este es el error metodo de eliminar" + e);
        }
    }
    
         public void Actualizar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada != -1) {
            //Obtenemos el id de la fila seleccionada
            String miUUId = tabla.getValueAt(filaSeleccionada, 0).toString();
            try { 
                //Ejecutamos la Query
                PreparedStatement updateUser = conexion.prepareStatement("update TB_Productos set nombre= ?, precio = ?, categoria = ? where UUID_producto = ?");
                updateUser.setString(1, getNombre());
                updateUser.setDouble(2, getPrecio());
                updateUser.setString(3, getCategoria());
                updateUser.setString(4, miUUId);
                updateUser.executeUpdate();
            } catch (Exception e) {
                System.out.println("este es el error en el metodo de actualizar" + e);
            }
        } else {
            System.out.println("no funciona actualizar");
        }
    }
         
         public void cargarDatosTabla(frmProductos vista) {
        // Obtén la fila seleccionada 
        int filaSeleccionada = vista.jtbProductos.getSelectedRow();
        // Debemos asegurarnos que haya una fila seleccionada antes de acceder a sus valores
        if (filaSeleccionada != -1) {
            String UUIDDeTb = vista.jtbProductos.getValueAt(filaSeleccionada, 0).toString();
            String NombreDeTB = vista.jtbProductos.getValueAt(filaSeleccionada, 1).toString();
            String PrecioTB = vista.jtbProductos.getValueAt(filaSeleccionada, 2).toString();
            String CategoriaTB = vista.jtbProductos.getValueAt(filaSeleccionada, 3).toString();
            // Establece los valores en los campos de texto
            vista.txt_Nombre.setText(NombreDeTB);
            vista.txt_Precio.setText(PrecioTB);
            vista.txt_Categoria.setText(CategoriaTB);
        }
    }
}
