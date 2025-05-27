package menuAdmin;

import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.*;

public class HapusKue extends javax.swing.JFrame {

    public HapusKue() {
        initComponents();
        try {
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font btnFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(18f);
            Font subtitleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(12f);
            Font txtFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(10f);
            jLabel1.setFont(subtitleFont);
            txtDaftarKue.setFont(txtFont);
            txtID.setFont(titleFont);
            btnHapus.setFont(btnFont);
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
        btnHapus = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
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
        btnKembali.setBounds(10, 0, 40, 40);

        jPanel1.setBackground(new java.awt.Color(255, 143, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDaftarKue.setEditable(false);
        txtDaftarKue.setColumns(20);
        txtDaftarKue.setForeground(new java.awt.Color(102, 102, 102));
        txtDaftarKue.setRows(5);
        jScrollPane1.setViewportView(txtDaftarKue);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 230, 180));

        btnHapus.setBackground(new java.awt.Color(231, 136, 149));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, -1));

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Kue");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 250, 310);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 290, 630);

        setSize(new java.awt.Dimension(303, 637));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        MenuAdmin menuAdmin = new MenuAdmin();
        menuAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String idStr = txtID.getText();
        if (idStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Masukkan ID kue yang ingin dihapus!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(idStr);
            if (id < 1) {
                JOptionPane.showMessageDialog(this, "ID harus minimal 1!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            boolean ditemukan = false;
            for (int i = 0; i < Admin.daftarKue.size(); i++) {
                if (Admin.daftarKue.get(i).getIdKue() == id) {
                    Admin.daftarKue.remove(i);
                    ditemukan = true;
                    break;
                }
            }
            if (ditemukan) {
                JOptionPane.showMessageDialog(this, "Kue berhasil dihapus.", "Berhasil!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Kue dengan ID tersebut tidak ditemukan.", "Peringatan!", JOptionPane.WARNING_MESSAGE);
            }
            txtID.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnHapusActionPerformed

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
                new HapusKue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDaftarKue;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
