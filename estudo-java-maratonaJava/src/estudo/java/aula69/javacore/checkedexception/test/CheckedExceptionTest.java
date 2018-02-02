package estudo.java.aula69.javacore.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		
		criarArquivo();

	}
	
	public static void  criarArquivo(){
		File file = new File("teste.txt");
		
		try {
			System.out.println("Arquivo criado: ?" + file.createNewFile());
			System.out.println("Arquivo criado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
