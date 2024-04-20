public class Futebol extends Atleta {

    private int gols;
    private int asssistencias;
    
    public int getGols() {
        return gols;
    }
    public void setGols(int gols) {
        this.gols = gols;
    }
    public int getAsssistencias() {
        return asssistencias;
    }
    public void setAsssistencias(int asssistencias) {
        this.asssistencias = asssistencias;
    }
    
    public Futebol() { }

    public Futebol(String nome, int idade, String time, int gols, int asssistencias) {
        super(nome, idade, time);
        this.gols = gols;
        this.asssistencias = asssistencias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de gols: " + gols + "\nQuantidade de assistências: " + asssistencias;
    }
}
