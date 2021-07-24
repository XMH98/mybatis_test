package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

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

            User user = new User();
            user.setId(5);
            user.setUsername("汤姆");
            user.setPassword("666");
            user.setPhone("13200000000");
            user.setAddress("南京");

            UserDao userDao = session.getMapper(UserDao.class);
            userDao.updateUser(user);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
            MyBatisUtil.close();
        }
    }
}
