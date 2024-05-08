package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//Declarar lista de strings, não aceita tipos primitivos(int)<Integer> <generics>...  = instanciar com classe que implementa interface "ArrayList<String>()"
		List<String> list = new ArrayList<>();
		
		//adicionando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//add com sobrecarga na posicao
		list.add(2, "Marco");
		
		//imprime o tamanho da lista
		System.out.println(list.size());
		
		//for each para imprimir cada elemento da lista
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//removendo por comparacao 
		// list.remove("Anna");
		//removendo por posicao
		//list.remove(1);
		
		// função lambda | removendo elemento com predicado (x -> x.charAt(0) == 'M') "remover todo String x -> tal que x.charArt(0)"
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//encontrar a posição de um elemento, pos 1
		System.out.println("Encontrar elemento na lista");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//encontrar a posição de um elemento que não tem na lista retorna -1,				
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		// filtrar elementos da lista usando predicado | declara uma nova lista, coloca o comando para pegar a lista list converte para stream, adiciona o filter, filtrar os elementos com predicado e 
		//devolver a nova lista com os elementos filtrados no stream e converter novamente para lista com collect(Collectors.toList());
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//encontrar elemento com certo predicado usando .findFirst()Pega o primeiro elemento da string, caso não tenha, retorna null
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}
}