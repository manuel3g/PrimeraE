package m3g.com.interfaces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Clases.AdapterPers;
import Clases.Estudiante;

public class Listaestudiantes extends AppCompatActivity {
    private List<Estudiante> list;
    private AdapterPers adapter;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaestudiantes);

        list = new ArrayList<Estudiante>();
        lista = findViewById(R.id.listaz);
        adapter = new AdapterPers(this, R.layout.customs, this.list);
        lista.setAdapter(adapter);

        //TODO recibimos el intent de la lista y con un foreach lo partimos para asignarlos por separado
        String[] separador;
        ArrayList<String> lix = (ArrayList<String>) getIntent().getStringArrayListExtra("miLista");
        for (String item:lix) {
            separador = item.split(",");
            Estudiante est = new Estudiante();
            est.setNombre(separador[0]);
            est.setCodigo(separador[1]);
            est.setMateria(separador[2]);
            est.setPromedio(Double.valueOf(separador[3]));
            list.add(est);
        }

    }
}
