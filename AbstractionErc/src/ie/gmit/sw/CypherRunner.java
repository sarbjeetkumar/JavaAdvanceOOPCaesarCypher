package ie.gmit.sw;

public class CypherRunner {
	
	public static void main(String[] args) throws Throwable {
		
		CaesarCypher cc = new CaesarCypher();
		
		cc.setKey(7);	
		
		System.out.println("-----------Caeser Cypher-------");
		String s = cc.encrypt("OBJECT ORIENTED");
		System.out.println("Encrypted :  "+ s);
		System.out.println("Decrypted  : " + cc.decrypt(s));
		
		
		
	} 

}
