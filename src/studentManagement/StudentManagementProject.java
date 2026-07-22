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
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			
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
			    
			case 5:
			    deleteStudent(students, sc);
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
		
		System.out.print("Enter student ID to update: ");
		long searchId = sc.nextLong();
		sc.nextLine();
		boolean found = false;
		
		for(Student student : students) {
			if(student.getId() == searchId) {
				System.out.println("Current Details:");
				student.displayDetails();
				
				System.out.println("\nWhat do you want to update?");
				System.out.println("1. Name");
				System.out.println("2. ID");
				System.out.println("3. Age");
				System.out.println("4. Course");
				System.out.println("5. Father's Name");
				System.out.println("6. Update All Details");
				System.out.println("7. Cancel");

				int choice = sc.nextInt();
				sc.nextLine();	
				
                switch(choice) {
                case 1: {
                    System.out.print("Enter new Name: ");
                    String name = sc.nextLine();
                    student.setName(name);
                    System.out.println("Name updated successfully!");
                    showUpdatedDetails(student);
                    break;
                }
                    
                case 2: {
                	System.out.print("Enter new ID: ");
                	long id = sc.nextLong();
                    sc.nextLine();
                	student.setId(id);
                	System.out.println("ID updated successfully!");
                	showUpdatedDetails(student);
                	break;
                }
                	
                case 3: {
                    System.out.print("Enter new Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    student.setAge(age);
                    System.out.println("Age updated successfully!");
                    showUpdatedDetails(student);
                    break;
                }
                    
                case 4: {
                    System.out.print("Enter new Course: ");
                    String course = sc.nextLine();
                    student.setCourse(course);
                    System.out.println("Course updated successfully!");
                    showUpdatedDetails(student);
                    break;
                }
                    
                case 5: {
                    System.out.print("Enter new Father's Name: ");
                    String fName = sc.nextLine();
                    student.setfName(fName);
                    System.out.println("Father's name updated successfully!");
                    showUpdatedDetails(student);
                    break;
                }
                    
                case 6: {
                	updateAllDetails(student, sc);
    				break;
                }
    				
                case 7: {
                    System.out.println("Update cancelled.");
                    break;
                }
                    
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
                }
                found = true;
                break;
				
			}
		}
		
		if(!found) {
			System.out.println("Student not found.");
		}
	}
	
	
	public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
		if(students.isEmpty()) {
			System.out.println("No students available.");
			return;
		}
		
		System.out.print("Enter student ID to delete: ");
		long deleteId = sc.nextLong();
		sc.nextLine();
		boolean found = false;
		
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getId() == deleteId) {
				students.remove(i);
				System.out.println("Student deleted successfully!");
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Student not found.");
		}
		System.out.println();
	}
	
	
	public static void updateAllDetails(Student student, Scanner sc) {
		System.out.print("Enter new Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter new ID: ");
		long id = sc.nextLong();

		System.out.print("Enter new Age: ");
		int age = sc.nextInt();
		sc.nextLine(); 

		System.out.print("Enter new Course: ");
		String course = sc.nextLine();

		System.out.print("Enter new Father's Name: ");
		String fName = sc.nextLine();
		
		student.setName(name);
		student.setId(id);
		student.setAge(age);
		student.setCourse(course);
		student.setfName(fName);
		
		System.out.println("Student updated successfully!");
		System.out.println();
		System.out.println("Updated Details:");
		student.displayDetails();
	}
	
	
	public static void showUpdatedDetails(Student student) {
	    System.out.println();
	    System.out.println("Updated Details:");
	    student.displayDetails();
	}
}
