package book.behavior.interpreter;

public class CalcContext {

	private CalcTokenizer tokenizer;
	private CalcToken currentToken;

	public CalcContext(String text) {
		tokenizer = new CalcTokenizer(text);		
	}

	public CalcToken getCurrentTokenAndGoToNext() {
		if (tokenizer.hasMoreElements()) {
			currentToken = tokenizer.getCurrentTokenAndGoToNext();
		} 
		else {
			currentToken = null;
		}

		return currentToken;
	}

	public void skipToken(String token) throws CalcParseException {
		if (!token.equals(currentToken.getToken())) {
			throw new CalcParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
		}
	}

	public void print() {
		tokenizer.print();
	}

	public CalcToken getCurrentToken() {
		return tokenizer.getCurrentToken();
	}

}
