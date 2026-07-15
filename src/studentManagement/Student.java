package studentManagement;

public class Student {
	private String name;
	private long id;
	private int age;
	private String course;
	private String fName;
	
	public Student(String name, long id, int age, String course, String fName) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.course = course;
		this.fName = fName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	
	void displayDetails() {
	    System.out.println("----------------------------");
	    System.out.println("Name          : " + name);
	    System.out.println("ID            : " + id);
	    System.out.println("Age           : " + age);
	    System.out.println("Course        : " + course);
	    System.out.println("Father's Name : " + fName);
		System.out.println("----------------------------");
	}
	
}
