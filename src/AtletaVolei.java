public class AtletaVolei extends Atleta {

    private int bloqueios;
    private int pontos;
    
    public int getBloqueios() {
        return bloqueios;
    }
    public void setBloqueios(int bloqueios) {
        this.bloqueios = bloqueios;
    }
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public AtletaVolei() { }

    public AtletaVolei(String nome, int idade, String time, int bloqueios, int pontos) {
        super(nome, idade, time);
        this.bloqueios = bloqueios;
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de bloqueios: " + bloqueios + "\nQuantidade de pontos: " + pontos;
    }
}
