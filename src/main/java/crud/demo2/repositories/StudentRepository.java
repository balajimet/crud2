package crud.demo2.repositories;

import org.springframework.data.repository.CrudRepository;

import crud.demo2.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
	


}
