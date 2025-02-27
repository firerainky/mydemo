package com.zky.springboot.mydemo.dao;

import java.util.List;

import com.zky.springboot.mydemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student student);

    void delete(Integer id);
}
