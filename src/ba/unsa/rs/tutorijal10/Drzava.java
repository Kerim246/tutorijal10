package ba.unsa.rs.tutorijal10;

public class Drzava {
    private String naziv,jedinica;
    private int broj_stanovnika;
    private double povrsina;
    private Grad glavni_grad;

    public Drzava() {
    }

    public Drzava(String naziv, String jedinica, int broj_stanovnika, double povrsina, Grad glavni_grad) {
        this.naziv = naziv;
        this.jedinica = jedinica;
        this.broj_stanovnika = broj_stanovnika;
        this.povrsina = povrsina;
        this.glavni_grad = glavni_grad;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getJedinica() {
        return jedinica;
    }

    public void setJedinica(String jedinica) {
        this.jedinica = jedinica;
    }

    public int getBroj_stanovnika() {
        return broj_stanovnika;
    }

    public void setBroj_stanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(double povrsina) {
        this.povrsina = povrsina;
    }

    public Grad getGlavni_grad() {
        return glavni_grad;
    }

    public void setGlavni_grad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }

    @Override
    public String toString() {
        return "Drzava{" +
                "naziv='" + naziv + '\'' +
                ", jedinica='" + jedinica + '\'' +
                ", broj_stanovnika=" + broj_stanovnika +
                ", povrsina=" + povrsina +
                ", glavni_grad=" + glavni_grad +
                '}';
    }
}
