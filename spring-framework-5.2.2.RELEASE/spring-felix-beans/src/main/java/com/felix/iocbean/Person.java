package com.felix.iocbean;

import org.springframework.beans.factory.InitializingBean;

/**
 * ClassName: Person
 * Function: TODO 功能说明.
 * <p>
 * date 2019年12月16日 17:21
 *
 * @author baize
 * @since JDK 1.8
 * <p>
 * Modified By: <修改人>
 * Modified Date: <修改日期，格式:YYYY-MM-DD>
 * Why & What is modified: <修改描述>
 */
public class Person implements InitializingBean {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void initPerson() {
		System.out.println("inti方法");
	}

//	@PostConstruct
//	public void init(){
//		System.out.println("PostConstruct init");
//	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 方法");
	}

	public Person(){
		System.out.println("无参构造...");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}

}