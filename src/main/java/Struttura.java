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

    public Struttura(String titolo, ArrayList<String> elementi) {
        Titolo = titolo;
        this.elementi = elementi;
    }

    public void removeElement(String elemento) {
        if (this.elementi.contains(elemento)) {
            this.elementi.remove(elemento);
        }
    }

    public Struttura(String titolo, String sottotitolo, ArrayList<String> elementi) {
        Titolo = titolo;
        Sottotitolo = sottotitolo;
        this.elementi = elementi;
    }

    public Struttura() {
    }

    public Struttura(String titolo, String sottotitolo) {
        Titolo = titolo;
        Sottotitolo = sottotitolo;
    }

    public Struttura(String titolo) {
        Titolo = titolo;
    }

    public String prettyList(){
        String tmp = "\n";
        for(String s : elementi){
            tmp+=String.format("\t- %s \n",s);
        }
        return tmp;
    }

    @Override
    public String toString() {
        String tmp = "\n";

        if(this.getTitolo().length()>0){
            tmp+=getTitolo()+"\n";
        }
        if(this.getSottotitolo().length()>0){
            tmp+=getSottotitolo()+"\n";
        }
        if(this.getElementi().size()>0){
            tmp+=prettyList();
        }

        return tmp;

    }
}
