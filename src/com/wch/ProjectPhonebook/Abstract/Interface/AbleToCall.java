package com.wch.ProjectPhonebook.Abstract.Interface;

import com.wch.ProjectPhonebook.Models.Number;

public interface AbleToCall <T>{
	public  <T extends Number> void getCall();
	public <T extends Number> T getNumber();
	public <T extends Number> void setNumber(T num);

}
