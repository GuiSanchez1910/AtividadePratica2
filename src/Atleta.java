public class Atleta {
    
    private String nome;
    private int idade;
    private String time;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    
    public Atleta() { }
    
    public Atleta(String nome, int idade, String time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }
             
    @Override
    public String toString() {
        String txt = "Nome: " + nome + "\nIdade: " + idade + "\nTime: " + time;
        return txt;
    }
}
