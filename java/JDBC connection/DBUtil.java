package javaproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class DBUtil {

		public static Connection getDBConnection() {
			Connection conn = null;

			try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Chinni@2002");
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return conn;

		}

	}

