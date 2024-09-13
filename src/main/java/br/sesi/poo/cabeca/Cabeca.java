package br.sesi.poo.cabeca;

public class Cabeca {
    public Olho olho;
    public Orelha orelhao;
    public Nariz nariz;
    public Boca boca;

    public Cabeca(){
        this.olho = new Olho();
        this.orelhao = new Orelha();
        this.nariz = new Nariz();
        this.boca = new Boca();
    }
}
