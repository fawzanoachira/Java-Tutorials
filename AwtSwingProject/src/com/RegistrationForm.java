package com;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegistrationForm extends Frame{
	
	Label name,email,password,address,phone,language,state,gender;
	TextField nameTf,emailTf,passwordTf,phoneTf;
	TextArea addressTa;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	Choice c;
	Button b;
	
	public RegistrationForm() {
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(400,600);
		this.setTitle("Registration Form");
		
		name = new Label("Name");
		name.setBounds(20,50,80,20);
		nameTf = new TextField();
		nameTf.setBounds(120, 50, 80, 20);
		
		address = new Label("Address");
		address.setBounds(20,80,80,20);
		addressTa = new TextArea();
		addressTa.setBounds(120, 80, 140, 50);
		
		phone = new Label("Phone");
		phone.setBounds(20,130,80,20);
		phoneTf = new TextField();
		phoneTf.setBounds(120, 130, 80, 20);
		
		email = new Label("Email");
		email.setBounds(20,160,80,20);
		emailTf = new TextField();
		emailTf.setBounds(120, 160, 80, 20);
		
		password = new Label("Password");
		password.setBounds(20,190,80,20);
		passwordTf = new TextField();
		passwordTf.setBounds(120, 190, 80, 20);
		
		language = new Label("Languages Known");
		language.setBounds(20,220,100,20);
		cb1 = new Checkbox("English");
		cb1.setBounds(130, 220, 60, 20);
		cb2 = new Checkbox("Malayalam");
		cb2.setBounds(190, 220, 80, 20);
		cb3 = new Checkbox("Hindi");
		cb3.setBounds(130, 250, 50, 20);
		cb4 = new Checkbox("Arabic");
		cb4.setBounds(180, 250, 50, 20);
		cb5 = new Checkbox("Turkish");
		cb5.setBounds(240, 250, 80, 20);
		
		state = new Label("State");
		state.setBounds(20, 280, 80, 20);
		c = new Choice();
		c.setBounds(120,280,80,20);
		c.add("Kerala");c.add("Tamil Nadu");c.add("Karnataka");
		
		gender = new Label("Gender");
		gender.setBounds(20, 310, 80, 20);
		cbg = new CheckboxGroup();
		cb6 = new Checkbox("Male",cbg,false);
		cb6.setBounds(120, 310, 40, 20);
		cb7 = new Checkbox("Female",cbg,false);
		cb7.setBounds(165, 310, 80, 20);
		
		b = new Button("Submit");
		b.setBounds(20, 340, 70, 20);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new LoginPage(nameTf,passwordTf,addressTa,phoneTf,emailTf,cb1,cb2,cb3,cb4,cb5,cbg,c);
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
		
		this.add(name);this.add(nameTf);
		this.add(address);this.add(addressTa);
		this.add(phone);this.add(phoneTf);
		this.add(email);this.add(emailTf);
		this.add(password);this.add(passwordTf);
		this.add(language);this.add(cb1);this.add(cb2);this.add(cb3);this.add(cb4);this.add(cb5);
		this.add(state);this.add(c);
		this.add(gender);this.add(cb6);this.add(cb7);
		this.add(b);
	}
	
	public static void main(String[] args) {
		new RegistrationForm();
	}
}
