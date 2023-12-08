import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MarksFile3 {
    private static final String[] Name = new String[] { "Gloria", "Gladiya", "Glisilla", "Femina", "Febin" };
    private static final String[] Subject = new String[] { "Kannada", "DSA", "Java", "MES", "OS" };
    private static final String[] USN = { "1CG21IS020", "1CG21IS021", "1CG21IS022", "1CG21IS023", "1CG21IS024" };

    public String[] registerNumber() {
        return USN;
    }

    public String[] getName() {
        return Name;
    }

    public static void appendIAMarks(String EnteredNo, int[] IA1, int[] IA2, int[] IA3) {
 
    	boolean valid = false;
        for (int i = 0; i < USN.length; i++) {

            if (EnteredNo.equalsIgnoreCase(USN[i])) {
                File[] files = new File[Name.length];
                files[i] = new File(Name[i] + ".txt");

                try {
                  String Branch = "ISE";
                    String AcademicYear = "2020-21";
                    files[i].createNewFile();

                    FileWriter fw = new FileWriter(files[i].getPath(), true);
                     if(files[i].length()==0)
                     {
                    fw.append("\n \t\t\t\t\t\t Academic Year :" + AcademicYear + "\t\t\t \n");
                    fw.append("\t\t\t\t\t\t*************************\n");
                     }
                    fw.append("\n");
                    fw.append("---------------------------------------------------------------------------------------------------------");
                    fw.append("\n Name : " + Name[i] + "\n USN : " + USN[i] + "\n Branch : " + Branch + "\n");
                    fw.append("---------------------------------------------------------------------------------------------------------");
                    fw.append("\n \tSubject \tIA1 \t\tIA2 \t\tIA3 \t\tAverage \t\tGrade \n");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the IA Marks of all 3 Tests out of 50 in all the Subjects(Kannada,DSA,Java,MES,OS):");
                    
                    
                    fw.append("\n");
                    for (int g = 0; g < Subject.length; g++) {
                        fw.append("\t" + Subject[g]);
                        
                        IA1[g]= scanner.nextInt();
                        if (IA1[g]<=50 && IA1[g]>=0)
                        {
                        	valid = true;
                        fw.append("\t\t"+IA1[g]);
                        
                        }
                          else if (valid)
                        {
                        	System.out.println("Enter Valid Marks");
                        	
                        	break;
                        	
                        }
                        IA2[g]= scanner.nextInt();
                        
                        fw.append("\t\t" + IA2[g]);
                        
                      IA3[g] = scanner.nextInt();
                      fw.append("\t\t" + IA3[g]);
                      
                      double[] Average = new double[Subject.length];
                      int[] sum = new int[Subject.length];
                      sum[g] = IA1[g] + IA2[g] + IA3[g];;
                      
                      
                      Average[g] = (double) sum[g]/3.0;
                      DecimalFormat df = new DecimalFormat("#.##");
                      fw.append("\t\t" + df.format(Average[g]));
                     
                      if (Average[g] >= 40) {
                          fw.append("\t\t\t A\n");
                      } else if (Average[g] >= 30) {
                          fw.append("\t\t\t B\n");
                      } else if (Average[g] >= 20) {
                          fw.append("\t\t\t C\n");
                      } else if (Average[g] >= 10) {
                          fw.append("\t\t\t D\n");
                      } else {
                          fw.append("\t\t\t F\n");
                      }
                    }

                   
                    String fileName = (Name[i] + ".txt");

                    

                    scanner.close();
                    fw.close();
                
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        System.out.println("Your data has been updated..!");
    }

    public static void main(String[] args) throws IOException {

        MarksFile3 student = new MarksFile3();
        System.out.println("Enter the Register Number :");
             int test=3;
        try (Scanner scanner = new Scanner(System.in)) {
            String EnteredNo = scanner.next();
            int[] IA1 = new int[Subject.length];
            int[] IA2 = new int[Subject.length];
            int[] IA3 = new int[Subject.length];

            appendIAMarks(EnteredNo, IA1, IA2, IA3);
            
        }
    }
}
