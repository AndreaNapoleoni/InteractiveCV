import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nomeCategoria;
    private ArrayList<Struttura> strutture = new ArrayList<>();

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public List<Struttura> getStruttura() {
        return strutture;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public void setStruttura(ArrayList<Struttura> oggetto) {
        this.strutture = oggetto;
    }

    public void addStruttura(Struttura elemento){
        if(!this.strutture.contains(elemento)){
            this.strutture.add(elemento);
        }
    }

    public void removeStruttura(Struttura elemento){
        if(this.strutture.contains(elemento)){
            this.strutture.remove(elemento);
        }
    }

    public Categoria() {
    }

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria(String nomeCategoria, ArrayList<Struttura> strutture) {
        this.nomeCategoria = nomeCategoria;
        this.strutture = strutture;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nomeCategoria='" + nomeCategoria + '\'' +
                ", strutture=" + strutture +
                '}';
    }
}
