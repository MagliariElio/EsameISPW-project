package logic;

public class Main {

	public static int concatenationLenght(String variable) {
		return variable.length();
	}
	public static String concatenation(String variable, String variable2) {
		return variable.concat(variable2);
	}

	public static void main(String[] args) {
		String output = concatenation("Elio", "Magliari");
		String output2 = concatenation(output, output);
		concatenationLenght(output2);
	}

}