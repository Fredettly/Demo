package cn.wolfcode.ssm.domain;

import lombok.*;

/**
 * Created by Administrator on 2019/12/4.
 * 员工实体类（JavaBean），与employee表映射
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    /*
        Ctrl+R：替换当前页中的内容
        按住alt+按下鼠标左键向下拖动：块状编辑
    * */
    private Long id;//bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    private String name;//varchar(20) DEFAULT NULL COMMENT '员工名称(登录账号)',
    private String password;//varchar(20) DEFAULT NULL COMMENT '员工密码',
    private String email;//varchar(255) DEFAULT NULL COMMENT '员工邮箱',
    private Integer age;//int(11) DEFAULT NULL COMMENT '员工年龄',
    private boolean admin;//bit(1) DEFAULT NULL COMMENT '是否是超级管理员',
    private Long deptId;//bigint(20) DEFAULT NULL COMMENT '关联字段:部门ID',
    /*生成getter、setter 等代码： alt+insert */
}
