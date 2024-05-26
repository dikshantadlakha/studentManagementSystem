package net.Management.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.Management.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
