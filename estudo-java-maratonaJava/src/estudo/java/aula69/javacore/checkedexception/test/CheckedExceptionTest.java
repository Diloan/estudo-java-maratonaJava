package estudo.java.aula69.javacore.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		

	}
	
	public static void  criarArquivo(){
		File file = new File("teste.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
