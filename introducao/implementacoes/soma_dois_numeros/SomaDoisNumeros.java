import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SomaDoisNumeros {
	
	  public static void main(String[] args) throws FileNotFoundException {
		// 1. Ler os dois números
	    File file = new File("entrada.txt");
	    Scanner input = new Scanner(file);	    
	    int a = Integer.parseInt(input.nextLine());
	    int b = Integer.parseInt(input.nextLine());	    
	    input.close();
	    // 2. Realizar a operação de soma dos dois números
	    int x = a + b;
	    // 3. Mostrar o resultado da operação
	    System.out.println(x);	    		
	  }		
}
