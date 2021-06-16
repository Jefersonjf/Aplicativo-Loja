
package aplicativo;

import models.UsuarioModel;
import statics.BancoLocalFake;

public class TelaCadastroUsuario extends javax.swing.JInternalFrame {

   UsuarioModel usuario;
    private UsuarioModel UsuarioAtual;
       
    public TelaCadastroUsuario(UsuarioModel _usuario) {
        
        initComponents();
        
        if (_usuario == null) {
            return;
        }
        
        this.preencherFormulario(_usuario);
        this.alterarNomeComponentes();
        
    }

    TelaCadastroUsuario() {
       
    }
    
    private void alterarNomeComponentes() {
        this.jButton1.setText("Atualizar");
        this.title = "Atualizar Usuario";
        
    }
    
    private void preencherFormulario(UsuarioModel _usuario){
        this.usuario = _usuario;
        txtUsuario.setText(this.usuario.usuario);
        txtSenha.setText(String.valueOf(this.usuario.senha)); 
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConSenha = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setClosable(true);
        setTitle("Tela Cadastro Usuario");

        jLabel1.setText("Usuario");

        jLabel2.setText("Senha");

        jLabel3.setText("Confirmar Senha");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(txtUsuario)
                        .addComponent(txtSenha)
                        .addComponent(txtConSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String Usuario = txtUsuario.getText();
        int Senha = Integer.parseInt(txtSenha.getText());
        
        UsuarioModel usuarioNovo = new UsuarioModel (Usuario, Senha);
        
        limparUsuario();
        
        if (this.usuario == null) {
            
            BancoLocalFake.usuarioCadastro.add(UsuarioAtual);
           
                        
        } else {
            
            int tamanhoLista = BancoLocalFake.usuarioCadastro.size();
            
            for (int i = 0; i <tamanhoLista; i++) {
                
                UsuarioModel usuarioAtual = BancoLocalFake.usuarioCadastro.get(i);
                
                if (usuarioAtual.equals(this.usuario)) {
                    
                    BancoLocalFake.usuarioCadastro.set(i, usuarioAtual);
                    
                }
                
                
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
  
    public void limparUsuario() {
        
        txtUsuario.setText("");
        txtSenha.setText("");
        txtConSenha.setText("");
    }
    
}
