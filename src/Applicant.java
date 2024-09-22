
public class Applicant {

	
    public String firstName;
    public String lastName;
    public int age;
    public String maritalStatus;

    public int speak1;
    public int listen1;
    public int read1;
    public int write1;
    public boolean all2;

    public String education;	
    public int  workExperience;
    public boolean arrangedEmployment;

    public boolean adaptabilitySpouseLanguage;
    public boolean adaptabilitySpouseEducation;
    public boolean adaptabilitySpouseWork;
    public boolean adaptabilityYouEducation;
    public boolean adaptabilityYouWork;
    public boolean adaptabilityYouEmployment;
    public boolean adaptabilityRelatives;
    			int score = 0;
 
    
    public Applicant(String firstName, String lastName, int age, String maritalStatus, int speak1, int listen1,int read1, int write1, boolean all2, String education, int workExperience, boolean arrangedEmployment, 
            boolean adaptabilitySpouseLanguage, boolean adaptabilitySpouseEducation, boolean adaptabilitySpouseWork, boolean 
            adaptabilityYouEducation, boolean adaptabilityYouWork, boolean adaptabilityYouEmployment, boolean adaptabilityRelatives) {
        
    			this.firstName = firstName;
        	    this.lastName = lastName;
        	    this.age = age;
        	    this.maritalStatus = maritalStatus;

        	    this.speak1 = speak1;
        	    this.listen1 = listen1;
        	    this.read1 = read1;
        	    this.write1 = write1;
        	    this.all2 = all2;

        	    this.education = education; 	
        	    this.workExperience = workExperience;
        	    this.arrangedEmployment = arrangedEmployment;

        	    this.adaptabilitySpouseLanguage = adaptabilitySpouseLanguage;
        	    this.adaptabilitySpouseEducation = adaptabilitySpouseEducation;
        	    this.adaptabilitySpouseWork = adaptabilitySpouseWork;
        	    this.adaptabilityYouEducation = adaptabilityYouEducation;
        	    this.adaptabilityYouWork = adaptabilityYouWork;
        	    this.adaptabilityYouEmployment = adaptabilityYouEmployment;
        	    this.adaptabilityRelatives = adaptabilityRelatives;

        	    this.score = 0;
    }

	
}
