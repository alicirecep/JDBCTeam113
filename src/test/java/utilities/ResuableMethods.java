package utilities;

import java.sql.*;

public class ResuableMethods {

    public static Connection getConnection(){

        /*
        "jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
          "heallife_hospitaltraininguser",
         "PI2ZJx@9m^)3"
         */


        Connection con= null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
                    "heallife_hospitaltraininguser",
                    "PI2ZJx@9m^)3");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;
    }


    public static Statement createStatement(Connection con){
       Statement st= null;
        try {
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return st;
    }



}
