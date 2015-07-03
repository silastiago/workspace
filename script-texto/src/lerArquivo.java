

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lerArquivo {
	Scanner ler;
	String nome;
	FileReader arq;
	BufferedReader lerArq;
	String linha;
	String numero = "";
	String nome2;
	List<String> lista = new ArrayList<String>();

	List<String> LerArquivo(){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero correspondente a hora que voce deseja para a quantidade de Nitrogenio:\n");
        System.out.println("1 - Para alterar as listas de email");
        numero = entrada.nextLine();

        switch(numero)
        {
        case "1":
            System.out.println("emails.txt");
            nome2 = "./emails.txt";
            break;
            default:
            	System.out.println("Digite o caminho do arquivo correspondente a hora que voce deseja:");
            	Scanner leitorCaminho = new Scanner(System.in);
            	nome2 = leitorCaminho.nextLine();

        }



		//ler = new Scanner(System.in);
		//System.out.printf("Informe o diretório do arquivo DadosdoIRI Soma total de Nitrogenio:\n");
		//nome = ler.nextLine();
		try {  arq = new FileReader(nome2);
		lerArq = new BufferedReader(arq);
		linha = lerArq.readLine();

		while (linha != null) {





			String token = linha + ";";
			//Double coluna1 = Double.parseDouble(token[5]);
			//Double coluna2 = Double.parseDouble(token[8]);


			linha = lerArq.readLine();

			//double total = (coluna1 * (Math.pow(10, coluna2)));
			lista.add(token);
		}

		arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());


		}


		return lista;

	}


}

//Leia mais em: Lendo dados de Txt com Java http:
//www.devmedia.com.br/lendo-dados-de-txt-com-java/23221#ixzz30EBmb8PN