package prefereciacorusuario.cursoandroid.com.petcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText UsuarioLogin;
    private  EditText Senha_login;
    private Button  botaoCadastrar;
    private Button botaoLogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsuarioLogin = (EditText) findViewById(R.id.login_UsuarioId);
        Senha_login =(EditText)findViewById(R.id.SenhaloginId);
        botaoCadastrar =(Button)findViewById(R.id.botaoCadastraId);
        botaoLogar = (Button)findViewById(R.id.botaoLogarId);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,CadastroActivity.class));

            }
        });
        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,EscolhaProdutoActivity.class));
            }
        });
    }
}
