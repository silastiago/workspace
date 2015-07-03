import java.util.ArrayList;


/**
* Esta classe Possui os atributos mencionados logo abaixo.
* String mp3 ela serve para e concatenar o nome da musica com o formato .mp3 dai facilita para o usuario inserir uma musica nova na playList visto que apenas precisa digitar o nome da musica e não precisa se preocupar com o formato.
* String audio ela para e concatenar com o nome da musica dai facilita para o usuario inserir uma musica nova na playList visto que apenas precisa digitar o nome da musica e não se preocupa com o nome do caminho da musica.
* engine ela é um objeto da classe SoundEngine vai servir para executar os arquivos mp3.
* musicas do tipo ArrayList conterá a playList a ser cadastrada
*
* O contrutor é sem parametro como nas intruções dp projeto.
*
* Os metodos estão relacionados logo abaixo
*
* addFile recebe uma string como parametro e adiciona esta string na playList que é o arralist.
* getMusicas uma funcao para retornar as musicas.
* getNumberOfFiles para retornar o tamanho da playList.
* listFiles ele retorna as musicas cadastradas na playList.
* removeFile recebe um inteiro como parametro que é o indice da playlist e remove o elemento referente a este indice.
* playFile recebe uma string que é o nome da musica e toca esta musica.
* playAll toca todas musicas cadastradas na playList.
* removeFile recebe uma string como parametro que é uma substring de uma das musicas existentes na playlist se ele não encontrar nenhuma substring igual a que você digitar ele retorna que não encontrou a musica procurada.
*
* @author
* @version
*/

public class AudioFileList {
	private String audio;
	private SoundEngine engine;
	private ArrayList<String> musicas;
	private String mp3;

	public AudioFileList(){
		audio = "audio/";
		musicas = new ArrayList<String>();
		engine = new SoundEngine();
		mp3 = ".mp3";
	}

	public void addFile(String addmusica){
		musicas.add(addmusica);
	}


	public ArrayList<String> getMusicas() {
		return musicas;
	}


	public int getNumberOfFiles(){
		return musicas.size();
	}

	public void listFiles(){
		for (int i = 0; i < musicas.size(); i++) {
			System.out.println(  i + ": " + audio +  musicas.get(i) + ".mp3");
		}
	}

	public void playAll(){
		//String path = "audio/";
		String path2 = "";

		for (int i = 0; i < musicas.size(); i++) {
			path2 = musicas.get(i);
			engine.playCompletely(audio + path2 + mp3);
		}

	}

	public void playFile(String path){

		engine.playCompletely(audio + path + mp3);

	}

	public void removeFile(int delmusica){
		if(getNumberOfFiles() > 0){
			musicas.remove(delmusica);
			System.out.println("A música removida foi a de indice "+ delmusica);
		}
		else{
			System.out.println("Indice Inválido");
		}

	}

	public void removeFile(String delmusic){

		int i =0;
		int f = 0;
		int j = delmusic.length();
		while(i < musicas.size()){

			while(!musicas.get(i).substring(f, j).equalsIgnoreCase(delmusic) && (musicas.get(i).length() > j)){
				System.out.println("Substring " + musicas.get(i).substring(f, j) + " na musica " + musicas.get(i));
				System.out.println("Música não encontrada");
				System.out.println("I = " + i);
				System.out.println("F = " + f);
				System.out.println("j = " + j);
				f = f + 1;
				j = j + 1;
			}
			if (musicas.get(i).substring(f, j).equalsIgnoreCase(delmusic)) {
				musicas.remove(i);
				System.out.println("A música removida foi a de indice "+ i);
				break;
			}else{
				System.out.println("Musica não encontrada");
			}
			f = 0;
			j = delmusic.length();
			i = i +1;
		}

	}

	public String searchMusic(int indiceMusic){
		return musicas.get(indiceMusic);


	}

	public void setMusicas(ArrayList<String> musicas) {
		this.musicas = musicas;
	}

}
