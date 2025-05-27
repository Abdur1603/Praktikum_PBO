package menuCustomer;

import java.awt.Font;
import java.io.File;
import main.*;

public class MenuCustomer extends javax.swing.JFrame {

    public MenuCustomer() {
        initComponents();
        try {
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            btnDaftarKue.setFont(btnFont);
            btnPesanKue.setFont(btnFont);
            btnDaftarPesanan.setFont(btnFont);           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JLabel();
        btnDaftarKue = new javax.swing.JButton();
        btnPesanKue = new javax.swing.JButton();
        btnDaftarPesanan = new javax.swing.JButton();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Log out.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 50, 60));

        btnDaftarKue.setBackground(new java.awt.Color(255, 143, 188));
        btnDaftarKue.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftarKue.setText(" Lihat Daftar Kue");
        btnDaftarKue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarKueActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftarKue, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 210, 260, -1));

        btnPesanKue.setBackground(new java.awt.Color(255, 143, 188));
        btnPesanKue.setForeground(new java.awt.Color(255, 255, 255));
        btnPesanKue.setText("Pesan Kue");
        btnPesanKue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanKueActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesanKue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        btnDaftarPesanan.setBackground(new java.awt.Color(255, 143, 188));
        btnDaftarPesanan.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftarPesanan.setText("Lihat Pesanan Saya");
        btnDaftarPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarPesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftarPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 260, -1));

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgCustomer.png"))); // NOI18N
        getContentPane().add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        setSize(new java.awt.Dimension(308, 636));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        Main Main = new Main();
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnDaftarKueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarKueActionPerformed
        LihatKue lihatKue = new LihatKue();
        lihatKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarKueActionPerformed

    private void btnPesanKueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanKueActionPerformed
        PesanKue pesanKue = new PesanKue();
        pesanKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesanKueActionPerformed

    private void btnDaftarPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarPesananActionPerformed
        LihatPesanan lihatPesanan = new LihatPesanan();
        lihatPesanan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDaftarPesananActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftarKue;
    private javax.swing.JButton btnDaftarPesanan;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JButton btnPesanKue;
    private javax.swing.JLabel jLabelBG;
    // End of variables declaration//GEN-END:variables
}
