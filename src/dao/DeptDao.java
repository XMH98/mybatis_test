package dao;

import entity.Dept;

import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-25 14:40
 * Description: <描述>
 */
public interface DeptDao {

    public void insertDept(Dept dept);

    public Dept selectById(Integer id);

    public List<Dept> selectAll();

}
