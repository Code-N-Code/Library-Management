package com.librarymanagement.repository;

import com.librarymanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IStudentRepository extends JpaRepository<Student , UUID> {
}
