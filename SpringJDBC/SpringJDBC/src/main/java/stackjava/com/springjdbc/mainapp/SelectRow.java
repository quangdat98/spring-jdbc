package stackjava.com.springjdbc.mainapp;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import stackjava.com.springjdbc.entities.User;
import stackjava.com.springjdbc.entities.UserMapper;

public class SelectRow {
	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "SELECT * FROM user_info";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {
			System.out.println(row.get("id") +"  " + row.get("name") + "  " + row.get("address"));
		}
		
		System.out.println("----------------------------------");
		List<User> listUser2 = jdbcTemplate.query(sql, new UserMapper());
		for (User user: listUser2) {
			System.out.println(user.getId() + "  " +user.getName() + "  " + user.getAddress());
		}

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
