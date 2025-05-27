package menuCustomer;

import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import models.*;

public class LihatKue extends javax.swing.JFrame {

    public LihatKue() {
        initComponents();
        try{
            File fontStyle = new File("src/resources/fonts/Agbalumo-Regular.ttf");
            Font titleFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font txtFont = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(10f);
            jLabel1.setFont(titleFont);
            txtDaftarKue.setFont(txtFont);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDaftarKue = new javax.swing.JTextArea();
        btnKembali = new javax.swing.JLabel();
        jLabelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 143, 188));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Kue:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 6, 220, 30);

        txtDaftarKue.setEditable(false);
        txtDaftarKue.setColumns(20);
        txtDaftarKue.setForeground(new java.awt.Color(102, 102, 102));
        txtDaftarKue.setRows(5);
        jScrollPane1.setViewportView(txtDaftarKue);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 230, 160);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 180, 250, 210);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/Arrow left.png"))); // NOI18N
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        getContentPane().add(btnKembali);
        btnKembali.setBounds(10, 0, 30, 40);

        jLabelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/media/bgAdmin.png"))); // NOI18N
        getContentPane().add(jLabelBG);
        jLabelBG.setBounds(0, 0, 293, 630);

        setSize(new java.awt.Dimension(309, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        MenuCustomer menuCustomer = new MenuCustomer();
        menuCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliMouseClicked

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
                new LihatKue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDaftarKue;
    // End of variables declaration//GEN-END:variables
}
