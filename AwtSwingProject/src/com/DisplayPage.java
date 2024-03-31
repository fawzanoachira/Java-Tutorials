package com;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayPage extends Frame{
	
	Label name,email,password,address,phone,language,state,gender;
	
	TextField nameTf,emailTf,passwordTf,phoneTf;
	TextArea addressTa;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4,cb5;
	Choice c;
	public DisplayPage(TextField nameTf, TextField emailTf, TextField phoneTf, TextArea addressTa,
			CheckboxGroup cbg, Checkbox cb1, Checkbox cb2, Checkbox cb3, Checkbox cb4, Checkbox cb5, Choice c) {
		

		this.setVisible(true);
		this.setLayout(null);
		this.setSize(400,600);
		this.setTitle("Profile");
		
		this.nameTf = nameTf;
		this.emailTf = emailTf;
		this.passwordTf = passwordTf;
		this.phoneTf = phoneTf;
		this.addressTa = addressTa;
		this.cb1 = cb1;
		this.cb2 = cb2;
		this.cb3 = cb3;
		this.cb4 = cb4;
		this.cb5 = cb5;
		this.cbg = cbg;
		this.c = c;
		
		name = new Label();
		name.setBounds(20,50,80,20);
		email = new Label();
		email.setBounds(20,80,80,20);
		phone = new Label();
		phone.setBounds(20,110,80,20);
		address = new Label();
		address.setBounds(20,140,80,20);
		language = new Label();
		language.setBounds(20,230,300,20);
		gender = new Label();
		gender.setBounds(20,170,80,20);
		state = new Label();
		state.setBounds(20,200,80,20);
		
		String str = "";
		if(cb1.getState()==true) {
			str = str + cb1.getLabel() + " ";
		}
		if(cb2.getState()==true) {
			str = str + cb2.getLabel() + " ";
		}
		if(cb3.getState()==true) {
			str = str + cb3.getLabel() + " ";
		}
		if(cb4.getState()==true) {
			str = str + cb4.getLabel() + " ";
		}
		if(cb5.getState()==true) {
			str = str + cb5.getLabel() + " ";
		}

		name.setText(nameTf.getText());
		email.setText(emailTf.getText());
		phone.setText(phoneTf.getText());
		address.setText(addressTa.getText());
		language.setText(str);
		gender.setText(cbg.getSelectedCheckbox().getLabel());
		state.setText(c.getSelectedItem());
		
		this.add(name);this.add(email);this.add(phone);this.add(address);this.add(language);this.add(gender);this.add(state);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
}
