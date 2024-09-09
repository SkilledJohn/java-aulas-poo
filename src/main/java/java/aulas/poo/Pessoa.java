package java.aulas.poo;


import java.aulas.poo.cabeça.Cabeca;
import java.aulas.poo.inferior.MembrosInferiores;
import java.aulas.poo.tronco.Tronco;

public class Pessoa {
    public Cabeca cabeca;
    public MembrosInferiores inferior;
    public Tronco tronco;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();

    }
}
