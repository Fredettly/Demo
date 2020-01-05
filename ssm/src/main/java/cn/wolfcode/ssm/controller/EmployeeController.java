package cn.wolfcode.ssm.controller;

import cn.wolfcode.ssm.domain.Employee;
import cn.wolfcode.ssm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2019/12/4.
 */
@Controller
@RequestMapping("/employee")// 指定EmployeeController(资源)的访问路径
public class EmployeeController {

    @Autowired// 注入一个service对象
    private IEmployeeService employeeService;

    // 资源的访问路径:localhost:8080/employee/list.do
    /*@RequestMapping("/list")// 指定list(资源)的访问路径
    public void list(){
        System.out.println("EmployeeController -> list");
    }*/

    // 资源的访问路径:localhost:8080/employee/list.do
    @RequestMapping("/list")// 指定list(资源)的访问路径
    public String list(Model model){
        System.out.println("EmployeeController -> list");
        // 处理请求
        //使用service对象调用相应的方法,查询数据库,并且把数据返回到JSP页面
        List<Employee> list = employeeService.queryAll();
        list.forEach(System.out::println);
        // 把数据丢到model对象中,model对象会把数据共享到JSP页面
        model.addAttribute("list",list);
        // 跳转到JSP页面
        return "employee/list";
    }

    // 资源的访问路径:localhost:8080/employee/input.do
    @RequestMapping("/input")
    public String input(Model model, Long id){
        if (id!=null){
            // 根据id查询数据
            Employee employee = employeeService.queryById(id);
            // 把数据封装到model中
            model.addAttribute("employee",employee);
        }
        return "employee/input";
    }

    // 资源的访问路径:localhost:8080/employee/input.do
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Employee employee){
        // 添加数据到数据库中
        employeeService.saveOrUpdate(employee);
        return "redirect:/employee/list.do";
    }

    // 资源的访问路径:localhost:8080/employee/input.do
    @RequestMapping("/delete")
    public String input(Long id){
        // 添加数据到数据库中
        employeeService.delete(id);
        return "redirect:/employee/list.do";
    }



}
