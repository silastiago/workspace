package com.example.alves;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Spinner spinner1, spinner2;
	private Button button;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		addItemsOnSpinner1();
		//addItemsOnSpinner2();
		addListenerOnButton();
		//addListenerOnSpinnerItemSelection();
	}

	// add items into spinner dynamically
	public void addItemsOnSpinner1() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		List<String> list = new ArrayList<String>();
		list.add("Escolha sua Origem");
		list.add("Barcelona");
		list.add("Bom Jesus");
		list.add("Lagoa de Velhos");
		list.add("Marias");
		list.add("Natal");
		list.add("São Paulo do potengi");
		list.add("São Tomé");
		list.add("São Pedro");
		list.add("Serra Caiada");
		list.add("Sitio Novo");
		list.add("Tangará");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
		spinner1.setOnItemSelectedListener((OnItemSelectedListener) new funcion());
	}
	
	public class funcion implements OnItemSelectedListener{

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {
			if(spinner1.getSelectedItem().toString().equals("Barcelona")){
				addItemsOnSpinner2();
			}
			else if(spinner1.getSelectedItem().toString().equals("Bom Jesus")){
				addItemsOnSpinner3();
			}
			else if(spinner1.getSelectedItem().toString().equals("Lagoa de Velhos")){
				addItemsOnSpinner4();
			}
			else if(spinner1.getSelectedItem().toString().equals("Marias")){
				addItemsOnSpinner5();
			}
			else if(spinner1.getSelectedItem().toString().equals("Natal")){
				addItemsOnSpinner6();
			}
			else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi")){
				addItemsOnSpinner7();
			}
			else if(spinner1.getSelectedItem().toString().equals("São Tomé")){
				addItemsOnSpinner8();
			}
			else if(spinner1.getSelectedItem().toString().equals("São Pedro")){
				addItemsOnSpinner9();
			}
			else if(spinner1.getSelectedItem().toString().equals("Serra Caiada")){
				addItemsOnSpinner10();
			}
			else if(spinner1.getSelectedItem().toString().equals("Sitio Novo")){
				addItemsOnSpinner11();
			}
			else if(spinner1.getSelectedItem().toString().equals("Tangará")){
				addItemsOnSpinner12();
			}
		}
		
		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	public void addItemsOnSpinner2() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Marias");
		list2.add("Natal");
		list2.add("São Paulo do potengi");
		list2.add("São Tomé");
		list2.add("São Pedro");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	
	public void addItemsOnSpinner3() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Marias");
		list2.add("Natal");
		list2.add("Serra Caiada");
		list2.add("Sitio Novo");
		list2.add("Tangará");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}

	public void addItemsOnSpinner4() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");		
		list2.add("Barcelona");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner5() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Barcelona");
		list2.add("Bom Jesus");
		list2.add("Lagoa de Velhos");
		list2.add("Natal");
		list2.add("São Paulo do potengi");
		list2.add("São Tomé");
		list2.add("São Pedro");
		list2.add("Serra Caiada");
		list2.add("Sitio Novo");
		list2.add("Tangará");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner6() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Barcelona");
		list2.add("Bom Jesus");
		list2.add("Lagoa de Velhos");
		list2.add("Marias");
		list2.add("São Paulo do potengi");
		list2.add("São Tomé");
		list2.add("São Pedro");
		list2.add("Serra Caiada");
		list2.add("Sitio Novo");
		list2.add("Tangará");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner7() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Barcelona");
		list2.add("Lagoa de Velhos");
		list2.add("Natal");
		list2.add("Marias");
		list2.add("São Tomé");
		list2.add("São Pedro");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner8() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Barcelona");
		list2.add("Natal");
		list2.add("Marias");
		list2.add("São Paulo do potengi");
		list2.add("São Pedro");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner9() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Barcelona");
		list2.add("Lagoa de Velhos");
		list2.add("Natal");
		list2.add("Marias");
		list2.add("São Paulo do potengi");
		list2.add("São Tomé");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner10() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Bom Jesus");
		list2.add("Natal");
		list2.add("Marias");
		list2.add("Sitio Novo");
		list2.add("Tangará");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner11() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Bom Jesus");
		list2.add("Marias");
		list2.add("Natal");
		list2.add("Serra Caiada");
		list2.add("Tangará");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	public void addItemsOnSpinner12() {
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List<String> list2 = new ArrayList<String>();
		list2.add("Escolha seu Destino");
		list2.add("Bom Jesus");
		list2.add("Marias");
		list2.add("Natal");
		list2.add("Serra Caiada");
		ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list2);
		dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter2);
	}
	
	/*

  public void addListenerOnSpinnerItemSelection() {
	spinner1 = (Spinner) findViewById(R.id.spinner1);
	spinner1.setOnItemSelectedListener(new MyOnItemSelectedListener());
  }


	 */
	public void addListenerOnButton() {

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		button = (Button) findViewById(R.id.button);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				// Barcelona
				if(spinner1.getSelectedItem().toString().equals("Barcelona") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaNatal.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Barcelona") &
						spinner2.getSelectedItem().toString().equals("São Pedro")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barceloSaoPedro.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Barcelona") &
						spinner2.getSelectedItem().toString().equals("São Paulo do potengi")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaSaoPaulo.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Barcelona") &
						spinner2.getSelectedItem().toString().equals("São Tomé")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaSaoTome.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Barcelona") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaMarias.class);
					startActivity(i);}


				// Bom Jesus

				else if(spinner1.getSelectedItem().toString().equals("Bom Jesus") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, bomJesusMarias.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Bom Jesus") &
						spinner2.getSelectedItem().toString().equals("Serra Caiada")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, bomJesusSerraCaiada.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Bom Jesus") &
						spinner2.getSelectedItem().toString().equals("Tangará")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, bomJesusTangara.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Bom Jesus") &
						spinner2.getSelectedItem().toString().equals("Sitio Novo")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, bomJesusSitioNovo.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Bom Jesus") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, bomJesusNatal.class);
					startActivity(i);}

				// Lagoa de Velhos


				else if(spinner1.getSelectedItem().toString().equals("Lagoa de Velhos") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaLagoaVelhos.class);
					startActivity(i);}

				// Santa Maria


				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("São Pedro")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasSaoPedro.class);
					startActivity(i);}
				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("São Paulo do potengi")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasSaoPaulo.class);
					startActivity(i);}
				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasBarcelona.class);
					startActivity(i);}


				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("São Tomé")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasSaoTome.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasNatal.class);
					startActivity(i);}


				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Sitio Novo")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasSitioNovo.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Tangará")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasTangara.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Bom Jesus")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasBomJesus.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Marias") &
						spinner2.getSelectedItem().toString().equals("Serra Caiada")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, mariasBomJesus.class);
					startActivity(i);}

				// Natal 


				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalBarcelona.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Bom Jesus")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalBomJesus.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Lagoa de Velhos")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalLagoaVelhos.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalMarias.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("São Paulo do Potengi")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalSaoPaulo.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("São Tomé")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalSaoTome.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("São Pedro")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalSaoPedro.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("São Serra Caiada")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalSerraCaiada.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Sitio Novo")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalSitioNovo.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Natal") &
						spinner2.getSelectedItem().toString().equals("Tangará")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, natalTangara.class);
					startActivity(i);}



				// São Paulo do potengi

				else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPauloPotengiNatal.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi") &
						spinner2.getSelectedItem().toString().equals("São Pedro")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPauloSaopedro.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPauloBarcelona.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPauloMarias.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Paulo do potengi") &
						spinner2.getSelectedItem().toString().equals("São Tomé")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, barcelonaSaoTome.class);
					startActivity(i);}
				
				// São Pedro
				
				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroNatal.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroMarias.class);
					startActivity(i);}
					
				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("São Paulo do potengi")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroSaoPaulo.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroBacelona.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("Lagoa de Velhos")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroLagoVelhos.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Pedro") &
						spinner2.getSelectedItem().toString().equals("São Tomé")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoPedroSaoTome.class);
					startActivity(i);}

				// São Tomé

				else if(spinner1.getSelectedItem().toString().equals("São Tomé") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoTomeNatal.class);
					startActivity(i);  
				}

				else if(spinner1.getSelectedItem().toString().equals("São Tomé") &
						spinner2.getSelectedItem().toString().equals("Barcelona")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoTomeBarcelona.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Tomé") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoTomeMarias.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Tomé") &
						spinner2.getSelectedItem().toString().equals("São Paulo do potengi")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoTomeSaoPaulo.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("São Tomé") &
						spinner2.getSelectedItem().toString().equals("São Pedro")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, saoTomeSaoPedro.class);
					startActivity(i);}

				
				// Serra Caiada
				
				else if(spinner1.getSelectedItem().toString().equals("Serra Caiada") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, serraCaiadaNatal.class);
					startActivity(i);}

				else if(spinner1.getSelectedItem().toString().equals("Serra Caiada") &
						spinner2.getSelectedItem().toString().equals("Bom Jesus")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, serraCaiadaBomJesus.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Serra Caiada") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, serraCaiadaMarias.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Serra Caiada") &
						spinner2.getSelectedItem().toString().equals("Sitio Novo")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, serraCaiadaSitioNovo.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Serra Caiada") &
						spinner2.getSelectedItem().toString().equals("Tangará")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, serraCaiadaTangara.class);
					startActivity(i);}
				
				// Sitio Novo
				
				else if(spinner1.getSelectedItem().toString().equals("Sitio Novo") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, sitioNovoNatal.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Sitio Novo") &
						spinner2.getSelectedItem().toString().equals("Tangará")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, sitioNovoTangara.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Sitio Novo") &
						spinner2.getSelectedItem().toString().equals("Bom Jesus")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, sitioNovoBomJesus.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Sitio Novo") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, sitioNovoMarias.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Sitio Novo") &
						spinner2.getSelectedItem().toString().equals("Serra Caiada")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, sitioNovoSerraCaiada.class);
					startActivity(i);}
				
				// Tangará
				
				else if(spinner1.getSelectedItem().toString().equals("Tangará") &
						spinner2.getSelectedItem().toString().equals("Natal")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, tangaraNatal.class);
					startActivity(i);}


				else if(spinner1.getSelectedItem().toString().equals("Tangará") &
						spinner2.getSelectedItem().toString().equals("Bom Jesus")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, tangaraBomJesus.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Tangará") &
						spinner2.getSelectedItem().toString().equals("Marias")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, tangaramarias.class);
					startActivity(i);}
				
				else if(spinner1.getSelectedItem().toString().equals("Tangará") &
						spinner2.getSelectedItem().toString().equals("Serra Caiada")){
					//Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sigaa.ufrn.br/"));
					//startActivity(intent);
					Intent i = new Intent(MainActivity.this, tangaraSerraCaiada.class);
					startActivity(i);}

			}
		});
	}
}
