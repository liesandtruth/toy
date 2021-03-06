package isedu.toy.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface StudentRepository extends Repository<Student, Long> {
    Student findById(Long id);
    void save(Student student);

    List<Student> findAll();
}
