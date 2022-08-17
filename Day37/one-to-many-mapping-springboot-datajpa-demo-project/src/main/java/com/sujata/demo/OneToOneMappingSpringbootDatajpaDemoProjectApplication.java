package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sujata.bean.Student;
import com.sujata.bean.Trainer;
import com.sujata.persistence.StudentDao;
import com.sujata.persistence.TrainerDao;


@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class OneToOneMappingSpringbootDatajpaDemoProjectApplication implements CommandLineRunner {

	@Autowired
	StudentDao studentDao;
	@Autowired
	TrainerDao trainerDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingSpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student("R001", "Sarvagya");
		Student s2=new Student("R002", "Nagalakshmi");
		Student s3=new Student("R003", "Basit");
		Student s4=new Student("R004", "Vivek");
		Student s5=new Student("R005", "Rishabh");
		
		Trainer t1=new Trainer(1, "Sujata");
		t1.getStudents().add(s1);
		t1.getStudents().add(s2);
		t1.getStudents().add(s3);
		
		Trainer t2=new Trainer(2, "Ashish");
		t2.getStudents().add(s4);
		t2.getStudents().add(s5);
		

		studentDao.save(s1);
		studentDao.save(s2);
		studentDao.save(s3);
		studentDao.save(s4);
		studentDao.save(s5);

		trainerDao.save(t1);
		trainerDao.save(t2);
		
	}

}
