/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otelotamsyonu;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 
 */
public class TemelYonetici {
   
    // Veritabanı bağlantısı oluşturma yöntemi
    protected Connection baglantiOlustur() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
    }
}

