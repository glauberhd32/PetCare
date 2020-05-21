package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicamentoProdutosActivity extends AppCompatActivity {
    private Button botaoVermifugos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento_produtos);

        botaoVermifugos = (Button)findViewById(R.id.botaoVermifugos);


        botaoVermifugos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MedicamentoProdutosActivity.this,VermifugosActivity.class));
            }
        });
    }
}
