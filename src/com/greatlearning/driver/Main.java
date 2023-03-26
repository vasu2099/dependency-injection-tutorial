package com.greatlearning.driver;

import com.greatlearningService.Teacher;
import com.greatlearningServiceImplements.HindiTeacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Teacher tc = new HindiTeacher();
     System.out.println(tc.getHomework());
	}

}
