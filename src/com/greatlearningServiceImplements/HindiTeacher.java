package com.greatlearningServiceImplements;

import com.greatlearningService.Examtip;
import com.greatlearningService.Teacher;

public class HindiTeacher implements Teacher {
	// defining a private field for dependency
	Examtip examTip;

	public HindiTeacher() {

	}

	public HindiTeacher(Examtip theexamTip) {
		examTip = theexamTip;
	}
	@Override
	public String getHomework() {
		// TODO Auto-generated method stub
		return " complete essay";
	}
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}
}
