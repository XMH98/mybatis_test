package test;

import dao.DeptDao;
import dao.EmpDao;
import entity.Dept;
import entity.Emp;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisUtil;

import java.util.List;

/**
 * Author: 徐明皓
 * Date: 2021-07-25 16:11
 * Description: <描述>
 */
public class Test07 {
    public static void main(String[] args) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.getSession();

            //EmpDao empDao = session.getMapper(EmpDao.class);
            //List<Emp> emps = empDao.selectAll();
            //System.out.println(emps);

            DeptDao deptDao = session.getMapper(DeptDao.class);
            List<Dept> depts = deptDao.selectAll();
            System.out.println(depts);

            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }finally {
            MyBatisUtil.close();
        }
    }
}
