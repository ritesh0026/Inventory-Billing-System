/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ritesh.crm;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import static ritesh.crm.Main.session_user;
import static ritesh.crm.Main.user_role;
/**
 *
 * @author RITESH KUMAR SINGH
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
        getContentPane().setBackground(Color.getHSBColor(120,39,100));
    }
    public DashBoard dashboard_obj;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        login_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        admin_login_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log_In_Panel");
        setBackground(new java.awt.Color(153, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        title_label.setFont(new java.awt.Font("Colonna MT", 1, 36)); // NOI18N
        title_label.setForeground(new java.awt.Color(102, 204, 255));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Inventory Billing");

        login_panel.setBackground(new java.awt.Color(102, 204, 255));
        login_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("User Log In ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ritesh/icons/user.png"))); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ritesh/icons/key.png"))); // NOI18N
        jLabel4.setText("Password :");

        username.setBackground(new java.awt.Color(153, 255, 153));

        password.setBackground(new java.awt.Color(153, 255, 153));

        login_btn.setBackground(new java.awt.Color(153, 255, 153));
        login_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        login_btn.setForeground(new java.awt.Color(0, 204, 0));
        login_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ritesh/icons/login (1).png"))); // NOI18N
        login_btn.setText("Log In");
        login_btn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        admin_login_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        admin_login_label.setForeground(new java.awt.Color(0, 0, 204));
        admin_login_label.setText("Click here for Admin Login !!");
        admin_login_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_login_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                        .addComponent(password)
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(admin_login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(59, 59, 59))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(admin_login_label)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        String uname = username.getText();
        String pswd = password.getText();
       
        
        try(Connection con = new DBConnection().getConnection()){
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from users where username = '"+uname+"' and password = '"+pswd+"' ");
            if(rs.next()){
                Main ms = new Main();
                session_user=uname;
                user_role="user";
                System.out.println(session_user);
                dashboard_obj = new DashBoard();
                dashboard_obj.setVisible(true);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong Username or Password!");
            }
        }catch(Exception e){
            System.err.println(e);
        }
       
    }//GEN-LAST:event_login_btnActionPerformed

    private void admin_login_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_login_labelMouseClicked
        // TODO add your handling code here:
        AdminloginJframe adl =new AdminloginJframe();
        adl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_admin_login_labelMouseClicked

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_login_label;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login_btn;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel title_label;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
