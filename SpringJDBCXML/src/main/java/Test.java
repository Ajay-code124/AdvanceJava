import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Test {
	
	
	public static void main(String[] args) {
		
		 ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		 
		 JdbcTemplate bean = container.getBean("template", JdbcTemplate.class);
		 //bean.update("INSERT INTO STUDENTS VALUES(?,?,?)",4,"SANDEEP","CIVIL");
		 //bean.update("UPDATE STUDENTS SET COURSE=? WHERE ID=?", "ECE",2);
	//	 bean.update("DELETE  FROM STUDENTS WHERE ID=?",2);
		 
		 Students student = bean.queryForObject("select * from students where id=?", new RowMapper<Students>() {
				 
				 @Override
				public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new Students(rs.getInt(1), rs.getString(2), rs.getString(3));
				}
		 }	,4 );
		 System.out.println(student);
		 
		  List<Students> stulist= bean.query("select * from students", new RowMapper<Students>() {
			 
			 @Override
			public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Students(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
	 } );
	 System.out.println(stulist);
	 
	 List<Students> stulistlambda = bean.query("select * from students", (rs, rowNum) -> new Students(rs.getInt(1), rs.getString(2), rs.getString(3)));
	 System.out.println(stulistlambda);
	
	}
}
 