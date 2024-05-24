package sec10;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치 ");
		ps.println("마치 ");
		ps.println("마치 ");
		ps.printf("마치 ");
		ps.printf("마치 ");
		
		ps.flush();
		ps.close();
	}

}
