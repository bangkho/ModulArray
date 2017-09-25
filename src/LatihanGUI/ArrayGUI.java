package LatihanGUI;
public class ArrayGUI extends javax.swing.JFrame {
    public ArrayGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pilih = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        spesial = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        gol = new javax.swing.JTextField();
        kewar = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 230, 40);

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------ Pilih Dokter ------", "Dr. Farras Yassar", "Dr. Dian Shikahita", "Dr. Harun Ulum Fajar" }));
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });
        getContentPane().add(pilih);
        pilih.setBounds(120, 60, 160, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(170, 120, 50, 10);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Usia");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 80, 70, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 110, 80, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Golongan Darah");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 140, 100, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Status");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 170, 70, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Kewarganegaraan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 200, 110, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Waktu Praktek");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 230, 100, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Spesialis");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 260, 70, 20);
        jPanel1.add(spesial);
        spesial.setBounds(140, 260, 170, 25);

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama);
        nama.setBounds(140, 20, 170, 25);
        jPanel1.add(alamat);
        alamat.setBounds(140, 50, 170, 25);
        jPanel1.add(usia);
        usia.setBounds(140, 80, 170, 25);
        jPanel1.add(jenis);
        jenis.setBounds(140, 110, 170, 25);
        jPanel1.add(status);
        status.setBounds(140, 170, 170, 25);
        jPanel1.add(gol);
        gol.setBounds(140, 140, 170, 25);
        jPanel1.add(kewar);
        kewar.setBounds(140, 200, 170, 25);
        jPanel1.add(waktu);
        waktu.setBounds(140, 230, 170, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 100, 330, 300);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pilih Dokter");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 65, 70, 20);

        setBounds(0, 0, 368, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        if(pilih.getSelectedItem().equals("Dr. Farras Yassar")){
            nama.setText("DR. Farras Yassar ");
            alamat.setText("Jl. Surabaya 16, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("A");
            status.setText("Belum Menikah ");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Umum");
            waktu.setText(" Pagi (07.00-15.00)");
        }
        else
        if(pilih.getSelectedItem().equals("Dr. Dian Shikahita")){
            nama.setText("DR. Dian Sikahita");
            alamat.setText("Jl. Veteran 3, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Perempuan");
            gol.setText("O");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gigi");
            waktu.setText(" Sore (16.00-22.00)");
        }
        else
        if(pilih.getSelectedItem().equals("Dr. Harun Ulum Fajar")){
            nama.setText("DR. Harun Ulum Fajar");
            alamat.setText("Jl. Bandung 9, Malang");
            usia.setText("20 Tahun");
            jenis.setText("Laki-Laki");
            gol.setText("B");
            status.setText("Belum Menikah");
            kewar.setText("Indonesia");
            spesial.setText("Dokter Gizi");
            waktu.setText(" Malam (22.00-06.00)");
        }
    }//GEN-LAST:event_pilihActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

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
            java.util.logging.Logger.getLogger(ArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArrayGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArrayGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField gol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField kewar;
    private javax.swing.JTextField nama;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JTextField spesial;
    private javax.swing.JTextField status;
    private javax.swing.JTextField usia;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables
}
