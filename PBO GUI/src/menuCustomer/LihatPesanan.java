package menuCustomer;

import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import models.*;

public class LihatPesanan extends javax.swing.JFrame {

    public LihatPesanan() {
        initComponents();
        try{
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font txtFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(10f);
            jLabel1.setFont(titleFont);
            txtDaftarPesanan.setFont(txtFont);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKembali = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDaftarPesanan = new javax.swing.JTextArea();
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
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Pesanan:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(9, 9, 230, 30);

        txtDaftarPesanan.setEditable(false);
        txtDaftarPesanan.setColumns(20);
        txtDaftarPesanan.setForeground(new java.awt.Color(102, 102, 102));
        txtDaftarPesanan.setRows(5);
        jScrollPane1.setViewportView(txtDaftarPesanan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 230, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 60, 250, 410);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 290, 632);

        setSize(new java.awt.Dimension(306, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        MenuCustomer menuCustomer = new MenuCustomer();
        menuCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String currentUser = UserSession.getUsername();
        StringBuilder sb = new StringBuilder();
        ArrayList<Transaksi> daftarTransaksi = Transaksi.getDaftarTransaksi();
        boolean adaTransaksi = false;
        for (Transaksi trx : daftarTransaksi) {
            if (trx.getCustomer().equals(currentUser)) {
                sb.append(trx.cetakNota());
                adaTransaksi = true;
            }
        }
        if (!adaTransaksi) {
            sb.append("Belum ada transaksi.");
        }
        txtDaftarPesanan.setText(sb.toString());
        txtDaftarPesanan.setCaretPosition(0);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LihatPesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDaftarPesanan;
    // End of variables declaration//GEN-END:variables
}
