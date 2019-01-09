package com.lucky.service;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultDto {

	String result;
	
	

	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
	}



	@Override
	public String toString() {
		return "ResultDto [result=" + result + "]";
	}
	
	
}
