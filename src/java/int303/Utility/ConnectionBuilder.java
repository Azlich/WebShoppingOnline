/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int303.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *lity;

 * @author Witchapon-Pc
 */
public class ConnectionBuilder {

    public static Connection mainConnection = null;

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://52.221.240.234:3306/INT303_WebshoppingOnline?zeroDateTimeBehavior=convertToNull", "pon322", "pon322");
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return conn;
    }
}
