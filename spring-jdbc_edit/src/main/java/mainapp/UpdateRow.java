package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class UpdateRow {

    public void updateAddress(String addressOld,String addressNew){
        JdbcTemplate jdbcTemplate=ConnectBean.getJdbcTemplate();
        String sql = "UPDATE user_info SET address = ? WHERE address = ?;";
        jdbcTemplate.update(sql,addressNew,addressOld);
        System.out.println("Updated!");
    }
}
