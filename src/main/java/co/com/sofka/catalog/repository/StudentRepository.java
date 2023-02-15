package co.com.sofka.catalog.repository;

import co.com.sofka.catalog.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    Student findByName (String name);

    Student findByIdNum (String idNum);
}
