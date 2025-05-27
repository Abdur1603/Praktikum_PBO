package menuAdmin;

import java.awt.Font;
import java.io.File;
import main.*;

public class MenuAdmin extends javax.swing.JFrame {

    public MenuAdmin() {
        initComponents();
        try {
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            btnTambah.setFont(btnFont);
            btnEdit.setFont(btnFont);
            btnHapus.setFont(btnFont);
            btnKue.setFont(btnFont);
            btnPesanan.setFont(btnFont);            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKue = new javax.swing.JButton();
        btnPesanan = new javax.swing.JButton();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Log out.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        btnTambah.setBackground(new java.awt.Color(255, 143, 188));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah Kue");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, -1));

        btnEdit.setBackground(new java.awt.Color(255, 143, 188));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit Kue");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, -1));

        btnHapus.setBackground(new java.awt.Color(255, 143, 188));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus Kue");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, -1));

        btnKue.setBackground(new java.awt.Color(255, 143, 188));
        btnKue.setForeground(new java.awt.Color(255, 255, 255));
        btnKue.setText("Lihat Daftar Kue");
        btnKue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKueActionPerformed(evt);
            }
        });
        getContentPane().add(btnKue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 250, -1));

        btnPesanan.setBackground(new java.awt.Color(255, 143, 188));
        btnPesanan.setForeground(new java.awt.Color(255, 255, 255));
        btnPesanan.setText("Lihat Daftar Pesanan");
        btnPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 250, -1));

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 630));

        setSize(new java.awt.Dimension(305, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahKue tmbhKue = new TambahKue();
        tmbhKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        Main Main = new Main();
        Main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        EditKue editKue = new EditKue();
        editKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        HapusKue hapusKue = new HapusKue();
        hapusKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKueActionPerformed
        DaftarKue dftrKue = new DaftarKue();
        dftrKue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKueActionPerformed

    private void btnPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesananActionPerformed
        DaftarPesanan dftrPesanan = new DaftarPesanan();
        dftrPesanan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesananActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JButton btnKue;
    private javax.swing.JButton btnPesanan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabelBG;
    // End of variables declaration//GEN-END:variables
}
