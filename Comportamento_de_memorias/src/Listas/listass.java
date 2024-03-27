package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listass {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Fabricio");
		list.add("Maria");
		list.add("Alex");
		list.add("Felipe");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //assim adcionamos elementos da lista
		
		//tamanho da lista
		System.out.println(list.size());
		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		list.remove(1); // remove da lista
		
		
		list.removeIf(x -> x.charAt(0) == 'M'); //remove com predicado, remove nome com a letra q eu es
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); //encontra a função de um elemento
		System.out.println("---------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());	
		for (String x : result) {
			System.out.println(x); //Filtra o nome pela letra q tu quiser na lista
		}
		System.out.println("---------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);	
		System.out.println(name); //encontra o primeiro elemento q começa com a letra q eu escolhi no predicado
	}


	
}
