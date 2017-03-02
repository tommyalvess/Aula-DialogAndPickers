package segundotina.fiap.com.br.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void salvar(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.titulo);
        builder.setMessage(R.string.msg);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setCancelable(false);

        //builder.setNeutralButton(R.string.fechar, null);

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {


                Toast.makeText(Main2Activity.this, getString(R.string.clicou_ok),Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton(R.string.fecha, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                Toast.makeText(Main2Activity.this, getString(R.string.cliclou_em_fechar), Toast.LENGTH_SHORT).show();

            }
        });
        builder.show();



    }
}
