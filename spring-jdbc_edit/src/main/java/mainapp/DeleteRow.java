package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class DeleteRow {

    public void delete(String address){
        JdbcTemplate jdbcTemplate = ConnectBean.getJdbcTemplate();
        String sql = "delete from user_info where address =? ";
        jdbcTemplate.update(sql,address);
        System.out.println("Deleted!");
    }
}
