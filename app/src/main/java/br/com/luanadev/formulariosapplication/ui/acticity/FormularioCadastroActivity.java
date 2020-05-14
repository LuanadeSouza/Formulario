package br.com.luanadev.formulariosapplication.ui.acticity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

import br.com.luanadev.formulariosapplication.R;

public class FormularioCadastroActivity extends AppCompatActivity {

    private TextInputLayout textNome;
    private TextInputLayout textCpf;
    private TextInputLayout textTelefone;
    private TextInputLayout textEmail;
    private TextInputLayout textSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cadastro);

        initView();

        EditText campoNome = textNome.getEditText();
        validaCampo(campoNome);
        EditText campoCPF = textCpf.getEditText();
        validaCampo(campoCPF);
        EditText campoTelefone = textTelefone.getEditText();
        validaCampo(campoTelefone);
        EditText campoEmail = textEmail.getEditText();
        validaCampo(campoEmail);
        EditText campoSenha= textSenha.getEditText();
        validaCampo(campoSenha);


    }

    private void validaCampo(final EditText campo) {
        campo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String texto = campo.getText().toString();
                if (texto.isEmpty()) {
                    campo.setError("Campo Obrigatorio");
                }
            }
        });
    }

    private void initView() {
        textNome = findViewById(R.id.text_nome_completo);
        textCpf = findViewById(R.id.text_cpf);
        textTelefone = findViewById(R.id.text_telefone);
        textEmail = findViewById(R.id.text_email);
        textSenha = findViewById(R.id.text_senha);
    }
}
