//Créditos para o dono do canal "Bro Code", que eu sempre recorro para procurar meus cursos (gratuitos) de programação.
//Link para o vídeo sobre estrutura de dados e algorítmos: https://youtu.be/CBYHwZcbD-s?si=NSHDQx0HUmC6M3XZ

package InsertionSort;

public class Main{
	
	public static void main(String args[]) {
		int array[] = {11, 4, 13, 24, 15, 1, 0, 7, 9, 5}; //Array desorganizada com 10 posições.
		
		insertionSort(array); //Chamada do método Insertion Sort.
		
		for(int i : array) { //Impressão dos valores da array na tela do usuário.
			System.out.print(i + " ");
		}
	}
	
	public static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) { //Loop que permite a repetição do algortimo de ordenação. Ele inicia no segundo índice (int i = 1).
			
			int temp = array[i]; //Variável responsável por armazenar temporariamente o elemento à ser movido para a esquerda.
			int j = i - 1; //Variável que nos auxilia na criação de uma "régua" para comparação. Ele inicia no primeiro índice (i - 1).
			
			while(j >= 0 && array[j] > temp) { //Loop que roda enquanto j for igual ou maior que 0, para que o loop cesse quando reconhecer o inicio do array,
											   //e o índice j for maior que "temp", o que em suma, serve como o comparador lógico que organiza os elementos.
				
				array[j + 1] = array[j]; //Rearranjo dos elementos. O índice j é movido para a direita, abrindo espaço para o elemento escrito em "temp".
				j--;//Diminuição do valor de j, para que a comparação continue sendo executada em direção ao inicio do array, até que o elemento esteja na posição correta.
			}
			array[j + 1] = temp; //Quando o laço "while" cessa quer dizer que achamos o local ideal para o elemento.
		}
	}
}