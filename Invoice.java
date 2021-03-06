 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ritesh.crm;

import java.awt.Color;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static ritesh.crm.Main.session_user;
import static ritesh.crm.TryingTable.cstmr_name;
import static ritesh.crm.TryingTable.email;
import static ritesh.crm.TryingTable.mob;
import static ritesh.crm.TryingTable.order_id;
import static ritesh.crm.TryingTable.orderlist2;

/**
 *
 * @author Trainee
 */
public class Invoice extends javax.swing.JFrame {

    /**
     * Creates new form Invoice
     */
    
    double total_amount=0.0;
    String duplicate_order_id;
    public Invoice() {
        initComponents();
        update_invoice_info();
        insert_orders();
        
    }
    public Invoice(String duplicate_order_id) {
        initComponents();
        this.duplicate_order_id=duplicate_order_id;
        duplicate_bill();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoice_label = new javax.swing.JLabel();
        customer_label = new javax.swing.JLabel();
        order_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        total_amount_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        print_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setTitle("Invoice");

        invoice_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        invoice_label.setForeground(new java.awt.Color(0, 153, 0));
        invoice_label.setText("Invoice");

        customer_label.setText("Customer's Name");

        order_label.setText("Order Id");

        date_label.setText("Date          ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Qty", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        total_amount_label.setText("Grand Total  :");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        print_btn.setText("Print Invoice");
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Mobile No.");

        jLabel2.setText("jLabel2");

        jLabel3.setText("E-mail");

        jLabel4.setText("jLabel4");

        jLabel5.setText("Time");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(print_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total_amount_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customer_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(date_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(order_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(285, 285, 285)
                                            .addComponent(invoice_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(308, 308, 308)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(invoice_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(order_label)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_label)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(print_btn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total_amount_label)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
   
        print_btn.setVisible(false);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        this.getContentPane().setBackground(Color.WHITE);
        
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.PORTRAIT);
        PageFormat postformat = pjob.pageDialog(preformat);
        //If user does not hit cancel then print.
        if (preformat != postformat) {
         //Set print component
        pjob.setPrintable(new Printer(this), postformat);
        if (pjob.printDialog()) {
            try {
                pjob.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }//GEN-LAST:event_print_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }
  
    public void duplicate_bill(){
        
        try(Connection con= new DBConnection().getConnection()){
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM orders WHERE order_id='"+duplicate_order_id+"'");
            if(rs.next()){
                jLabel6.setText(rs.getString("amount"));
                jLabel9.setText(rs.getString("date"));
                jLabel10.setText(rs.getString("time"));
                String dup_customer_id=rs.getString("customer_id");
                rs=st.executeQuery("SELECT * FROM customers WHERE customer_id='"+dup_customer_id+"'");
                if(rs.next()){
                    jLabel7.setText(rs.getString("customer_name"));
                    jLabel2.setText(rs.getString("customer_mobile"));
                    jLabel4.setText(rs.getString("customer_email"));
                }
                rs = st.executeQuery("SELECT * FROM order_details WHERE order_id='"+duplicate_order_id+"'");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while(rs.next()){
                    model.addRow(new Object[]{rs.getString("product"),Double.parseDouble(rs.getString("base_price")),Integer.parseInt(rs.getString("quantity")),Double.parseDouble(rs.getString("gross_price"))});
                }
            }
            
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public void update_invoice_info(){
        jLabel7.setText(cstmr_name);
        jLabel2.setText(mob);
        jLabel4.setText(email);
        DateFormat df = new SimpleDateFormat("dd MMMM yyyy");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        Calendar calobj = Calendar.getInstance();
        jLabel9.setText(df.format(calobj.getTime()));
        jLabel10.setText(tf.format(calobj.getTime()));

        jLabel8.setText(Long.toString(order_id));



        for (Order ol : orderlist2) {
            total_amount+=ol.gross_price;
        }
        jLabel6.setText("₹ "+Double.toString(total_amount));

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object rowData[] = new Object[4];
        for(int i = 0; i < orderlist2.size(); i++)
        {
            rowData[0] = orderlist2.get(i).product_name;

            rowData[1] = orderlist2.get(i).price;
            rowData[2] = orderlist2.get(i).quantity;
            rowData[3] = orderlist2.get(i).gross_price;
            model.addRow(rowData);
        }

    }

   public void insert_orders(){
        
        int rows = jTable1.getRowCount();
        for(int i=0;i<rows;i++){
            String ordr_id = Long.toString(order_id);
            String product = new String();
            product=jTable1.getValueAt(i, 0).toString();
            String qty = jTable1.getValueAt(i, 2).toString();
            String base_price = jTable1.getValueAt(i, 1).toString();
            String gross_price = jTable1.getValueAt(i, 3).toString();
            
            try(Connection con = new DBConnection().getConnection()){
                Statement stmt = con.createStatement();
                stmt.executeUpdate("INSERT INTO order_details VALUES(NULL,'"+ordr_id+"','"+product+"','"+qty+"','"+base_price+"','"+gross_price+"')");
                con.close();
            }catch(Exception e){
                System.err.println(e);
            }
        }
        try(Connection con = new DBConnection().getConnection()){
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE customer_name='"+cstmr_name+"' and customer_mobile='"+mob+"'");
                if(!rs.next()){
                    
                    Statement stm = con.createStatement();
                    stm.executeUpdate("INSERT INTO customers VALUES(null,'"+cstmr_name+"','"+email+"','"+mob+"')");
                }
                
                long milis = System.currentTimeMillis();
                java.sql.Date date = new java.sql.Date(milis);
                java.util.Date curr_date = new java.util.Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                Statement stmt = con.createStatement();
                rs=stmt.executeQuery("SELECT customer_id FROM customers WHERE customer_name='"+cstmr_name+"' and customer_mobile='"+mob+"' and customer_email='"+email+"' ");
                if(rs.next()){
                    String cstmr_id=rs.getString("customer_id");
                    stmt.executeUpdate("INSERT INTO orders VALUES(null,'"+order_id+"','"+cstmr_id+"','"+total_amount+"','"+mob+"','"+session_user+"','"+date+"','"+sdf.format(curr_date)+"')");
             
                }
                con.close();
            }catch(Exception e){
                System.err.println(e);
            }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customer_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel invoice_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel order_label;
    private javax.swing.JButton print_btn;
    private javax.swing.JLabel total_amount_label;
    // End of variables declaration//GEN-END:variables
}
