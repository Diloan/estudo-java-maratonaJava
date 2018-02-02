package estudo.java.aula68.javacore.runtimeExeption.test;

public class RuntimeExceptionTeste3 {

	// Erros em tempo de execu��o, no exemplo o ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		Object o = null;
		
		try{
		
			int[] a = new int[2];
			System.out.println(a[2]); // ArrayIndexOutOfBoundsException, tentando acessar uma posic�o que n�o existe
			System.out.println("Imprimeindo depois da possivel exce��o");
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		System.out.println("Fora do bloco catch");
	}

}
