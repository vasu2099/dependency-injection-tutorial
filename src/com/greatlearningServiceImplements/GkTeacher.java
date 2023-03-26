package com.greatlearningServiceImplements;

import com.greatlearningService.Examtip;
import com.greatlearningService.Teacher;

public class GkTeacher implements Teacher {
//  defining a private field for dependency
	Examtip examTip;
    public GkTeacher() {
    	
    }
	// defining constructor for dependency injection
	public GkTeacher(Examtip theexamTip) {
		examTip = theexamTip;
	}
	@Override
	public String getHomework() {
		// TODO Auto-generated method stub
		return "update current affairs";
	}
	@Override
	public String getExamTip() {
		return examTip.getExamTip();
	}

}
