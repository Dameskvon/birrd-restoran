/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Restoran_BIRRD;

import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

    public class DatabaseConnection {

        private static Connection koneksi; // Variabel koneksi

        public static Connection getConnection() { // Mengubah nama metode kembali ke getConnection()
            // Periksa apakah koneksi belum dibuat atau sudah ditutup sebelumnya
            if (koneksi == null) {
                try {
                    // Memuat driver JDBC MySQL
                    Class.forName("com.mysql.cj.jdbc.Driver"); 

                    // Membuat koneksi ke database
                    // PASTIKAN DETAIL INI BENAR: URL, Username, Password
                    String url = "jdbc:mysql://localhost:3306/db_birrd"; // Ganti dengan nama database Anda
                    String user = "root";     // Ganti dengan username database Anda
                    String pass = "";         // Ganti dengan password database Anda (kosong jika tidak ada)

                    koneksi = DriverManager.getConnection(url, user, pass);
                    System.out.println("Koneksi berhasil!"); // Pesan sukses ke konsol
                    // JOptionPane.showMessageDialog(null, "Koneksi database berhasil!", "Info Koneksi", JOptionPane.INFORMATION_MESSAGE); // Opsional: pop-up sukses
                } catch (ClassNotFoundException e) {
                    System.out.println("Koneksi gagal: Driver tidak ditemukan! " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Kesalahan Koneksi: Driver database tidak ditemukan.\nPastikan MySQL Connector/J JAR sudah ditambahkan dan driver sudah benar.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                    koneksi = null; // Pastikan koneksi null jika gagal
                } catch (SQLException e) {
                    System.out.println("Koneksi gagal: SQL Error! " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Kesalahan Koneksi SQL: " + e.getMessage() + "\nPastikan MySQL Server berjalan, URL, username, dan password benar.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                    koneksi = null; // Pastikan koneksi null jika gagal
                } catch (Exception e) {
                    System.out.println("Koneksi gagal: Kesalahan umum! " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Kesalahan umum saat koneksi database: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                    koneksi = null; // Pastikan koneksi null jika gagal
                }
            }
            return koneksi;
        }

        // Opsional: Tambahkan metode untuk menutup koneksi jika diperlukan
        public static void closeConnection() {
            if (koneksi != null) {
                try {
                    koneksi.close();
                    koneksi = null;
                    System.out.println("Koneksi database ditutup.");
                } catch (SQLException e) {
                    System.out.println("Gagal menutup koneksi: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }