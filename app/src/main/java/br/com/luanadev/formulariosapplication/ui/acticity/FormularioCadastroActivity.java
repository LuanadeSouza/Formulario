package br.com.luanadev.formulariosapplication.ui.acticity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

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

        validaCampo(textNome);
        validaCampo(textCpf);
        validaCampo(textTelefone);
        validaCampo(textTelefone);
        validaCampo(textSenha);


    }

    private void validaCampo(final TextInputLayout textCampo){
        final EditText campo = textCampo.getEditText();
        campo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                String texto = campo.getText().toString();
                if (!hasFocus && texto.isEmpty()) {
                    textCampo.setError("Campo Obrigatorio");
                }else {
                    textCampo.setError(null);
                    textCampo.setErrorEnabled(false);
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
