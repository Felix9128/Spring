package com.felix.iocbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MainConfig
 * Function: TODO 功能说明.
 * <p>
 * date 2019年12月16日 17:07
 *
 * @author baize
 * @since JDK 1.8
 * <p>
 * Modified By: <修改人>
 * Modified Date: <修改日期，格式:YYYY-MM-DD>
 * Why & What is modified: <修改描述>
 */
@Configuration
@ComponentScan(basePackages = "com.felix.iocbean")
public class MainConfig {

	@Bean(initMethod = "initPerson")
	public Person person(){
		Person person = new Person();
		person.setName("Felix");
		person.setAge(28);
		return person;
	}

}