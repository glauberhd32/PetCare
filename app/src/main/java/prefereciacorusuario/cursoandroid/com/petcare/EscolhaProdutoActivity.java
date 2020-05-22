package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscolhaProdutoActivity extends AppCompatActivity {
    private Button botaoRacao;
    private Button botaoMedicamento;
    private Button botaoAcessorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_produto);

        botaoRacao = (Button)findViewById(R.id.botaoRacaId);
        botaoMedicamento =(Button)findViewById(R.id.botaoMedicamentoId);
        botaoAcessorio= (Button)findViewById(R.id.botaoAcessorioId);

        botaoRacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EscolhaProdutoActivity.this,RacaoActivity.class));
            }
        });
        botaoMedicamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EscolhaProdutoActivity.this,MedicamentoProdutosActivity.class));
            }
        });

        botaoAcessorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EscolhaProdutoActivity.this,AcessorioActivity.class));
            }
        });
    }
}
