package book.behavior.interpreter;

import java.util.ArrayList;

public class CalcTokenizer {

	public static final String INVALID_VARIABLE = "#REF!";

	private String[] keywords = { "SQRT", "FRAC", "POW", "ADD", "SUB", "MUL", "DIV" };

	private ArrayList<CalcToken> tokenList = new ArrayList<CalcToken>();

	private int currentIndex = 0;

	public boolean hasMoreElements() {
		return currentIndex < tokenList.size();
	}

	public CalcToken getCurrentTokenAndGoToNext() {
		return tokenList.get(currentIndex++);
	}

	public CalcTokenizer(String text) {
		StringBuffer sb = new StringBuffer();

		char ch;
		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);

			if (isDelim(ch)) {
				if (!Character.isWhitespace(ch)) {
					tokenList.add(new CalcToken(CalcToken.DELIM, "" + ch));
				}
			} 
			else if (Character.isLetter(ch)) {
				sb = new StringBuffer();
				sb.append(ch);
				for (int k = i + 1; k < text.length(); k++) {
					ch = text.charAt(k);
					if (isDelim(ch)) {
						i = k - 1;
						break;
					}
					sb.append(ch);

					i = k;
				}

				String variable = sb.toString();
				if (isFunction(variable)) {
					tokenList.add(new CalcToken(CalcToken.FUNCTION, variable));
				} 
				else {
					tokenList.add(new CalcToken(CalcToken.VARIABLE, variable));
				}
			} 
			else if (Character.isDigit(ch)) {
				sb = new StringBuffer();
				sb.append(ch);
				for (int k = i + 1; k < text.length(); k++) {
					ch = text.charAt(k);
					if (isDelim(ch)) {
						i = k - 1;
						break;
					}
					sb.append(ch);

					i = k;
				}

				tokenList.add(new CalcToken(CalcToken.NUMBER, sb.toString()));
			}
		}
	}

	private boolean isFunction(String variable) {
		for (int i = 0; i < keywords.length; i++) {
			if (variable.equals(keywords[i])) {
				return true;
			}
		}

		return false;
	}

	private boolean isDelim(char c) {		
		if (("(),".indexOf(c) != -1))
			return true;
		return false;
	}

	public void print() {
		for (int i = 0; i < tokenList.size(); i++) {
			System.out.println(i + " " + tokenList.get(i));
		}
	}

	public CalcToken getCurrentToken() {
		if (currentIndex < tokenList.size()) {
			return tokenList.get(currentIndex);
		}

		return null;
	}

}
