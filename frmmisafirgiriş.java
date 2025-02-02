/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otelotamsyonu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author suleyucel
 */
public class frmmisafirgiriş extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    HotelManagement hm = new HotelManagement();

    public frmmisafirgiriş() {
        initComponents();
        ComboYaVeriGetir();
        ComboYaVeriGetir2();

    }

    private void veriGetir() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM muster");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int sutunSayisi = metaData.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();
            for (int i = 1; i <= sutunSayisi; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            while (resultSet.next()) {
                Object[] row = new Object[sutunSayisi];
                for (int i = 1; i <= sutunSayisi; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setFont(new java.awt.Font("Toppan Bunkyu Midashi Gothic", 0, 13)); // NOI18N

        jLabel8.setText("Otelde Konaklamak İstediğiniz Tarih :");

        jLabel9.setText("Oda Tipi:");

        jButton4.setText("Hesapla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jButton4)
                .addGap(37, 37, 37)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fiyat Öğren", jPanel2);

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad:");

        jLabel3.setText("Tc No:");

        jLabel4.setText("Cinsiyet:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Oda Tipi Seçiniz:");

        jLabel7.setText("Tarih seçiniz:");

        jLabel6.setText("Ödenecek ücret:");

        jRadioButton1.setText("Sözleşmeyi okudum ve onaylıyorum.");

        jButton2.setText("Ücreti Hesapla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Rezervasyon Oluştur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Erkek");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Kadın");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField3)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(52, 52, 52)
                                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 365, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(411, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rezervasyon Yaptır", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(782, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmIlkEkran yenEkran = new frmIlkEkran();
        dispose();
        yenEkran.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            baglan();
        } catch (SQLException ex) {
            Logger.getLogger(frmMüşteriBilgisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date baslangicTarihi = jDateChooser1.getDate();
        Date bitisTarihi = jDateChooser3.getDate();

        if (baslangicTarihi != null && bitisTarihi != null) {
            long baslangicZamani = baslangicTarihi.getTime();
            long bitisZamani = bitisTarihi.getTime();

            long farkZamani = bitisZamani - baslangicZamani;
            long farkGünler = farkZamani / (1000 * 60 * 60 * 24); // Milisaniyeden güne çeviriyor

            double toplamFiyat = 0;

            if (farkGünler > 0) {
                for (int i = 0; i < farkGünler; i++) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(baslangicTarihi);
                    cal.add(Calendar.DAY_OF_MONTH, i);
                    int haftaninGunu = cal.get(Calendar.DAY_OF_WEEK);

                    if (haftaninGunu >= Calendar.MONDAY && haftaninGunu <= Calendar.THURSDAY) {
                        toplamFiyat += 100;
                    } else {
                        toplamFiyat += 150;
                    }

                }

                String odaTipi = (String) jComboBox3.getSelectedItem();
                double fiyat = odaFiyatiniGetir(odaTipi);

                
                
                HotelManagement hm=new HotelManagement();
                java.sql.Date sqlStartDate = new java.sql.Date(baslangicTarihi.getTime());
                java.sql.Date sqlEndDate = new java.sql.Date(bitisTarihi.getTime());
                
                boolean musait = hm.isRoomAvailable(sqlStartDate, sqlEndDate, odaTipi);

if (musait) {
    jTextField6.setText(String.valueOf(toplamFiyat));
    JOptionPane.showMessageDialog(this, "Başlangıç Tarihi: " + formatDate(baslangicTarihi) + "\nBitiş Tarihi: " + formatDate(bitisTarihi) + "\nOda Türü: " + odaTipi + "\nToplam Gün: " + farkGünler + "\nToplam Fiyat: " + toplamFiyat + " TL");
} else {
    JOptionPane.showMessageDialog(this, "Seçilen tarihlerde oda müsait değil.", "Uyarı", JOptionPane.WARNING_MESSAGE);
}
                
//                toplamFiyat += farkGünler * fiyat;
//
//                jTextField6.setText(String.valueOf(toplamFiyat));
//                JOptionPane.showMessageDialog(this, "Başlangıç Tarihi: " + formatDate(baslangicTarihi) + "\nBitiş Tarihi: " + formatDate(bitisTarihi) + "\nOda Türü: " + odaTipi + "\nToplam Gün: " + farkGünler + "\nToplam Fiyat: " + toplamFiyat + " TL");
//            } else {
//                JOptionPane.showMessageDialog(this, "Lütfen geçerli bir tarih aralığı seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(this, "Lütfen başlangıç ve bitiş tarihlerini seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
//        }
            }
            }
    }//GEN-LAST:event_jButton4ActionPerformed
    public double odaFiyatiniGetir(String odaTipi) {

        String sorgu = "SELECT Oda_fıyat FROM new_schema1.oda WHERE Oda_Tıpı=?";
        double fiyat = 0;

        try (Connection baglanti = baglan(); PreparedStatement statement = baglanti.prepareStatement(sorgu)) {
            statement.setString(1, odaTipi);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    fiyat = rs.getDouble("Oda_fıyat");

                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return fiyat;
    }

    private void ComboYaVeriGetir() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT Oda_tıpı FROM oda");

            while (resultSet.next()) {
                String odaTipi = resultSet.getString("Oda_tıpı");
                jComboBox3.addItem(odaTipi);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void ComboYaVeriGetir2() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT DISTINCT Oda_tıpı FROM oda");

            while (resultSet.next()) {
                String odaTipi = resultSet.getString("Oda_tıpı");
                jComboBox1.addItem(odaTipi);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection baglan() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/new_schema1";
        String kullaniciAdi = "root";
        String sifre = "12345678";

        return DriverManager.getConnection(url, kullaniciAdi, sifre);
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//      

        try {
            baglan();
        } catch (SQLException ex) {
            Logger.getLogger(frmMüşteriBilgisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date baslangicTarihi = jDateChooser2.getDate();
        Date bitisTarihi = jDateChooser4.getDate();

        if (baslangicTarihi != null && bitisTarihi != null) {
            long baslangicZamani = baslangicTarihi.getTime();
            long bitisZamani = bitisTarihi.getTime();

            long farkZamani = bitisZamani - baslangicZamani;
            long farkGünler = farkZamani / (1000 * 60 * 60 * 24); // Milisaniyeden güne çeviriyor
//            iki tarih arasındaki gün sayısını hesaplamak için kullanılır
//1000 (milisaniye) * 60 (saniye) * 60 (dakika) * 24 (saat) = 86,400,000 milisaniye (1 gün)

            double toplamFiyat = 0;

            if (farkGünler > 0) {
                for (int i = 0; i < farkGünler; i++) {
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(baslangicTarihi);
                    cal.add(Calendar.DAY_OF_MONTH, i);
//                    add(Calendar.DAY_OF_MONTH, i) metodu, Calendar nesnesine i gün ekler. Bu, döngüde her iterasyonda bir gün ileri gider.
                    int haftaninGunu = cal.get(Calendar.DAY_OF_WEEK);
//get(Calendar.DAY_OF_WEEK) metodu, Calendar nesnesinin temsil ettiği günün haftanın hangi günü olduğunu belirler. 
//Bu değer, haftanın gününü temsil eden bir sabit (Sunday = 1, Monday = 2, ..., Saturday = 7) olarak döner.
                    if (haftaninGunu >= Calendar.MONDAY && haftaninGunu <= Calendar.THURSDAY) {
                        toplamFiyat += 100;
                    } else {
                        toplamFiyat += 150;
                    }
//ğer gün Pazartesi ile Perşembe arasındaysa, toplamFiyat 100 birim artırılır.
//Aksi takdirde (Cuma, Cumartesi veya Pazar), toplamFiyat 150 birim artırılır.
                }

                String odaTipi = (String) jComboBox1.getSelectedItem();
                double fiyat = odaFiyatiniGetir(odaTipi);

                toplamFiyat += farkGünler * fiyat;

                jTextField5.setText(String.valueOf(toplamFiyat));
                JOptionPane.showMessageDialog(this, "Başlangıç Tarihi: " + formatDate(baslangicTarihi) + "\nBitiş Tarihi: " + formatDate(bitisTarihi) + "\nOda Türü: " + odaTipi + "\nToplam Gün: " + farkGünler + "\nToplam Fiyat: " + toplamFiyat + " TL");
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen geçerli bir tarih aralığı seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen başlangıç ve bitiş tarihlerini seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        String cinsiyet = jButton2.isSelected() ? "Erkek" : "Kadın";

        String ad = jTextField1.getText();
        if (!ad.matches("^[a-zA-Z0-9ıİöÖçÇşŞğĞüÜ]{3,16}$")) {
            JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String soyad = jTextField2.getText();
        if (!soyad.matches("^[a-zA-ZıİöÖçÇşŞğĞüÜ]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Geçersiz soyad.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String tc = jTextField3.getText();
        if (!tc.matches("[1-9]{1}[0-9]{10}")) {
            JOptionPane.showMessageDialog(null, "Geçersiz TC kimlik numarası.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            java.util.Date date = jDateChooser2.getDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            java.util.Date date1 = jDateChooser4.getDate();
            java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
            String roomType = (String) jComboBox1.getSelectedItem();

            boolean isAvailable = hm.isRoomAvailable(sqlDate, sqlDate1, roomType);

            if (isAvailable) {
                PreparedStatement statement = connection.prepareStatement(
                        "INSERT INTO muster (musterı_ad, musterı_soyad, musterı_tc, musterı_cınsıyet, musterı_odatıpı, gırıs_tarıh, cıkıs_tarıh, ucret) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
                );

                statement.setString(1, jTextField1.getText());
                statement.setString(2, jTextField2.getText());
                statement.setString(3, jTextField3.getText());
                statement.setString(4, jButton2.isSelected() ? "Erkek" : "Kadın");
                statement.setString(5, (String) jComboBox1.getSelectedItem());
                statement.setDate(6, sqlDate);
                statement.setDate(7, sqlDate1);
                statement.setString(8, jTextField5.getText());

                int affectedRows = statement.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Müşteri başarıyla kaydedildi.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                    veriGetir();
                } else {
                    JOptionPane.showMessageDialog(this, "Müşteri kaydedilemedi.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                }
                statement.close();
            } else {
                JOptionPane.showMessageDialog(null, "Oda bu tarihlerde müsait değil.", "Availability", JOptionPane.WARNING_MESSAGE);
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Veritabanı bağlantı hatası: " + ex.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

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
            java.util.logging.Logger.getLogger(frmmisafirgiriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmisafirgiriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmisafirgiriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmisafirgiriş.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmisafirgiriş().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
