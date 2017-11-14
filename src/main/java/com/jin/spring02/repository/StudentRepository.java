package com.jin.spring02.repository;

import com.jin.spring02.Model.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends Repository<Student,Integer>{

    @Query("select s from Student s where s.name=:name and s.age=:age")
    public List<Student> selectNameByAge(@Param("name")String name, @Param("age")Integer age);


}
