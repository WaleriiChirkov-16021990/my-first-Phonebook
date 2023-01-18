package com.wch.ProjectPhonebook.Abstract.Interface;

import com.wch.ProjectPhonebook.Models.Number;

 /**
 *  Интерфейс описывает поведение обьектов, которые обладают сбособностью связываться с помощью звонка и имеют контактный номер.
 * @param <T> - обьектный тип
 */
public interface AbleToCall <T>{
	public  <T extends Number> void getCall();
	public <T extends Number> T getNumber();
	public <T extends Number> void setNumber(T num);

}
