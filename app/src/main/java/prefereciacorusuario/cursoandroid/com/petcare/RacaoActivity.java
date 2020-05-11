package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RacaoActivity extends AppCompatActivity {
   private  Button racaoDEPeixe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_racao);

        racaoDEPeixe = (Button)findViewById(R.id.botao_racao_peixe);

        racaoDEPeixe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RacaoActivity.this,RacaoPeixeActivity.class));

            }
        });
    }
}
