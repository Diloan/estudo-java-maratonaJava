package estudo.java.aula68.javacore.runtimeExeption.test;

public class RuntimeExceptionTeste2 {

	// Erros em tempo de execução, no exemplo o NullPointerException
	public static void main(String[] args) {
		Object o = null;
		
		
		System.out.println(o.toString()); // NullPointerException

	}

}
