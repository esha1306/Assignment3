import java.io.File;
import java.io.FilenameFilter;
import java.io.*;

public class DeleteFileInitialS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:\\exampleDirectory");
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("S");
			}		
		};
		
		String[] child = dir.list(filter);
		
		if (child != null) {
			for (int i = 0; i < child.length; i++) {
				String filename = child[i];
				System.out.println("Deleteed File:" +filename);
				
				File RemoveFile = new File(filename);
				RemoveFile.delete();			
			}
			
		}
	}

}
