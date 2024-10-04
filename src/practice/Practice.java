package practice;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String correct_name = "Arnold";
String correct_password="cyrus";
	int attempts = 3;
	for(int attempt=1;attempt<=3;attempt++) {
		System.out.print("Enter your username");
		String username = input.nextLine();
		System.out.print("Enter your password ");
		String password = input.nextLine();
		if(username.equals(correct_name)&&password.equals(correct_password)) {System.out.println("login successful");break;}
		else {System.out.println("incorrect password");
		}
		if (attempt==attempts) {System.out.println("too many attempts ,pliz try again");}
		}	
	input.close();
}
}