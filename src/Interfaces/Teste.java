/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author herba
 */
public class Teste extends javax.swing.JFrame {

    /**
     * Creates new form Teste
     */
    public Teste() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane7 = new javax.swing.JLayeredPane();
        InformacoesPan7 = new javax.swing.JPanel();
        JLb_NumClientes5 = new javax.swing.JLabel();
        JTF_NumClientes5 = new javax.swing.JTextField();
        JLB_NumQueijos5 = new javax.swing.JLabel();
        JTF_NUmQueijos5 = new javax.swing.JTextField();
        JLB_NumPedidos5 = new javax.swing.JLabel();
        JTF_NumPedidos5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTB_Clientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InformacoesPan7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JLb_NumClientes5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLb_NumClientes5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLb_NumClientes5.setText("Nosso atual número de clientes é:");

        JTF_NumClientes5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JTF_NumClientes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NumClientes5JTF_NumClientesActionPerformed(evt);
            }
        });

        JLB_NumQueijos5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLB_NumQueijos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLB_NumQueijos5.setText("Nossa quantidade de queijos é:");

        JTF_NUmQueijos5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JTF_NUmQueijos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NUmQueijos5JTF_NUmQueijosActionPerformed(evt);
            }
        });

        JLB_NumPedidos5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JLB_NumPedidos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLB_NumPedidos5.setText("Nosso número de pedidos é:");

        JTF_NumPedidos5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JTF_NumPedidos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_NumPedidos5JTF_NumPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InformacoesPan7Layout = new javax.swing.GroupLayout(InformacoesPan7);
        InformacoesPan7.setLayout(InformacoesPan7Layout);
        InformacoesPan7Layout.setHorizontalGroup(
            InformacoesPan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesPan7Layout.createSequentialGroup()
                .addGroup(InformacoesPan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InformacoesPan7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InformacoesPan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLB_NumPedidos5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLB_NumQueijos5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLb_NumClientes5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(InformacoesPan7Layout.createSequentialGroup()
                        .addGroup(InformacoesPan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InformacoesPan7Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(JTF_NumClientes5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InformacoesPan7Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(JTF_NUmQueijos5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(InformacoesPan7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(JTF_NumPedidos5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        InformacoesPan7Layout.setVerticalGroup(
            InformacoesPan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacoesPan7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(JLb_NumClientes5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTF_NumClientes5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLB_NumQueijos5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTF_NUmQueijos5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLB_NumPedidos5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTF_NumPedidos5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        JTB_Clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTB_Clientes);

        jLayeredPane7.setLayer(InformacoesPan7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InformacoesPan7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(InformacoesPan7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jLayeredPane7)
                    .addGap(127, 127, 127)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jLayeredPane7)
                    .addGap(50, 50, 50)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_NumClientes5JTF_NumClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NumClientes5JTF_NumClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NumClientes5JTF_NumClientesActionPerformed

    private void JTF_NUmQueijos5JTF_NUmQueijosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NUmQueijos5JTF_NUmQueijosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NUmQueijos5JTF_NUmQueijosActionPerformed

    private void JTF_NumPedidos5JTF_NumPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_NumPedidos5JTF_NumPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NumPedidos5JTF_NumPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InformacoesPan7;
    private javax.swing.JLabel JLB_NumPedidos5;
    private javax.swing.JLabel JLB_NumQueijos5;
    private javax.swing.JLabel JLb_NumClientes5;
    private javax.swing.JTable JTB_Clientes;
    private javax.swing.JTextField JTF_NUmQueijos5;
    private javax.swing.JTextField JTF_NumClientes5;
    private javax.swing.JTextField JTF_NumPedidos5;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
