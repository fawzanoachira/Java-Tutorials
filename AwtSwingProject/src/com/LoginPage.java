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

public class LoginPage extends Frame {
	Label email, password;
	TextField emailLtf, passwordLtf;
	Button b;
	
	TextField nameTf, passwordTf, phoneTf, emailTf;
	TextArea addressTa;
	Checkbox cb1, cb2, cb3, cb4, cb5; 
	CheckboxGroup cbg; 
	Choice c;
	
	public LoginPage(TextField nameTf, TextField passwordTf, TextArea addressTa, TextField phoneTf, TextField emailTf,
			Checkbox cb1, Checkbox cb2, Checkbox cb3, Checkbox cb4, Checkbox cb5, CheckboxGroup cbg, Choice c) {
		this.setVisible(true);
		this.setTitle("Login Page");
		this.setSize(400, 500);
		this.setLayout(null);
		
		email = new Label("Email");
		email.setBounds(20,100,80,20);
		emailLtf = new TextField();
		emailLtf.setBounds(120, 100, 80, 20);
		
		password = new Label("Password");
		password.setBounds(20,130,80,20);
		passwordLtf = new TextField();
		passwordLtf.setBounds(120, 130, 80, 20);
		
		b = new Button("Login");
		b.setBounds(20, 160, 60, 20);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(emailLtf.getText().equals(emailTf.getText())) {
					if(passwordLtf.getText().equals(passwordTf.getText())) {
						new DisplayPage(nameTf,emailTf,phoneTf,addressTa,cbg,cb1,cb2,cb3,cb4,cb5,c);
					}
				}
			}
		});
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.add(email);this.add(emailLtf);
		this.add(password);this.add(passwordLtf);
		this.add(b);
	}
}
