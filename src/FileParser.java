import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {
	BufferedReader br;
	Scanner scan;

	public FileParser(String filename) throws FileNotFoundException {
		br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
		scan = new Scanner(new File(filename));
	}

	public ArrayList<String> readInstructions() throws IOException {
		
		ArrayList<String> al = new ArrayList<String>();
		
		String fromFile = "";
		while (scan.hasNextLine()) {

			// fromFile = br.readLine();
			fromFile = scan.nextLine();
			System.out.println(fromFile);
			if (!fromFile.isEmpty()) {
				if(fromFile.charAt(0) == '='){
					break;
				}
				if (!(fromFile.charAt(0) == '/')) {
					al.add(fromFile);
				}
			}
			// System.out.println(fromFile);

		}

		return al;
	}
}
