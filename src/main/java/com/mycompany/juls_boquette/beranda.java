/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.juls_boquette;

/**
 *
 * @author alya
 */
public class beranda extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public beranda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Profil = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        kategori = new javax.swing.JLabel();
        stok_barang = new javax.swing.JLabel();
        laporan = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        profil = new javax.swing.JTabbedPane();
        home = new javax.swing.JTabbedPane();
        Kategori = new javax.swing.JTabbedPane();
        Stok = new javax.swing.JTabbedPane();
        Laporan = new javax.swing.JTabbedPane();
        Barang = new javax.swing.JTabbedPane();
        Keranjang = new javax.swing.JTabbedPane();
        Pembayaran = new javax.swing.JTabbedPane();
        Manajemen = new javax.swing.JTabbedPane();
        tambah_data = new javax.swing.JTabbedPane();
        data_pembeli = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        Nama2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juls_boquette/jul's bouqet logo 150.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(244, 160, 177));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Profil.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        Profil.setText("Profil");
        jPanel2.add(Profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 37, -1));

        Home.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        Home.setText("Home");
        jPanel2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 37, -1));

        kategori.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        kategori.setText("Kategori");
        jPanel2.add(kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 54, -1));

        stok_barang.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        stok_barang.setText("Stok Bahan Baku");
        jPanel2.add(stok_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        laporan.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        laporan.setText("Laporan");
        jPanel2.add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 61, -1));

        logout.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        logout.setText("Logout");
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 76, -1));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 34, 37, -1));

        jLabel2.setText("____________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel3.setText("____________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("____________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("____________________________");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("____________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 170, 370));

        jTabbedPane1.addTab("Profil", profil);
        jTabbedPane1.addTab("Home", home);
        jTabbedPane1.addTab("Kategori", Kategori);
        jTabbedPane1.addTab("Stok", Stok);
        jTabbedPane1.addTab("Laporan", Laporan);
        jTabbedPane1.addTab("Barang", Barang);
        jTabbedPane1.addTab("Keranjang", Keranjang);
        jTabbedPane1.addTab("Pembayaran", Pembayaran);
        jTabbedPane1.addTab("Manajemen Karyawan", Manajemen);
        jTabbedPane1.addTab("Tambah Data", tambah_data);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Kanit", 1, 36)); // NOI18N
        jLabel7.setText("DATA PEMBELI");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(110, 10, 247, 55);

        jLabel9.setFont(new java.awt.Font("Livvic", 1, 24)); // NOI18N
        jLabel9.setText("Nama");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 230, 71, 31);

        Nama.setBackground(new java.awt.Color(253, 192, 204));
        jPanel4.add(Nama);
        Nama.setBounds(150, 340, 260, 30);

        jLabel10.setFont(new java.awt.Font("Livvic", 1, 24)); // NOI18N
        jLabel10.setText("Alamat");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(40, 280, 120, 31);

        jLabel11.setFont(new java.awt.Font("Livvic", 1, 14)); // NOI18N
        jLabel11.setText("No. Handphone");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(30, 340, 120, 19);

        Nama1.setBackground(new java.awt.Color(253, 192, 204));
        jPanel4.add(Nama1);
        Nama1.setBounds(150, 230, 260, 30);

        Nama2.setBackground(new java.awt.Color(253, 192, 204));
        jPanel4.add(Nama2);
        Nama2.setBounds(150, 280, 260, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/juls_boquette/jul's bouqet logo 150.png"))); // NOI18N
        jPanel4.add(jLabel12);
        jLabel12.setBounds(170, 70, 150, 150);

        data_pembeli.addTab("tab1", jPanel4);

        jTabbedPane1.addTab("Data Pembeli", data_pembeli);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, -100, 490, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 656, 454));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Barang;
    private javax.swing.JLabel Home;
    private javax.swing.JTabbedPane Kategori;
    private javax.swing.JTabbedPane Keranjang;
    private javax.swing.JTabbedPane Laporan;
    private javax.swing.JTabbedPane Manajemen;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nama1;
    private javax.swing.JTextField Nama2;
    private javax.swing.JTabbedPane Pembayaran;
    private javax.swing.JLabel Profil;
    private javax.swing.JTabbedPane Stok;
    private javax.swing.JTabbedPane data_pembeli;
    private javax.swing.JTabbedPane home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel kategori;
    private javax.swing.JLabel laporan;
    private javax.swing.JLabel logout;
    private javax.swing.JTabbedPane profil;
    private javax.swing.JLabel stok_barang;
    private javax.swing.JTabbedPane tambah_data;
    // End of variables declaration//GEN-END:variables
}
