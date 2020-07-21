import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class OS {
	 public static void main(String args[]) throws Exception {
		 processes  proc1=new processes(1, "ready");
		 processes  proc2=new processes(2, "ready");
		 processes  proc5=new processes(5, "ready");
		 processes  proc4=new processes(4, "ready");
		 processes  proc3=new processes(3, "ready");
	 proc1.start();
	 proc3.start();
	 proc4.start();
	 proc5.start();
     proc2.start();
    }
	 public static String in() {		
			Scanner sc=new Scanner(System.in);
			String text=sc.nextLine();
			return text;
		}
		public static void out(Object txt) {	
			System.out.println(txt);	
		}

		public static String readFile2(String file) throws Exception {			
		    BufferedReader reader = new BufferedReader(new FileReader (file));
		    String         line = null;
		    StringBuilder  stringBuilder = new StringBuilder();
		    String ls = System.getProperty("line.separator");

		    try {
		        while((line = reader.readLine()) != null) {
		            stringBuilder.append(line);
		            stringBuilder.append(ls);
		        }
		        return stringBuilder.toString();
		    } finally {
		        reader.close();
		    }
		   
		}
		public static void writeInFile(String fileName, String data) throws IOException {
			File f=new File(fileName);
			if(f.exists()) {
		    FileWriter fileWriter = new FileWriter(fileName, true); 
		    PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.write(data);
		    printWriter.close();}
			
	}
}

