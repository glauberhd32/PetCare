package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {
    private Button botaoCadastrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        botaoCadastrado =(Button) findViewById(R.id.botaoCadastraPessoa);

        botaoCadastrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CadastroActivity.this,MainActivity.class));
                Toast.makeText(getApplicationContext(),"Cadastrado com sucesso",Toast.LENGTH_LONG).show();

            }
        });


    }
}
