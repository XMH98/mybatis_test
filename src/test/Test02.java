package test;

import com.mysql.cj.Session;
import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

/**
 * Author: 徐明皓
 * Date: 2021-07-23 21:02
 * Description: <描述>
 */
public class Test02 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            User user = new User();
            user.setUsername("kkk");
            user.setPassword("111");
            user.setPhone("110");
            user.setAddress("苏州");

            UserDao userDao = session.getMapper(UserDao.class);
            userDao.insertUser(user);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
            MyBatisUtil.close();
        }
    }
}
