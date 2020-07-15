package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CreateTable{
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");

        /* -------------- Create table user_info ----------------- */
        String sql = "CREATE TABLE user_info (" +
                "  id int(11) NOT NULL AUTO_INCREMENT," +
                "  name varchar(45) DEFAULT NULL," +
                "  address varchar(255) DEFAULT NULL," +
                "  PRIMARY KEY (id)" +
                ")";
        jdbcTemplate.execute(sql);
        ((ClassPathXmlApplicationContext) ctx).close();

        System.out.println("Table is Created!");
    }

}
