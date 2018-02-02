package estudo.java.aula70.javacore.runtimeExeption.test;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		
		try{
		divisao(10, 0);
		}catch(RuntimeException e){
			System.out.println(e.getMessage()); // Retorna a mensagem que foi npassada no construtor no IllegalArgumentexception 
			e.printStackTrace();
		}
		
	}
	
	private static void divisao(int num1, int num2){
		if(num2 == 0){
			throw new IllegalArgumentException("passe um valor diferente de zero para num2");
		}
		
		int result = num1 / num2;
		System.out.println(result);
	}

}


