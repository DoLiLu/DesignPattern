package book.behavior.interpreter;

public class CalcToken {

	public static final int FUNCTION = 1;
	public static final int NUMBER = 2;
	public static final int DELIM = 3; // ( )	
	public static final int VARIABLE = 4;

	private int type;
	private String token;

	public CalcToken(int type, String token) {
		this.type = type;
		this.token = token;
	}

	public int getType() {
		return type;
	}

	public String getToken() {
		return token;
	}

	public String toString() {
		return getTypeDescription(type) + " " + token;
	}

	private String getTypeDescription(int type) {

		if (type == FUNCTION) {
			return "FUNCTION";
		}
		if (type == NUMBER) {
			return "NUMBER";
		}
		if (type == DELIM) {
			return "DELIM";
		}		
		if (type == VARIABLE) {
			return "VARIABLE";
		}

		return null;
	}
}
