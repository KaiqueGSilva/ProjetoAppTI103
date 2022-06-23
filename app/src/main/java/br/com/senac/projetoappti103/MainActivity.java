package br.com.senac.projetoappti103;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar as variáveis globais referenciando os componentes

    ListView lstFilmes;

    //Criando os dados para a lista

    String titulo[] = {"Contractor","Bad Boys","It a Coisa","John Wick","Joker","Jumanji",
            "Madagascar","Shrek","Spider Man","Turma da Monica"};

    String ano[] = {"2022","2020","2019","2014","2019","2020","2005","2004","2019","2021"};

    String classificacao[] = {"18 anos ou mais","18 anos ou mais","18 anos ou mais",
            "18 anos ou mais","18 anos ou mais","13 anos ou mais","7 anos ou mais","7 anos ou mais",
            "13 anos ou mais","7 anos ou mais"};

    int imgFilmes[] = {R.drawable.contractor, R.drawable.badboys, R.drawable.itacoisa,
            R.drawable.johnwick, R.drawable.joker, R.drawable.jumanji, R.drawable.madagascar,
            R.drawable.shrek, R.drawable.spiderman, R.drawable.turmadamonica};

    String notas[] = {"12","97","6.435","10.899","18.834","9.237","1.330","1.527","43","353"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = findViewById(R.id.listaFilmes);

        //instânciar o adaptador
        MyAdapter adapter = new MyAdapter();

        lstFilmes.setAdapter(adapter);

        lstFilmes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Abrindo outra janela e passando os valores
                Intent intent = new Intent(getApplicationContext(),MostrarFilmesActivity.class);

                intent.putExtra("titulo",titulo[position]);
                intent.putExtra("ano",ano[position]);
                intent.putExtra("classificacao",classificacao[position]);
                intent.putExtra("notas",notas[position]);
                intent.putExtra("imagemFilme",imgFilmes[position]);

                startActivity(intent);
            }
        });
    }

    //Criando uma classe interna inner class
    public class  MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imgFilmes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //Criando as variaveis globais para os componentes
            ImageView imageFilmes;
            TextView txtTitulo, txtAno, txtClassificacao, txtNotas;

            //Instânciando e carregando o modelo ao adaptador
            View view1 = getLayoutInflater().inflate(R.layout.modelo_filmes,null);

            //Declarando o xml para o java

            txtTitulo = view1.findViewById(R.id.txtModeloTitulo);
            txtAno = view1.findViewById(R.id.txtModeloAno);
            txtClassificacao = view1.findViewById(R.id.txtModeloClassificacao);
            txtNotas = view1.findViewById(R.id.txtModeloNotas);
            imageFilmes = view1.findViewById(R.id.imgModeloFilme);

            //Passando os valores para os componentes do modelo
            txtTitulo.setText(titulo[position]);
            txtAno.setText(ano[position]);
            txtClassificacao.setText(classificacao[position]);
            txtNotas.setText(notas[position]);

            imageFilmes.setImageResource(imgFilmes[position]);

            return view1;
        }
    }
}