package Clases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import m3g.com.interfaces.R;

public class AdapterPers extends BaseAdapter {
    private Context cntxt;
    private List<Estudiante> ListaE;
    private int Plantilla;

    public AdapterPers(Context context, int Layout, List<Estudiante> Lista){
        this.cntxt = context;
        this.Plantilla = Layout;
        this.ListaE = Lista;
    }

    @Override
    public int getCount() {
        return this.ListaE.size();
    }

    @Override
    public Object getItem(int i) {
        return this.ListaE.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            LayoutInflater adminLayout = (LayoutInflater) this.cntxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = adminLayout.inflate(this.Plantilla, null);
            Estudiante EActual = this.ListaE.get(i);
            TextView numero = view.findViewById(R.id.numz);
            TextView nombre = view.findViewById(R.id.nombrez);
            TextView codigo = view.findViewById(R.id.codigoz);
            TextView materia = view.findViewById(R.id.materiaz);
            TextView nota = view.findViewById(R.id.notaz);
            numero.setText(String.valueOf(i+1));
            nombre.setText(EActual.getNombre());
            codigo.setText(EActual.getCodigo());
            materia.setText(EActual.getMateria());
            nota.setText(EActual.getPromedio().toString());
        }
        return view;
    }
}
