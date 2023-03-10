package crud.demo2;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import crud.demo2.entities.Student;
import crud.demo2.repositories.StudentRepository;

@SpringBootTest
class Cruddemo2ApplicationTests {
	
	
	@Autowired
	private StudentRepository studentRepo;
	

	@Test
	void SaveOneStudent() {
		
		
//		System.out.println(studentRepo);
		
		Student s = new Student();
		
		s.setName("tony");
		s.setCourse("testing");
		s.setFee(4000);
		studentRepo.save(s);	
		
	}
	
	@Test
	void deleteOneStudent()
	{
		studentRepo.deleteById(2L);
		
	}
	
	@Test
	void getOneStudent() {

		Optional<Student> findById = studentRepo.findById(1L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	
	
	@Test
	void updateOneStudent() {

		Student s = new Student();
        
		s.setId(1);
		s.setName("mikal");
		s.setCourse("java");
		s.setFee(5000);

		studentRepo.save(s);

	}
	
	

}
