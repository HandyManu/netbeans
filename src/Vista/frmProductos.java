
package Vista;

import Controlador.ctrlProducto;
import Modelo.Producto;


public class frmProductos extends javax.swing.JFrame {

 
    public frmProductos() {
        initComponents();
    }
    
    public static void initProductos(){
    Producto Modelo = new Producto();
    frmProductos Vista = new frmProductos();
        ctrlProducto controlador = new ctrlProducto(Vista, Modelo);
        
        Vista.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Precio = new javax.swing.JTextField();
        txt_Categoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbProductos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Pollo Pinulito");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 310, 30));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 220, -1));
        jPanel1.add(txt_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 220, -1));
        jPanel1.add(txt_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 230, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel3.setText("Precio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jLabel4.setText("Categoria");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        btn_Guardar.setText("Guardar");
        jPanel1.add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        btn_eliminar.setText("Eliminar");
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        btn_Actualizar.setText("Actualizar");
        jPanel1.add(btn_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        btn_Limpiar.setText("Limpiar");
        jPanel1.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 200, -1));

        btn_buscar.setText("Buscar");
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        jtbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtbProductos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 441, 770, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initProductos();
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Actualizar;
    public javax.swing.JButton btn_Guardar;
    public javax.swing.JButton btn_Limpiar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jtbProductos;
    public javax.swing.JTextField txt_Categoria;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_Precio;
    public javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
