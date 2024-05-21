package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<G> { //parametrizar a classe do tipo Generics G
	
	private List<G> list = new ArrayList<>();//Cria a lista do tipo Generics
	
	public void addValue(G value) { //Cria o Metodo AddValue do tipo G recebendo value
		list.add(value);
	}
	
	public G first() {//Cria o Metodo first que retorna o primeiro elemento da lista do tipo G
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
		
	}

}

//Generics permitem que classes, interfaces e metodos possam ser parametrizados por tipo. Seus benefícios: Reuso, Type safety e PErformance. Uso comum: Colecoes
