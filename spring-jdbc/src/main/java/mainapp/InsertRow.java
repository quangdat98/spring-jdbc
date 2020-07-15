package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertRow {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");

        String sql = "insert into user_info (name,address) values (?,?)";
        jdbcTemplate.update(sql,"dat","thai binh");
        jdbcTemplate.update(sql,"huy","ninh binh");

        ((ClassPathXmlApplicationContext) context).close();
        System.out.println("inserted!");
    }
}
