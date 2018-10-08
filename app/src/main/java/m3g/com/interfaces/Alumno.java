package m3g.com.interfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Alumno extends AppCompatActivity {
    public  EditText nombrex;
    public EditText codigox;
    public EditText materiax;
    public EditText parcial1x;
    public EditText parcial2x;
    public EditText parcial3x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);
        nombrex = findViewById(R.id.txtnombre);
        codigox = findViewById(R.id.txtcodigo);
        materiax = findViewById(R.id.txtmateria);
        parcial1x = findViewById(R.id.txtparcial1);
        parcial2x = findViewById(R.id.txtparcial2);
        parcial3x = findViewById(R.id.txtparcial3);

    }

    public void onClick(View v){
        String n = nombrex.getText().toString();
        String c = codigox.getText().toString();
        String m = materiax.getText().toString();
        String p1 = parcial1x.getText().toString();
        String p2 = parcial2x.getText().toString();
        String p3 = parcial3x.getText().toString();

        Intent datosx = new Intent();
        datosx.putExtra("nombre",n);
        datosx.putExtra("codigo",c);
        datosx.putExtra("materia",m);
        datosx.putExtra("parcial1",p1);
        datosx.putExtra("parcial2",p2);
        datosx.putExtra("parcial3",p3);
        setResult(2,datosx);
        finish();
    }
}
