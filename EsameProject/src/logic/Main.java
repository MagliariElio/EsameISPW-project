package logic;

public class Main {

	public static boolean equalsConcatenation(String variable, String variable2) {
		return variable.equals(variable2);
	}
	public static String concatenation(String variable, String variable2) {
		return variable.concat(variable2);
	}

	public static void main(String[] args) {
		String output = concatenation("Elio", "Magliari");
		String output2 = concatenation(output, output);
		equalsConcatenation(output, output2);
	}

}