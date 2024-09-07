package com.shosha.springboot.demo.dao.instructorrepository;

import com.shosha.springboot.demo.model.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, String> ,InstructorCustomRepository{
    boolean existsByEmail(String email);

    List<Instructor> findAllByFirstName(String firstName);

    Optional<Instructor> findByEmail(String email);
}
