
public class Applicant {

	
    public String firstName;
    public String lastName;
    public int age;
    public String maritalStatus;

    public int speak_1;
    public int listen_1;
    public int read_1;
    public int write_1;
    public boolean all_2;

    public String education;	
    public int  work_experience;
    public boolean arranged_employment;

    public boolean adaptability_spouse_language;
    public boolean adaptability_spouse_education;
    public boolean adaptability_spouse_work;
    public boolean adaptability_you_education;
    public boolean adaptability_you_work;
    public boolean adaptability_you_employment;
    public boolean adaptability_relatives;
    
    public Applicant(self, first_name, last_name, age, marital_status, speak_1, listen_1, read_1, write_1, all_2, education, work_experience, arranged_employment,
            adaptability_spouse_language, adaptability_spouse_education, adaptability_spouse_work, 
            adaptability_you_education, adaptability_you_work, adaptability_you_employment, adaptability_relatives) {
        this.first_name = first_name;
        	    this.last_name = last_name;
        	    this.age = age;
        	    this.marital_status = marital_status;

        	    this.speak_1 = speak_1;
        	    this.listen_1 = listen_1;
        	    this.read_1 = read_1;
        	    this.write_1 = write_1;
        	    this.all_2 = all_2;

        	    this.education = education; 	
        	    this.work_experience = work_experience;
        	    this.arranged_employment = arranged_employment;

        	    this.adaptability_spouse_language = adaptability_spouse_language;
        	    this.adaptability_spouse_education = adaptability_spouse_education;
        	    this.adaptability_spouse_work = adaptability_spouse_work;
        	    this.adaptability_you_education = adaptability_you_education
        	    this.adaptability_you_work = adaptability_you_work
        	    this.adaptability_you_employment = adaptability_you_employment
        	    this.adaptability_relatives = adaptability_relatives

        	    this.score = 0
    }

	
}
