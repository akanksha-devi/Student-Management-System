package studentManagement;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
		boolean isRunning = true;

		while(isRunning) {
			System.out.println("======Student Management System======");
			System.out.println("Which operation do you want to do!");
			System.out.println("1. Add details of new student.");
			System.out.println("2. Display details of students.");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : addStudent(students, sc);
			break;
			
			case 2 : displayStudents(students);
			break;
			
			case 3 : searchStudent(students, sc);
		    break;
		    
			case 4:
			    updateStudent(students, sc);
			    break;
		    
			case 5 : isRunning = false;
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
	
	public static void addStudent(ArrayList<Student> students, Scanner sc) {
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter ID: ");
			long id = sc.nextLong();

			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Enter Course: ");
			String course = sc.nextLine();

			System.out.print("Enter Father's Name: ");
			String fName = sc.nextLine();
			
			Student student = new Student(name, id, age, course, fName);
			
			students.add(student);
			System.out.println("Student added successfully!");
			System.out.println();
	}
	
	public static void displayStudents(ArrayList<Student> students) {
		if(students.isEmpty()) {
			System.out.println("No students available.");
			System.out.println();
			return;
		}
		
		for(Student student: students) {
			student.displayDetails();
			System.out.println();
		}
	}
	
	public static void searchStudent(ArrayList<Student> students, Scanner sc) {
	    if(students.isEmpty()) {
	        System.out.println("No students available.");
	        return;
	    }

	    System.out.print("Enter Student ID to search: ");
	    long searchId = sc.nextLong();
	    sc.nextLine();
	    boolean found = false;

	    for(Student student : students) {
	        if(student.getId() == searchId) {
	            System.out.println("Student Found!");
	            student.displayDetails();
	            found = true;
	            break;
	        }
	    }

	    if(!found) {
	        System.out.println("Student not found.");
	    }
	    System.out.println();
	}
	
	public static void updateStudent(ArrayList<Student> students, Scanner sc) {
		if(students.isEmpty()) {
			System.out.println("No students available.");
			return;
		}
		
		System.out.println("Enter student ID to update: ");
		long searchId = sc.nextLong();
		sc.nextLine();
		boolean found = false;
		
		for(Student student : students) {
			if(student.getId() == searchId) {
				System.out.println("Current Details:");
				student.displayDetails();
				System.out.println("\nEnter new details:");				
				
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				
				System.out.print("Enter ID: ");
				long id = sc.nextLong();

				System.out.print("Enter Age: ");
				int age = sc.nextInt();
				sc.nextLine(); 

				System.out.print("Enter Course: ");
				String course = sc.nextLine();

				System.out.print("Enter Father's Name: ");
				String fName = sc.nextLine();
				
				student.setName(name);
				student.setId(id);
				student.setAge(age);
				student.setCourse(course);
				student.setfName(fName);
				
				System.out.println("Student updated successfully!");
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Student not found.");
		}
	}

}
