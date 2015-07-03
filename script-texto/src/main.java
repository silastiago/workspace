

import java.util.ArrayList;


public class main {
	public static void main(String[] args) {

		ArrayList<String> arquivo = new ArrayList<String>();

		lerArquivo lerArquivo = new lerArquivo();
		arquivo = (ArrayList<String>) lerArquivo.LerArquivo();

		System.out.println("arquivo vindo do ler dados");
		for (int i = 0; i < arquivo.size(); i++) {
			System.out.println(arquivo.get(i));
		}

		SalvarDadosArquivo salvar = new SalvarDadosArquivo();
		salvar.saveData(arquivo);


	}

}


