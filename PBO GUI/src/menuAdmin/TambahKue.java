package menuAdmin;

import java.awt.Font;
import java.io.File;
import javax.swing.JOptionPane;
import models.*;

public class TambahKue extends javax.swing.JFrame {

    public TambahKue() {
        initComponents();
        try {
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            Font subtitleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(12f);
            jLabel1.setFont(subtitleFont);
            jLabel2.setFont(subtitleFont);
            jLabel3.setFont(subtitleFont);
            jLabel4.setFont(subtitleFont);
            txtID.setFont(titleFont);
            txtNama.setFont(titleFont);
            txtHarga.setFont(titleFont);
            txtStok.setFont(titleFont);
            btnTambah.setFont(btnFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        txtStok = new javax.swing.JTextField();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Arrow left.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(10, -10, 50, 60);

        jPanel1.setBackground(new java.awt.Color(255, 143, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Kue");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Kue");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        txtNama.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, -1));

        txtHarga.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stok");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, -1));

        btnTambah.setBackground(new java.awt.Color(255, 255, 204));
        btnTambah.setForeground(new java.awt.Color(92, 172, 183));
        btnTambah.setText("Tambah Kue");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, -1));

        txtStok.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 130, 250, 310);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 293, 630);

        setSize(new java.awt.Dimension(308, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String idStr = txtID.getText();
        String nama = txtNama.getText();
        String hargaStr = txtHarga.getText();
        String stokStr = txtStok.getText();

        if (idStr.isEmpty() || nama.isEmpty() || hargaStr.isEmpty() || stokStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(idStr);
            float harga = Float.parseFloat(hargaStr);
            int stok = Integer.parseInt(stokStr);
            
            if (id < 1 || harga < 1 || stok < 1) {
                JOptionPane.showMessageDialog(this, "ID, Harga, dan Stok harus minimal 1.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            for (Kue k : Admin.tampilkanDaftarKue()) {
                if (k.getIdKue() == id) {
                    JOptionPane.showMessageDialog(this, "ID Kue sudah digunakan. Silakan gunakan ID lain.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (k.getNamaKue().equalsIgnoreCase(nama)) {
                    JOptionPane.showMessageDialog(this, "Nama Kue sudah digunakan.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            Kue kueBaru = new Kue(id, nama, harga, stok);
            Admin.tambahKue(kueBaru);

            JOptionPane.showMessageDialog(this, "Data kue berhasil ditambahkan!", "Berhasil!", JOptionPane.INFORMATION_MESSAGE);

            txtID.setText("");
            txtNama.setText("");
            txtHarga.setText("");
            txtStok.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID, Harga dan Stok harus berupa angka!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnTambahActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
