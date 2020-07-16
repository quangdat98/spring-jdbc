package mainapp;

import entities.User;
import entities.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SelectRow {

    public void select(){

        List<Map<String, Object>> userList = new ArrayList<>();
        JdbcTemplate jdbcTemplate=  ConnectBean.getJdbcTemplate();;

        String sql = "select * from user_info";
        userList=jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : userList) {
            System.out.println(row.get("id") +"  " + row.get("name") + "  " + row.get("address"));
        }
    }
}
