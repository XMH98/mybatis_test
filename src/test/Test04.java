package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: 徐明皓
 * Date: 2021-07-24 16:39
 * Description: <描述>
 */
public class Test04 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            UserDao userDao = session.getMapper(UserDao.class);

            //User user = userDao.selectById2(1);
            //User user = userDao.selectById3(1);
            //System.out.println(user);

            //User user = new User();
            //user.setUsername("tom");
            //user.setPassword("111");
            //User user1 = userDao.selectByUsernameAndPassword3(user);

            //Map map = new HashMap<String,Object>();
            //map.put("username","tom");
            //map.put("password","111");
            //User user = userDao.selectByUsernameAndPassword4(map);
            //System.out.println(user);

            String username = "a";
            //List<User> users = userDao.selectByUsername("%" + username + "%");
            List<User> users = userDao.selectByUsername2(username);
            System.out.println(users);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
            MyBatisUtil.close();
        }
    }
}
