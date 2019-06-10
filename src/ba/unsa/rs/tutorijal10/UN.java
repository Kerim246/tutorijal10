package ba.unsa.rs.tutorijal10;

import java.util.ArrayList;

public class UN {
    private ArrayList<Drzava> lista = new ArrayList<>();

    public UN() {
    }

    public UN(ArrayList<Drzava> lista) {
        this.lista = lista;
    }

    public ArrayList<Drzava> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Drzava> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "UN{" +
                "lista=" + lista +
                '}';
    }
}
