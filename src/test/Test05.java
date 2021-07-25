package test;

import dao.UserDao;
import entity.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-24 22:11
 * Description: <描述>
 */
public class Test05 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            UserDao userDao = session.getMapper(UserDao.class);

            User userParams = new User();
            userParams.setUsername("tom");
            userParams.setPassword("111");
            userParams.setPhone("110");
            userParams.setAddress("苏州");

            //List<User> users = userDao.selectByParams(userParams);

            List<User> users = userDao.selectByParams2(userParams);
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
