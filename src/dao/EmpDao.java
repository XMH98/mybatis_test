package dao;

import entity.Emp;

import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-25 14:41
 * Description: <描述>
 */
public interface EmpDao {

    public void insertEmp(Emp emp);

    public List<Emp> selectAll();



}
