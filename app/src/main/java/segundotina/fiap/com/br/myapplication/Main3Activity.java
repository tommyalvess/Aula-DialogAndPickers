package segundotina.fiap.com.br.myapplication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void salvar(View v){

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Carregado");
        progressDialog.setMessage("Aguarde");
        progressDialog.show();
    }

}
