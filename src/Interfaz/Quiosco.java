package Interfaz;

import Codigo.sms;
import EstructurasD.Client;
import EstructurasD.HeapPrioridad;
import EstructurasD.QueuePrioridad;
import static Interfaz.Inicio.*;


public class Quiosco extends javax.swing.JFrame {
    Integer contadorP = 0;
     Integer contadorNP =0;
     Integer numero=0 ;
     String numerotiquete;
     static public QueuePrioridad cola = new QueuePrioridad("Tiquete");
    
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
        regular = new javax.swing.JRadioButton();
        noperecedero = new javax.swing.JRadioButton();
        camponombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        generar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        numerotelefono = new javax.swing.JTextField();
        embarazada = new javax.swing.JRadioButton();
        perecedero = new javax.swing.JRadioButton();
        botonCrearTiquete = new javax.swing.JButton();
        enviarmsm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        Usuario.add(regular);
        regular.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        regular.setText("Cliente Regular");
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
        regular.setBounds(30, 330, 160, 19);

        tipoPaquete.add(noperecedero);
        noperecedero.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        noperecedero.setText("No Perecedero");
        noperecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noperecederoMouseClicked(evt);
            }
        });
        noperecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noperecederoActionPerformed(evt);
            }
        });
        getContentPane().add(noperecedero);
        noperecedero.setBounds(30, 430, 160, 22);

        camponombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponombreActionPerformed(evt);
            }
        });
        getContentPane().add(camponombre);
        camponombre.setBounds(20, 70, 210, 30);

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
        generar.setBounds(1006, 364, 96, 30);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("Ficha asignada");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 110, 190, 21);

        numerotelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(numerotelefono);
        numerotelefono.setBounds(350, 410, 160, 24);

        Usuario.add(embarazada);
        embarazada.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        embarazada.setText("Embarazada");
        embarazada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                embarazadaMouseClicked(evt);
            }
        });
        embarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                embarazadaActionPerformed(evt);
            }
        });
        getContentPane().add(embarazada);
        embarazada.setBounds(30, 300, 160, 22);

        tipoPaquete.add(perecedero);
        perecedero.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        perecedero.setText("Perecedero");
        perecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perecederoMouseClicked(evt);
            }
        });
        perecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perecederoActionPerformed(evt);
            }
        });
        getContentPane().add(perecedero);
        perecedero.setBounds(30, 400, 160, 22);

        botonCrearTiquete.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        botonCrearTiquete.setForeground(new java.awt.Color(51, 102, 0));
        botonCrearTiquete.setText("Crear tiquete");
        botonCrearTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearTiqueteActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrearTiquete);
        botonCrearTiquete.setBounds(27, 470, 160, 30);

        enviarmsm.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        enviarmsm.setForeground(new java.awt.Color(51, 102, 0));
        enviarmsm.setText("Enviar mensaje");
        enviarmsm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarmsmActionPerformed(evt);
            }
        });
        getContentPane().add(enviarmsm);
        enviarmsm.setBounds(350, 450, 160, 30);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 150, 240, 50);

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

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 0, 90, 20);
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

    private void amayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amayorActionPerformed
        amayor.setActionCommand("M"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_amayorActionPerformed

    private void discapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discapacitadoActionPerformed
        discapacitado.setActionCommand("D"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_discapacitadoActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generarActionPerformed

    private void noperecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noperecederoMouseClicked
        // EMBARAZADA
    }//GEN-LAST:event_noperecederoMouseClicked

    private void amayorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amayorMouseClicked
        //ADULTO MAYOR
    }//GEN-LAST:event_amayorMouseClicked

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

    private void regularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_regularMouseClicked

    private void regularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularActionPerformed
        regular.setActionCommand("R"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_regularActionPerformed

    private void embarazadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_embarazadaMouseClicked
        embarazada.setActionCommand("E"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_embarazadaMouseClicked

    private void perecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perecederoMouseClicked
        noperecedero.setActionCommand("P"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_perecederoMouseClicked

    private void noperecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noperecederoActionPerformed
        noperecedero.setActionCommand("NP"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_noperecederoActionPerformed

    private void botonCrearTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearTiqueteActionPerformed
        String tiquete = "";
        String tipousuario= "";
        int prioridad = 0;
        String tipoPaquete = "";
        
        
        //PARA EL TIPO DE PAQUETE   
         if (perecedero.isSelected()){
            tipoPaquete = "P";
        }
        else if (noperecedero.isSelected()){
            tipoPaquete = "NP";
        }
        //PARA EL TIPO DE USUARIO
         if (regular.isSelected()){
            tipousuario = "R";
            prioridad = 3;
        }
         else if (embarazada.isSelected()){
            tipousuario = "E";
            prioridad = 2;
        }
        else if (amayor.isSelected()){
            tipousuario = "M";
            prioridad = 1;
        }
        else if (discapacitado.isSelected()){
            tipousuario = "D";
            prioridad = 0;
        }
        //CONTADORES SEGÚN EL TIPO DE PAQUETE
        if (perecedero.isSelected()){
            numero= contadorP;
        contadorP ++;
        }
        else if (noperecedero.isSelected()){
            numero = contadorNP;
        contadorNP++;
        }
        //IMPRIME EL TIQUETE
        tiquete = tipoPaquete+"-"+tipousuario+"-"+numero;
        System.out.println(tiquete);
        jLabel5.setText(tiquete);
        Client cliente = new Client(tipousuario, tipoPaquete);
        cola.enqueue(cliente);
        //PARA SABER DÓNDE AGREGAR
        if(EntregasCola == true){
            VEntregaCola.enqueue(cliente);
        }
        else if(EntregasHeap == true){
            VEntregaHeap.enqueue(cliente);
        }
       // System.out.println(VEntregaCola.getTicket()+"TIQUETE");
       // System.out.println(cola.siguienteAtender()+"SGT");
        //System.out.println(cola.getSize()+"SIZE");
        
    }//GEN-LAST:event_botonCrearTiqueteActionPerformed

    private void perecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perecederoActionPerformed
        perecedero.setActionCommand("P"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_perecederoActionPerformed

    private void embarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_embarazadaActionPerformed
        embarazada.setActionCommand("E"); //PARA OBTENER EL DATO DEL RADIO BUTTON
    }//GEN-LAST:event_embarazadaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaPrincipal VPrincipal = new VentanaPrincipal();
        VPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JRadioButton embarazada;
    private javax.swing.JButton enviarmsm;
    private javax.swing.JButton generar;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JRadioButton noperecedero;
    public static javax.swing.JTextField numerotelefono;
    private javax.swing.JRadioButton perecedero;
    private javax.swing.JRadioButton regular;
    public static javax.swing.ButtonGroup tipoPaquete;
    // End of variables declaration//GEN-END:variables

}