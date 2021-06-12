class Erro03{

public static void main(String[] args){

	System.out.println("Valor incializado: " + 6/2);

	}
}


/** ERRO
 * 
 * 1. EXECUÇÃO
 * 
 * C:\desenvolvimento\curso-java-basico\aula07>javac Erro03.java
** COMPILOU!!! MAS NÃO EXECUTOU
* 
* C:\desenvolvimento\curso-java-basico\aula07>java Erro03
* Error: Main method not found in class Erro03, please define the main method as:
*   public static void main(String[] args)
* or a JavaFX application class must extend javafx.application.Application
* 
* C:\desenvolvimento\curso-java-basico\aula07>javac Erro03.java
** COMPILOU!!! MAS NÃO EXECUTOU

* C:\desenvolvimento\curso-java-basico\aula07>java Erro03
* Exception in thread "main" java.lang.ArithmeticException: / by zero
*        at Erro03.main(Erro03.java:5)
* 
* 2. COMPILAÇÃO
* 
* C:\desenvolvimento\curso-java-basico\aula07>javac Erro03.java
* Erro03.java:3: error: cannot find symbol
* public static void main(string[] args){
*                         ^
*  symbol:   class string
*  location: class Erro03
* 1 error


RESULTADO DA SOLUÇÃO

* C:\desenvolvimento\curso-java-basico\aula07>javac Erro03.java
** COMPILOU
* C:\desenvolvimento\curso-java-basico\aula07>java Erro03
** EXECUTOU
* Valor incializado:
*
* C:\desenvolvimento\curso-java-basico\aula07>
*/