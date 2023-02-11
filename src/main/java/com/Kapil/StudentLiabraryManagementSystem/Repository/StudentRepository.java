package com.Kapil.StudentLiabraryManagementSystem.Repository;

import com.Kapil.StudentLiabraryManagementSystem.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
