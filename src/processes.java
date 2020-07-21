import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class processes extends Thread{
	 int id;
	 String State;

	public processes(int x, String y) {
		id=x;
		State=y;	
	}
	public void run() {
		if(id==1) {
			try {
				p1();
			} catch (Exception e) {
				
			}
		}
		else if(id==2) {
			try {
				p2();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(id==3) {
			p3();
		}
		else if(id==4) {
			p4();
		}
		else if(id==5) {
			try {
				p5();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
 		 
	private static void p5() throws IOException {
		 try {
		OS.out("enter low:");
		int low=Integer.parseInt(OS.in()) ;
		OS.out("enter high:");
		int high=Integer.parseInt(OS.in()) ; 

		// int temp=low;
//		    if (low>high) {
//		    low=high;
//		    high=temp;
//		    } 
		String myFile = new String("file"+low);
		File myObj = new File(myFile);
		  while(myObj.exists()) {
			  myFile=myFile+""+low;  
			  myObj = new File(myFile);
		  }
		  
		     myObj.createNewFile();
		   for(int i=low;i<=high;i++) {
		    String s = Integer.toString(i); 
		    OS.writeInFile(myFile,s+" "); 
		   }}catch (Exception e) {
			     System.out.println("An error occurred.");
			   
		}
}
		private static void p2() throws IOException {
			
		OS.out("enter file name");
		String fileName=(String) OS.in(); 
		File file=new File(fileName);
		if(file.exists()) {
		OS.out("enter data");
		String data=(String) OS.in();
				  try {
		         OS.writeInFile(fileName,data);
		  }
		   catch (Exception e) {
		  OS.out("error somewhere");
		  }}
		else{
			System.out.println("no such file");}
		}
	

		
//	private static void p5() throws IOException {
//		try {
//		OS.out("enter low:");
//		int low=Integer.parseInt(OS.in()) ;
//		OS.out("enter high:");
//		
//		int high=Integer.parseInt(OS.in()) ;
//		   int temp=low;
//		    if (low>high) {
//		    low=high;
//		    high=temp;
//		    }			
//				String myFile = new String("test.txt");
//
//		    for(int i=low;i<high;i++) {
//		    	String s = Integer.toString(i); 
//		  
//		    	OS.writeInFile(myFile,s);
//		    		
//		    }}
//		catch (Exception e) {
//		System.out.println("error");
//		}
//		   
//		    
//	}
//
//	private static void p2() throws IOException {
//		OS.out("enter file name");
//		String fileName=(String) OS.in();	
//		File file = new File(fileName);
//		if(file.exists()) {
//		OS.out("enter data");
//		 String data=(String) OS.in();
//		 OS.writeInFile(fileName,data);}
//		else {
//			OS.out("file doesn't exist");
//	   	}
//	}
	public static void p1() throws Exception {
		OS.out("Enter file name:");
		String fileName=(String) OS.in();
   	//use file returned as string
   	String s = null;
   		try {
  
  
   			s=OS.readFile2(fileName);

   			OS.out(s);
   }
    catch (Exception e) {
   	 OS.out("error somewhere");
   }}


	
	//It should count and display to the user the numbers from 0 to 300.
	public static void p3() {
		
	for(int i=0;i<301;i++) {
		OS.out(""+i);}
	}
	//It should count and display to the user the numbers from 500 to 1000.
	public static void p4() {
	for(int i=500;i<1001;i++) {
	//System.out.println(""+i);
		OS.out(""+i);
	}

	}

}
