import java.io.File;

public class ListofFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directoryPath = new File("D:\\exampleDirectory");
		
		String contents[] = directoryPath.list();
		System.out.println("List of the Files and Folder of exampleDirectory are as follows:");
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}

	}

}
