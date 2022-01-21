package com.librarymanagement.service;

import com.librarymanagement.entity.Student;
import com.librarymanagement.repository.IStudentRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{

    @Autowired
    IStudentRepository repository;

    @Override
    public void registerStudent(Student student) {

    }

    @Override
    public boolean loginUser(Student student) {
        if(StringUtils.isBlank(student.getEmail()) || StringUtils.isBlank(student.getPassword())) return false;

        var optionalStudent = repository.findById(student.getId());
        if(optionalStudent.isEmpty()) return false;

        var student1 = optionalStudent.get();
        if(student1.getEmail().equals(student.getEmail()) && student1.getPassword().equals(student.getPassword())) return true;
        else    return false;
    }
}
