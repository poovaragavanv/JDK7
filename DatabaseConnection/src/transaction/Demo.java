package transaction;

import java.sql.*;
public class Demo {
    private String dbURL = "jdbc:mysql://localhost:3306/sales";
    private String user = "root";
    private String password = "P@ssw0rd";
    private Connection conn;
 
    public void connect() {
        try {
            conn = DriverManager.getConnection(dbURL, user, password);
            System.out.println("Connected.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 
    public void disconnect() {
        try {
            conn.close();
            System.out.println("Closed.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
 
    public void saveOrder(int productId, Date orderDate, float amount, int reportMonth) {
        PreparedStatement orderStatement = null;
        PreparedStatement saleStatement = null;
 
        try {
        	// Disabling Auto Commit mode
            conn.setAutoCommit(false);
            String sqlSaveOrder = "insert into orders (product_id, order_date, amount)";
            sqlSaveOrder += " values (?, ?, ?)";
 
            String sqlUpdateTotal = "update monthly_sales set total_amount = total_amount + ?";
            sqlUpdateTotal += " where product_id = ? and report_month = ?";
 
            orderStatement = conn.prepareStatement(sqlSaveOrder);
            saleStatement = conn.prepareStatement(sqlUpdateTotal);
 
            orderStatement.setInt(1, productId);
            orderStatement.setDate(2, orderDate);
            orderStatement.setFloat(3, amount);
 
            saleStatement.setFloat(1, amount);
            saleStatement.setInt(2, productId);
            saleStatement.setInt(3, reportMonth);
 
            orderStatement.executeUpdate();
            saleStatement.executeUpdate();
            // the current transaction, and they are committed as a single unit until we call the method commit():
            conn.commit();
 
        } catch (SQLException ex) {
            if (conn != null) {
                try {
             // any statement failed to execute, a SQLException is thrown, and in the catch block.
             // We invoke the method rollback() to abort the transaction
                    conn.rollback();
 
                    System.out.println("Rolled back.");
                } catch (SQLException exrb) {
                    exrb.printStackTrace();
                }
            }
        } finally {
            try {
                if (orderStatement != null ) {
                    orderStatement.close();
                }
 
                if (saleStatement != null ) {
                    saleStatement.close();
                }
            // we enable the auto commit mode to get the connection back to the default state
                conn.setAutoCommit(true);
            } catch (SQLException excs) {
                excs.printStackTrace();
            }
        }
    }
 
    public static void main(String[] args) {
        Demo demo = new Demo();
 
        int productId = 1;
        int reportMonth = 7;
        Date date = new Date(System.currentTimeMillis());
        float amount = 580;
 
        demo.connect();
 
        demo.saveOrder(productId, date, amount, reportMonth);
 
        demo.disconnect();
    }
}