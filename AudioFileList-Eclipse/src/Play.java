
import java.util.Scanner;


public class Play {

	/**
	 *Esta classe é o main do projeto.
	 *Ele possui o atributo toca do tipo audioFileList que é a classe onde estão as funções a serem chamadas.
	 *
	 *Ele tem um menu com numeros que vão de 1 à 8 Cada numero representa uma chamada à uma função da playlist.
	 *O numero 1 representa a adição de uma musica na playList.
	 *o numero 2 representa visualizar o tamanho da playList
	 *o numero 3 representa visualizar os elementos da playList
	 *o numero 4 representa remover um elemento da playList passando o indice do elemento
	 *o numero 5 representa ouvir alguma musica da playList passando o indice do elemento que quer escutar
	 *o numero 6 represent ouvir todas as musicas cadastradas na playlist
	 *o numero 7 representa remover uma musica da playlist passando uma parte do nome da musica.
	 *o numero 8 é para sair do player
	 *
	 *Nela contemos alguns atributos que são eles:
	 *mp3
	 *
	 * @author
	 * @version
	 */


	public static void main(String[] args) {
		AudioFileList toca = new AudioFileList();


		System.out.println("Digite 1 para adicionar um arquivo a playList");
		System.out.println("Digite 2 pata ver o tamanhao da playList");
		System.out.println("Digite 3 para Visualizar sua playList");
		System.out.println("Digite 4 para remover algum elemento da playList");
		System.out.println("Digite 5 para ouvir uma música especifíca da playList");
		System.out.println("Digite 6 para ouvir todas as músicas da playList");
		System.out.println("Digite 7 para remover um elemento da playList apartir de uma String n");
		System.out.println("Digite 8 para sair do programa \n");
		Scanner funcao1 = new Scanner(System.in);
		String funcao2 = funcao1.nextLine();
		while(Integer.parseInt(funcao2) <= 7){

			switch (funcao2) {
			case "1":
				System.out.println("Digite o nome da musica como no exemplo abaixo\n");
				System.out.println("Exemplo:  BoB-Airplane");
				Scanner arqmusic = new Scanner(System.in);
				String arqmusic2 = arqmusic.nextLine();
				toca.addFile(arqmusic2);
				break;
			case "2":
				System.out.println("numero de elementos de sua playList é " + toca.getNumberOfFiles() + " \n");

				break;

			case "3":
				toca.listFiles();

				break;
			case "4":
				toca.listFiles();
				System.out.println("\n");
				System.out.println("Digite o numero correspondente ao indice da música que você quer escluir\n");
				Scanner delmusic = new Scanner(System.in);
				String delmusicArq = delmusic.nextLine();
				int  condicao = Integer.parseInt(delmusicArq);
				if(condicao >= 0 && condicao < toca.getMusicas().size()){
					toca.removeFile(condicao);
				}else{
					System.out.println("Indice Inválido");
				}


				break;
			case "5":
				toca.listFiles();
				System.out.println("\n");
				System.out.println("Digite o numero correspondente ao indice da música que você quer Ouvir\n");
				Scanner tocarmusic = new Scanner(System.in);
				String tocarmusicArq = tocarmusic.nextLine();
				int variavel = Integer.parseInt(tocarmusicArq);
				if(variavel >= 0  && variavel < toca.getMusicas().size()){
					String musicaTocar = toca.searchMusic(variavel);
					toca.playFile(musicaTocar);
				}else{
					System.out.println("Numero Inválido");
				}


				break;
			case "6":
				System.out.println("\n");
				toca.playAll();
				break;
			case "7":
				toca.listFiles();
				System.out.println("\n");
				System.out.println("Digite uma string correspondente a música a ser removida\n");

				Scanner substringmusic = new Scanner(System.in);
				String substringString = substringmusic.nextLine();
				toca.removeFile(substringString);
				break;
			default:

				break;
			}

			System.out.println("\n");
			System.out.println("Digite 1 para adicionar um arquivo a playList");
			System.out.println("Digite 2 pata ver o tamanhao da playList");
			System.out.println("Digite 3 para Visualizar sua playList");
			System.out.println("Digite 4 para remover algum elemento da playList");
			System.out.println("Digite 5 para ouvir uma música especifíca da playList");
			System.out.println("Digite 6 para ouvir todas as músicas da playList");
			System.out.println("Digite 7 para remover um elemento da playList apartir de uma String n");
			System.out.println("Digite 8 para sair do programa \n");

			Scanner funcao3 = new Scanner(System.in);
			funcao2 = funcao3.nextLine();

		}


	}

}
