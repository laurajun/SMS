package net.larasoft.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.larasoft.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
