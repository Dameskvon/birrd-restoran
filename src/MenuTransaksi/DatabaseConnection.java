/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MenuTransaksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private final String URL = "jdbc:mysql://localhost/db_birrd";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    public static Connection con;

    // Constructor otomatis koneksi
    public DatabaseConnection() {
        connect();
    }

    void connect() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Koneksi berhasil tersambung ke database.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
            }
        }
    }

    public Connection getCon() {
        return con;
    }
}

