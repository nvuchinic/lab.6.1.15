/**
 * class for creating  Student object, with instance variables name, index, gpa
 * @author nerminvucinic
 *
 */

public class Student {
	private String name;
	private int index;
	private double gpa;

	/**
	 * constructor method with parameters
	 * @param name variable for setting value of this.name variable
	 * @param index variable for setting value of this.index variable
	 * @param gpa variable for setting value of this.gpa variable
	 */
	public Student(String name, int index, double gpa) {
		this.name = name;
		this.index = index;
		this.gpa = gpa;
	}

	/**
	 * method for returning value of variable name
	 * @return value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * method for setting the value of variable name
	 * @param name new value for name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method for returning value of variable index
	 * @return
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * method for setting value of variable index
	 * @param index new value for index
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * method for returning value of variable gpa
	 * @return value of gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * method for setting value of variable gpa
	 * @param gpa new value for gpa
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * method for comparing objects of type Student
	 * @param other other object of type Student
	 * @return number 1 if this object of Student is bigger than other object of Student, returns -1 if other object is bigger, and 0 if objects are equal
	 */
	public int compareTo(Student other) {
		if (this.gpa > other.gpa) {
			return 1;
		} else if (this.gpa < other.gpa) {
			return -1;
		} else {
			if (this.index > other.index) {
				return 1;
			} else if (this.index < other.index) {
				return -1;
			} else {
				if (this.name.compareTo(other.name) > 0)
					return 1;
				else if (this.name.compareTo(other.name) < 0) {
					return -1;
				} else
					return 0;
			}

		}
	}

	/**
	 * method for creating and returning string representation of Student object
	 * @return string representation of Student object
	 */
	public String toString() {
		String StudentString = "";
		StudentString = "Ime: " + this.name + "\nIndex: " + this.index
				+ "\nProsjek ocjena: " + this.gpa + "\n_____________________\n";
		return StudentString;
	}

}
