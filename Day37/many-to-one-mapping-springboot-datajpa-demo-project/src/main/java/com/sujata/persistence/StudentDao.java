package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, String> {

}
