package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearningService.Teacher;
import com.greatlearningServiceImplements.HindiTeacher;
import com.greatlearningServiceImplements.MathsTeacher;

public class SpringDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// l.load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2.retrieve bean from spring container
		Teacher tc = context.getBean("hindiTeacher", HindiTeacher.class);// bean ,bean class.extension
		// 3.call methods of the bean
		System.out.println(tc.getHomework());
		System.out.println(tc.getExamTip());
		// 4.close the context
		context.close();
		// same as for gk teacher load xml,retrieve bean,call,close
	}

}
