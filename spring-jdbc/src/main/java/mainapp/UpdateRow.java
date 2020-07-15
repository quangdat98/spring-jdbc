package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class UpdateRow {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "UPDATE user_info SET address = ? WHERE address = ?;";
        jdbcTemplate.update(sql,"Thai Binh","thai binh");
        ((ClassPathXmlApplicationContext) ctx).close();
        System.out.println("Updated!");
    }
}
