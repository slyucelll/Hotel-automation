/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otelotamsyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author suleyucel
 */
public class Oda_fiyatlandırma {
    //sqldeki oda bilgisinden oda fiyatını getiriyorum bunu müşteriye oda fiyatını gösterirken kullanıyorum
    public Connection baglan() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/new_scheama1";
        String kullaniciAdi = "root";
        String sifre = "12345678";

        return DriverManager.getConnection(url, kullaniciAdi, sifre);
    }
    
    public double odaFiyatiniGetir(String odaTipi) {

        String sorgu = "SELECT Oda_fıyat FROM new_schema1.oda WHERE Oda_Tıpı = ?";
        double fiyat = 0;

        try (Connection baglanti = baglan(); 
                
             PreparedStatement statement = baglanti.prepareStatement(sorgu)) {
            // Oda tipini sorguya yerleştirir
            statement.setString(1, odaTipi);
            
             // Sorguyu çalıştırır ve sonuçları alır
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    fiyat = rs.getDouble("Oda_fıyat");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return fiyat;
    }
}
