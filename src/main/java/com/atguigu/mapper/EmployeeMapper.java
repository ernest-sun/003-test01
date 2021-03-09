package com.atguigu.mapper;

import com.atguigu.model.Department;
import org.apache.ibatis.annotations.*;

/**
 * ClassName:DepartMapper
 * Package:com.atguigu.mapper
 * Description:
 *
 * @Date:2021/3/5 15:48
 * @Author:sunzheng@bmrj.com
 */
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from employee where id = #{id}")
    public int deleteById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into employee(email) values( #{email})")
    public int insertDept(Department department);


    @Update("update employee set email = #{email} where id = #{id}")
    public int updateById(Department department);
}
