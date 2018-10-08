package m3g.com.interfaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;

import Clases.AdapterPers;
import Clases.Estudiante;

import static java.lang.Math.round;

public class Principal extends AppCompatActivity {
    public String nom = "";
    public String cod = "";
    public String mat = "";
    public Double p1 = 0.0;
    public Double p2 = 0.0;
    public Double p3 = 0.0;
    public Double pm = 0.0;
    // public long h;
    //public String k;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        list = new ArrayList<>();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==2){
            //TODO obtenemos datos del intent
            //DecimalFormat fm = new DecimalFormat("#.#");
            nom = data.getStringExtra("nombre");
            cod = data.getStringExtra("codigo");
            mat = data.getStringExtra("materia");
            p1 = Double.parseDouble(data.getStringExtra("parcial1"));
            p2 = Double.parseDouble(data.getStringExtra("parcial2"));
            p3 = Double.parseDouble(data.getStringExtra("parcial3"));

            //TODO hacemos el calculo del promedio y le damos formato
            //h=Math.round(((p1*0.3) + (p2*0.3) + (p3*0.4)),2);
             //pm = ((p1*0.3) + (p2*0.3) + (p3*0.4));
            //k=String.valueOf(h);
            //pm =Double.valueOf(k);

            pm = Double.parseDouble(new DecimalFormat("#.#").format(((p1*0.3) + (p2*0.3) + (p3*0.4))));
            //fm.format(pm);


            //TODO agregamos un elemento a la lista, separado todo por comas
            list.add(nom+","+cod+","+mat+","+pm.toString());

        }
    }

    public void Mostrar(View v){
        //TODO funcion para mostrar lista de estudiantes pasando la lista de agregados por el intent
        Intent lis = new Intent(this,Listaestudiantes.class);
        lis.putStringArrayListExtra("miLista", list);
        startActivity(lis);
    }

    public void onClick(View v){
        //TODO funcion para agregar un nuevo estudiante a la lista
        Intent alu = new Intent(this,Alumno.class);
        startActivityForResult(alu,2);
    }
}
