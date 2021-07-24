package dao;

import entity.User;

/**
 * Author: 徐明皓
 * Date: 2021-07-23 19:23
 * Description: <描述>
 */
public interface UserDao {
    /**
     * 添加用户
     */
    public void insertUser(User user);

    /**
     * 添加用户，返回主键
     */
    public void insert(User user);

    /**
     * 修改用户
     */
    public void updateUser(User user);
}
