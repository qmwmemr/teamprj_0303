package team2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBClass {
	private String url = "jdbc:oracle:thin:@210.108.48.214:1521:xe";
	private String id = "team2";
	private String pwd = "1234";
	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<Board> getBoard() {
		
		List<Board> boardList = new ArrayList<>();
		
		String sql = "SELECT * FROM board";
		
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Board bd = new Board();
				bd.setNum(rs.getInt("board_id"));
				bd.setWriter(rs.getString("writer"));
				bd.setTitle(rs.getString("title"));
				bd.setContent(rs.getString("content"));
				boardList.add(bd);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return boardList;
	}
}





