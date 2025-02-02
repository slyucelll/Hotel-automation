/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otelotamsyonu;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class dosya {
    //sqldeki müşterileri tc nosunu isteyerek tablosunu yazdırıyorum.
    public void exportCustomerData() {
        String url = "jdbc:mysql://localhost:3306/new_schema1";
        String username = "root";
        String password = "12345678";

        String tcNo = JOptionPane.showInputDialog(null, "Lütfen raporlamak istediğiniz müşterinin TC kimlik numarasını giriniz:", "Müşteri TC Kimlik Girişi", JOptionPane.QUESTION_MESSAGE);

        if (tcNo == null || !tcNo.matches("[1-9]{1}[0-9]{10}")) {
            JOptionPane.showMessageDialog(null, "Geçersiz TC kimlik numarası.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "SELECT * FROM muster WHERE musterı_tc = ?";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, tcNo);

            try (ResultSet rs = pstmt.executeQuery();
                 BufferedWriter writer = new BufferedWriter(new FileWriter("musteri_rapor.txt"))) {
                // Tarih formatı
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
// Sonuç setinde bir kayıt varsa, müşteri bilgilerini dosyaya yaz
                if (rs.next()) {
                    String musteriAd = rs.getString("musterı_ad");
                    String musteriSoyad = rs.getString("musterı_soyad");
                    String musteriTc = rs.getString("musterı_tc");
                    String musteriCinsiyet = rs.getString("musterı_cınsıyet");
                    String musterıOdaTipi = rs.getString("musterı_odatıpı");
                    java.sql.Date girisTarih = rs.getDate("gırıs_tarıh");
                    java.sql.Date cikisTarih = rs.getDate("cıkıs_tarıh");
                    double ucret = rs.getDouble("ucret");

                    String customerInfo = String.format("Ad: %s, Soyad: %s, TC: %s, Cinsiyet: %s, Oda Tipi: %s, Giriş Tarihi: %s, Çıkış Tarihi: %s, Ücret: %.2f TL%n",
             musteriAd, musteriSoyad, musteriTc, musteriCinsiyet, musterıOdaTipi, dateFormat.format(girisTarih), dateFormat.format(cikisTarih), ucret);
                    // Müşteri bilgilerini dosyaya yaz
                    writer.write(customerInfo);
                    JOptionPane.showMessageDialog(null, "Müşteri bilgileri başarıyla dosyaya yazıldı.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Girilen TC kimlik numarasına sahip müşteri bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Hatası: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Dosya yazma hatası: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        // Programın başlangıç noktası
        new dosya().exportCustomerData();
    }
}
