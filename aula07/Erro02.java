class Erro02{

public static void main(String[] args){
	
    int cont = 0;

	System.out.println("Valor incializado: " + cont);

	}
}


/** ERRO DE COMPILAÇÃO
 * 
 * 1. SEMÂNTICA
 * 
 * C:\desenvolvimento\curso-java-basico\aula07>javac Erro02.java
 * Erro02.java:5: error: not a statement
 *   var int cont;
 *   ^
* Erro02.java:5: error: ';' expected
*    var int cont;
*       ^
* 2 errors
*
* C:\desenvolvimento\curso-java-basico\aula07>javac Erro02.java
* Erro02.java:7: error: variable cont might not have been initialized
*        System.out.println("Valor digitado: " + cont);
*                                                ^
* 1 error

RESULTADO DA SOLUÇÃO

* C:\desenvolvimento\curso-java-basico\aula07>javac Erro02.java
** COMPILOU!!!
* 
* C:\desenvolvimento\curso-java-basico\aula07>java Erro02
* Valor incializado: 0
*/