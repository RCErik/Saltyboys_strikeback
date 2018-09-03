package automata;

import java.util.ArrayList;


public class Estado {
    protected int id;
    protected boolean esFinal;
    protected ArrayList<Transicion> transiciones;

    public Estado(int id, boolean esFinal, ArrayList<Transicion> transiciones) {
        this.id = id;
        this.esFinal = esFinal;
        this.transiciones = transiciones;
    }
    
    public Estado() {
        this.id = -1;
        this.esFinal = false;
        this.transiciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public boolean isEsFinal() {
        return esFinal;
    }

    public ArrayList<Transicion> getTransiciones() {
        return transiciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEsFinal(boolean esFinal) {
        this.esFinal = esFinal;
    }

    public void setTransiciones(ArrayList<Transicion> transiciones) {
        this.transiciones = transiciones;
    }
    
    public int tieneTransicionCon (char s){
        int aux = -1;
        for(Transicion t : this.transiciones){
            if(t.simbolo == s)
                aux = t.destino.getId();
        }
        return aux;
    }

    @Override
    public String toString() {
        return "{" + id + '}';
    }
    
}
