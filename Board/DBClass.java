package team2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBClass {
	private String url = "jdbc:oracle:thin:@210.108.48.214:1521:xe";
	private String id = "team2";
	private String pw = "1234";

	
	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void saveBoard(Board bo) {
		String sql = "insert into board(board_id, writer, title, content) values(?, ?, ?, ?)";

		try {
			Connection con = DriverManager.getConnection(url, id, pw);
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, bo.getNum());
			ps.setString(2, bo.getWriter());
			ps.setString(3, bo.getTitle());
			ps.setString(4, bo.getContent());
			ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
