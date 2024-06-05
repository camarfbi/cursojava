package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new HashMap<>(); // cria a instancia HashMap e implementa a interface Map "votes"

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // instanceia FileReader para ler arquivo
																				// de texto em formato de caracteres e
																				// BufferedReader Lê texto de um fluxo
																				// de entrada de caracteres de forma
																				// eficiente, usando um buffer. ,

			String line = br.readLine(); // armazena a linha na string
			while (line != null) { // enquanto linha for diferente de nulo, continua lendo

				String[] fields = line.split(","); // separa a linha pelo delimitador "," e armazena na lista fields
				String name = fields[0]; // add o conteudo da posicao 0 da lista
				int count = Integer.parseInt(fields[1]); // add o conteudo da pos 1 da convertendo para int

				if (votes.containsKey(name)) { // Verifica se o mapa já contém a chave `name`
					int votesSoFar = votes.get(name); // Obtém o número de votos atuais associados ao `name`
					votes.put(name, count + votesSoFar); // Atualiza a contagem de votos adicionando `count` aos votos
															// existentes
				} else {
					votes.put(name, count);// Se a chave `name` não existe no map, adiciona o nome e voto
				}

				line = br.readLine(); // le a prox linha
			}

			for (String key : votes.keySet()) {//itera sobre todas as chaves no mapa votes
				System.out.println(key + ": " + votes.get(key));//Imprime a chave e o valor associado a ela
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
/*
 * 1. **`if (votes.containsKey(name))`**: - **Verifica se o mapa já contém a
 * chave `name`**: - `votes.containsKey(name)` retorna `true` se o mapa `votes`
 * já contém uma entrada para a chave `name`. - Se a chave existe, significa que
 * já há votos registrados para esse `name`.
 * 
 * 2. **`int votesSoFar = votes.get(name);`**: - **Obtém o número de votos
 * atuais associados ao `name`**: - `votes.get(name)` retorna o valor associado
 * à chave `name`, que é o número de votos que o `name` já recebeu até agora. -
 * Este valor é armazenado na variável `votesSoFar`.
 * 
 * 3. **`votes.put(name, count + votesSoFar);`**: - **Atualiza a contagem de
 * votos adicionando `count` aos votos existentes**: - `votes.put(name, count +
 * votesSoFar)` atualiza a entrada no mapa para `name` com um novo valor que é a
 * soma do `count` atual (os novos votos) e `votesSoFar` (os votos existentes).
 * 
 * 4. **`else`**: - **Se a chave `name` não existe no mapa**: - Este bloco será
 * executado se `votes.containsKey(name)` retornar `false`, ou seja, se não há
 * votos registrados para `name` ainda.
 * 
 * 5. **`votes.put(name, count);`**: - **Adiciona `name` ao mapa com `count`
 * votos**: - `votes.put(name, count)` cria uma nova entrada no mapa com `name`
 * como a chave e `count` como o valor. - Isso registra os primeiros votos para
 * `name`.
 * 
 * ### Resumo
 * 
 * - O código verifica se um nome (`name`) já existe no mapa `votes`. - Se já
 * existe, ele adiciona os novos votos (`count`) aos votos existentes
 * (`votesSoFar`) e atualiza o mapa. - Se não existe, ele cria uma nova entrada
 * no mapa com `name` e define a contagem de votos como `count`.
 * 
 * ### Exemplo
 * 
 * Suponha que `votes` inicialmente é `{ "Alice": 10, "Bob": 15 }`, e queremos
 * adicionar 5 votos para `Alice` e 3 votos para um novo candidato `Charlie`.
 * 
 * 1. Para `Alice`: - `votes.containsKey("Alice")` é `true`. -
 * `votes.get("Alice")` retorna `10`. - `votes.put("Alice", 5 + 10)` atualiza
 * `Alice` para `15` votos.
 * 
 * 2. Para `Charlie`: - `votes.containsKey("Charlie")` é `false`. -
 * `votes.put("Charlie", 3)` adiciona `Charlie` com `3` votos.
 * 
 * Após a execução, o mapa `votes` será `{ "Alice": 15, "Bob": 15, "Charlie": 3
 * }`.
 *
 * Explicação for (String key : votes.keySet()):
 * 
 * Itera sobre todas as chaves no mapa votes: votes.keySet() retorna um conjunto
 * (Set) contendo todas as chaves presentes no mapa votes. O loop for percorre
 * cada chave no conjunto de chaves (keySet()), uma por uma. Em cada iteração, a
 * variável key contém uma das chaves do map. 
 * 
 * System.out.println(key + ": " + votes.get(key));:
 * 
 * Imprime a chave e o valor associado a ela: votes.get(key) retorna o valor
 * associado à chave key. System.out.println(key + ": " + votes.get(key))
 * imprime a chave seguida por dois pontos e o valor associado a ela. Por
 * exemplo, se key for "Alice" e votes.get("Alice") for 10, a linha impressa
 * será Alice: 10.
 */