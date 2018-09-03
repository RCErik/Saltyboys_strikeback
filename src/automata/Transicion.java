package automata;
/**
 *
 * @author Charly
 */
public class Transicion {
    protected char simbolo;
    protected Estado destino;
    
    public Transicion(char simbolo, Estado destino){
        this.simbolo = simbolo;
        this.destino = destino;
    }

    public Transicion(Estado destino){
        this.simbolo = '☼'; //Caracter no imprimible, sale con Alt + 15
        this.destino = destino;
    }
    
    public Transicion(){
        this.simbolo = ' ';
    }

    public char getSimbolo() {
        return simbolo;
    }

    public Estado getDestino() {
        return destino;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setDestino(Estado destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "{" + "simbolo=" + simbolo + ", destino=" + destino + '}';
    }

    
    
    
}
