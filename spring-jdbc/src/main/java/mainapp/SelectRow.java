package mainapp;

import entities.User;
import entities.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class SelectRow {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "SELECT * FROM user_info";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : rows) {
            System.out.println(row.get("id") +"  " + row.get("name") + "  " + row.get("address"));
        }

        System.out.println("----------------------------------");
        UserMapper userMapper = new UserMapper();
        List<User> listUser2 = jdbcTemplate.query(sql,userMapper);
        for (User user: listUser2) {
            System.out.println(user.getId() + "  " +user.getName() + "  " + user.getAddress());
        }

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
