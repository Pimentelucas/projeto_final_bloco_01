package calcados.menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import calcados.controller.CalcadosController;
import calcados.model.Calcados;
import calcados.model.Tenis;

public class Menu {

	public static void main(String[] args) {
		
		CalcadosController calcado = new CalcadosController();
		
		Scanner leia = new Scanner (System.in);
		
		int opcao, tipo, tamanho, codigo;
		float preco;
		String modalidade;
		
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
					System.out.println("Digite o tamanho do item");
					tamanho = leia.nextInt();
					
					do { 
						System.out.println("Digite o Tipo do calçado (1-Tenis ou 2-Sandália): ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o preço do item: ");
					preco = leia.nextFloat();
					
					switch(tipo) {
						case 1 -> {  
							System.out.println("Digite a modalidade do tenis: ");
							modalidade = leia.toString();
							calcado.cadastrar(new Tenis (calcado.gerarCodigo(), tamanho, tipo, preco, modalidade));
						}
					}
					keyPress();
					break;
				case 2:
					System.out.println("Os itens são:\n\n");
					calcado.listarTodas();
					keyPress();
					break;
				case 3:
					System.out.println("Digite o código do item que deseja buscar:\n\n");
					codigo = leia.nextInt();
					
					calcado.procurarPorCodigo(codigo);
					keyPress();
					break;
				case 4:
					System.out.println("Digite o código do item que deseja atualizar: ");
					codigo = leia.nextInt();
					var buscaCalcado = calcado.buscarNaCollection (codigo);
					if(buscaCalcado != null) { 
						tipo = buscaCalcado.getTipo();
						System.out.println("Digite o tamanho do calcado: ");
						tamanho = leia.nextInt();
						System.out.println("Digite o preço: ");
						preco = leia.nextFloat();
						
						switch (tipo) {
							case 1 -> {
								System.out.println("Digite a modalidade: ");
								modalidade = leia.next();
							}
							
							default -> {
								System.out.println("Tipo de conta calçado inválido!");
							}
						}	
					}else {
						System.out.println("O calçado não foi encontrado!"); 
					}
					keyPress();
					break;
				case 5:
					System.out.println("Digite o número do código do item que deseja apagar: ");
					codigo = leia.nextInt();
					calcado.deletar(codigo);
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

