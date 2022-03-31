package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nick;
		Random rand = new Random();
		System.out.println("Seja bem vindo ao jogo! Insira Seu nick:");
		nick = in.nextLine();
		System.out.println("Seja bem vindo(a) ao jogo "+nick);
		System.out.println("--------------------------");
		//história
		System.out.println("Você estava em sua casa quando derrepente sua visão fica preta");
		System.out.println("Quando você acorda se depara que está em um labirindo");
		System.out.println("Há 4 caminhos, Direita(d), Esquerda(a), Para frente(w), para trás(s)");
		System.out.println("por qual caminho você deseja ir? (w, a, s, d)");
		String comando = in.nextLine();
		System.out.println(" ");
		
		//Comando "w"
		if (comando.equals("w")) {
				System.out.println("Você decidiu ir para Frente");
				System.out.println("Você encontra uma espada no chão");
				System.out.println("Ela está rachada e enferrujada");
				System.out.println("Deseja Pegar Ela? (s = pegar, n = não pegar)");
				comando = in.nextLine();
				System.out.println(" ");
					//Pegar espada
					if (comando.equals("s")) {
						System.out.println("A ESPADA TINHA UMA MALDIÇÃO");
						System.out.println("VOCÊ TENTA DOMINAR ESSA MALDIÇÃO");
						if(rand.nextInt(100) < 75) {
							System.out.println("Você dominou a maldição");
						} else {
							System.out.println("Você morreu para a maldição");
							System.out.println("fim de jogo...");
						}
						
					//Não pegar espada
					} else {
						System.out.println("Você passou direto");
						System.out.println("Você encontrou um Bixo gigante");
						System.out.println("Ele te viu e começou a te atacar");
						
						//Morrer com o boss
						if((rand.nextInt(100) < 99)) {
							System.out.println("Você começa a bater nele com a mão");
							System.out.println("sua mão fica em pedaços");
							System.out.println("O gigante te ataca");
							System.out.println("Você morre");
							System.out.println("Fim de jogo "+nick);
							
						//vencer o boss	
						} else {
							System.out.println("Você começa a bater nele com a mão");
							System.out.println("sua mão fica em pedaços");
							System.out.println("O gigante te ataca");
							System.out.println("Você esquiva varias vezes");
							System.out.println("começa a bater nele muito");
							System.out.println("ele começa a cambalear");
							System.out.println("ele cai e você não para de bater nele");
							System.out.println("Você mata ele e conclui o labirinto");
							System.out.println("Você ganhou, Parabéns");
							System.out.println("FIM DE JOGO");
							
							
						}
						
					}
			}		
		
	}
}
