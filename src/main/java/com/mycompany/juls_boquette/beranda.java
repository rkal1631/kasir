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

        jPanel1 = new javax.swing.JPanel();
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jTabbedPane8 = new javax.swing.JTabbedPane();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jTabbedPane11 = new javax.swing.JTabbedPane();
        jTabbedPane12 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTabbedPane1.addTab("Profil", jTabbedPane2);
        jTabbedPane1.addTab("Home", jTabbedPane4);
        jTabbedPane1.addTab("Kategori", jTabbedPane6);
        jTabbedPane1.addTab("Stok", jTabbedPane5);
        jTabbedPane1.addTab("Laporan", jTabbedPane3);
        jTabbedPane1.addTab("Barang", jTabbedPane7);
        jTabbedPane1.addTab("Keranjang", jTabbedPane8);
        jTabbedPane1.addTab("Data Pembeli", jTabbedPane9);
        jTabbedPane1.addTab("Pembayaran", jTabbedPane10);
        jTabbedPane1.addTab("Manajemen Karyawan", jTabbedPane11);
        jTabbedPane1.addTab("Tambah Data", jTabbedPane12);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 490, 450));

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
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Profil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTabbedPane jTabbedPane11;
    private javax.swing.JTabbedPane jTabbedPane12;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTabbedPane jTabbedPane8;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JLabel kategori;
    private javax.swing.JLabel laporan;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel stok_barang;
    // End of variables declaration//GEN-END:variables
}
