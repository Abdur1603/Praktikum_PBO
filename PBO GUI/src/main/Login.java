package main;

import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;
import menuAdmin.MenuAdmin;
import menuCustomer.MenuCustomer;
import models.*;

public class Login extends javax.swing.JFrame {

    public Login() {
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
            btnSignIn.setFont(btnFont);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btnSignIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHide = new javax.swing.JLabel();
        btnShow = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(138, 235, 202));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(248, 248, 225));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setToolTipText("Masukkan Username");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 31, 212, -1));

        btnSignIn.setBackground(new java.awt.Color(255, 143, 188));
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("Sign In");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 212, -1));

        jLabel2.setForeground(new java.awt.Color(255, 102, 255));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 212, -1));

        jLabel3.setForeground(new java.awt.Color(255, 102, 255));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 212, -1));

        btnHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/hide.png"))); // NOI18N
        btnHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHideMouseClicked(evt);
            }
        });
        jPanel2.add(btnHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 30, 70));

        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/view.png"))); // NOI18N
        btnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShowMouseReleased(evt);
            }
        });
        jPanel2.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 50));

        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setEchoChar('*');
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, -1));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 230, 230, 190);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 150, 160, 60);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Arrow left.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKembaliMousePressed(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(20, 130, 30, 40);

        jLabelBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgMain.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 290, 630);

        setSize(new java.awt.Dimension(304, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan password harus diisi!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        } else {
            if (username.equals("Admin") && password.equals("admin123")) {
            UserSession.setUsername("Admin");
            JOptionPane.showMessageDialog(this, "Login sebagai Admin", "Berhasil!", JOptionPane.INFORMATION_MESSAGE);
            new MenuAdmin().setVisible(true);
            this.dispose();
            } else {
                Person user = UserData.cariUser(username, password);
                if (user != null) {
                    UserSession.setUsername(user.getUsername());
                    JOptionPane.showMessageDialog(this, "Login sebagai Customer", "Berhasil!", JOptionPane.INFORMATION_MESSAGE);
                    new MenuCustomer().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Username atau password salah!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                    txtUsername.setText("");
                    txtPassword.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnKembaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMousePressed
        Main Main = new Main();
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMousePressed

    private void btnShowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMousePressed
        
    }//GEN-LAST:event_btnShowMousePressed

    private void btnShowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowMouseReleased
        
    }//GEN-LAST:event_btnShowMouseReleased

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

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost

    }//GEN-LAST:event_txtUsernameFocusLost

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnHide;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel btnShow;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
