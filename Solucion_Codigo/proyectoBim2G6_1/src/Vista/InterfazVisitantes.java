package Vista;

import Controlador.GestionVisitantes;
import java.sql.*;
import javax.swing.JOptionPane;

public class InterfazVisitantes extends javax.swing.JFrame {

    GestionVisitantes temp = new GestionVisitantes();
    
    

    public InterfazVisitantes() {
        initComponents();
        this.setLocationRelativeTo(null);//Centra la interfaz cada que se ejecuta
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        int_entradasN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        int_entradasE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bool_discapacidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Evento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mensajeEstatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        int_numCedula = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        int_identificador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad de entradas normales: ");

        int_entradasN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_entradasNActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de entradas eventos: ");

        jLabel3.setText("¿Posee alguna discapacidad? (true/false)");

        jLabel4.setText("Evento asistido: ");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mensajeEstatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Insertar visitante");

        jLabel6.setText("C.I");

        int_numCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int_numCedulaActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Identificador: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensajeEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(int_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(int_entradasE, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(int_entradasN, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bool_discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Evento, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(int_numCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int_entradasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int_entradasE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bool_discapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Evento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int_numCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(int_identificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(mensajeEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/feriadeloja", "root", "");

            // Especificamos columnas para evitar problemas
            PreparedStatement instruccionSQL = conexion.prepareStatement(
                    "INSERT INTO visitantes (cantEntradasN, cantEntradasE, discapacidad, eventoAsistido, `C.I`) VALUES (?, ?, ?, ?, ?)"
            );

            // Obtener valores desde la interfaz
            String entradasN = int_entradasN.getText().trim();
            String entradasE = int_entradasE.getText().trim();
            String discapacidad = bool_discapacidad.getText().trim();
            String evento = txt_Evento.getText().trim();
            String cedula = int_numCedula.getText().trim();

            // Insertar en la base de datos
            instruccionSQL.setString(1, entradasN);
            instruccionSQL.setString(2, entradasE);
            instruccionSQL.setString(3, discapacidad);
            instruccionSQL.setString(4, evento);
            instruccionSQL.setString(5, cedula);

            instruccionSQL.executeUpdate();

            //Se insertan los datos en una ArrayList para procesar los datos 
            temp.insertarVisitante(
                    temp.acumulacionVisitantes,
                    Boolean.parseBoolean(discapacidad),
                    Integer.parseInt(entradasN),
                    Integer.parseInt(entradasE),
                    evento
            );

            JOptionPane.showMessageDialog(null, temp.obtenerTextoVisitantes());


            // Limpiar campos
            int_entradasN.setText("");
            int_entradasE.setText("");
            bool_discapacidad.setText("");
            txt_Evento.setText("");
            int_numCedula.setText("");

            mensajeEstatus.setText("Registro actualizado");

        } catch (Exception e) {

            mensajeEstatus.setText("Registro fallido");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void int_numCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_numCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_int_numCedulaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Boton de modificar 
        
        try {
            String busqueda = int_identificador.getText().trim();
            //Conexion a la BD
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/feriadeloja", "root", "");
            
            PreparedStatement intruccionBD = conexion.prepareStatement("UPDATE visitantes SET cantEntradasN = ?, cantEntradasE = ?, discapacidad = ?, eventoAsistido = ?, `C.I` = ? WHERE `C.I` = " + busqueda);
        
            intruccionBD.setString(1, int_entradasN.getText().trim());
            intruccionBD.setString(2, int_entradasE.getText().trim());
            intruccionBD.setString(3, bool_discapacidad.getText().trim());
            intruccionBD.setString(4, txt_Evento.getText().trim());
            intruccionBD.setString(5, int_numCedula.getText().trim());
            
            intruccionBD.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cambios realizados con exito. ");
            
            
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, "Cambio fallido.");
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Codigo del boton "Buscar"
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //Boton buscar
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/feriadeloja", "root", "");

            // Comilla invertida para nombre de columna con punto
            PreparedStatement instruccionSQL = conexion.prepareStatement("SELECT * FROM visitantes WHERE `C.I` = ?");
            instruccionSQL.setString(1, int_identificador.getText().trim());
            
            //la varibale resultado va a trabajar con la BD -> Query
            ResultSet resultado = instruccionSQL.executeQuery();
            
            //Si resultado tiene un valor siguiente, es decir no esta vacio se va a ejecutar y obtener los valores de la BD
            if (resultado.next()) {
                int_entradasN.setText(resultado.getString("cantEntradasN"));
                int_entradasE.setText(resultado.getString("cantEntradasE"));
                bool_discapacidad.setText(resultado.getString("discapacidad"));
                txt_Evento.setText(resultado.getString("eventoAsistido"));
                int_numCedula.setText(resultado.getString("C.I"));
            } else {
                //Esto va a invocar una ventana emergente con el String que se ingrese
                
                JOptionPane.showMessageDialog(null, "Visitante no registrado \n Ingrese el identificador nuevamente.");
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la búsqueda");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Boton eliminar
        try {
            Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost/feriadeloja", "root", "");
            PreparedStatement instruccionesBD = conexionBD.prepareStatement("DELETE FROM visitantes WHERE `C.I` = ?");
        
            instruccionesBD.setString(1, int_identificador.getText().trim());
            
            instruccionesBD.executeUpdate();
            
            int_entradasN.setText("");
            int_entradasE.setText("");
            bool_discapacidad.setText("");
            txt_Evento.setText("");
            int_numCedula.setText("");
            
            JOptionPane.showMessageDialog(null, "Registro eliminado");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la búsqueda");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void int_entradasNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_int_entradasNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_int_entradasNActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazVisitantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazVisitantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bool_discapacidad;
    private javax.swing.JTextField int_entradasE;
    private javax.swing.JTextField int_entradasN;
    private javax.swing.JTextField int_identificador;
    private javax.swing.JTextField int_numCedula;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mensajeEstatus;
    private javax.swing.JTextField txt_Evento;
    // End of variables declaration//GEN-END:variables
}
