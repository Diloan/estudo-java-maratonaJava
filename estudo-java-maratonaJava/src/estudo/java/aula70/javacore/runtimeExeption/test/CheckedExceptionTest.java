package estudo.java.aula70.javacore.runtimeExeption.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try{
		criarArquivo();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void  criarArquivo() throws IOException{ // Com o IOException passa a responsabilidade para quem está chamando
		File file = new File("teste.txt");
		
		try{
		System.out.println("Arquivo criado: ? " + file.createNewFile());
		System.out.println("Arquivo criado");
		
		}catch(IOException e){
			e.printStackTrace();
			throw e;
		}

	}

}
