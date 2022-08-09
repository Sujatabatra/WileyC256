package com.sujata.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer,BeanNameAware,BeanFactoryAware
,ApplicationContextAware,InitializingBean,DisposableBean {

	private String song;
	private String singerName;
	
	public Singer() {
		System.out.println("1. Constructor Call");
	}
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("2. Populate Property : calling setter");
	}


	@Override
	public void perform() {
		System.out.println(singerName+" is singing "+song);

	}

	@Override
	public void setBeanName(String name) {
		this.singerName=name;
		System.out.println("3. setBeanName() method from interface BeanNameAware for "+singerName);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. setBeanFactory()method from interface BeanFactoryAware for "+singerName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. setApplicationContext() method from interface ApplicationContextAware for "+singerName);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. afterPropertiesSet() method from interface InitializingBean for "+singerName);
		
	}
	
	public void ChitranshuInit() {
		System.out.println("8. Custom Init Method for "+singerName);
	}
	
	public void HamzaInit() {
		System.out.println("8. Custom Init Method for "+singerName);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("a. destroy() method from interface DisposableBean for "+singerName);
		
	}
	
	public void chitranshuDestroy() {
		System.out.println("b. chitranshuDestroy() Method for "+singerName);
	}
	
	public void hamzaDestroy() {
		System.out.println("b. HamzaDestroy() Method for "+singerName);
	}


}
