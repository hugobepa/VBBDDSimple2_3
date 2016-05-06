
package vbbdd;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class V extends javax.swing.JFrame {
    ConectToDB cdb = new ConectToDB();
    DefaultComboBoxModel dm; 
    DefaultTableModel dt;
    int cont=0;
  //select name from emp where name like 'ravi%'  
    
    public V() {
        initComponents();
         initCB();
        
    }

     public void initCB(){
          cdb.InsertCB();
          dm = new DefaultComboBoxModel(cdb.lista.toArray());
         //dm = new DefaultComboBoxModel(petStrings);
         CB.setModel(dm);
      }
    
     
      public void MostrarTabla ()
    {
        String data [][]= {};
        //titulo
        String col[]={"Nom","EDAD"};
        //Instaciamos Model para Tabla tipo de array String, y titulo columnas
        dt = new DefaultTableModel(data,col);
        //insertamos los datos en al tabla fisica
        this.TBTaula.setModel(dt);     
        this.TBTaula.setVisible(true);
    }
  
      
      public void consultaTot()
    {
        try {
            //conexion BBDD especifica
            cdb.miConexion= (Connection) cdb.getConnection("Java","root","antonia");
            // enviar consulta
            cdb.consulta=cdb.miConexion.prepareStatement("SELECT nombre,edad FROM Java.Tabla1");
          //ejecutar consulta y guardar consulta
            cdb.datos= cdb.consulta.executeQuery();
            //mostrar los datos siguiente en siguiente
            while(cdb.datos.next())
            {
                dt.insertRow(cont, new Object[]{});
                dt.setValueAt(cdb.datos.getString("nombre"),cont,0);
                dt.setValueAt(cdb.datos.getString("edad"),cont,1);
              
            }  
        }catch ( SQLException ex){
                JOptionPane.showMessageDialog(null,"No se pudo hacer consulta " +ex);
        }finally{
            //para descoenctar todo
            cdb.desconectar();
        }
    } 
      
      
     public void consultaMultiple(String n)
    {
        try {
            //conexion BBDD especifica
            cdb.miConexion= (Connection) cdb.getConnection("Java","root","antonia");
            // enviar consulta
            cdb.consulta=cdb.miConexion.prepareStatement("SELECT nombre,edad FROM Java.Tabla1  where nombre like\""+n+"%\"");
          //ejecutar consulta y guardar consulta
            cdb.datos= cdb.consulta.executeQuery();
            //mostrar los datos siguiente en siguiente
            while(cdb.datos.next())
            {
                dt.insertRow(cont, new Object[]{});
                dt.setValueAt(cdb.datos.getString("nombre"),cont,0);
                dt.setValueAt(cdb.datos.getString("edad"),cont,1);
              
            }  
        }catch ( SQLException ex){
                JOptionPane.showMessageDialog(null,"No se pudo hacer consulta " +ex);
        }finally{
            //para descoenctar todo
            cdb.desconectar();
        }
    }  
      //select name from emp where name like 'ravi%'
     //consulta=miConexion.prepareStatement("SELECT nombre,edad FROM Java.Tabla1  where nombre like\""+n+"%\"");
     
     
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTSalir = new javax.swing.JButton();
        CB = new javax.swing.JComboBox();
        LB = new javax.swing.JLabel();
        TFN = new javax.swing.JTextField();
        BTInsertar = new javax.swing.JButton();
        TFE = new javax.swing.JTextField();
        BTBorrar = new javax.swing.JButton();
        BTCBToLabel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBTaula = new javax.swing.JTable();
        BTMostrarTot = new javax.swing.JButton();
        BTBusquedaMultiple = new javax.swing.JButton();

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

        BTSalir.setText("Salir");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LB.setText("LB");

        TFN.setText("TFN");
        TFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFNKeyTyped(evt);
            }
        });

        BTInsertar.setText("Insertar");
        BTInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTInsertarActionPerformed(evt);
            }
        });

        TFE.setText("TFE");

        BTBorrar.setText("Borrar");
        BTBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBorrarActionPerformed(evt);
            }
        });

        BTCBToLabel.setText("CBtoLabel");
        BTCBToLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCBToLabelActionPerformed(evt);
            }
        });

        TBTaula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TBTaula);

        BTMostrarTot.setText("MostrarToT");
        BTMostrarTot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTMostrarTotActionPerformed(evt);
            }
        });

        BTBusquedaMultiple.setText("BusquedaMultiple");
        BTBusquedaMultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBusquedaMultipleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFE)
                                    .addComponent(TFN)
                                    .addComponent(CB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTBusquedaMultiple)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LB)
                                            .addComponent(BTInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(BTBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BTCBToLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BTMostrarTot))))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BTSalir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTInsertar)
                    .addComponent(BTCBToLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTBorrar)
                    .addComponent(BTMostrarTot))
                .addGap(18, 18, 18)
                .addComponent(BTBusquedaMultiple)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BTSalirActionPerformed

    private void BTBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBorrarActionPerformed
       
        VEliminar ve = new  VEliminar(new javax.swing.JFrame(), true);
        ve.setLocationRelativeTo(null);
        ve.setVisible(true);
        
        //pantalla confirmacio
        if (ve.confirmar==true) {
             cdb.eliminarFila(this.TFN.getText());
        }else{
            cdb.eliminarFila(null);
        }
        
        this.TFN.setText("");
    }//GEN-LAST:event_BTBorrarActionPerformed
        //Insertar un valor a tabla
    private void BTInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTInsertarActionPerformed
        cdb.insertarFila(this.TFN.getText(),Integer.parseInt(this.TFE.getText()));
        //limpiar valores
        this.TFE.setText("");
        this.TFE.setText("");
        initCB();
    }//GEN-LAST:event_BTInsertarActionPerformed
      // un element de CB s'introdueix a un Label
    private void BTCBToLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCBToLabelActionPerformed
        //agafar valor Item CB pasarlo Label
        this.LB.setText(this.CB.getSelectedItem().toString());
    }//GEN-LAST:event_BTCBToLabelActionPerformed
     
    private void TFNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFNKeyTyped
        int tecla= evt.getKeyChar();
         this.TFE.setText("");
        if(tecla==10)// si apretar ENTER
        {
          cdb.busquedaSencilla(this.TFN.getText());
         
          
              this.TFE.setText(cdb.age);
          
        }
       
        
        cdb.name=null;
        cdb.age=null;
    }//GEN-LAST:event_TFNKeyTyped

    private void BTMostrarTotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTMostrarTotActionPerformed
        MostrarTabla();
        consultaTot();
    }//GEN-LAST:event_BTMostrarTotActionPerformed

    private void BTBusquedaMultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBusquedaMultipleActionPerformed
        MostrarTabla();
        consultaMultiple(this.TFN.getText());
    }//GEN-LAST:event_BTBusquedaMultipleActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBorrar;
    private javax.swing.JButton BTBusquedaMultiple;
    private javax.swing.JButton BTCBToLabel;
    private javax.swing.JButton BTInsertar;
    private javax.swing.JButton BTMostrarTot;
    private javax.swing.JButton BTSalir;
    private javax.swing.JComboBox CB;
    private javax.swing.JLabel LB;
    private javax.swing.JTable TBTaula;
    private javax.swing.JTextField TFE;
    private javax.swing.JTextField TFN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
