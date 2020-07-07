import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryMultiResource {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		//write multiple resources in try block using semicolon
		try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\exampleDirectory\\Input.txt");
			InputStream input = new FileInputStream("D:\\\\exampleDirectory\\\\Input.txt") ){
				String msg = "Hello from TryMultiResource program";
				byte byteArray[] = msg.getBytes();
				fileOutputStream.write(byteArray);
				System.out.println("Data written into file");  
		        System.out.println(msg); 
		        
		        DataInputStream inst = new DataInputStream(input);
		        int data = input.available();
		    
		        byte[] byteArray1 = new byte[data];
		        inst.read(byteArray1);
		        String s = new String(byteArray1);
		        System.out.println("data read from the file");
		        System.out.println(s);				
			}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
	}

}
