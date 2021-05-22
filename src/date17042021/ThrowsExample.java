package date17042021;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) throws FileNotFoundException {
		openFile("abc.txt");
		
	}
	
	static void openFile(String path) throws FileNotFoundException {
		File f = new File(path);
		FileInputStream ip = new FileInputStream(f);
	}
	

}
