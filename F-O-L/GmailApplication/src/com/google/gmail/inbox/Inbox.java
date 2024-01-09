package com.google.gmail.inbox;
import com.gmail.spam.Spam;
import com.gmail.spam.Draft;

public class Inbox {
	public static void main(String[] args) {
		Draft d = new Draft();
		
		System.out.println(com.gmail.spam.Spam.a); //if not importing packages, we can access members using this.
		System.out.println(Spam.a);
		System.out.println(d.a);
	}
}
