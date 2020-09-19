package com.example.demo;
import java.io.Serializable;

import org.springframework.stereotype.Controller;
@Controller
public class User implements Serializable {
	private String Bankname;
	private String Bankaddress;
	public User(String bankname, String bankaddress) {
		super();
		Bankname = bankname;
		Bankaddress = bankaddress;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
	}
	public String getBankaddress() {
		return Bankaddress;
	}
	public void setBankaddress(String bankaddress) {
		Bankaddress = bankaddress;
	}

}
