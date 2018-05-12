package Interfaz;
public class Inicio extends javax.swing.JFrame {
    
    public Inicio() {
        initComponents();
        setLocationRelativeTo (null);
        setResizable (false);
        setTitle ("Inicio");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        campoTexto = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        Cola = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoTexto1 = new javax.swing.JTextField();
        Cola2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton4.setText("Árbol Heap");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(390, 250, 121, 28);

        buttonGroup1.add(Cola);
        Cola.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Cola.setForeground(new java.awt.Color(51, 102, 0));
        Cola.setText("Cola");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Cola, org.jdesktop.beansbinding.ELProperty.create("${icon}"), Cola, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaActionPerformed(evt);
            }
        });
        getContentPane().add(Cola);
        Cola.setBounds(400, 190, 121, 28);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("cola de Seguridad");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 120, 141, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(520, 140, 63, 24);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 0));
        jLabel2.setText("Tiempo en la ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(520, 100, 100, 14);

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

        buttonGroup1.add(Cola2);
        Cola2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        Cola2.setForeground(new java.awt.Color(51, 102, 0));
        Cola2.setText("Cola");
        Cola2.setBorderPainted(true);
        Cola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cola2ActionPerformed(evt);
            }
        });
        getContentPane().add(Cola2);
        Cola2.setBounds(390, 210, 121, 28);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 102, 0));
        jRadioButton3.setText("Árbol Heap");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(500, 230, 121, 28);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("Bienvenidos a Courier TEC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 0, 510, 80);

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 0));
        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 290, 100, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/progra_1.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-50, -70, 1234, 550);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cola2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cola2ActionPerformed

    private void campoTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTexto1ActionPerformed

    private void ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColaActionPerformed

    private void campoTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoActionPerformed

    }//GEN-LAST:event_campoTextoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int num = Integer.parseInt(campoTexto1.getText());
        for(int i = 0; i != num; i++){
            
            //ventanilla para la seguridad
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    public static javax.swing.JRadioButton Cola;
    public static javax.swing.JRadioButton Cola2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoTexto;
    private javax.swing.JTextField campoTexto1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JRadioButton jRadioButton3;
    public static javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}