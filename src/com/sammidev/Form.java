package com.sammidev;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sammidev
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    private DefaultTableModel model;
    
    public Form() {
        initComponents();
        
        // membuat tabel model
        model = new DefaultTableModel();
        
        // tambahkan tablemodel ke table
        TableMahasiswa.setModel(model);
        
//  mata_kuliah 
//  hari VARCHAR(10) NOT NULL,
// waktu_mulai TIME
//  waktu_selesai TIME
        
        model.addColumn("mata_kuliah");
        model.addColumn("nama_dosen");
        model.addColumn("hari");
        model.addColumn("waktu_mulai");
        model.addColumn("waktu_selesai");
        
        loadData();
    }
    
    public void loadData() {
        // hapus seluruh data
        model.getDataVector().removeAllElements();
        // memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        try {
            Connection c = KoneksiDatabase.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM tb_jadwal_kuliah";
            ResultSet r = s.executeQuery(sql);
            while(r.next()) {
                // lakukan penulusuran baris
                Object[] o = new Object[5];
                o[0] = r.getString("mata_kuliah");
                o[1] = r.getString("nama_dosen");
                o[2] = r.getString("hari");
                o[3] = r.getString("waktu_mulai");
                o[4] = r.getString("waktu_selesai");
                model.addRow(o);
            }
            
            r.close();
            s.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableMahasiswa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        inputHari = new javax.swing.JTextField();
        inputMatkul = new javax.swing.JTextField();
        inputDosen = new javax.swing.JTextField();
        inputMulai = new javax.swing.JTextField();
        inputSelesai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Hari");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Matkul");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Dosen");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Jam Mulai");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jam Selesai");

        TableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hari", "Matkul", "Dosen", "Jam Mulai", "Jam Selesai"
            }
        ));
        TableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableMahasiswa);

        inputMulai.setText("contoh : 10:00:12");
        inputMulai.setToolTipText("");
        inputMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMulaiActionPerformed(evt);
            }
        });

        inputSelesai.setText("contoh : 12:30:00");
        inputSelesai.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputHari, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(inputHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        exit.setText("Keluar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

        String matkul       = inputMatkul.getText();
        String namadosen    = inputDosen.getText();
        String hari         = inputHari.getText();
        String waktumulai   = inputMulai.getText();
        String waktuselesai = inputSelesai.getText();
            
        try {
            Connection c = KoneksiDatabase.getConnection();
            String sql = "INSERT INTO tb_jadwal_kuliah(mata_kuliah,nama_dosen,hari,waktu_mulai,waktu_selesai) VALUES (?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1,matkul);
            p.setString(2,namadosen);
            p.setString(3,hari);
            p.setString(4,waktumulai);
            p.setString(5,waktuselesai);
            p.executeUpdate();
            p.close();
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("terjadi error pada saat insert data");
        }finally {
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = TableMahasiswa.getSelectedRow();
        if(i == -1) {
            // tidak ada baris yang tedeteksi
            return;
        }
        
     
        try {
            
            // ambil matkul yang terseleksi
            String matkul = (String) model.getValueAt(i, 0);
            String matkulUpdated = inputMatkul.getText();
            String namadosen = inputDosen.getText();
            String hari = inputHari.getText();
            String waktumulai = inputMulai.getText();
            String waktselesai = inputSelesai.getText();

            
            Connection c = KoneksiDatabase.getConnection();
            
            String sql = "UPDATE TB_JADWAL_KULIAH SET mata_kuliah = ?, hari = ?, nama_dosen = ?, waktu_mulai = ?, waktu_selesai = ? where mata_kuliah = ?";
            
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, matkulUpdated);
            p.setString(2, hari);
            p.setString(3, namadosen);
            p.setString(4, waktumulai);
            p.setString(5, waktselesai);
            p.setString(6, matkul);
            
            p.executeUpdate();
            p.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int i = TableMahasiswa.getSelectedRow();
        if (i == -1) {
            // tidak ada baris yang tedeteksi
            return;
        }

        // ambil matkul yang terseleksi
        String matkul = (String) model.getValueAt(i, 0);
        try {
            Connection c = KoneksiDatabase.getConnection();
            String sql = "DELETE FROM tb_jadwal_kuliah WHERE mata_kuliah = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, matkul);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }finally {
            loadData();
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void TableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMahasiswaMouseClicked

        int i = TableMahasiswa.getSelectedRow();
        if (i == -1) {
            // tidak ada baris yang tedeteksi
            return;
        }
 
        
        String matkul   = (String) model.getValueAt(i,0);
        inputMatkul.setText(matkul);
        String dosen = (String) model.getValueAt(i,1);
        inputDosen.setText(dosen);
        String hari = (String) model.getValueAt(i,2);
        inputHari.setText(hari);
        String waktumulai  = (String) model.getValueAt(i,3);
        inputMulai.setText(waktumulai);
        String waktuselesai = (String) model.getValueAt(i,4);
        inputSelesai.setText(waktuselesai);
    }//GEN-LAST:event_TableMahasiswaMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void inputMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMulaiActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableMahasiswa;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inputDosen;
    private javax.swing.JTextField inputHari;
    private javax.swing.JTextField inputMatkul;
    private javax.swing.JTextField inputMulai;
    private javax.swing.JTextField inputSelesai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
