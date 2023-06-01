import java.sql.*;

public class JDBC_Query_1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    //  1-> Kullanılacak veritabanı için doğru sürücüyü ekle

            Class.forName("com.mysql.cj.jdbc.Driver");

    //  2-> Database baglantisi kurulur.
    /*
    URL: "jdbc:mysql://194.140.198.209/heallife_hospitaltraining";
    USERNAME= "heallife_hospitaltraininguser";
    PASSWORD="PI2ZJx@9m^)3";
     */

        Connection con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
                                                        "heallife_hospitaltraininguser",
                                                        "PI2ZJx@9m^)3");

        // Olusturulan connection bir objeye atanmasa da calisir
        // ancak ilerde ilgili connection'i kullanmak istersek ona ulasamayiz.
        // O yuzden onu Connection nesnesine atama yapariz.


    //  3->  SQL sorgularini yapabilmek icin suite hazirla

        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

    // 4 ->  SQL sorgularini hazirla ve calistir.

            String query = "SELECT * FROM heallife_hospitaltraining.staff";
        ResultSet rs = st.executeQuery(query);

        rs.next();
        System.out.println(rs.getString("name"));

    }
}
