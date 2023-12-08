import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class MarksCard {
	
	private static final String[] Name= new String[] { "Gloria", "Gladiya", "Glisilla","Femina","Febin" };
	private static final String[] USN = new String[] {"1CG21IS020","1CG21IS021","1CG21IS022","1CG21IS023", "1CG21IS024"};
	private static String Branch;
	private static String AcademicYear;
	public static String getBranch() {
		return Branch;
	}
	public static void setBranch(String branch) {
		Branch = branch;
	}
	public static String getAcademicYear() {
		return AcademicYear;
	}
	public static void setAcademicYear(String academicYear) {
		AcademicYear = academicYear;
	}
	public static String[] getName() {
		return Name;
	}
	public static String[] getUsn() {
		return USN;
	}
	
	public void appendIAMarksToFile(String EnteredNo, int amt )
	  {
		  
	File[] files = new File[Name.length];
	     
	      
	      for (int i=0; i<=3; i++)
	      {
	    	  if (EnteredNo==USN[i]) 
	    	  {
	    		  files[i]=new File(Name[i]+".txt");
	        	  try {
					files[i].createNewFile();
					
					FileWriter fw = new FileWriter(files[i].getName(),true);
					
					 fw.write("Hi");
		        	  
					  fw.close();
				} 
	        	  
	        	  catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	  }
	      }
	        	  
	        	  
	        	  
	        	  
	               
	    	  }
	      
	  
	
	
	
	
}
