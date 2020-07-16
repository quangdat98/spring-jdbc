package mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertRow {

    public void insertRow(String name,String address){
        JdbcTemplate jdbcTemplate;
        jdbcTemplate=ConnectBean.getJdbcTemplate();

        String sql ="insert into user_info (name,address) values (?,?)";
        jdbcTemplate.update(sql,name,address);
        System.out.println("inserted!");
    }
}
