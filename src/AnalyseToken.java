import java.util.*;
import java.security.InvalidParameterException;

public class AnalyseToken {
	
	
	public HashMap<String, Integer> buildHashmap(){
		HashMap <String, Integer> reservedTokens = new HashMap <String, Integer>();
		
		reservedTokens.put("if", 1);
		reservedTokens.put("then", 2);
		reservedTokens.put("else", 3);
		reservedTokens.put("begin", 4);
		reservedTokens.put("end", 5);
		reservedTokens.put("print", 6);
		reservedTokens.put(";", 7);
		reservedTokens.put("num", 8);
		reservedTokens.put("=", 9);
		
		return reservedTokens;
	}
	
	public void analyseTokens(String token, HashMap<String, Integer> reservedTokens){
		String parsedTokens[] = token.split(" ");
		for(int i=0; i<parsedTokens.length; i++){
			processToken(parsedTokens[i], reservedTokens, i);
		}
	}
	
	public void processToken(String token, HashMap<String, Integer> reservedTokens, int lineNumber) throws InvalidParameterException {
		
		if(reservedTokens.containsKey(token)){
			consume(reservedTokens.get(token));
		}else{
			throw new InvalidParameterException("File contains invalid token that cannot be resolved in line " + lineNumber);
		}
//		else{ // n�o � necess�rio, ao inv�s de executar uma fun��o que n�o faz nada, joga exce��o caso n�o seja v�lido e continua caso seja
//			processFunction(token);
//		}
	}
	
//	public void processFunction(String token){
//		if(token.equals("L") || token.equals("S") || token.equals("E")){
			//l� a pr�xima, s� passa adiante ent�o isso n�o � necess�rio.
//		}
//	}
	
	public void consume(int token){
		//faz alguma coisa com o comando e segue o baile
	}
		
}
