package com.zky.springboot.mydemo.dao;

import com.zky.springboot.mydemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);
}
