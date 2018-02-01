package estudo.java.aula68.javacore.runtimeExeption.test;

public class RuntimeExceptionTeste3 {

	// Erros em tempo de execução, no exemplo o ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		Object o = null;
		
		
		int[] a = new int[2];
		System.out.println(a[2]); // ArrayIndexOutOfBoundsException, tentando acessar uma posicão que não existe

	}

}
