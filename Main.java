package ex_while;

/*
import java.util.Locale;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma ensagem explicativa, conforme exemplos.		
  
  		int a, b, c;
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();		
		c = a + b;
		
		System.out.println("O valor de a é: " + a);
		System.out.println("O valo de b é: " + b);
		System.out.println("A soma dos valores é: " + c);


//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos. Fórmula da área: area = π . raio2 Considere o valor de π = 3.14159	
		
		double a, area;
		
		a = sc.nextDouble();
		
		area = 3.14159 * Math.pow(a, 2.0);
			
		System.out.printf("A área do circulo é: %.4f", area);

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = A * B - C * D;
		
		System.out.println("DIFERENÇA = " + diferenca);	
		
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		
		int nFun, horas;
		double horaTrab, salario;
		
		nFun = sc.nextInt();
		horas = sc.nextInt();
		horatrab = sc.nextDouble();
		salario = horas * horaTrab;
		
		System.out.println("Number = " + nFun);
		System.out.printf("SALARY = U$ %.2f", salario);

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double vPeca1, vPeca2, total;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		vPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		vPeca2 = sc.nextDouble();
		
		total = numPeca1 * vPeca1 + numPeca2 * vPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);

//		
		double A, B, C, tri, cir, trap, qua, ret;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = A * C / 2;
		cir = 3.14159 * Math.pow(C, 2.0);
		trap = ((A + B) * C ) / 2;
		qua = B *B;
		ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f %n", tri);
		System.out.printf("CIRCULO: %.3f %n", cir);
		System.out.printf("TRAPEZIO: %.3f %n", trap);
		System.out.printf("QUADRADO: %.3f %n", qua);
		System.out.printf("RETANGULO: %.3f", ret);


// -------CONDICIONAIS------/

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	
		int x;
		
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não Negativo");
			}
		
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
			
		}

//	Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 		ordem crescente ou decrescente. 
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A%B == 0 || B%A == 0) {
			System.out.println("São Multipos");
		}
		else {
			System.out.println("Não são Multiplos");
		}

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.		
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int duracao;
		
		if (hi < hf) {			
			duracao = hf - hi;
		}
		else {
			duracao = 24 - hi + hf;
		}
		System.out.println("O jogo durou " + duracao + " horas");

// 	Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
	
		double cod = sc.nextInt();
		double quant = sc.nextDouble();
		double total;
		
		if (cod == 1) {
			total = quant * 4.00;
		}
		else if(cod == 2) {
			total = quant * 4.50;
		}
		else if(cod == 3) {
			total = quant * 5.00;
		}
		else if(cod == 4) {
			total = quant * 2.00;
		}
		else {
				total = quant * 1.50;
		}
		
		System.out.printf("Total: " + total);

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

		double x = sc.nextDouble();
		String intervalo;
		if (x >= 0 && x <= 25) {
			intervalo = "([0,25]";
		}
		else if (x > 25 && x <= 50) {
			intervalo = "(25,50]";
		}
		else if (x > 50 && x <= 75) {
			intervalo = "(50,75]";
		}
		else if (x > 75 && x <= 100) {
			intervalo = "(75,100])";
		}
		else {
			intervalo = "Fora de intervalo";
		}
		
		System.out.println("Intervalo " + intervalo);
		
//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 

		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (y == 0) {
			System.out.println("Eixo x");
		}
		
		else if (x == 0) {
			System.out.println("Eixo y");			
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");			
		}
		else if(x < 0 && y > 0){
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0){
			System.out.println("Q4");
		}
		else {
			System.out.println("Origem");
		}
*/
/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
 * duas casas decimais.
 *
 		
		double sal = sc.nextDouble();
		double imp;
				
		if(sal <= 2000.00) {
			imp = 0.0;
			}
		else if(sal <= 3000.00) {
			imp = (sal - 2000) * 0.08;
		}
		else if(sal <= 4500.00) {
			imp = (sal - 3000) * 0.18 + 1000.0 * 0.08;
			
		}
		else {
			imp = (sal - 4500) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
			
		}	
		if (imp == 0.0) {
			System.out.printf("Isento");
		}
		else {
			System.out.printf("R$ %.2f", imp);
		}
		sc.close();
		}
}
package ex_while;

