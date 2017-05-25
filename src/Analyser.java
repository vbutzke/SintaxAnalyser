import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class Analyser {

	public static void main(String[] args) {
		
		AnalyseToken analyser = new AnalyseToken();
		HashMap <String, Integer> reservedTokens = analyser.buildHashmap();
		String actualLine = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("foo.in"));
	         
	         while ((actualLine = br.readLine()) != null) {
	        	 analyser.analyseTokens(actualLine, reservedTokens);
	         }       
	         br.close();
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	}
}
