package estudo.java.aula68.javacore.runtimeExeption.test;

public class RuntimeExceptionTeste {

	// Erros em tempo de execu��o, no exemplo o ArithmetivException
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		// Solu��o
		if(b != 0){
			int c = a / b; // ArithmetivException
			System.out.println(a);
		}
		

	}

}
