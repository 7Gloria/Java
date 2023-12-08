import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MovementRegister {
	private static final String[] Dept = new String[] { "ISE", "CSE", "AI&DS" };
	private static final String[] Name = new String[] { "Gloria", "Glady", "Glisy", "Femina", "Febin" };
//	private static final String[] Login_id = new String[] { "IS020@cit", "CS021@cit", "AD022@cit", "IS023@cit",
//			"IS024@cit" };
//	private static final String[] idcont = new String[] {"020", "021","022","023","024"};
	private static final String[] USN = new String[] { "1CG21IS020", "1CG21CS021", "1CG21AD022", "1CG21CS023",
			"1CG21IS024" };

	public static void validateLogin() throws IOException {
		System.out.println("Please enter your Login Id : ");
		Scanner scanner = new Scanner(System.in);
		String Entered_id = scanner.next();
		FileWriter fw = null;
		BufferedReader br = null;
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		String formattedTime = timeFormat.format(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date currentDate = new Date();
		String formattedDate = dateFormat.format(currentDate);

		try {
			File file = null;

			for (int i = 0; i < USN.length; i++) {
				if (Entered_id.equalsIgnoreCase(USN[i])) {

					file = new File(Dept[i] + ".txt");
					fw = new FileWriter(file.getPath(), true);

//					if (file.length() == 0) {
//						file.createNewFile();
//						fw.append("\nWelcome...!");
//						fw.write("\nDate:-" + formattedDate);
//						fw.append("\n-----------------------------------------------------------------------------");
//						fw.append("\n Name\t\tUSN\t\t\tTime-in\t\t\tTime-out");
//						fw.append("\n-----------------------------------------------------------------------------");
//					}

					if (Entered_id.contains("CS") || Entered_id.contains("cs")) {
						System.out.println("Welcome To CSE Lab");
						System.out.println("Login Details has been updated!!!");
					} else if (Entered_id.contains("IS") || Entered_id.contains("is")) {
						System.out.println("Welcome To ISE Lab");
						System.out.println("Login Details has been updated!!!");
					} else if (Entered_id.contains("AD") || Entered_id.contains("ad")) {
						System.out.println("Welcome To AI&DS Lab");
						System.out.println("Login Details has been updated!!!");
					}

					fw.append("\n" + Name[i] + "\t\t" + USN[i] + "\t\t" + formattedTime);
					break;
				}
			}

			if (file == null) {

				System.out.println("Please Enter The Valid ID.. Try again..!");
			}

			fw.close();
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//						while ((line = br.readLine()) != null) {
//							String[] parts = line.split("\t\t");
//							String[] splitedVal = parts;
//							System.out.println(splitedVal[0]);
//						}
//						if (br != null) {
//							br.close();
//						}
//						
//						PrintWriter printWriter = new PrintWriter(files);
//						String lineToRemove = line;	 
//						try (Stream<String> stream = Files.lines(Paths.get(files.toURI()))) { 
//						    stream.filter(lineDlt -> !lineDlt.trim().equals(lineToRemove)).forEach(printWriter::println); 
//						} catch (IOException e) { 
//						    System.err.println("Can't able to delete the line");
//						} 
//						printWriter.close();

//						else if (!Entered_id.equalsIgnoreCase(USN[i])
//							&& !Entered_id.equalsIgnoreCase(USN[i].toLowerCase())) {
//
//						System.out.println("Please Enter The Valid ID.. Try again..!");
//						System.exit(0);
//					}

	public static void ExitLab() {
		try {

			FileWriter fw = null;
			System.out.println("Please enter your Login Id to Exit : ");
			Scanner scanner = new Scanner(System.in);
			String Entered_id = scanner.next();

			for (int i = 0; i < USN.length; i++) {
				File file = new File(Dept[i] + ".txt");

				fw = new FileWriter(file.getPath(), true);

				if (Entered_id.equalsIgnoreCase(USN[i])) {

					boolean logoutAppended = false;
					System.out.println("Type Exit to Logout : ");

					String Typed = scanner.next();
					SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
					String Time = time.format(new Date());

					if (Typed.equalsIgnoreCase("Exit")) {
						logoutAppended = true;

					} else {
						System.out.println("Type exit correctly");
						String Type = scanner.next();
						if (Type.equalsIgnoreCase("Exit")) {
							logoutAppended = true;

						}
					}
					int lineIndex = 0; // Initialize line index
					if (logoutAppended) {
						try {
							int count = 0;
							FileReader fileReader = new FileReader("ISE.txt");
							String targetString = "1CG21IS020";
							// Wrap FileReader in BufferedReader
							BufferedReader bufferedReader = new BufferedReader(fileReader);

							String line2;

							// Read the file line by line
							while ((line2 = bufferedReader.readLine()) != null) {
								lineIndex++;

								// Check if the line contains the target string
								if (line2.contains(targetString)) {
									if (count == 0) {
										count++;
										continue;
									}
									System.out.println("Target string found on line " + lineIndex);
									break; // Stop searching after finding the first occurrence
								}
								

							}
							String fileName = Dept[i]+".txt"; // Replace with your actual file name
					        int lineToModify = lineIndex; // Replace with the line number you want to modify (1-based index)
					        String contentToAdd = "\tAdditional Content"; // Content to add to the specified line

							BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
				            StringBuilder fileContent = new StringBuilder();
				            String line;

				            int currentLine = 0;

				            while ((line = bufferedReader1.readLine()) != null) {
				                currentLine++;

				                // Step 2: Modify the specific line
				                if (currentLine == lineToModify) {
				                    line += contentToAdd;
				                }

				                fileContent.append(line).append("\n");
				            }

				            bufferedReader1.close();

				            // Step 3: Append the modified content back to the file
				            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
				            bufferedWriter.write(fileContent.toString());
				            bufferedWriter.close();

				            System.out.println("Content added to line " + lineToModify + " and appended to the file successfully.");

						} catch (IOException e) {
							e.printStackTrace();
						}
						fw.write("\t\t" + Time);

						break;
					}

				}
			}
			fw.close();
			scanner.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void displayStudentsInLab() throws IOException {

		System.out.println("Please enter which LAB : ");
		Scanner scan = new Scanner(System.in);
		String lab = scan.next();
		try {
			int count = 0;
			FileReader fileReader = new FileReader(lab + ".txt");
			String targetString = "-----------------------------------------------------------------------------";
			// Wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line2;
			int lineIndex = 0; // Initialize line index

			// Read the file line by line
			while ((line2 = bufferedReader.readLine()) != null) {
				lineIndex++;

				// Check if the line contains the target string
				if (line2.contains(targetString)) {
					if (count == 0) {
						count++;
						continue;
					}
					System.out.println("Target string found on line " + lineIndex);
					break; // Stop searching after finding the first occurrence
				}

			}

			// Close the BufferedReader
			bufferedReader.close();
			FileReader fileReader2 = new FileReader(lab + ".txt");
			LineNumberReader lineNumberReader = new LineNumberReader(fileReader2);

			// Read lines to the end of the file to get the line count
			while (lineNumberReader.readLine() != null) {
				// Looping through the lines without doing anything
			}

			// Get the line count
			int lineCount = lineNumberReader.getLineNumber();
			lineNumberReader.close();

			System.out.println("Students still working in the LAB:-");
			for (int i = lineIndex; i < lineCount; i++) {
				String line = Files.readAllLines(Paths.get("D:/Javabootcamp/" + lab + ".txt")).get(i);

				String regexPattern = "\\s+";

				// Split the string using the regex pattern
				String[] parts = line.split(regexPattern);
				if (parts.length == 3) {
					System.out.println(parts[0]);
				}
			}
		}

		catch (NoSuchFileException e) {
			System.err.println("File doesn't exists");
		}

	}

	public static void main(String[] args) throws IOException {
		File[] files = new File[Dept.length];
		FileWriter fw = null;
		for (int d = 0; d < Dept.length; d++) {

			files[d] = new File(Dept[d] + ".txt");
			if (!files[d].exists()) {
				files[d].createNewFile();
				fw = new FileWriter(files[d]);
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				Date currentDate = new Date();
				String formattedDate = dateFormat.format(currentDate);
				fw.append("\nWelcome...!");
				fw.write("\nDate:-" + formattedDate);
				fw.append("\n-----------------------------------------------------------------------------");
				fw.append("\n Name\t\tUSN\t\t\tTime-in\t\t\tTime-out");
				fw.append("\n-----------------------------------------------------------------------------");
				fw.close();
			}

		}

		try (Scanner scanner = new Scanner(System.in)) {
			int choice;
			while (true) {
				System.out.println(
						"Enter 1 to Login...\n Enter 2 to Leave the Lab... \n Enter 3 to display students in Lab...\n Enter 4 to Exit...");
				System.out.println("\nEnter Your Choice");

				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					validateLogin();
					break;
				case 2:
					ExitLab();
					break;

				case 3:
					displayStudentsInLab();
					break;

				case 4:
					System.out.println("Thank you.. Bye..👋👋👋");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice..!");
					break;
				}

			}
		}

	}
}
