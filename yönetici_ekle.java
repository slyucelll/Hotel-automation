/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otelotamsyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author suleyucel
 */
public class yönetici_ekle extends javax.swing.JFrame {

    
    public yönetici_ekle() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        txt_tc = new javax.swing.JTextField();
        txt_şifre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Hoefler Text", 2, 12)); // NOI18N
        jLabel1.setText("Ad:");

        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 2, 14)); // NOI18N
        jLabel2.setText("Soyad:");

        jLabel3.setFont(new java.awt.Font("Hiragino Sans", 3, 13)); // NOI18N
        jLabel3.setText("Tc No:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel4.setText("Şifre:");

        txt_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soyadActionPerformed(evt);
            }
        });

        jLabel5.setText("Otel Yönetici Ekle");

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Geri");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Geri");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Çıkış");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Çıkış");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(171, 171, 171))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(183, 183, 183)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ad)
                        .addComponent(txt_soyad)
                        .addComponent(txt_tc)
                        .addComponent(txt_şifre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                    .addContainerGap(183, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(98, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tcActionPerformed

    }//GEN-LAST:event_txt_tcActionPerformed

    private void txt_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soyadActionPerformed

    }//GEN-LAST:event_txt_soyadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement st = c.createStatement();

            String kullanıcıAdı = txt_ad.getText();
            if (!kullanıcıAdı.matches("^[a-zA-Z0-9ıİöÖçÇşŞğĞüÜ]{3,16}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı.", "Hata", JOptionPane.ERROR_MESSAGE);
                return; 
            }

            String soyad = txt_soyad.getText();
            if (!soyad.matches("^[a-zA-ZıİöÖçÇşŞğĞüÜ]{2,}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz soyad.", "Hata", JOptionPane.ERROR_MESSAGE);
                return; 
            }
            
            String şifre = txt_şifre.getText();
            if (!şifre.matches("^\\d{3,}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz şifre.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String tcNo = txt_tc.getText();
            if (!tcNo.matches("[1-9]{1}[0-9]{10}")) {
                JOptionPane.showMessageDialog(null, "Geçersiz TC kimlik numarası.", "Hata", JOptionPane.ERROR_MESSAGE);
                return; 
            }

            // Kullanıcı adının veritabanında var olup olmadığını kontrol etme
            String sorgu = "SELECT * FROM new_schema1.new_table1 WHERE Ad = ?";
            PreparedStatement ps = c.prepareStatement(sorgu);
            ps.setString(1, kullanıcıAdı); 
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Bu kullanıcı adı zaten var.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kullanıcıyı ekleme sorgusu
            String eklemeSorgusu = "INSERT INTO new_schema1.new_table1 (Ad, Soyad, Şifre, Tc) VALUES (?, ?, ?, ?)";
            PreparedStatement psEkleme = c.prepareStatement(eklemeSorgusu);
            psEkleme.setString(1, kullanıcıAdı);
            psEkleme.setString(2, soyad);
            psEkleme.setString(3, şifre);
            psEkleme.setString(4, tcNo);

            int eklemeSonucu = psEkleme.executeUpdate();

            if (eklemeSonucu > 0) {
                JOptionPane.showMessageDialog(null, "Kullanıcı başarıyla eklendi.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
                
                // Kullanıcı sayfasına geçiş yapma
                frmkullanıcısayfası yenıkul = new frmkullanıcısayfası();
                dispose();
                yenıkul.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Kullanıcı eklenemedi.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        
        frmkullanıcısayfası kullanıcısyf=new frmkullanıcısayfası();
       dispose();
       kullanıcısyf.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(yönetici_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yönetici_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yönetici_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yönetici_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yönetici_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_şifre;
    // End of variables declaration//GEN-END:variables
}
