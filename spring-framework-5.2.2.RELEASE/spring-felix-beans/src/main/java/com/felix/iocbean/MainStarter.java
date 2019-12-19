package com.felix.iocbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: MainStarter
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
public class MainStarter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = (Person) context.getBean("person");

		System.out.println("person: "+ person.getName()+"-----"+person.getAge());

	}

}