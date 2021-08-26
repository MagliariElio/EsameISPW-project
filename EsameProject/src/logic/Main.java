package logic;

public class Main {

	public static String concatenation(String variable, String variable2) {
		return variable.concat(variable2);
	}

	public static void main(String[] args) {
		String output = concatenation("Hello", "World");
		concatenation(output, output);
	}

}