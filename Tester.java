package scholarship;
import java.util.Scanner;

/*
 * A student is eligible for scholarships if he satisfies the below conditions:

A. Student is between the age 18 and 24 (boundary value included)

B. Student has lived in California for last 2 years, if he fails this criterion, check if satisfies D.

C. Has worked part time for at least for 6 months in the relevant field of study, 
if he fails this criterion, check if satisfies E.

D. Parents of the student have paid California state tax for at least 1 year in their lifetime.

E. Has volunteered for a cause and has a valid proof of it.

F. Has household income less than 5000$ per annum then one need not satisfy criteria C, 
he will be redirected to "Dean for consideration"
 */
public class Tester {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Student student = new Student(); //Creates a student object to store information
		
		System.out.print("How old are you? \nEnter age: ");
		int age = scan.nextInt();
		student.setAge(age);
		
		scan.nextLine();
		
		if(student.checkAge(age)) { //Checks whether the student is between the age 18 and 24, if not then not eligible
			System.out.print("Have you lived in California for the last two years? \n(Answer YES or NO)-> ");
			String livedInCali = scan.nextLine();
			student.setLivedInCali(livedInCali);
			
			if (student.checkLivedInCali(livedInCali) == false) { //If student fails the criterion, check if it satisfies D
				System.out.print("Have your parents paid California state tax for at least 1 year in their lifetime? \n(Answer YES or NO)-> ");
				String paidStateTax = scan.nextLine();
				student.setPaidStateTax(paidStateTax);
				if(student.checkPaidStateTax(paidStateTax) == false) {
					System.out.print("Have you worked part time for atleast 6 months in your field of study? \n(Answer YES or NO)-> ");
					String partTime = scan.nextLine();
					student.setPartTime(partTime);
					if(student.checkPartTime(partTime) == false) { //If student fails the criterion, check if it satisfies E
						System.out.print("Have you volunteered for a cause and have valid proof of it? \n(Answer YES or NO)-> ");
						String volunteer = scan.nextLine();
						student.setVolunteer(volunteer);
						if(student.checkVolunteer(volunteer) == true) { //Student has volunteered for a cause
							System.out.println();
							System.out.println("Student is eligible for scholarship");
						}
					}
					else { //Student has worked part time for at least 6 months
						System.out.println();
						System.out.println("Student is eligible for scholarship");
					}
				}
				else { //Student has had their parents pay for California tax
					System.out.println();
					System.out.println("Student is eligible for scholarship");
				}
			}
			else {//Student has lived in California for the last 2 years
				System.out.println();
				System.out.println("Student is eligible for scholarship");
			}
			
			
			
			if(!student.checkResidency()) { //Checks whether the students has not fulfilled CA Residency conditions
				System.out.print("Do you have a household income less than 5000$? \n(Answer YES or NO)-> ");
				String houseIncome = scan.nextLine();
				student.setHouseIncome(houseIncome);
				if (student.checkHouseIncome(houseIncome)) { //Checks whether the student is allowed for Dean's Consideration
					System.out.println();
					System.out.println("Dean for Consideration");
				}
				else { //Otherwise no scholarship
					System.out.println();
					System.out.println("Student is not eligible for scholarship");
				}
			}
			
			
			}
		else { //In the event that the student does not fulfill the age requirements
			System.out.println();
			System.out.println("Student is NOT eligible for scholarship");
		}
		
		
		
		scan.close();
		
	}

}
