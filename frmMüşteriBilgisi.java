/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otelotamsyonu;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class frmMüşteriBilgisi extends javax.swing.JFrame {
// Tablo modeli oluşturma

    DefaultTableModel model = new DefaultTableModel();
    // HotelManagement sınıfı örneği oluşturma
    HotelManagement hm = new HotelManagement();

    public frmMüşteriBilgisi() {
        initComponents();
        // ComboBox'a veri ekleme
        ComboYaVeriGetir();
        // ComboBox'tan seçili oda tipini alma
        String roomType = (String) jComboBox1.getSelectedItem();
        // Tarih seçim bileşenlerinden tarihleri alma
        Date startDate = jDateChooser1.getDate();
        Date endDate = jDateChooser2.getDate();

    }
// Veritabanından müşteri bilgilerini getirir ve tabloya ekler

    private void veriGetir() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM muster");
// metadata kullanarak otomatik olarak sütun adları alınır
            ResultSetMetaData metaData = resultSet.getMetaData();
            int sutunSayisi = metaData.getColumnCount();
// Yeni tablo modeli oluşturma
            DefaultTableModel model = new DefaultTableModel();
            // Sütun adlarını tablo modeline ekleme
            for (int i = 1; i <= sutunSayisi; i++) {
                model.addColumn(metaData.getColumnName(i));
            }
            // Sonuç setindeki satırları tablo modeline ekleme
            while (resultSet.next()) {
                Object[] row = new Object[sutunSayisi];
                for (int i = 1; i <= sutunSayisi; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            tablo.setModel(model);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {

        }
    }

    private void ComboYaVeriGetir() {
       // Veritabanından oda tiplerini alıp ComboBox'a ekler
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Oda_Numarası,Oda_Tıpı FROM oda ORDER BY  Oda_Tıpı, Oda_Numarası");

            while (resultSet.next()) {
                String odaTipi = resultSet.getString("Oda_Tıpı");
                int odaNumarasi = resultSet.getInt("Oda_Numarası");
                jComboBox1.addItem(odaTipi);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection baglan() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/new_schema1";
        String kullaniciAdi = "root";
        String sifre = "12345678";

        return DriverManager.getConnection(url, kullaniciAdi, sifre);
    }

    public Connection baglantı() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/new_schema1";
        String kullaniciAdi = "root";
        String sifre = "12345678";

        return DriverManager.getConnection(url, kullaniciAdi, sifre);
    }

    public double odaFiyatiniGetir(String odaTipi) {
//oda türüne özel oda tablosundaki oda ücretini getiriyor.
        String sorgu = "SELECT Oda_fıyat FROM new_schema1.oda WHERE  Oda_Tıpı = ?";
        double fiyat = 0;

        try (Connection baglanti = baglan(); PreparedStatement statement = baglanti.prepareStatement(sorgu)) {
            statement.setString(1, odaTipi);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    fiyat = rs.getDouble("Oda_fıyat");
                }
            }
        } catch (SQLException ex) {

        }

        return fiyat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "Tc No", "Cinsiyet", "Oda tipi", "Giriş Tarihi", "Çıkış Tarihi", "Ücret"
            }
        ));
        jScrollPane1.setViewportView(tablo);

        jLabel1.setText("Müşteri Ekle");

        jLabel2.setText("Ad");

        jLabel3.setText("Soyad");

        jLabel4.setText("Tc No");

        jLabel5.setText("Seçilen Oda Tipi");

        jButton1.setText("Rezervasyon Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Müşteri Ekstra Harcama Ekle");

        jButton2.setText("Ekle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Seçilen Müşteriyi Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Cinsiyet");

        jRadioButton1.setText("Kadın");

        jRadioButton2.setText("Erkek");

        jLabel8.setText("Tarih Seçiniz:");

        jButton3.setText("Toplam Ücret Hesapla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Geri");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Müşterileri Göster");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jButton7.setText("Müşteri Ad ve Soyad Listele");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 936, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton3)
                                .addGap(52, 52, 52)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(439, 439, 439)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(129, 129, 129)
                                                .addComponent(jButton6))
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(125, 125, 125)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton1)
                                                .addComponent(jRadioButton2)))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(53, 53, 53))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(277, 277, 277))))
        );

        jRadioButton2.getAccessibleContext().setAccessibleParent(jRadioButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Rezervasyon ekleyen,kayıt oluşturan button. Regex kontrolllerini yaptıktan sonra oda müsaitse rezervasyon yapıyor.
        String cinsiyet = jButton2.isSelected() ? "Erkek" : "Kadın";

        String ad = jTextField1.getText();
        if (!ad.matches("^[a-zA-Z0-9]{3,16}$")) {
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
            java.util.Date date = jDateChooser1.getDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            java.util.Date date1 = jDateChooser2.getDate();
            java.sql.Date sqlDate1 = new java.sql.Date(date1.getTime());
            String roomType = (String) jComboBox1.getSelectedItem();
            //odanın müsaitliği kontorl ediliyor,true dönerse Insert Intoyla rezervasyon gerçekleşiyor.
            boolean isAvailable = hm.isRoomAvailable(sqlDate, sqlDate1, roomType);

            if (isAvailable) {
                PreparedStatement statement = connection.prepareStatement(
                        "INSERT INTO muster (musterı_ad, musterı_soyad, musterı_tc, musterı_cınsıyet, musterı_odatıpı, gırıs_tarıh, cıkıs_tarıh, ucret) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
                );
                System.out.println("hata 3");
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

    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Rezervasyon yapmadan önce müşteriye fiyat bilgisi verilmesi için öncesinde fiyatı öğrenip daha sonra rezervasyon yapıyor.

        try {
            baglan();
        } catch (SQLException ex) {
            Logger.getLogger(frmMüşteriBilgisi.class.getName()).log(Level.SEVERE, null, ex);
        }

        Date startDate = jDateChooser1.getDate();
        Date endDate = jDateChooser2.getDate();

        if (startDate != null && endDate != null) {
            long baslangicZamani = startDate.getTime();
            long bitisZamani = endDate.getTime();

            long farkZamani = bitisZamani - baslangicZamani;
            long farkGünler = farkZamani / (1000 * 60 * 60 * 24); // Milisaniyeden güne çeviriyor

            double toplamFiyat = 0;
//Bu kod, verilen tarih aralığındaki her gün için haftanın gününe göre fiyatlandırma yapar ve toplam fiyatı hesaplar. 
//farkGünler kadar çarpılarak , her günün fiyatını toplamFiyat değişkenine ekler. 
//        Pazartesi ile Perşembe arasındaki günler daha ucuz (100 birim),
//        Cuma ile Pazar arasındaki günler ise daha pahalıdır (150 birim).
            if (farkGünler > 0) {
                for (int i = 0; i < farkGünler; i++) {
                    Calendar cal = Calendar.getInstance();
//                    Yeni bir Calendar nesnesi oluşturulur. Bu nesne, tarih ve zaman işlemleri için kullanılır.
                    cal.setTime(startDate);
                    cal.add(Calendar.DAY_OF_MONTH, i);
//                    Calendar nesnesine, i kadar gün eklenir. Bu, döngüde her iterasyonda bir gün ileri gider.
                    int haftaninGunu = cal.get(Calendar.DAY_OF_WEEK);

                    if (haftaninGunu >= Calendar.MONDAY && haftaninGunu <= Calendar.THURSDAY) {
                        toplamFiyat += 100;
                    } else {
                        toplamFiyat += 150;
                    }

                }

                String odaTipi = (String) jComboBox1.getSelectedItem();
                double fiyat = odaFiyatiniGetir(odaTipi);

                toplamFiyat += farkGünler * fiyat;

                jTextField5.setText(String.valueOf(toplamFiyat));
                JOptionPane.showMessageDialog(this, "Başlangıç Tarihi: " + formatDate(startDate) + "\nBitiş Tarihi: " + formatDate(endDate) + "\nOda Türü: " + odaTipi + "\nToplam Gün: " + farkGünler + "\nToplam Fiyat: " + toplamFiyat + " TL");
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen geçerli bir tarih aralığı seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen başlangıç ve bitiş tarihlerini seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //sqlden ve tablodan misafir silmek için kullanılıyor.
        int selectedRow = tablo.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Lütfen bir müşteri seçin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tcString = (String) tablo.getValueAt(selectedRow, 2);

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            String sql = "DELETE FROM muster WHERE musterı_tc = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, tcString);
            int affectedRows = statement.executeUpdate();
//            affectedRows değişkeni, silme işlemi sonucunda etkilenen satır sayısını tutar.
//          SQL sorgusu veritabanında çalıştırılır ve sorgunun etkilediği satır 
//        sayısı bir tamsayı olarak döndürülür. Bu tamsayı değeri, affectedRows değişkenine atanır.
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Müşteri başarıyla silindi.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                veriGetir();
            } else {
                JOptionPane.showMessageDialog(this, "Silinecek müşteri bulunamadı.", "Uyarı", JOptionPane.WARNING_MESSAGE);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(this, "Müşteri silinirken bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmkullanıcısayfası odabil = new frmkullanıcısayfası();
        dispose();
        odabil.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //misafirler ekstra harcama yaptıklarında ücreti güncellemek için kullanılıyor.
        double yeniUcret = Double.parseDouble(jTextField4.getText());
        int selectedRow = tablo.getSelectedRow();
        String selectedOda = "";
        selectedOda = tablo.getValueAt(selectedRow, 2).toString();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678")) {
            double mevcutUcret = 0.0;
            String sql = "SELECT Ucret FROM muster WHERE musterı_tc = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, selectedOda);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    mevcutUcret = rs.getDouble("Ucret");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            double toplamUcret = mevcutUcret + yeniUcret;

            sql = "UPDATE muster SET Ucret = ? WHERE musterı_tc = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setDouble(1, toplamUcret);
                pstmt.setString(2, selectedOda);
                pstmt.executeUpdate();

                System.out.println("Oda ücretleri güncellendi.");
                veriGetir();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_jButton2ActionPerformed


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        veriGetir();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
// Veritabanından müşteri ad ve soyadlarını içeren listeyi al
        ArrayList<String> adSoyadListesi = adSoyadListesiGetir();
        // JList bileşeni için bir model oluştur
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Ad soyad listesini JList'e ekleme
        for (String adSoyad : adSoyadListesi) {
            listModel.addElement(adSoyad);
        }

        jList1.setModel(listModel);


    }//GEN-LAST:event_jButton7ActionPerformed
    private ArrayList<String> adSoyadListesiGetir() {
        // Müşteri ad soyadlarını tutacak bir ArrayList oluşturur
        ArrayList<String> adSoyadListesi = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678"); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT musterı_ad, musterı_soyad FROM muster")) {
// Sonuç seti üzerinde gezinir ve ad soyad çiftlerini listeye ekler
            while (rs.next()) {
                String adSoyad = rs.getString("musterı_ad") + " " + rs.getString("musterı_soyad");
                adSoyadListesi.add(adSoyad);
            }

        } catch (SQLException e) {

        }

        return adSoyadListesi;
    }
// SimpleDateFormat("dd/MM/yyyy") ifadesi, 
//  gün/ay/yıl formatında bir SimpleDateFormat nesnesi oluşturur.
//    Date'i  String'e dönüştürür
    private String formatDate(Date date) {
        // SimpleDateFormat nesnesi oluşturma ve formatı ayarlama
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMüşteriBilgisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables
}
