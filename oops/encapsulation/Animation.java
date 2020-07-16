package oops.encapsulation;

import java.util.*;

public class Animation {
	Scanner sc = new Scanner(System.in);

	Animation(String name) {
		System.out.println(name + " is being under process.please wait!");
	}

	private String password = "Kunal@123";

	public void getString() {
		System.out.println("The password is set");
	}

	public void setPassword() {
		System.out.print("Enter the previous password:");
		String s = sc.next();
		if (password == s) {
			System.out.print("Enter the new password");
			sc.nextLine();
			String s1 = sc.next();
			System.out.print("Re enter the new password:");
			sc.nextLine();
			String s2 = sc.next();
			if (s1 == s2)
				getString();
			else
				setPassword();
		} else
			System.out.println("The password is incorrect");
	}

}
