public class AtletaBasquete extends Atleta{

    private int pontosDeTres;
    private int pontosDeDois;
    
    public int getPontosDeTres() {
        return pontosDeTres;
    }
    public void setPontosDeTres(int pontosDeTres) {
        this.pontosDeTres = pontosDeTres;
    }
    public int getPontosDeDois() {
        return pontosDeDois;
    }
    public void setPontosDeDois(int pontosDeDois) {
        this.pontosDeDois = pontosDeDois;
    }
    
    public AtletaBasquete() { }
    
    public AtletaBasquete(String nome, int idade, String time, int pontosDeTres, int pontosDeDois) {
        super(nome, idade, time);
        this.pontosDeTres = pontosDeTres;
        this.pontosDeDois = pontosDeDois;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de cestas de 3 pontos: " + pontosDeTres + "\nQuantidade de cestas de 2 pontos: " + pontosDeDois;
    }    
}
