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
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suleyucel
 */
public class HotelManagement extends TemelYonetici {

    public boolean isRoomAvailable(Date startDate, Date endDate, String roomType) {
        Connection baglanti= null;
        try {baglanti = baglantiOlustur();
            

            String sorgu = "SELECT * FROM muster WHERE "
                    + "musterı_odatıpı = ? AND ("
                    + "(gırıs_tarıh <= ? AND cıkıs_tarıh >= ?) OR "
//                    Bu koşul, yeni rezervasyonun mevcut rezervasyonun başlangıç ve
//                 bitiş tarihleri arasında tamamen yer alıp almadığını kontrol eder
                     + "(gırıs_tarıh >= ? AND cıkıs_tarıh <= ?))";
                    
//Bu koşul, yeni rezervasyonun tamamen mevcut rezervasyonun tarih aralığı içinde olup olmadığını kontrol eder.
//        Yani yeni rezervasyonun başlangıç ve bitiş tarihleri,
//        mevcut rezervasyonun başlangıç ve bitiş tarihleri arasında olmalıdır.


// Java Date nesnelerini SQL Date nesnelerine dönüştürme
            java.sql.Date sqlStartDate = new java.sql.Date(startDate.getTime());
            java.sql.Date sqlEndDate = new java.sql.Date(endDate.getTime());
            PreparedStatement ps = baglanti.prepareStatement(sorgu);
            // Sorguya parametreleri ekleme
            ps.setString(1, roomType);
            ps.setDate(2, sqlStartDate);
            ps.setDate(3, sqlEndDate);
            ps.setDate(4, sqlStartDate);
            ps.setDate(5, sqlEndDate);
            

            try (ResultSet rs = ps.executeQuery()) {
 // Sonuç setinde bir kayıt varsa, oda dolu demektir.
                return !rs.next();
            }
        } catch (SQLException e) {
            Logger.getLogger(HotelManagement.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } finally {
            if (baglanti != null) {
                try {
                    baglanti.close();
                } catch (SQLException e) {
                    Logger.getLogger(HotelManagement.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