/*import java.util.Locale;
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 *
 * 
 		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}		
		System.out.println("Acesso Permitido");		
* 
* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
* cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
* menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while ((x != 0 && y != 0 )) {
			if (x < 0 && y > 0) {
				System.out.println("Q1");
			}
			else if (x > 0 && y > 0) {
				System.out.println("Q2");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
				}
			x = sc.nextInt();
			y = sc.nextInt();
			}

** Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
* um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
* 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
* que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
* mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
* exemplo.
*
		int combustivel = sc.nextInt();
		int alc = 0;
		int gas = 0;
		int dis = 0;
		int fim = 4;
		
		while (combustivel != 4) {
			if (combustivel == 1) {
				alc += 1;
			}
			else if(combustivel == 2) {
				gas += 1;
			}
			else if(combustivel == 3) {
				dis += 1;
			}
			combustivel = sc.nextInt();
			
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + dis);
*  
*  
*  Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
* X, se for o caso.
*
*
*
		int x = sc.nextInt();
		
		for (int i = 1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
					
		}
		
		
*
*URI1071	
*	
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
*
*
*URI1072
*
*
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max;
		
		if (x < y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		int soma = 0;
		//varrer valores
		for (int i=min+1; i<max; i++) {
			if (i % 2 != 0 ) {
				soma += i;
			}
		}
		System.out.println(soma);
*
*
*URI 1073

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<= N; i++) {
			if (i % 2 == 0) {
		
				System.out.println(i + "^2 = " + (i * i));
			}
			
		}

*
*
*
*URI 1074

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");
			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("NULL");
			}
		}
*
*
*
*URI 1075

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i < 10000; i++) {
			if (i % N == 2) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
*
*
*URI 1078

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x "+ N +" = "+ i * N);			
			}
		sc.close();
	}

}
*
*
*URI 1078
*

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double N = sc.nextDouble();
		for (int i = 1; i <= N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = ((2*a + 3*b + 5*c) / 10);
			
			System.out.printf(" %.1f\n", media);
		}
		 sc.close();
	}

}
*
*
*URI 1070
*

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int count = 0;

		while (count < 6) {
			if (X % 2 != 0) {
				count++;
				System.out.println(X);
			}
			X++;
		}
		sc.close();
	}
}
*
*
*URI 1067
*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		for (int i=0; i<=X; i++) {
			if (i % 2 != 0){
				System.out.println(i);
			}
		}
		sc.close();
	}
}
*
*
*URI 1002
*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = sc.nextDouble();
		double r2 = Math.pow(raio, 2);
		double pi = 3.14159;
		double area = (pi * r2);
		System.out.printf("A=%.4f\n", area);
		sc.close();
	}
}
*
*URI 1003
*

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double aPeso = A * 3.5;
		double bPeso = B * 7.5;
		double MEDIA = (aPeso + bPeso) / 11;
		
		System.out.printf("MEDIA = %.5f\n", MEDIA);
		sc.close();
	}
}
*
*URI 1005
*
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double aPeso = A * 2;
		double bPeso = B * 3;
		double cPeso = C * 5;
		double MEDIA = (aPeso + bPeso + cPeso) / 10;

		System.out.printf("MEDIA = %.1f\n", MEDIA);
		sc.close();
	}
}
*
*URI 1007
*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int DIFERENCA = (A * B - C * D);

		System.out.println("DIFERENCA = " + DIFERENCA);

		sc.close();
	}
}
*
*URI 1008
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String nome = sc.next();  
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double renda = (salario + (vendas * 0.15));

		System.out.printf("TOTAL = R$ %.2f\n", renda);

		sc.close();
	}
}
*
*URI 1010
*
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double venda1 = num1 * valor1;
		double venda2 = num2 * valor2;
		
		double total = (venda1 + venda2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

		sc.close();
	}
}
*
*URI 1011
*
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int R = sc.nextInt();
		double pi = 3.14159;
		double volume = (4.0/3) * pi * Math.pow(R, 3);
				
		System.out.printf("VOLUME = %.3f\n", volume);

		sc.close();
	}
}
*
*URI 1012
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double tri = A * C / 2;
		double cir = 3.14159 * Math.pow(C, 2);
		double tra = C * (A + B) / 2 ;
		double qua = B * B;
		double ret = A * B;
				
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);

		sc.close();
	}
}
*
*URI 1013
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int X = sc.nextInt();
		double Y = sc.nextDouble();
		double consumo = X/Y;
		
		System.out.printf("%.3f km/l\n", consumo);

		sc.close();
	}
}
*
*URI 1015
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double disx = Math.pow(x2 - x1, 2);
		double disy = Math.pow(y2 - y1, 2);
		double distancia = Math.sqrt(disx + disy);
		
		System.out.printf("%.4f\n", distancia);

		sc.close();
	}
}
*
*URI 1017
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int tempo = sc.nextInt();
		double autonomia = 12;
		int velocidade = sc.nextInt();
		double distancia = tempo * velocidade;
		double consumo = distancia / autonomia;
		
		System.out.printf("%.3f",consumo);

		sc.close();
	}
}
*
*URI 1018
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N = sc.nextInt();

		System.out.println(N);
		System.out.println(N / 100 + " nota(s) de R$ 100,00");
		System.out.println((N % 100) / 50 + " nota(s) de R$ 50,00");
		System.out.println((((N % 100) % 50) / 20) + " nota(s) de R$ 20,00");
		System.out.println((((N % 100) % 50) % 20) / 10 + " nota(s) de R$ 10,00");
		System.out.println(((((N % 100) % 50) % 20) % 10) / 5 + " nota(s) de R$ 5,00");
		System.out.println((((((N % 100) % 50) % 20) % 10) % 5) / 2 + " nota(s) de R$ 2,00");
		System.out.println(((((((N % 100) % 50) % 20) % 10) % 5) % 2) / 1 + " nota(s) de R$ 1,00");

		sc.close();
	}
}
*
*URI 1019
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N = sc.nextInt();
		int hora;
		int min;
		int seg;
		
		hora = (N / 3600);
		min = ((N%3600)/60);
		seg = ((N%3600)%60);
		
		System.out.println(hora +":"+ min + ":" + seg );

		sc.close();
	}
}
*
*URI 1020
*
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int N = sc.nextInt();
		int anos, meses, dias;
		
		anos = (N / 365);
		meses = ((N%365)/30);
		dias = ((N%365)%30);
		
		System.out.println(anos +" ano(s)");
		System.out.println(meses +" mes(es)");
		System.out.println(dias +" dia(s)");

		sc.close();
	}
}
*
*URI 1021
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double N = sc.nextDouble();
		int resultado;
			
		
		System.out.println("NOTAS:");
		resultado = (int)N/100;
		System.out.println(resultado + " nota(s) de R$ 100.00");
		N = N%100;
		resultado = (int)N/50;
		System.out.println(resultado + " nota(s) de R$ 50.00");
		N = N%50;
		resultado = (int)N/20;
		System.out.println(resultado + " nota(s) de R$ 20.00");
		N = N%20;
		resultado = (int)N/10;
		System.out.println(resultado + " nota(s) de R$ 10.00");
		N = N%10;
		resultado = (int)N/5;
		System.out.println(resultado + " nota(s) de R$ 5.00");
		N = N%5;
		resultado = (int)N/2;
		System.out.println(resultado + " nota(s) de R$ 2.00");
		
		N = N * 100;
		
		System.out.println("MOEDAS:");
		N = N%200;
		resultado = (int)N/100;
		System.out.println(resultado + " moeda(s) de R$ 1.00");
		N = N%100;
		resultado = (int)N/50;
		System.out.println(resultado + " moeda(s) de R$ 0.50");
		N = N%50;
		resultado = (int)N/25;
		System.out.println(resultado + " moeda(s) de R$ 0.25");
		N = N%25;
		resultado = (int)N/10;
		System.out.println(resultado + " moeda(s) de R$ 0.10");
		N = N%10;
		resultado = (int)N/5;
		System.out.println(resultado + " moeda(s) de R$ 0.05");
		N = N%5;
		resultado = (int)N/1;
		System.out.println(resultado + " moeda(s) de R$ 0.01");
		
		sc.close();
	}
}
*
*URI 1035
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && (A % 2) == 0) {
			System.out.println("Valores aceitos");			
		}
		else {
			System.out.println("Valores não aceitos");
		}
						
		sc.close();
	}
}
*
*URI 1036
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double delta = Math.pow(B, 2) - (4*A*C);
		double raizDelta = Math.sqrt(delta);
		double R1 = (-B + raizDelta) / (2 * A);
		double R2 = (-B - raizDelta) / (2 * A);
		
		if (delta > 0 && A != 0) {
			System.out.println("R1 ="+String.format(" %.5f", R1));
			System.out.println("R2 ="+String.format(" %.5f", R2));
		}
		else {
			System.out.println("Impossivel calcular");
		}
							
		sc.close();
	}
}
*
*URI 1037
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x = sc.nextDouble();
		String intervalo;
		if (x >= 0 && x <= 25) {
			intervalo = "([0,25]";
		}
		else if (x > 25 && x <= 50) {
			intervalo = "(25,50]";
		}
		else if (x > 50 && x <= 75) {
			intervalo = "(50,75]";
		}
		else if (x > 75 && x <= 100) {
			intervalo = "(75,100])";
		}
		else {
			intervalo = "Fora de intervalo";
		}
		
		System.out.println("Intervalo " + intervalo);
							
		sc.close();
	}
}
*
*URI 1038
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x = sc.nextDouble();
		String intervalo;
		if (x >= 0 && x <= 25) {
			intervalo = "[0,25]";
			System.out.println("Intervalo " + intervalo);
		}
		else if (x > 25 && x <= 50) {
			intervalo = "(25,50]";
			System.out.println("Intervalo " + intervalo);
		}
		else if (x > 50 && x <= 75) {
			intervalo = "(50,75]";
			System.out.println("Intervalo " + intervalo);
		}
		else if (x > 75 && x <= 100) {
			intervalo = "(75,100]";
			System.out.println("Intervalo " + intervalo);
		}
		else {
			intervalo = "Fora de intervalo";
			System.out.println(intervalo);
		}
					
		sc.close();
	}
}
*
*URI 1038
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod = sc.nextInt();
		int quant = sc.nextInt();
		
		if (cod == 1) {
			double total = quant * 4.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		else if(cod == 2) {
			double total = quant * 4.50;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		else if(cod == 3) {
			double total = quant * 5.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		else if(cod == 4) {
			double total = quant * 2.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		else {
			double total = quant * 1.50;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		sc.close();
	}
}
*
*URI 1040
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float N1 = sc.nextFloat();
		float N2 = sc.nextFloat();
		float N3 = sc.nextFloat();
		float N4 = sc.nextFloat();
		float media;

		media = (float) (((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10.0);

		if (media >= 7.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno reprovado.");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Media: " + String.format("%.1f", media));
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			double mediafinal = ((exame + media) / 2);
			if ((exame + mediafinal) / 2 >= 5.0) {
			    System.out.println("Nota do exame: " + String.format("%.1f", exame));
			    System.out.println("Aluno aprovado.");
			    System.out.println("Media final: " + String.format("%.1f", mediafinal));
			} else {
				System.out.println("Aluno reprovado.");
			    System.out.println("Media final: " + String.format("%.1f", mediafinal));
			}
		}

		sc.close();
	}
}
*
*URI 1041
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (y == 0 && x == 0) {
			System.out.println("Origem");
		} 
		else if (x != 0 && y == 0) {
			System.out.println("Eixo X");
		}
		else if (y != 0 && x == 0) {
			System.out.println("Eixo Y");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}

		sc.close();
	}
}
*
*URI 1042
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A, B, C, min1, min2 = 0, min3 = 0;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		min1 = Math.min(A, Math.min(B, C));

		if (min1 == A) {
			min2 = Math.min(B, C);
			min3 = Math.max(B, C);
		}
		if (min1 == B) {
			min2 = Math.min(A, C);
			min3 = Math.max(A, C);
		}
		if (min1 == C) {
			min2 = Math.min(A, B);
			min3 = Math.max(A, B);
		}
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(min3);
		System.out.println("");
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		sc.close();
	}
}
*
*URI 1043
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if (A < (B + C) && B < (A + C) && C < (A + B)) {
			double peri = A + B + C;
			System.out.println("Perimetro =" + peri);
		}
		else {
			double area = ((A + B) * C)/2;
			System.out.println("Area = " + area);
		}
		
		sc.close();
	}
}
*
*URI 1044
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
			
		sc.close();
	}
}
*
*URI 1045
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A, B, C, maior;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if (B > A) {
			maior = A;
			A = B;
			B = maior;
		}
		if (C > A) {
			maior = A;
			A = C;
			C = maior;
		}

		double A2 = Math.pow(A, 2);
		double BC = Math.pow(B, 2) + Math.pow(C, 2);

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (A2 > BC) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (A2 < BC) {
				System.out.println("TRIANGULO ACUTANGULO");
			} else {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();
	}
}
*
*URI 1046
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		int duracao;

		if (hi < hf) {			
			duracao = hf - hi;
		}
		else {
			duracao = 24 - hi + hf;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}
}
*
*URI 1047
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int hi = sc.nextInt();
		int mi = sc.nextInt();
		int hf = sc.nextInt();
		int mf = sc.nextInt();
		int hm1, hm2, h24, resultado;
		
		hm1 = (hi * 60)+ mi;
		hm2 = (hf * 60) + mf;
		h24 = 24 * 60;
		resultado = 0;
		
		if(hm2 > hm1) {
			resultado = hm2 - hm1;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (resultado/60),(resultado % 60));
		}
		else if(hm1 > hm2) {
			resultado = (h24 - hm1) + hm2;
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (resultado/60),(resultado % 60));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", 24, 0);
		}
		
		sc.close();
	}
}
*
*URI 1048
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double sal, rea = 0, per = 0; 
		
		sal = sc.nextDouble();
		
		
		if (sal > 0 && sal <= 400) {
			per = 0.15;
			rea = (sal*per);
			sal = (rea + sal);
		}
		else if (sal >= 400.01 && sal <= 800) {
			per = 0.12;
			rea = (sal*per);
			sal = (rea + sal);
		}
		else if (sal >= 800.01 && sal <= 1200) {
			per = 0.10;
			rea = (sal*per);
			sal = (rea + sal);
		}
		else if (sal >= 1200.01 && sal <= 2000) {
			per = 0.07;
			rea = (sal*per);
			sal = (rea + sal);
		}
		else if (sal > 2000) {
			per = 0.04;
			rea = (sal*per);
			sal = (rea + sal);
		}
		
		System.out.printf("Novo salario: %.2f\n", sal);
		System.out.printf("Reajuste ganho: %.2f\n", rea);
		System.out.println("Em percentual:" + String.format(" %.0f ", (per*100)) + "%");
		
	
		sc.close();
	}
}
*
*URI 
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String pal1 = sc.next();
		String pal2 = sc.next();
		String pal3 = sc.next();
		String resultado = "";

		if (pal1.equalsIgnoreCase("vertebrado")) {
			if (pal2.equalsIgnoreCase("ave")) {
				if (pal3.equalsIgnoreCase("carnivoro")) {
					resultado = "aguia";
				}
				if (pal3.equalsIgnoreCase("onivoro")) {
					resultado = "pomba";
				}
			} else {
				if (pal2.equalsIgnoreCase("mamifero")) {
					if (pal3.equalsIgnoreCase("herbivoro")) {
						resultado = "vaca";
					}
					if (pal3.equalsIgnoreCase("onivoro")) {
						resultado = "homem";
					}
				}
			}
		}
		if (pal1.equalsIgnoreCase("invertebrado")) {
			if (pal2.equalsIgnoreCase("inseto")) {
				if (pal3.equalsIgnoreCase("hematofago")) {
					resultado = "pulga";
				}
				if (pal3.equalsIgnoreCase("herbivoro")) {
					resultado = "lagarta";
				}
			} else {
				if (pal2.equalsIgnoreCase("anelideo")) {
					if (pal3.equalsIgnoreCase("hematofago")) {
						resultado = "sanguessuga";
					}
					if (pal3.equalsIgnoreCase("onivoro")) {
						resultado = "minhoca";
					}
				}
			}
		}

		System.out.println(resultado);
		sc.close();
	}
}
*
*URI 1050
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int ddd = sc.nextInt();

		if (ddd == 61) {
			System.out.println("Brasilia");
		} else if (ddd == 71) {
			System.out.println("Salvador");
		} else if (ddd == 11) {
			System.out.println("Sao Paulo");
		} else if (ddd == 21) {
			System.out.println("Rio de Janeiro");
		} else if (ddd == 32) {
			System.out.println("Juiz de Fora");
		} else if (ddd == 19) {
			System.out.println("Campinas");
		} else if (ddd == 27) {
			System.out.println("Vitoria");
		} else if (ddd == 31) {
			System.out.println("Belo Horizonte");
		}
		else {
			System.out.println("DDD nao cadastrado");
		}
		sc.close();
	}
}
*
*URI 1051
*

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double sal = sc.nextDouble();
		double imp;

		if (sal <= 2000.00) {
			imp = 0.0;
		} else if (sal <= 3000.00) {
			imp = (sal - 2000) * 0.08;
		} else if (sal <= 4500.00) {
			imp = (sal - 3000) * 0.18 + 1000.0 * 0.08;

		} else {
			imp = (sal - 4500) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;

		}
		if (imp == 0.0) {
			System.out.printf("Isento\n");
		} else {
			System.out.printf("R$ %.2f\n", imp);
		}
		sc.close();
	}
}
*
*URI 1052
*

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int mes = sc.nextInt();
		
		if (mes == 1) {
			System.out.println("January");
		}
		else if(mes == 2) {
			System.out.println("February");
		}
		else if(mes == 3) {
			System.out.println("March");
		}
		else if(mes == 4) {
			System.out.println("April");
		}
		else if(mes == 5) {
			System.out.println("May");
		}
		else if(mes == 6) {
			System.out.println("June");
		}
		else if(mes == 7) {
			System.out.println("July");
		}
		else if(mes == 8) {
			System.out.println("August");
		}
		else if(mes == 9) {
			System.out.println("September");
		}
		else if(mes == 10) {
			System.out.println("October");
		}
		else if(mes == 11) {
			System.out.println("November");
		}
		else if(mes == 12) {
			System.out.println("December");
		}
		
		sc.close();
	}
}
*
*1059
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double total = 0;
		
		
		if (a > 0) {
			total += 1;					
		}
		if (b > 0) {
			total += 1;					
		}
		if (c > 0) {
			total += 1;					
		}
		if (d > 0) {
			total += 1;					
		}
		if (e > 0) {
			total += 1;					
		}
		if (f > 0) {
			total += 1;					
		}
		System.out.printf("%.0f valores positivos\n",total);
		sc.close();
	}
}
*
*URI 1061
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String di[] = sc.nextLine().split(" ");
		String hi[] = sc.nextLine().replaceAll(" ", "").split(":");
		String df[] = sc.nextLine().split(" ");
		String hf[] = sc.nextLine().replaceAll(" ", "").split(":");
		
		int d1 = Integer.parseInt(di[1]);
		int h1 = Integer.parseInt(hi[0]);
		int m1 = Integer.parseInt(hi[1]);
		int s1 = Integer.parseInt(hi[2]);
		int d2 = Integer.parseInt(df[1]);
		int h2 = Integer.parseInt(hf[0]);
		int m2 = Integer.parseInt(hf[1]);
		int s2 = Integer.parseInt(hf[2]);
		int q1, q2, tempo;

		q1 = s1 + (m1 * 60) + (h1 * 3600) + (d1 * 86400);
		q2 = s2 + (m2 * 60) + (h2 * 3600) + (d2 * 86400);
		tempo = q2 - q1;
		
		System.out.printf("%d dia(s)\n", (tempo / 86400));
		tempo = tempo % 86400;
		System.out.printf("%d hora(s)\n", (tempo / 3600));
		tempo = tempo % 3600;
		System.out.printf("%d minuto(s)\n", (tempo / 60));
		tempo = tempo % 60;
		System.out.printf("%d segundo(s)\n", tempo);

		sc.close();
	}
}
*
*URI 1064
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		double total = 0, media = 0;
		
		
		if (a > 0) {
			total += 1;
			media = a/total;
		}
		if (b > 0) {
			total += 1;
			media = (media + b);
		}
		if (c > 0) {
			total += 1;
			media = (media + c);
		}
		if (d > 0) {
			total += 1;					
			media = (media + d);
		}
		if (e > 0) {
			total += 1;					
			media = (media + e);
		}
		if (f > 0) {
			total += 1;					
			media = (media + f);
		}
		media = media / total;
		System.out.printf("%.0f valores positivos\n",total);
		System.out.printf("%.1f\n",media);
		sc.close();
	}
}
*
*URI 1065
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double total = 0;
		
		
		if (a % 2 == 0) {
			total += 1;
		}
		if (b % 2 == 0) {
			total += 1;
		}
		if (c % 2 == 0) {
			total += 1;
		}
		if (d % 2 == 0) {
			total += 1;					
		}
		if (e % 2 == 0) {
			total += 1;					
		}
		System.out.printf("%.0f valores pares\n",total);
		sc.close();
	}
}
*
*URI 1066
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double par = 0, imp = 0, pos = 0, neg = 0;
		
		
		if (a % 2 == 0) {
			par += 1;
		}
		if (a % 2 != 0) {
			imp += 1;
		}
		if (a > 0) {
			pos += 1;
		}
		if (a < 0) {
			neg += 1;
		}
		
		if (b % 2 == 0) {
			par += 1;
		}
		if (b % 2 != 0) {
			imp += 1;
		}
		if (b > 0) {
			pos += 1;
		}
		if (b < 0) {
			neg += 1;
		}
		
		if (c % 2 == 0) {
			par += 1;
		}
		if (c % 2 != 0) {
			imp += 1;
		}
		if (c > 0) {
			pos += 1;
		}
		if (c < 0) {
			neg += 1;
		}
		
		if (d % 2 == 0) {
			par += 1;
		}
		if (d % 2 != 0) {
			imp += 1;
		}
		if (d > 0) {
			pos += 1;
		}
		if (d < 0) {
			neg += 1;
		}
		
		if (e % 2 == 0) {
			par += 1;
		}
		if (e % 2 != 0) {
			imp += 1;
		}
		if (e > 0) {
			pos += 1;
		}
		if (e < 0) {
			neg += 1;
		}
		
		System.out.printf("%.0f valor(es) par(es)\n", par);
		System.out.printf("%.0f valor(es) impar(es)\n", imp);
		System.out.printf("%.0f valor(es) positivo(s)\n", pos);
		System.out.printf("%.0f valor(es) negativo(s)\n", neg);
		sc.close();
	}
}
*
*URI 1080
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int pos = 1, x = 0, maior = 0;

		for (int i = 1; i < 100; i++) {
			x = sc.nextInt();
			if (x > maior) {
				maior = x;
				pos = i;
			} 
		}

		System.out.println(maior);
		System.out.println(pos);

		sc.close();
	}
}
*
*URI 1094
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int ncob, totcob = 0, tc = 0, tr = 0, ts = 0;
		double percR, percC, percS;
		String animal;
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			ncob = sc.nextInt();
			animal = sc.next();
			totcob += ncob;

			if (animal.equals("C")) {
				tc += ncob;
			} else if (animal.equals("R")) {
				tr += ncob;
			} else if (animal.equals("S")) {
				ts += ncob;
			}
		}
		System.out.println("Total: " + totcob + " cobaias");
		System.out.println("Total de coelhos: " + tc);
		System.out.println("Total de ratos: " + tr);
		System.out.println("Total de sapos: " + ts);
		percC = (double) (tc * 100) / totcob;
		percR = (double) (tr * 100) / totcob;
		percS = (double) (ts * 100) / totcob;
		System.out.printf("Percentual de coelhos: %.2f", percC);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f", percR);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f", percS);
		System.out.print(" %\n");
		sc.close();
	}
}
*
*
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int I = 1, J = 60;

		for (int i = 1; J >= 0; i++) {
			System.out.println("I=" + I + " J=" + J);
			I += 3;
			J -= 5;
		}

		sc.close();
	}
}
*
*URI 1096
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int Ia = 1, Ib = 1, Ic = 1, Ja = 7, Jb = 6, Jc = 5;

		for (int i = 1; Ic <= 9; i++) {
			System.out.println("I=" + Ia + " J=" + Ja);
			System.out.println("I=" + Ib + " J=" + Jb);
			System.out.println("I=" + Ic + " J=" + Jc);
			Ia += 2;
			Ib += 2;
			Ic += 2;
		}
		sc.close();
	}
}
*
*URI 1097
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int Ia = 1, Ib = 1, Ic = 1, Ja = 7, Jb = 6, Jc = 5;

		for (int i = 1; Ic <= 9; i++) {
			System.out.println("I=" + Ia + " J=" + Ja);
			System.out.println("I=" + Ib + " J=" + Jb);
			System.out.println("I=" + Ic + " J=" + Jc);
			Ia += 2;
			Ib += 2;
			Ic += 2;
			Ja += 2;
			Jb += 2;
			Jc += 2;
		}
		sc.close();
	}
}
*
*URI 1098
*
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float Ia = 0, Ib = 0, Ic = 0, Ja = 1, Jb = 2, Jc = 3;

		System.out.printf("I=%.0f J=%.0f\n", Ia, Ja);
		System.out.printf("I=%.0f J=%.0f\n", Ib, Jb);
		System.out.printf("I=%.0f J=%.0f\n", Ic, Jc);

		for (int i = 1; Ic <= 1.8; i++) {
			Ia += 0.2;
			Ib += 0.2;
			Ic += 0.2;
			Ja += 0.2;
			Jb += 0.2;
			Jc += 0.2;
			if (Ia % 1 == 0 && Ib % 1 == 0 && Ic % 1 == 0)  {
				System.out.printf("I=%.0f J=%.0f\n" , Ia, Ja);
				System.out.printf("I=%.0f J=%.0f\n", Ib, Jb);
				System.out.printf("I=%.0f J=%.0f\n", Ic, Jc);
			} 
			else {
				System.out.printf("I=%.1f J=%.1f\n", Ia, Ja);
				System.out.printf("I=%.1f J=%.1f\n", Ib, Jb);
				System.out.printf("I=%.1f J=%.1f\n", Ic, Jc);

			}
		}
		System.out.printf("I=%.0f J=%.0f\n", Ia, Ja);
		System.out.printf("I=%.0f J=%.0f\n", Ib, Jb);
		System.out.printf("I=%.0f J=%.0f\n", Ic, Jc);
		sc.close();
	}
}
*
*URI 1101
*/
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int M, N, X, soma;
		
		for (int i = 0; M > 0 || N > 0; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			soma = 0;
		}
		System.out.println("Olá");
			
		sc.close();
	}
}
