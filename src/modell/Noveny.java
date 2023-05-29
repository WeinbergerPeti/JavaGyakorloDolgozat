package modell;

import java.io.Serializable;

public class Noveny implements Serializable
{
    private String id;
    private int ar;
    private String nev;
    private int kor;

    public Noveny(String id, int ar, String nev, int kor) 
    {
        this.id = id;
        this.ar = ar;
        this.nev = nev;
        this.kor = kor;
    }

    public String getId() {
        return id;
    }

    public int getAr() {
        return ar;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Noveny{" + "id=" + id + ", ar=" + ar + ", nev=" + nev + ", kor=" + kor + '}';
    }
}
