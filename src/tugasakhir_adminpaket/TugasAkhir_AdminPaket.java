/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir_adminpaket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class TugasAkhir_AdminPaket {
    public static Connection con;
    public static Statement stm;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost/dbpaket";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil");
            
        }catch(Exception e){
            System.err.println("Koneksi Gagal" +e.getMessage());
        }
    }
    
}
