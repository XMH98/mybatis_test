package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 删除用户
     */
    public void deleteById(int id);

    /**
     * 查询操作
     */
    public User selectById(int id);

    public List<User> selectAll();

    public User selectById2(int id);

    public User selectById3(int id);

    public User selectByUsernameAndPassword(String username,String password);

    public User selectByUsernameAndPassword2(@Param("username") String username,@Param("password") String password);

    public User selectByUsernameAndPassword3(User user);

    public User selectByUsernameAndPassword4(Map<String,Object> map);

    public List<User> selectByUsername(String username);

    public List<User> selectByUsername2(String username);

    public List<User> selectByParams(User user);

    public List<User> selectByParams2(User user);

    public List<User> selectByParams3(User user);

    public List<User> selectByParams4(User user);

    public void updateUser2(User user);

    public List<User> selectByIds(List<Integer> ids);
}
