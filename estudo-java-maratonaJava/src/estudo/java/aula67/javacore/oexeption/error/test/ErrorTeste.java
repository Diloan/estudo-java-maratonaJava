package estudo.java.aula67.javacore.oexeption.error.test;

public class ErrorTeste {

	public static void main(String[] args) {
		stackOverflowError();

	}
	
	public static void stackOverflowError(){
		stackOverflowError();
	}

}
