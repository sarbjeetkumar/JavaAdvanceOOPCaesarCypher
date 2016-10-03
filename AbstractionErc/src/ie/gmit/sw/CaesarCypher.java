package ie.gmit.sw;

public class CaesarCypher {
	
	private int Key;

	public String encrypt(String plainText) throws CypherException {
		return  new String(encrypt(plainText.getBytes()));
	}
	
	
	public byte[] encrypt(byte[] plainText) throws CypherException {
		
		for (int i = 0; i < plainText.length; i++) {
			plainText[i] = (byte) (plainText[i] + getKey());
		}
		
		
		return plainText;
		
	}
	
	
	public String decrypt(String cypherText) throws CypherException {
		
		return new String (decrypt(cypherText.getBytes()));
		
	}
	
	
	public byte[] decrypt(byte[] cypherText) throws CypherException{
		
		
		for (int i = 0; i < cypherText.length; i++) {
			cypherText[i] = (byte) (cypherText[i] - getKey());
		}
		
		
		
		return cypherText;
		
	}


	@Override
	protected void finalize() throws Throwable {
		System.out.println("Ceser Cypher " + this + " about to garbage collected ");
	}


	public int getKey() {
		return Key;
	}


	public void setKey(int key) {
		Key = key;
	}

	
	
}//class ends 
