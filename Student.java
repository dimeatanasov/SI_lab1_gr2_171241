class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		int sum = 0;
		for(Integer element : grades){
			sum += element;
		}
		return sum/grades.size();
 	}

	public int ECTSCredits() {
		return grades.size() * 6;
	}
}
