package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class St_DAO {
	
	public void insert_data(St_modal s) throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//orcl - connection stream
		//@192.i68.1.18 - ip address
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.18:1521:orcl","csa4047","licet");
		//(sid,sname,mark,grade) - same as in the sql table attribute names
		PreparedStatement ps = con.prepareStatement("insert into stud(sid,sname,mark,grade) values(?,?,?,?)");
		ps.setInt(1, s.getID());
		ps.setString(2, s.getName());
		ps.setInt(3, s.getMarks());
		ps.setString(4, s.getGrade());
		ps.executeUpdate();
		
	}
	
}
