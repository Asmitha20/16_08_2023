import java.util.*;
public class Main
{
    //static variable
    static int companyRegistrationID = 1020;
    //instance variable
    int employeeAge;
    char employeeGender;
    String employeeName;
	public static void main(String[] args) {
		System.out.println(companyRegistrationID);
		Main e1 = new Main();
		e1.employeeAge = 10;
		e1.employeeGender = 'M';
		e1.employeeName = "Female";
		System.out.println(e1.employeeAge);
		System.out.println(e1.employeeGender);
		System.out.println(e1.employeeName);
		System.out.println("-------");
		System.out.println(companyRegistrationID);
		Main e2 = new Main();
		e2.employeeAge = 20;
		e2.employeeGender = 'F';
		e2.employeeName = "Female";
		System.out.println(e2.employeeAge);
		System.out.println(e2.employeeGender);
		System.out.println(e2.employeeName);
	}
}
