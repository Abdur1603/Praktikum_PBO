package menuCustomer;

import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.*;

public class PesanKue extends javax.swing.JFrame {

    public PesanKue() {
        initComponents();
        try {
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            Font subtitleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(12f);
            Font txtFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(10f);
            jLabel2.setFont(subtitleFont);
            jLabel3.setFont(subtitleFont);
            txtDaftarKue.setFont(txtFont);
            txtID.setFont(titleFont);
            txtJumlah.setFont(titleFont);
            btnSimpan.setFont(btnFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDaftarKue = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        txtJumlah = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Arrow left.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(10, 0, 37, 40);

        jPanel1.setBackground(new java.awt.Color(255, 143, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDaftarKue.setEditable(false);
        txtDaftarKue.setColumns(20);
        txtDaftarKue.setForeground(new java.awt.Color(102, 102, 102));
        txtDaftarKue.setRows(5);
        jScrollPane1.setViewportView(txtDaftarKue);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 250));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Kue");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, -1));

        btnSimpan.setBackground(new java.awt.Color(255, 255, 204));
        btnSimpan.setForeground(new java.awt.Color(92, 172, 183));
        btnSimpan.setText("Simpan Perubahan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 230, 40));

        txtJumlah.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, -1));

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 50, 250, 430);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 290, 630);

        setSize(new java.awt.Dimension(305, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        MenuCustomer menuCustomer = new MenuCustomer();
        menuCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            int idKue = Integer.parseInt(txtID.getText().trim());
            int jumlah = Integer.parseInt(txtJumlah.getText().trim());
            Kue kueDipilih = null;
            for (Kue k : Admin.tampilkanDaftarKue()) {
                if (k.getIdKue() == idKue) {
                    kueDipilih = k;
                    break;
                }
            }
            if (kueDipilih == null) {
                JOptionPane.showMessageDialog(this, "Kue dengan ID tersebut tidak ditemukan.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (jumlah <= 0) {
                JOptionPane.showMessageDialog(this, "Jumlah harus lebih dari 0.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (jumlah > kueDipilih.getStok()) {
                JOptionPane.showMessageDialog(this, "Stok tidak mencukupi.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int newId = Transaksi.getDaftarTransaksi().size() + 1;
            Transaksi trx = new Transaksi(newId, UserSession.getUsername());

            trx.tambahKue(kueDipilih.getNamaKue(), jumlah, kueDipilih.getHarga());
            trx.hitungTotal();
            Transaksi.tambahTransaksi(trx);
            kueDipilih.updateStok(kueDipilih.getStok() - jumlah);
            JOptionPane.showMessageDialog(this, trx.cetakNota());
            txtID.setText("");
            txtJumlah.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID dan Jumlah harus berupa angka.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        StringBuilder sb = new StringBuilder();
        ArrayList<Kue> listKue = Admin.tampilkanDaftarKue();

        if (listKue.isEmpty()) {
            sb.append("Belum ada data kue.");
        } else {
            for (Kue k : listKue) {
                sb.append("ID Kue: ").append(k.getIdKue()).append("\n");
                sb.append("Nama: ").append(k.getNamaKue()).append("\n");
                sb.append("Harga: Rp").append(String.format("%.2f", k.getHarga())).append("\n");
                sb.append("Stok: ").append(k.getStok()).append("\n\n");
            }
        }
        txtDaftarKue.setText(sb.toString());
        txtDaftarKue.setCaretPosition(0);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanKue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDaftarKue;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJumlah;
    // End of variables declaration//GEN-END:variables
}
