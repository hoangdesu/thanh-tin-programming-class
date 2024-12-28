package Lab.Dec25_Lab10_28_Deans_list;

import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects
//	private ArrayList<Student> deansList; // tạo 1 array riêng cho dean's list

	public Course() {
		roster = new ArrayList<Student>();
//		deansList = new ArrayList<>();
	}

	public ArrayList<Student> getDeansList() {
		/* Type your code here */
//		return deansList;

//		lặp qua các hs trong lớp, lọc các thằng hs thoả điều kiện
		ArrayList<Student> deanList = new ArrayList<>();

		for (Student s : roster) {
			if (s.getGPA() >= 3.5) {
				deanList.add(s);
			}
		}

		return deanList;
	}

	public void addStudent(Student s) {
		roster.add(s);

//		if (s.getGPA() >= 3.5) {
//			deansList.add(s);
//		}
	}
}