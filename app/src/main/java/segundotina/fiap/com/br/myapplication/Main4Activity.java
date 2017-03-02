package segundotina.fiap.com.br.myapplication;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void salvar(View v){

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int i, int i1, int i2) {

                Toast.makeText(Main4Activity.this, i2 + "/" + i1 + "/" + i, Toast.LENGTH_SHORT).show();

            }
        }, 2017,03,02);
        datePickerDialog.show();

    }
}
