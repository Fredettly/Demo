package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Employee;

import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 * 对应EmployeeMapper.xml的接口,接口方法名对应xml文件中的SQL语句的id
 */
public interface EmployeeMapper {

    void insert(Employee employee);

    List<Employee> selectAll();

    Employee selectById(Long id);

    void update(Employee employee);

    void delete(Long id);
}
