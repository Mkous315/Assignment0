package appdriver;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class application {
	public static void main (String[] args) throws IOException {
		// scanner for user input
		Scanner scanner = new Scanner(System.in);
		//creating the dataset options
		
		System.out.println("Enter the full name of the .txt file you want to sort: ");
		String chosen_datafile = scanner.next();
		
		final String FILE_PATH = "rsc/" + chosen_datafile;
		//file path into file object
		File file = new File(FILE_PATH);
		//file into fileScanner
		Scanner fileScanner = new Scanner(file);
		
		// file out put 
		//a formatter for the output
		
		int qualifiedApplicant = 0;
	
		//while filescanner has a next line put it into a list split by white space
		while(fileScanner.hasNextLine()) {
			String current_line = fileScanner.nextLine();
			String [] applicantData = current_line.split("\t");
			 	
			String firstName = applicantData[0];
	        String lastName = applicantData[1];
	        int age = Integer.parseInt(applicantData[2]);
	        String maritalStatus = applicantData[3];
	        int speak1 = Integer.parseInt(applicantData[4]);
	        int listen1 = Integer.parseInt(applicantData[5]);
	        int read1 = Integer.parseInt(applicantData[6]);
	        int write1 = Integer.parseInt(applicantData[7]);
	        boolean all2 = applicantData[8].equals("yes");
            String education = applicantData[9];
	        int workExperience = Integer.parseInt(applicantData[10]);
	        boolean arrangedEmployment = applicantData[11].equals("yes");
	        boolean adaptabilitySpouseLanguage = applicantData[12].equals("yes");
	        boolean adaptabilitySpouseEducation = applicantData[13].equals("yes");
	        boolean adaptabilitySpouseWork = applicantData[14].equals("yes");
	        boolean adaptabilityYouEducation = applicantData[15].equals("yes");
	        boolean adaptabilityYouWork = applicantData[16].equals("yes");
            boolean adaptabilityYouEmployment = applicantData[17].equals("yes");
	        boolean adaptabilityRelatives = applicantData[18].equals("yes");

	        // calling methods with the data from txt file and storing them into int variables
	        int agePoints = age(age);
	        int languageSkills = languageSkills(speak1, listen1, read1, write1);
	        int secondaryLanguageSkills = secondaryLanguageSkillsCalculator(all2);
	        int educationPoints = educationCalculator(education);
	        int workExperiencePoints = calculateWorkExperiencePoints(workExperience);
	        int arrangedEmploymentPoints = arrangedEmployment(arrangedEmployment);
	        int adaptabilityPoints = adaptabilityCalculator(adaptabilitySpouseLanguage, adaptabilitySpouseEducation,
	        adaptabilitySpouseWork, adaptabilityYouEducation, adaptabilityYouWork, adaptabilityYouEmployment,adaptabilityRelatives);
	            
	        // Here i am taking all the int values and adding them to determine applicants total points 
	        int totalPoints = (agePoints + languageSkills + secondaryLanguageSkills + educationPoints +
	                           workExperiencePoints + arrangedEmploymentPoints + adaptabilityPoints);
	            
	        // if qualified increment qualifiedApplicant variable
	            // if qualified print the structure to the formater
	            if (totalPoints >= 67) {
	                //write the applicant name last name age and score to the output file

	                qualifiedApplicant++;

	            }
	            
		}
		System.out.println("There are " + qualifiedApplicant + "qualified applicants");
		
		fileScanner.close();
		scanner.close();
		
	            } 
	
	    public static int secondaryLanguageSkillsCalculator(boolean all2) {
	        
	    }

	    // Adaptability point calculator
	    public static int adaptabilityCalculator(boolean adaptabilitySpouseLanguage, boolean adaptabilitySpouseEducation,
	            boolean adaptabilitySpouseWork, boolean adaptabilityYouEducation, boolean adaptabilityYouWork,
	            boolean adaptabilityYouEmployment, boolean adaptabilityRelatives) {
	        
	    }

	    // Arranged employment point calculator
	    public static int arrangedEmployment(boolean arrangedEmployment) {
	        
	    }

	    // education point calculator
	    public static int educationCalculator(String education) {
	        
	    }

	    // age point calculator
	    public static int age(int age) {

	    }

	    // Experience point calculator
	    public static int calculateWorkExperiencePoints(int workExperience) {

	        
	    }

	    // Language skills point calculator
	    public static int languageSkills(int speak1, int listen1, int read1, int write1) {
	        
	    }
		
}