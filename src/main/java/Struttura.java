import java.util.ArrayList;
import java.util.List;

public class Struttura {
    private String Titolo = "";
    private String Sottotitolo = "";
    private ArrayList<String> elementi = new ArrayList<String>();

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public String getSottotitolo() {
        return Sottotitolo;
    }

    public void setSottotitolo(String sottotitolo) {
        Sottotitolo = sottotitolo;
    }

    public List<String> getElementi() {
        return elementi;
    }

    public void setElementi(ArrayList<String> elementi) {
        this.elementi = elementi;
    }

    public void addElement(String elemento) {
        if (!this.elementi.contains(elemento)) {
            this.elementi.add(elemento);
        }
    }

    public void removeElement(String elemento) {
        if (this.elementi.contains(elemento)) {
            this.elementi.remove(elemento);
        }
    }

    public Struttura() {
    }

    public Struttura(String titolo, String sottotitolo) {
        Titolo = titolo;
        Sottotitolo = sottotitolo;
    }

    @Override
    public String toString() {
        return Sottotitolo.length() == 0 ? "Struttura{" + "Titolo='" + Titolo + ", elementi=" + elementi + "}" :
                "Struttura{" +
                        "Titolo='" + Titolo + '\'' +
                        ", Sottotitolo='" + Sottotitolo + '\'' +
                        ", elementi=" + elementi +
                        '}';
    }
}
