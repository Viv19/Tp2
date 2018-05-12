package Interfaz;

import EstructurasD.SeguridadPrioridad;
import EstructurasD.SeguridadPrioridadHeap;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
    //PARA SEGURIDAD
    static public SeguridadPrioridad VSeguridadCola;
    static public SeguridadPrioridadHeap VSeguridadHeap;
    //PARA ENTREGAS
    static public SeguridadPrioridad VEntregaCola;
    static public SeguridadPrioridadHeap VEntregaHeap;
    
    //PARA SABER CUÁL ESTRUCTURA SE ESCOGE
    static public boolean EntregasCola = false;
    static public boolean EntregasHeap = false;
    public Inicio() {
        initComponents();
        setLocationRelativeTo (null);
        setResizable (false);
        setTitle ("Inicio");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoTexto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTexto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(680, 365));
        getContentPane().setLayout(null);

        campoTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoActionPerformed(evt);
            }
        });
        getContentPane().add(campoTexto);
        campoTexto.setBounds(250, 230, 111, 24);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("Máximo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 200, 92, 20);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(590, 230, 63, 24);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Tiempo en las");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 74, 120, 20);

        jLabel4.setBackground(new java.awt.Color(237, 154, 147));
        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("Ventanillas de Entrega");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 215, 38);

        jLabel1.setBackground(new java.awt.Color(237, 154, 147));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Ventanillas de Seguridad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 120, 215, 38);

        campoTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTexto1ActionPerformed(evt);
            }
        });
        getContentPane().add(campoTexto1);
        campoTexto1.setBounds(250, 130, 111, 24);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Bienvenidos a Courier TEC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 0, 480, 80);

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(570, 0, 110, 20);

        jRadioButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton1.setText("Árbol Heap");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(390, 150, 130, 20);

        jRadioButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton2.setText("Cola");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(390, 128, 130, 20);

        jRadioButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton3.setText("Cola");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(390, 218, 130, 20);

        jRadioButton5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton5.setText("Árbol Heap");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(390, 240, 130, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(590, 150, 63, 24);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 0));
        jLabel8.setText("Mínimo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 120, 92, 20);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 0));
        jLabel6.setText("ventanillas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(540, 90, 92, 20);

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 0));
        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 290, 100, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/progra_1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-50, -70, 1234, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto1ActionPerformed

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed

    }//GEN-LAST:event_campoTextoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().equals("") || jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el tiempo"
                +" máximo y mínimo de atención.");
            System.out.println("Ayuda");
        }
        else{
            int min = Integer.parseInt(jTextField2.getText());
            int max = Integer.parseInt(jTextField1.getText());
            if(!campoTexto1.getText().equals("")){
                int num = Integer.parseInt(campoTexto1.getText());
                for(int i = 0; i != num; i++){
                    if(jRadioButton2.isSelected()== true){ //VENTANILLAS DE SEGURIDAD CON COLA P
                        VSeguridadCola = new SeguridadPrioridad(min, max, "ColaSeguridad"+i);
                    }
                    else if(jRadioButton1.isSelected()== true){ //VENTANILLAS DE SEGURIDAD CON HEAP
                        VSeguridadHeap = new SeguridadPrioridadHeap(min, max, "ColaSeguridad"+i);  
                    }
                }
            }
            if(!campoTexto.getText().equals("")){
                int num2 = Integer.parseInt(campoTexto.getText());
                for(int i = 0; i != num2; i++){
                    if(jRadioButton3.isSelected()== true){ //VENTANILLAS DE ENTREGA CON COLA P
                        VEntregaCola = new SeguridadPrioridad(min, max, "ColaEntregas"+i);
                        EntregasCola = true;
                    }
                    else if(jRadioButton1.isSelected()== true){ //VENTANILLAS DE ENTREGA CON HEAP
                        VEntregaHeap = new SeguridadPrioridadHeap(min, max, "HeapEntregas"+i);
                        EntregasHeap = true;
                    }   
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Por favor, ingrese los datos solicitados.");
            }
        }
        JOptionPane.showMessageDialog(null, "               Realizado");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         VentanaPrincipal Vprincipal = new VentanaPrincipal(); 
         Vprincipal.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoTexto;
    private javax.swing.JTextField campoTexto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}