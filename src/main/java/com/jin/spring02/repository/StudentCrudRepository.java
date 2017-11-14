package com.jin.spring02.repository;

import com.jin.spring02.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentCrudRepository extends CrudRepository<Student,Integer> {
    //增加了一个countByXX的方法
    public long countByAge(int age);
}
