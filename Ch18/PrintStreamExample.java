package sec10;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("��ġ ");
		ps.println("��ġ ");
		ps.println("��ġ ");
		ps.printf("��ġ ");
		ps.printf("��ġ ");
		
		ps.flush();
		ps.close();
	}

}
