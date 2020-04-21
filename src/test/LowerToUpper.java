package test;

public class LowerToUpper {

	public static void main(String[] args) {
		
		String value = "AAbcDE  efGHij";
		StringBuilder sb = new StringBuilder(value);
		for (int index = 0; index < sb.length(); index++) {
		    char c = sb.charAt(index);
		    if (Character.isLowerCase(c)) {
		        sb.setCharAt(index, Character.toUpperCase(c));
		    } else {
		        sb.setCharAt(index, Character.toLowerCase(c));
		    }
		}
     System.out.println(sb);
		
	}

}
