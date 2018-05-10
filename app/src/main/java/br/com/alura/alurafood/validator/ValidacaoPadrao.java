package br.com.alura.alurafood.validator;

import android.support.design.widget.TextInputLayout;
import android.widget.EditText;

public class ValidacaoPadrao {

    private final TextInputLayout textInputCampo;
    private final EditText campo;

    public ValidacaoPadrao(TextInputLayout textInputCampo) {
        this.textInputCampo = textInputCampo;
        this.campo = this.textInputCampo.getEditText();
    }

    private boolean validaCampoObrigatorio() {
        String texto = campo.getText().toString();
        if (texto.isEmpty()) {
            textInputCampo.setError("Campo obrigatório");
            return false;
        }
        return true;
    }

    public boolean estaValido(){
        if(!validaCampoObrigatorio()) return false;
        removeErro();
        return true;
    }

    private void removeErro() {
        textInputCampo.setError(null);
        textInputCampo.setErrorEnabled(false);
    }

}
