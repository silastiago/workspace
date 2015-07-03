

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;




public class SalvarDadosArquivo {

	private FileWriter arq;
	private Scanner arquivoSaida;
	private PrintWriter gravarArq;
	private String arquivoSaida2;
	private ArrayList<String> arquivo = new ArrayList<String>();


	public void saveData(ArrayList<String> arquivo){
		try {
			System.out.println("Digite o nome do arquivo de Saída");
			arquivoSaida = new Scanner(System.in);
			arquivoSaida2 = arquivoSaida.nextLine();
			arq = new FileWriter(arquivoSaida2);
			gravarArq  = new PrintWriter(arq);
			for (int i = 0; i < arquivo.size(); i++) {
				gravarArq.print(arquivo.get(i) + "\n");
			}
			arq.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
