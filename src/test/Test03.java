package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-24 13:08
 * Description: <描述>
 */
public class Test03 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            UserDao userDao = session.getMapper(UserDao.class);

            //User user = new User();
            //user.setId(5);
            //user.setUsername("汤姆");
            //user.setPassword("666");
            //user.setPhone("13200000000");
            //user.setAddress("南京");
            //userDao.updateUser(user);

            //userDao.deleteById(5);

            //User user = userDao.selectById(8);
            //System.out.println(user);

            List<User> users = userDao.selectAll();
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
