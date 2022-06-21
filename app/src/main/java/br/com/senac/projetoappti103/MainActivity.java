package br.com.senac.projetoappti103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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

    String classificação[] = {"18 anos ou mais","18 anos ou mais","18 anos ou mais",
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
            ImageView imgFilmes;
            TextView txtTitulo, txtAno, txtClassificacao, txtNotas;

            //Instânciando e carregando o modelo ao adaptador
            View view1 = getLayoutInflater().inflate(R.layout.modelo_filmes,null);

            return null;
        }
    }
}