package main;

import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;
import models.*;

public class Regis extends javax.swing.JFrame {
    public Regis() {
        initComponents();
        try{
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(40f);
            Font subtitleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(12f);
            Font txtFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            jLabel1.setFont(titleFont);
            jLabel2.setFont(subtitleFont);
            jLabel3.setFont(subtitleFont);
            txtUsername.setFont(txtFont);
            txtPassword.setFont(txtFont);
            btnSignUp.setFont(btnFont);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnHide = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnShow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 248, 225));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 102, 255));
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setToolTipText("");
        txtPassword.setEchoChar('*');
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        btnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/hide.png"))); // NOI18N
        btnHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHideMouseClicked(evt);
            }
        });
        jPanel1.add(btnHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 37, 70));

        btnSignUp.setBackground(new java.awt.Color(255, 143, 188));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 212, -1));

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/view.png"))); // NOI18N
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
        });
        jPanel1.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 37, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 230, 230, 180);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 150, 320, 70);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Arrow left.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(20, 130, 28, 28);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgMain.png"))); // NOI18N
        jLabelBG.setText("jLabelBG");
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 290, 630);

        setSize(new java.awt.Dimension(304, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        Main Main = new Main();
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHideMouseClicked
        btnShow.setVisible(true);
        btnHide.setVisible(false);
        txtPassword.setEchoChar((char)0);
    }//GEN-LAST:event_btnHideMouseClicked

    private void btnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseClicked
        btnShow.setVisible(false);
        btnHide.setVisible(true);
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_btnShowMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        if ("admin".equals(username)){
            JOptionPane.showMessageDialog(this, "Username tidak boleh sebagai admin!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            txtUsername.setText("");
            txtPassword.setText("");
            return;
        }
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan password harus diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            txtUsername.setText("");
            txtPassword.setText("");
            return;
        }
        boolean sudahAda = false;
        for (Person u : UserData.akunTerdaftar) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                sudahAda = true;
                break;
            }
        }
        if (sudahAda) {
            JOptionPane.showMessageDialog(this, "Username sudah digunakan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            txtUsername.setText("");
            txtPassword.setText("");
        } else {
            UserData.tambahUser(username, password);
            JOptionPane.showMessageDialog(this, "Berhasil Registrasi", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            new Login().setVisible(true);
            this.dispose();
        }      
    }//GEN-LAST:event_btnSignUpActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHide;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel btnShow;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
