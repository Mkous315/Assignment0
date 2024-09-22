import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Applicant.java


public class Application {
	final  static String INPUT_DATA_FOLDER = "data/input/";
	final static String OUTPUT_DATA_FOLDER = "data/output/";
	final static int SCORE_THRESHOLD = 67;

	public static void main(String[] args) throws IOException {
 
		printQualifiedApplicants("foo.txt", null);
		
		

	}

	public static void printQualifiedApplicants(String fileName, ArrayList<String>applicantList) throws IOException {
		String relativePath = OUTPUT_DATA_FOLDER + fileName;
		int qualifiedApplicants = 0;
		Applicant app = new Applicant();
		FileWriter  writer = new FileWriter(relativePath);
		writer.write("First Name          |Last Name           |  Age|Score");
		writer.write("\n--------------------+--------------------+-----+-----");
		
			writer.write();
		writer.close();
		
	}
	
}

