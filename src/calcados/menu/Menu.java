package calcados.menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int opcao, modalidade;
		
		while (true) {
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PIMENTEL CALÇADOS	                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar novo item                  ");
			System.out.println("            2 - Listar todas os itens                ");
			System.out.println("            3 - Buscar item por código               ");
			System.out.println("            4 - Atualizar dados do item              ");
			System.out.println("            5 - Apagar item                          ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");

			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 6) {
				System.out.println("\nPIMENTEL CALÇADOS - O primeiro passo para o futuro é com a gente!");
				sobre();
                 		leia.close();

				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Digite as seguintes informações para adicionar um item:\n\n");					
					keyPress();
					break;
				case 2:
					System.out.println("Os itens são:\n\n");
					keyPress();
					break;
				case 3:
					System.out.println("Digite o código do item que deseja:\n\n");
					keyPress();
					break;
				case 4:
					System.out.println("Digite o código do item: ");
					keyPress();
					break;
				case 5:
					System.out.println("Digite o número do código do item que deseja apagar: ");
					keyPress();
					break;
	
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Lucas da Silva Pimentel ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("https://github.com/Pimentelucas/projeto_final_bloco_01");
		System.out.println("*********************************************************");
	}
		
	public static void keyPress() {
		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}

