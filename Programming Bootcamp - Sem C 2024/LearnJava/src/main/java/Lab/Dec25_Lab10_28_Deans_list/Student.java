package Lab.Dec25_Lab10_28_Deans_list;

import java.text.DecimalFormat;


// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average

	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first; // first name
		this.last = last;   // last name
		this.gpa = gpa;     // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}
	
	// Returns a String representation of the Student object, with the GPA formatted to one decimal
	public String toString() {

//		getFullName()
		DecimalFormat fmt = new DecimalFormat("#.0");
		return first + " " + last + " (GPA: " + fmt.format(gpa) + ")";

	}


	public String getFullName() {
		return first + " " + last;
	}
}