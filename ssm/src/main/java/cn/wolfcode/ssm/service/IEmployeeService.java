package cn.wolfcode.ssm.service;

import cn.wolfcode.ssm.domain.Employee;

import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 */
public interface IEmployeeService {

    //void save(Employee employee);

    void saveOrUpdate(Employee employee);

    List<Employee> queryAll();

    Employee queryById(Long id);

    void delete(Long id);
}
