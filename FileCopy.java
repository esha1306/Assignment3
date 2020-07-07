import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader rf = new FileReader("D:\\exampleDirectory\\Input.txt");
			BufferedReader br = new BufferedReader(rf);
			
			// if the folder doesn't have a output file it will create output file first.
			FileWriter wf = new FileWriter("D:\\exampleDirectory\\Output.txt", true);
			String s;
			
			while((s = br.readLine()) != null) { //reads the data of the input file
				
				wf.write(s); //writes in the output file
				wf.flush();
			}
			
			br.close();
			wf.close();
			System.out.println("File Copied successfully!!!");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
