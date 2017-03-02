package segundotina.fiap.com.br.myapplication;

import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actPaises;
    String[] paises = new String[]{"Argentina", "Brasil", "Dinamarca", "Escócia"};


    DatePicker dtpAniversario;
    TimePicker tmpHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dtpAniversario = (DatePicker)findViewById(R.id.dpAniversario);

        tmpHorario = (TimePicker)findViewById(R.id.tmpHorario);

        actPaises = (AutoCompleteTextView)findViewById(R.id.actPaises);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, paises);
        actPaises.setAdapter(adapter);

          }

            public void salvar(View v){

                int year = dtpAniversario.getYear();
                int month = dtpAniversario.getMonth();
                int day =  dtpAniversario.getDayOfMonth();


                //Calendar calendario = new GregorianCalendar(year,month,day);
                //calendario.getTimeInMillis();

                //Builder é usado para set quando precisar

                AlertDialog.Builder dialog = new AlertDialog.Builder(this);

                dialog.setTitle(getString(R.string.data_escolhida));
                dialog.setMessage(day + "/" + month + "/" + year);
                dialog.show();


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                    int hour = tmpHorario.getHour();
                    int minute = tmpHorario.getMinute();
                }




            }
}
