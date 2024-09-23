package mru;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import mru.Applicant;


public class Application {
	final  static String INPUT_DATA_FOLDER = "data/input/";
	final static String OUTPUT_DATA_FOLDER = "data/output/";
	final static int SCORE_THRESHOLD = 67;

	public static void main(String[] args) throws IOException {
		
		
		
		
		ArrayList<Applicant>list = new ArrayList<>();
		Applicant applicant = new Applicant("jordan", "p", 25, "sure", 5, 8, 8, 5, true, "Kill me now", 10, true, true, true, true, true, true, true, true);
		list.add(applicant);
		
		printQualifiedApplicants("full.txt", list);
		

	}

	public static void printQualifiedApplicants(String fileName, ArrayList<Applicant>applicantList) throws IOException {
		String relativePath = OUTPUT_DATA_FOLDER + fileName;
		int qualifiedApplicants = 0;
		FileWriter  writer = new FileWriter(relativePath);
		writer.write("First Name          |Last Name           |  Age|Score");
		writer.write("\n--------------------+--------------------+-----+-----");
		for (Applicant applicant: applicantList)
			/*if applicant.score >= SCORE_THRESHOLD:
                print(f"{applicant}", file=output_file)
                qualified_applicants += 1*/
		 System.out.println(applicant); 
			
		writer.close();
		
	}
	
}

