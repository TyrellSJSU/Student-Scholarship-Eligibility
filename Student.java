package scholarship;

/*
 * Information on Student
 * Used to determine a student's scholarship eligibility
 */
public class Student {
	private int age; //Age of the student
	private boolean livedInCali; //Whether student has lived in California for last 2 years
	private boolean paidStateTax; //Whether student's parents have paid California state tax for at least 1 year in their lifetime
	private boolean partTime; //Whether student has worked part time for at least for 6 months in the relevant field of study
	private boolean volunteer; // Whether student has volunteered
	private boolean houseIncome; //Whether student has household income less than 5000$ 
	
	/*
	 * Constructor for the student
	 * The student
	 */
	public Student() {
		this.age = 0;
		this.livedInCali = false;
		this.paidStateTax = false;
		this.partTime = false;
		this.volunteer = false;
		this.houseIncome = false;
	}
	
	/*
	 * Sets the students age
	 * @param age student's age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * Checks the student's age, and determines their eligibility
	 * @param age student's age
	 * @return returns true if the student is eligible, false otherwise
	 */
	public boolean checkAge(int age) {
		if (18 <= age && age <= 24) {
			return true;
		}
		return false;
	}
	
	/*
	 * Checks to see if the student has lived in California for last 2 years
	 * @param livedInCali YES if the lived in California for last 2 years or NO
	 * @return returns true if they lived in Cali or otherwise false
	 */
	public boolean checkLivedInCali(String livedInCali) {
		String answer = livedInCali.toUpperCase();
		if (answer.equals("YES")) {
			return true;
		}
		else if (answer.equals("NO")) {
			return false;
		}
		return false;
	}
	
	/*
	 * Sets whether the student lived in Cali or not
	 * @param livedInCali YES or NO
	 */
	public void setLivedInCali(String livedInCali) {
		String answer = livedInCali.toUpperCase();
		if (answer.equals("YES")) {
			this.livedInCali = true;
		}
		else if (answer.equals("NO")) {
			this.livedInCali = false;
		}
	}
	
	/*
	 * Checks to see if parents of the student have paid California state tax for at least 1 year in their lifetime.
	 * @param paidStateTax YES if tax paid or NO 
	 * @return returns true if the parents paid tax or otherwise false
	 */
	public boolean checkPaidStateTax(String paidStateTax) {
		String answer = paidStateTax.toUpperCase();
		if (answer.equals("YES")) {
			return true;
		}
		else if (answer.equals("NO")) {
			return false;
		}
		return false;
	}
	
	/*
	 * Sets whether parents have paid the tax or not
	 */
	public void setPaidStateTax(String paidStateTax) {
		String answer = paidStateTax.toUpperCase();
		if (answer.equals("YES")) {
			this.paidStateTax = true;
		}
		else if (answer.equals("NO")) {
			this.paidStateTax = false;
		}
	}
	
	/*
	 * Checks to see if student has worked part time for at least for 6 months in the relevant field of study
	 * @param partTime YES if student has worked part time for 6 months or NO 
	 * @return returns true if student worked or otherwise false
	 */
	public boolean checkPartTime(String partTime) {
		String answer = partTime.toUpperCase();
		if (answer.equals("YES")) {
			return true;
		}
		else if (answer.equals("NO")) {
			return false;
		}
		return false;
	}
	
	/*
	 * Sets whether student did part time
	 */
	public void setPartTime(String partTime) {
		String answer = partTime.toUpperCase();
		if (answer.equals("YES")) {
			this.partTime = true;
		}
		else if (answer.equals("NO")) {
			this.partTime = false;
		}
	}
	
	/*
	 * Checks to see if student has volunteered for a cause and have valid proof of it
	 * @param partTime YES if student has voluteered or NO 
	 * @return returns true if student volunteered or otherwise false
	 */
	public boolean checkVolunteer(String volunteer) {
		String answer = volunteer.toUpperCase();
		if (answer.equals("YES")) {
			return true;
		}
		else if (answer.equals("NO")) {
			return false;
		}
		return false;
	}
	
	/*
	 * Sets whether student has volunteered
	 */
	public void setVolunteer(String volunteer) {
		String answer = volunteer.toUpperCase();
		if (answer.equals("YES")) {
			this.volunteer = true;
		}
		else if (answer.equals("NO")) {
			this.volunteer = false;
		}
	}
	
	/*
	 * Determines if the student fulfills at least one CA Residency condition
	 */
	public boolean checkResidency() {
		if(this.livedInCali == true || this.paidStateTax == true || this.partTime == true || this.volunteer == true) {
			return true;
		}
		return false;
	}
	
	/*
	 * Checks the students information and determines whether 
	 * the student in eligible for a scholarship
	 */
	public boolean checkEligibility() {
		if (checkAge(this.age) & checkResidency()) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * Checks to see if student has a household income less than 5000$
	 * @param partTime YES if student has a household income less than 5000$ or NO 
	 * @return returns true if student has a household income less than 5000$ or otherwise false
	 */
	public boolean checkHouseIncome(String houseIncome) {
		String answer = houseIncome.toUpperCase();
		if (answer.equals("YES")) {
			return true;
		}
		else if (answer.equals("NO")) {
			return false;
		}
		return false;
	}
	
	/*
	 * Sets whether student has volunteered
	 */
	public void setHouseIncome(String houseIncome) {
		String answer = houseIncome.toUpperCase();
		if (answer.equals("YES")) {
			this.houseIncome = true;
		}
		else if (answer.equals("NO")) {
			this.houseIncome = false;
		}
	}
}
