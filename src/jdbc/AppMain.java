package jdbc;

import com.mysql.jdbc.ResultSetRow;

import java.sql.*;

public class AppMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/czm?useUnicode=true&characterEncoding=utf8","root","root");

        String sql = "select * from users ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("id"));
        }

    }
}
