
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Siddhi
 */
public class Add_Recepient extends javax.swing.JFrame {

    /**
     * Creates new form Add_Recepient
     */
    public Add_Recepient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rmale = new javax.swing.JRadioButton();
        rfemale = new javax.swing.JRadioButton();
        idf = new javax.swing.JTextField();
        namef = new javax.swing.JTextField();
        datef = new javax.swing.JTextField();
        mobilef = new javax.swing.JTextField();
        emailf = new javax.swing.JTextField();
        cityf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addf = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        agef = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW RECEPIENT ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of birth:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile No:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 110, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("City:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/Blood group.png"))); // NOI18N
        jLabel10.setText("Blood Group:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Which Organ you need?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Complete Address:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, -1));

        buttonGroup1.add(rmale);
        rmale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rmale.setForeground(new java.awt.Color(255, 255, 255));
        rmale.setText("Male");
        jPanel1.add(rmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        buttonGroup1.add(rfemale);
        rfemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rfemale.setForeground(new java.awt.Color(255, 255, 255));
        rfemale.setText("Female");
        jPanel1.add(rfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        idf.setBackground(new java.awt.Color(255, 204, 255));
        idf.setForeground(new java.awt.Color(0, 51, 255));
        idf.setBorder(null);
        jPanel1.add(idf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 200, 30));

        namef.setBackground(new java.awt.Color(255, 204, 255));
        namef.setForeground(new java.awt.Color(0, 0, 204));
        namef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                namefFocusLost(evt);
            }
        });
        jPanel1.add(namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 30));

        datef.setBackground(new java.awt.Color(255, 204, 255));
        datef.setForeground(new java.awt.Color(0, 51, 204));
        datef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datefMouseClicked(evt);
            }
        });
        jPanel1.add(datef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 30));

        mobilef.setBackground(new java.awt.Color(255, 204, 255));
        mobilef.setForeground(new java.awt.Color(0, 0, 204));
        mobilef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobilefFocusLost(evt);
            }
        });
        jPanel1.add(mobilef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 260, 30));

        emailf.setBackground(new java.awt.Color(255, 204, 255));
        emailf.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(emailf, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 120, 270, 30));

        cityf.setBackground(new java.awt.Color(255, 204, 255));
        cityf.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(cityf, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 140, 30));

        jComboBox1.setBackground(new java.awt.Color(255, 204, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "B+", "A-", "B-", "AB+", "AB-", "O+", "O-", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 170, 30));

        jComboBox2.setBackground(new java.awt.Color(255, 204, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kidney", "Liver", "Lungs", "heart", "eyes", "pancreas", "intestines", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 220, 30));

        addf.setBackground(new java.awt.Color(255, 204, 255));
        addf.setColumns(20);
        addf.setForeground(new java.awt.Color(0, 0, 204));
        addf.setRows(5);
        jScrollPane1.setViewportView(addf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 280, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("age:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        agef.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.add(agef, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 71, -1));

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/Add new.png"))); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 130, 40));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/deleteoption.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 130, 40));

        jButton4.setBackground(java.awt.Color.orange);
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/Update details.png"))); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 130, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("New Recepient Id:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/Logout.png"))); // NOI18N
        jButton5.setText("Back ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ODMS ICON/table image2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1650, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 386, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         String user=namef.getText();   
       
       String mobile=mobilef.getText();
 if(user.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Entered Value is the name field");
        }
  if(mobile.equals("")||mobile.length()!=10)
        {
            JOptionPane.showMessageDialog(rootPane, "Please Enter valid mobile number");
            mobilef.setText("");
        }
        
        String id=idf.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sql="update add_rec set id=?,name=?,birthdate=?, age=?,gender=?,mobileno=?,email=?,city=?,bloodgrp=?,organ=?,address=? where id='"+id+"'";
            java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata","root","Siddhi@123");
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,idf.getText());
            pstmt.setString(2, namef.getText());
            pstmt.setString(3, datef.getText());
             pstmt.setString(4, agef.getText());
            if(rmale.isSelected())
            {
                pstmt.setString(5, rmale.getText());
            }
            else if(rfemale.isSelected())
            {
                pstmt.setString(5, rfemale.getText());
            }
           
             pstmt.setString(6, mobilef.getText());
              pstmt.setString(7,  emailf.getText());
            pstmt.setString(8,  cityf.getText());
            String combo=jComboBox1.getSelectedItem().toString();
            pstmt.setString(9, combo);
            String combo1=jComboBox2.getSelectedItem().toString();
            pstmt.setString(10, combo1);
            pstmt.setString(11,  addf.getText());
            
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"details of Recepient are updated Successfully!!");
            //  con.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sql="DELETE FROM add_rec WHERE name=?";
            java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata","root","Siddhi@123");
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,namef.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Recepient Deleted Successfully!!");
            //  con.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id=idf.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String sql="INSERT INTO add_rec VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Connection con=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/organdata","root","Siddhi@123");
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1,idf.getText());
            pstmt.setString(2, namef.getText());
            pstmt.setString(3, datef.getText());
             pstmt.setString(4, agef.getText());
            if(rmale.isSelected())
            {
                pstmt.setString(5, rmale.getText());
            }
            else if(rfemale.isSelected())
            {
                pstmt.setString(5, rfemale.getText());
            }
           
            pstmt.setString(6, mobilef.getText());
            pstmt.setString(7,  emailf.getText());
            pstmt.setString(8,  cityf.getText());
            String combo=jComboBox1.getSelectedItem().toString();
            pstmt.setString(9, combo);
            String combo1=jComboBox2.getSelectedItem().toString();
            pstmt.setString(10, combo1);
            pstmt.setString(11,  addf.getText());
            
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Recepient added Successfully!!");
            //  con.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void datefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datefMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Date of birth Should be in the form of DD/MM/YY");
    }//GEN-LAST:event_datefMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        home h=new home();
        h.setTitle("home page");
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void namefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namefFocusLost
        String user=namef.getText();
                       int l=user.length();
                       if(user.equals(""))
                       {
                           JOptionPane.showMessageDialog(rootPane,"Enter value in the name field");
                       }
                       if(l<2){
                           JOptionPane.showMessageDialog(rootPane, "Enter value in the name field");
                       }
    }//GEN-LAST:event_namefFocusLost

    private void mobilefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobilefFocusLost
         String mobile=mobilef.getText();
         if(mobile.length()==0)
         {}else if(mobile.length()!=10){
             JOptionPane.showMessageDialog(rootPane,"Please enter valid mobile no(only 10 digits)");
            mobilef.setText("");
         }else if(isValid(mobile)){}
         else{
             
         }
    }//GEN-LAST:event_mobilefFocusLost

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
            java.util.logging.Logger.getLogger(Add_Recepient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Recepient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Recepient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Recepient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Recepient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addf;
    private javax.swing.JTextField agef;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField cityf;
    private javax.swing.JTextField datef;
    private javax.swing.JTextField emailf;
    private javax.swing.JTextField idf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobilef;
    private javax.swing.JTextField namef;
    private javax.swing.JRadioButton rfemale;
    private javax.swing.JRadioButton rmale;
    // End of variables declaration//GEN-END:variables

    private boolean isValid(String mobile) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
