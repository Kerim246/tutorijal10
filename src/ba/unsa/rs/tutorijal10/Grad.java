package ba.unsa.rs.tutorijal10;

import java.util.Arrays;

public class Grad {

    private String naziv;
    private int broj_stanovnika;

    double [] niz = new double[1000];


    public Grad(String naziv, double[] mjerenja, int j) {

    }

    public Grad(String naziv, int broj_stanovnika, double[] niz) {
        this.naziv = naziv;
        this.broj_stanovnika = broj_stanovnika;
        this.niz = niz;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public double[] getNiz() {
        return niz;
    }

    public void setNiz(double[] niz) {
        this.niz = niz;
    }

    @Override
    public String toString() {
        return "Grad{" +
                "naziv='" + naziv + '\'' +
                ", broj_stanovnika=" + broj_stanovnika +
                ", niz=" + Arrays.toString(niz) +
                '}';
    }
}
