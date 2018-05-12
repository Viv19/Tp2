package Interfaz;

import Codigo.sms;
import javax.swing.JOptionPane;

public class Quiosco extends javax.swing.JFrame {
    public Quiosco() {
        initComponents();
        setLocationRelativeTo (null);
        setResizable (false);
        setTitle ("Quiosco de AutoServicio");
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.ButtonGroup();
        Clase = new javax.swing.ButtonGroup();
        tipoPaquete = new javax.swing.ButtonGroup();
        campocorreo = new javax.swing.JTextField();
        discapacitado = new javax.swing.JRadioButton();
        amayor = new javax.swing.JRadioButton();
        regular1 = new javax.swing.JRadioButton();
        radioBNP = new javax.swing.JRadioButton();
        camponombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regular2 = new javax.swing.JRadioButton();
        regular = new javax.swing.JRadioButton();
        generar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        numerotelefono = new javax.swing.JTextField();
        embarazada1 = new javax.swing.JRadioButton();
        radioBP = new javax.swing.JRadioButton();
        botonCrearTiquete = new javax.swing.JButton();
        enviarmsm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campoTexNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 550));
        getContentPane().setLayout(null);

        campocorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campocorreoActionPerformed(evt);
            }
        });
        getContentPane().add(campocorreo);
        campocorreo.setBounds(20, 150, 210, 30);

        Usuario.add(discapacitado);
        discapacitado.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        discapacitado.setText("Discapacitado");
        discapacitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discapacitadoMouseClicked(evt);
            }
        });
        discapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discapacitadoActionPerformed(evt);
            }
        });
        getContentPane().add(discapacitado);
        discapacitado.setBounds(30, 240, 160, 20);

        Usuario.add(amayor);
        amayor.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        amayor.setText("Adulto Mayor");
        amayor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amayorMouseClicked(evt);
            }
        });
        amayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amayorActionPerformed(evt);
            }
        });
        getContentPane().add(amayor);
        amayor.setBounds(30, 270, 160, 20);

        Usuario.add(regular1);
        regular1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        regular1.setText("Cliente Regular");
        regular1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regular1MouseClicked(evt);
            }
        });
        regular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regular1ActionPerformed(evt);
            }
        });
        getContentPane().add(regular1);
        regular1.setBounds(30, 330, 153, 19);

        tipoPaquete.add(radioBNP);
        radioBNP.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        radioBNP.setText("No Perecedero");
        radioBNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBNPMouseClicked(evt);
            }
        });
        radioBNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBNPActionPerformed(evt);
            }
        });
        getContentPane().add(radioBNP);
        radioBNP.setBounds(30, 430, 160, 22);

        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });
        getContentPane().add(camponombre);
        camponombre.setBounds(20, 70, 220, 30);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 84, 21);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Correo Electrónico");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 230, 21);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 86, 21);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 360, 130, 38);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Tipo Paquete");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 370, 143, 21);

        Usuario.add(regular2);
        regular2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        regular2.setText("Perecedero");
        regular2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regular2MouseClicked(evt);
            }
        });
        regular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regular2ActionPerformed(evt);
            }
        });
        getContentPane().add(regular2);
        regular2.setBounds(1108, 380, 150, 19);

        Usuario.add(regular);
        regular.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        regular.setText("No Perecedero");
        regular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regularMouseClicked(evt);
            }
        });
        regular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regularActionPerformed(evt);
            }
        });
        getContentPane().add(regular);
        regular.setBounds(851, 380, 143, 19);

        generar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        generar.setText("Generar");
        generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarMouseClicked(evt);
            }
        });
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        getContentPane().add(generar);
        generar.setBounds(1006, 364, 99, 23);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Ficha asignada");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 30, 190, 21);

        numerotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(numerotelefono);
        numerotelefono.setBounds(350, 410, 160, 20);

        Usuario.add(embarazada1);
        embarazada1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        embarazada1.setText("Embarazada");
        embarazada1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                embarazada1MouseClicked(evt);
            }
        });
        embarazada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embarazada1ActionPerformed(evt);
            }
        });
        getContentPane().add(embarazada1);
        embarazada1.setBounds(30, 300, 160, 22);

        tipoPaquete.add(radioBP);
        radioBP.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        radioBP.setText("Perecedero");
        radioBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioBPMouseClicked(evt);
            }
        });
        radioBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBPActionPerformed(evt);
            }
        });
        getContentPane().add(radioBP);
        radioBP.setBounds(30, 400, 160, 22);

        botonCrearTiquete.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        botonCrearTiquete.setText("Crear tiquete");
        botonCrearTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearTiqueteActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrearTiquete);
        botonCrearTiquete.setBounds(27, 470, 160, 23);

        enviarmsm.setText("Enviar mensaje");
        enviarmsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarmsmActionPerformed(evt);
            }
        });
        getContentPane().add(enviarmsm);
        enviarmsm.setBounds(350, 450, 105, 23);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 70, 230, 110);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("Enviar por mensaje ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 310, 220, 21);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 0));
        jLabel9.setText("la ficha asignada");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 330, 192, 21);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(300, 0, 10, 520);

        campoTexNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/progra_1.jpg"))); // NOI18N
        getContentPane().add(campoTexNombre);
        campoTexNombre.setBounds(-30, -10, 1680, 534);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campocorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campocorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campocorreoActionPerformed

    private void camponombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponombreActionPerformed

    private void regularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularActionPerformed

    private void amayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amayorActionPerformed

    private void discapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discapacitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discapacitadoActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarActionPerformed

    private void radioBNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBNPMouseClicked
        // EMBARAZADA
    }//GEN-LAST:event_radioBNPMouseClicked

    private void amayorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amayorMouseClicked
        //ADULTO MAYOR
    }//GEN-LAST:event_amayorMouseClicked

    private void regularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regularMouseClicked
        // REGULAR
    }//GEN-LAST:event_regularMouseClicked

    private void discapacitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discapacitadoMouseClicked
        // DISCAPACITADO
    }//GEN-LAST:event_discapacitadoMouseClicked

    private void generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarMouseClicked
  
    }//GEN-LAST:event_generarMouseClicked
    
    private void numerotelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotelefonoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numerotelefonoActionPerformed

    private void enviarmsmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarmsmActionPerformed
        sms mensaje = new sms();
        mensaje.sendSMS("okis", numerotelefono.getText());
    }//GEN-LAST:event_enviarmsmActionPerformed

    private void regular1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regular1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regular1MouseClicked

    private void regular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regular1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regular1ActionPerformed

    private void regular2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regular2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regular2MouseClicked

    private void regular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regular2ActionPerformed

    private void embarazada1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarazada1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_embarazada1MouseClicked

    private void radioBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioBPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBPMouseClicked

    private void radioBNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBNPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBNPActionPerformed

    private void botonCrearTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearTiqueteActionPerformed

        JOptionPane.showMessageDialog(null,"Nombre cliente:" + camponombre.getText() + "\n\n" + "Correo electrónico:" + campocorreo.getText() + "\n\n" + "Usuario: " + Usuario.getSelection() + "\n\n" + "Tipo de paquete: " + tipoPaquete.toString())    ;
       

    }//GEN-LAST:event_botonCrearTiqueteActionPerformed

    private void radioBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBPActionPerformed

    private void embarazada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embarazada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_embarazada1ActionPerformed

     /* @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiosco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup Clase;
    public static javax.swing.ButtonGroup Usuario;
    private javax.swing.JRadioButton amayor;
    private javax.swing.JButton botonCrearTiquete;
    private javax.swing.JLabel campoTexNombre;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField camponombre;
    private javax.swing.JRadioButton discapacitado;
    private javax.swing.JRadioButton embarazada1;
    private javax.swing.JButton enviarmsm;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField numerotelefono;
    private javax.swing.JRadioButton radioBNP;
    private javax.swing.JRadioButton radioBP;
    private javax.swing.JRadioButton regular;
    private javax.swing.JRadioButton regular1;
    private javax.swing.JRadioButton regular2;
    public static javax.swing.ButtonGroup tipoPaquete;
    // End of variables declaration//GEN-END:variables

}