package br.com.senac.projetoappti103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MostrarFilmesActivity extends AppCompatActivity {

    //Declarando as variáveis globais
    ImageView imgFilmes;
    TextView txtTitulo, txtAno, txtClassicacao, txtNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_filmes_layout);

        imgFilmes = findViewById(R.id.imgMostrarFilmes);
        txtTitulo = findViewById(R.id.txtTituloMostrarFilmes);
        txtAno = findViewById(R.id.txtAnoMostraFilmes);
        txtClassicacao = findViewById(R.id.txtClassificacaoMostrarFilmes);
        txtNota = findViewById(R.id.txtNotaMostrarFilmes);

        Intent intent = getIntent();

        String titulo = intent.getStringExtra("titulo");
        String ano = intent.getStringExtra("ano");
        String classificacao = intent.getStringExtra("classificacao");
        String nota = intent.getStringExtra("nota");
        int imagem = intent.getIntExtra("imagemFilme", 0);

        txtTitulo.setText(titulo);
        txtAno.setText(ano);
        txtClassicacao.setText(classificacao);
        txtNota.setText(nota);
        imgFilmes.setImageResource(imagem);

    }
}