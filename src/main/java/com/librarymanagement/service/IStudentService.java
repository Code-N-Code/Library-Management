package com.librarymanagement.service;

import com.librarymanagement.entity.Student;

public interface IStudentService {
    public void registerStudent(Student student);
    public boolean loginUser(Student student);
}
