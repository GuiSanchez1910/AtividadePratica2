public class Volei extends Atleta {

    private int bloqueios;
    private int pontosSaque;
    
    public int getBloqueios() {
        return bloqueios;
    }
    public void setBloqueios(int bloqueios) {
        this.bloqueios = bloqueios;
    }
    public int getPontosSaque() {
        return pontosSaque;
    }
    public void setPontosSaque(int pontosSaque) {
        this.pontosSaque = pontosSaque;
    }
    public Volei() { }

    public Volei(String nome, int idade, String time, int bloqueios, int pontosSaque) {
        super(nome, idade, time);
        this.bloqueios = bloqueios;
        this.pontosSaque = pontosSaque;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de bloqueios: " + bloqueios + "\nQuantidade de pontos de saque: " + pontosSaque;
    }
}
