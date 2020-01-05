import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 * 测试Spring整合MyBatis框架的代码
 */
@RunWith(SpringJUnit4ClassRunner.class)// Spring整合junit4进行测试,启动Spring测试相关方法
@ContextConfiguration("classpath:applicationContext.xml")// 加载Spring配置,启动Spring容器
public class EmployeeServiceImplTest {

    @Autowired// 注入service对象
    private IEmployeeService employeeService;


    /*生成测试方法:alt+insert */

    @Test
    public void testIoC() throws Exception {
        // Spring是否能帮我们创建对象
        System.out.println(employeeService);//cn.wolfcode.ssm.service.impl.EmployeeServiceImpl@524f3b3a
    }

    @Test
    public void testQueryAll() throws Exception {
        List<Employee> list = employeeService.queryAll();// 生成变量:Ctrl+alt+V
        list.forEach(System.out::println);
    }

    @Test
    public void testSave() throws Exception {
        Employee employee = new Employee(null, "西门大官人", "1",
                "xm@qq.com", 23, false, 1L);
        employeeService.saveOrUpdate(employee);// 生成变量:Ctrl+alt+V
    }
}
