/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Restoran_BIRRD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ikhla
 */
public class Login extends javax.swing.JFrame {

       public Login() {
        initComponents();
        // Center the login window on the screen
        this.setLocationRelativeTo(null); 
    }

    /**
     * The 'user' inner class.
     * This class is currently not directly utilized within the login action itself,
     * but it's retained as it may serve a purpose in other parts of your application.
     * If it has no further use, it can also be removed for further reduction.
     * NOTE: Accessing UI components (jTextField1, jPasswordField1) directly in
     * this constructor is generally not recommended as these might not be
     * fully initialized or may lead to NullPointerException if this class
     * is instantiated out of context. It's better to pass values as parameters.
     */
    class user {
        int id_user, id_level;
        String username, password, nama_user;

        public user(){
            this.id_user = 0;
            // These lines might cause issues if not called after UI components are rendered.
            // For robust design, pass username/password as parameters to this constructor.
            this.username = jTextField1.getText(); 
            this.password = jPasswordField1.getText();
            this.nama_user = "";
            this.id_level = 0;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SILAHKAN LOGIN  ");
        jLabel4.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESTORAN BIRRD");
        jLabel3.setToolTipText("");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SILAHKAN LOGIN  ");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(180, 180, 180))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String username = jTextField1.getText().trim();
        String password = new String(jPasswordField1.getPassword());

        // Validasi field kosong
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username dan Password tidak boleh kosong. Harap masukkan keduanya.", "Login Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // --- PERINGATAN KEAMANAN KRITIS ---
        // Menyimpan dan membandingkan password dalam TEKS BIASA SANGAT TIDAK AMAN.
        // Dalam aplikasi nyata, Anda HARUS melakukan hash dan salt pada password sebelum menyimpannya
        // di database. Kemudian, saat pengguna mencoba login, Anda melakukan hash pada password yang dimasukkan
        // dengan metode yang sama dan membandingkan hasil hash dengan hash yang tersimpan.
        // Library seperti jBCrypt atau BCryptPasswordEncoder dari Spring Security direkomendasikan.
        // ---------------------------------

        // Query SQL untuk memeriksa kredensial dan mengambil level pengguna
        String sql = "SELECT id_level FROM user WHERE username = ? AND password = ?"; 

        // Gunakan try-with-resources untuk memastikan sumber daya database otomatis ditutup
        try (Connection conn = DatabaseConnection.getConnection(); // Mendapatkan koneksi database
             PreparedStatement pst = conn.prepareStatement(sql); // Membuat prepared statement
             ) {

            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Gagal terhubung ke database. Harap periksa pengaturan koneksi database Anda.", "Kesalahan Koneksi Database", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Menetapkan parameter untuk prepared statement
            pst.setString(1, username);
            pst.setString(2, password);

            try (ResultSet rs = pst.executeQuery()) { // Menjalankan query dan mendapatkan result set
                if (rs.next()) {
                    // Login berhasil
                    String userLevel = rs.getString("id_level"); // Mendapatkan level pengguna dari result set
                    this.dispose();
                    if (userLevel.equals("1")) { 
                        DashboardAdmin adminDashboard = new DashboardAdmin();
                        adminDashboard.setVisible(true);
                    } else if (userLevel.equals("2")) { // Jika level adalah Kasir
                        DashboardKasir kasirDashboard = new DashboardKasir();
                        kasirDashboard.setVisible(true);
                    } else if (userLevel.equals("3")) { // Jika level adalah Manajer
                        DashboardManajer manajerDashboard = new DashboardManajer();
                        manajerDashboard.setVisible(true);
                    } else { // Level pengguna tidak dikenal
                        JOptionPane.showMessageDialog(this, "Level pengguna tidak dikenal terdeteksi. Harap hubungi dukungan.", "Login Error", JOptionPane.ERROR_MESSAGE);
                        // Log level yang tidak terduga ini untuk debugging/peninjauan administrasi
                        System.err.println("Unexpected user level ID: " + userLevel + " for username: " + username);
                    }
                } else {
                    // Login gagal (tidak ada username/password yang cocok ditemukan)
                    JOptionPane.showMessageDialog(this, "Username atau Password tidak valid. Silakan coba lagi.", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            // Menangani kesalahan khusus SQL (misalnya, masalah koneksi, query tidak valid)
            JOptionPane.showMessageDialog(this, "Kesalahan database: " + e.getMessage() + "\nHarap hubungi dukungan.", "Login Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Cetak stack trace untuk tujuan debugging
        } catch (Exception e) {
            // Menangkap pengecualian tak terduga lainnya
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan tak terduga selama login: " + e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0); 
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
