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
		//hist�ria
		System.out.println("Voc� estava em sua casa quando derrepente sua vis�o fica preta");
		System.out.println("Quando voc� acorda se depara que est� em um labirindo");
		System.out.println("H� 4 caminhos, Direita(d), Esquerda(a), Para frente(w), para tr�s(s)");
		System.out.println("por qual caminho voc� deseja ir? (w, a, s, d)");
		String comando = in.nextLine();
		System.out.println(" ");
		
		//Comando "w"
		if (comando.equals("w")) {
				System.out.println("Voc� decidiu ir para Frente");
				System.out.println("Voc� encontra uma espada no ch�o");
				System.out.println("Ela est� rachada e enferrujada");
				System.out.println("Deseja Pegar Ela? (s = pegar, n = n�o pegar)");
				comando = in.nextLine();
				System.out.println(" ");
					//Pegar espada
					if (comando.equals("s")) {
						System.out.println("A ESPADA TINHA UMA MALDI��O");
						System.out.println("VOC� TENTA DOMINAR ESSA MALDI��O");
						if(rand.nextInt(100) < 75) {
							System.out.println("Voc� dominou a maldi��o");
						} else {
							System.out.println("Voc� morreu para a maldi��o");
							System.out.println("fim de jogo...");
						}
						
					//N�o pegar espada
					} else {
						System.out.println("Voc� passou direto");
						System.out.println("Voc� encontrou um Bixo gigante");
						System.out.println("Ele te viu e come�ou a te atacar");
						
						//Morrer com o boss
						if((rand.nextInt(100) < 99)) {
							System.out.println("Voc� come�a a bater nele com a m�o");
							System.out.println("sua m�o fica em peda�os");
							System.out.println("O gigante te ataca");
							System.out.println("Voc� morre");
							System.out.println("Fim de jogo "+nick);
							
						//vencer o boss	
						} else {
							System.out.println("Voc� come�a a bater nele com a m�o");
							System.out.println("sua m�o fica em peda�os");
							System.out.println("O gigante te ataca");
							System.out.println("Voc� esquiva varias vezes");
							System.out.println("come�a a bater nele muito");
							System.out.println("ele come�a a cambalear");
							System.out.println("ele cai e voc� n�o para de bater nele");
							System.out.println("Voc� mata ele e conclui o labirinto");
							System.out.println("Voc� ganhou, Parab�ns");
							System.out.println("FIM DE JOGO");
							
							
						}
						
					}
			}		
		
	}
}
