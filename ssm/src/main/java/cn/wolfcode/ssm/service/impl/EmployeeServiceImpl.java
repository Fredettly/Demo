package cn.wolfcode.ssm.service.impl;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.mapper.EmployeeMapper;
import cn.wolfcode.ssm.service.IEmployeeService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 */
@Service// 告诉Spring,让Spring帮我们创建一个EmployeeServiceImpl对象,放入Spring容器中管理
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired// 去获取Spring容器中的代理类对象,注入到当前的EmployeeMapper属性中
    private EmployeeMapper employeeMapper;

    /* 代码补全:alt+enter */
    /*@Override
    public void save(Employee employee) {
        employeeMapper.insert(employee);
        // 其他业务...
        //int i =1/0;// 模拟异常
    }*/

    @Override
    public void saveOrUpdate(Employee employee) {
        if(employee!=null && employee.getId()!=null){ // 判断employee中是否成存在id,如果存在id则是修改(更新)操作
            employeeMapper.update(employee);
        }else {// 不存在id则是新增操作
            employeeMapper.insert(employee);
        }

    }

    @Override
    public List<Employee> queryAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public Employee queryById(Long id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public void delete(Long id) {
        employeeMapper.delete(id);
    }
}
