package studentManagement;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter ID: ");
			long id = sc.nextLong();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine(); // consume the leftover newline

			System.out.print("Enter Course: ");
			String course = sc.nextLine();

			System.out.print("Enter Father's Name: ");
			String fName = sc.nextLine();
			
			Student s = new Student(name, id, age, course, fName);
			
			students.add(s);
			System.out.println("Student added successfully!");
			System.out.println("1. Add Another Student");
		    System.out.println("2. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 2) {
				isRunning = false;
			}
		}

		for(Student s1: students) {
			s1.displayDetails();
			System.out.println();
		}

	}

}
