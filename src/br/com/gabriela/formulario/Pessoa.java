/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.formulario;

/**
 *
 * @author SATC
 */
public class Pessoa extends javax.swing.JFrame {

    /**
     * Creates new form Pessoa
     */
    public Pessoa() {
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

        jLabel1 = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblDataNascimento = new javax.swing.JLabel();
        jLblCPF = new javax.swing.JLabel();
        jLblRG = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jLblEstadoCivil = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblTelefone = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jTxtCPF = new javax.swing.JTextField();
        jTxtRG = new javax.swing.JTextField();
        jTxtDataNascimento = new javax.swing.JTextField();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtTelefone = new javax.swing.JTextField();
        jTxtSexo = new javax.swing.JTextField();
        jTxtEstadoCivil = new javax.swing.JTextField();
        jBtnSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Pessoas");

        jLblNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblNome.setText("Nome:");

        jLblDataNascimento.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblDataNascimento.setText("Data de Nascimento:");

        jLblCPF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblCPF.setText("CPF:");

        jLblRG.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblRG.setText("RG:");

        jLblEndereco.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblEndereco.setText("Endereço:");

        jLblEstadoCivil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblEstadoCivil.setText("Estado Civil:");

        jLblSexo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblSexo.setText("Sexo:");

        jLblTelefone.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLblTelefone.setText("Telefone:");

        jTxtNome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtRG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtDataNascimento.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtEndereco.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtTelefone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtSexo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTxtEstadoCivil.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jBtnSalvar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnSalvar.setText("Salvar");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBtnSalvar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLblNome)
                                                    .addComponent(jLblRG)
                                                    .addComponent(jLblSexo))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLblEndereco)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(122, 122, 122)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblTelefone)
                                            .addComponent(jLblDataNascimento)
                                            .addComponent(jLblCPF)
                                            .addComponent(jLblEstadoCivil))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDataNascimento)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNome)
                    .addComponent(jTxtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCPF)
                    .addComponent(jLblRG)
                    .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEndereco)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jBtnSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCPF;
    private javax.swing.JLabel jLblDataNascimento;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblEstadoCivil;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblRG;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JLabel jLblTelefone;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtCPF;
    private javax.swing.JTextField jTxtDataNascimento;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstadoCivil;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRG;
    private javax.swing.JTextField jTxtSexo;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
