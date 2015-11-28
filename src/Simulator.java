import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Simulator {
	String filename;
	public Simulator(String filename){
		this.filename = filename;
	};
	public void run() throws IOException{
		FileParser ip = new FileParser(filename);
		ArrayList<String> fromFile = new ArrayList<String>();
		fromFile = ip.readInstructions();
		for(int i =0;i<fromFile.size();i++){
			System.out.println(fromFile.get(i));
		}
		
	}
	
	public void InstructionParser(String instruction){
		//StringTokenizer st = new StringTokenizer(instruction);
		if(instruction.contains("begin")){
			
		}
		
	}
}
