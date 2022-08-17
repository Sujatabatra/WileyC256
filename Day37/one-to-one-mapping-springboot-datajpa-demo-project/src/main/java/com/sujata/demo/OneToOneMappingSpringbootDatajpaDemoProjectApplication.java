package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sujata.bean.Husband;
import com.sujata.bean.Wife;
import com.sujata.persistence.HusbandDao;
import com.sujata.persistence.WifeDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class OneToOneMappingSpringbootDatajpaDemoProjectApplication implements CommandLineRunner {

	@Autowired
	private WifeDao wifeDao;
	@Autowired
	private HusbandDao husbandDao;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingSpringbootDatajpaDemoProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Husband husband1=new Husband("H001", "Husband 1");
//		Husband husband2=new Husband("H002", "Husband 2");
//		Husband husband3=new Husband("H003", "Husband 3");
//		Husband husband4=new Husband("H004", "Husband 4");
//		
//		Wife wife1=new Wife("W001", "Wife A");
//		wife1.setPati(husband4);
//		Wife wife2=new Wife("W002", "Wife B");
//		wife2.setPati(husband3);
//		Wife wife3=new Wife("W003", "Wife C");
//		wife3.setPati(husband2);
//		Wife wife4=new Wife("W004", "Wife D");
//		wife4.setPati(husband1);
//		
//		
//		husbandDao.save(husband1);
//		husbandDao.save(husband2);
//		husbandDao.save(husband3);
//		husbandDao.save(husband4);
//		
//		wifeDao.save(wife1);
//		wifeDao.save(wife2);
//		wifeDao.save(wife3);
//		wifeDao.save(wife4);
		
		Wife wife=wifeDao.findById("W002").get();
		
		System.out.println(wife.getWifeName());
		System.out.println(wife.getPati());
		
		
	}

}
