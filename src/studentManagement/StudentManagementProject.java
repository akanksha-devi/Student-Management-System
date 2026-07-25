package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();

		ArrayList<Student> students = new ArrayList<>();
		boolean isRunning = true;

		while(isRunning) {
			System.out.println("======Student Management System======");
			System.out.println("Which operation do you want to do!");
			System.out.println("1. Add details of new student.");
			System.out.println("2. Display details of students.");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : service.addStudent(students, sc);
			break;
			
			case 2 : service.displayStudents(students);
			break;
			
			case 3 : service.searchStudent(students, sc);
		    break;
		    
			case 4:
			    service.updateStudent(students, sc);
			    break;
			    
			case 5:
			    service.deleteStudent(students, sc);
			    break;
		    
			case 6 : isRunning = false;
			     System.out.println("\nThank you for using the Student Management System.");
			     System.out.println("Have a great day!");
				break;
				
				
			default:
			    System.out.println("Invalid choice! Please enter a valid option.");
			    System.out.println();
			}
		}
		sc.close();
	}
}
