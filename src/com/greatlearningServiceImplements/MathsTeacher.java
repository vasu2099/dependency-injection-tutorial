package com.greatlearningServiceImplements;

import com.greatlearningService.Examtip;
import com.greatlearningService.Teacher;

public class MathsTeacher implements Teacher {
//  defining a private field for dependency
	Examtip examTip;

	public MathsTeacher() {

	}

	// define a constructor for dependency injection
	public MathsTeacher(Examtip theexamTip) {
		examTip = theexamTip;
	}
	@Override
	public String getHomework() {
		// TODO Auto-generated method stub
		return "do problems";
	}
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
