package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Rating;
import com.sujata.persistence.RatingDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class RatingServiceApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private RatingDao ratingDao;
	
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		ratingDao.save(new Rating(1,"M002",4,"U002"));
//		ratingDao.save(new Rating(2,"M002",5,"U001"));
//		ratingDao.save(new Rating(3,"M001",3,"U004"));
//		ratingDao.save(new Rating(4,"M001",5,"U002"));
//		ratingDao.save(new Rating(5,"M002",4,"U002"));
//		ratingDao.save(new Rating(6,"M006",4,"U001"));
//		ratingDao.save(new Rating(7,"M005",5,"U001"));
//		ratingDao.save(new Rating(8,"M003",3,"U002"));
//		ratingDao.save(new Rating(9,"M002",5,"U004"));
//		ratingDao.save(new Rating(10,"M006",4,"U004"));
//		
//	}

}
