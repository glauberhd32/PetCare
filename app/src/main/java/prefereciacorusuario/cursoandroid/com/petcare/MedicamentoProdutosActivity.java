package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicamentoProdutosActivity extends AppCompatActivity {
    private Button botaoVermifugos;
    private Button botaoAnti_pulga;
    private  Button botaoAntibiotico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento_produtos);

        botaoVermifugos = (Button)findViewById(R.id.botaoVermifugos);
        botaoAnti_pulga = (Button)findViewById(R.id.botaoCarrapatoEpulga);
        botaoAntibiotico =(Button)findViewById(R.id.botaoAntibiotico);

        botaoVermifugos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MedicamentoProdutosActivity.this,VermifugosActivity.class));


            }
        });
        botaoAnti_pulga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MedicamentoProdutosActivity.this,PulgaCarrapatoActivity.class));
            }
        });
        botaoAntibiotico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MedicamentoProdutosActivity.this,AntibioticoActivity.class));
                
            }
        });
    }
}
