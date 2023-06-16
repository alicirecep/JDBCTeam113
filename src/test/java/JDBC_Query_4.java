import utilities.ResuableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Query_4 {
    public static void main(String[] args) throws SQLException {

        /*
        1- Roles tablosundan name bilgisi 'Receptionist' olan rolün is_active, is_system, is_superadmin
        ve created_at bilgilerini alt alta yazdiriniz.
         */

       Statement st= ResuableMethods.createStatement(ResuableMethods.getConnection());

        String query= "select is_active,is_system,is_superadmin,created_at from heallife_hospitaltraining.roles where `name`='Receptionist';";

          ResultSet rs = st.executeQuery(query);

          rs.next();
  System.out.println(rs.getInt(" is_active")+" \n "+ rs.getInt("is_system")+" \n "+ rs.getInt("is_superadmin")+" \n "+ rs.getString("created_at"));

    rs.close();
    st.close();



    }
}
