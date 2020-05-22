package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcessorioActivity extends AppCompatActivity {
    private Button botaoComedouro_Bebedouro;
    private Button botaoBrinquedo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acessorio);

        botaoComedouro_Bebedouro = (Button)findViewById(R.id.botaoBedouroComedouro);
        botaoBrinquedo = (Button)findViewById(R.id.botaoBrinquedoId);

        botaoComedouro_Bebedouro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AcessorioActivity.this,BebedouroEcomedouroActivity.class));
            }
        });
        botaoBrinquedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AcessorioActivity.this,BrinquedoActivity.class));
            }
        });
    }
}
