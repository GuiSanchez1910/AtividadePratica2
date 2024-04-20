import java.util.ArrayList;
import java.util.List;

public class CadastrarAtleta {
    
    private static List<Atleta> listaAtletas = new ArrayList<>();

    public static void cadastrar(Atleta atl) {
        listaAtletas.add(atl);
    }

    public static List<Atleta> getListaAtletas(){
        return listaAtletas;
    }

    public static List<Atleta> getFutebol() {

        List<Atleta> tempListF = new ArrayList<>();

        for (Atleta temp : listaAtletas) {
            if(temp instanceof Futebol) {
                tempListF.add(temp);
            }
        }

        return tempListF;
    }

    public static List<Atleta> getBasquete() {

        List<Atleta> tempListB = new ArrayList<>();

        for (Atleta temp : tempListB) {
            if(temp instanceof Basquete) {
                tempListB.add(temp);
            }
        }

        return listaAtletas;
    }

    public static List<Atleta> getVolei() {

        List<Atleta> tempListV = new ArrayList<>();

        for (Atleta temp : tempListV) {
            if(temp instanceof Volei) {
                tempListV.add(temp);
            }
        }

        return tempListV;
    }

    public static boolean excluir(String nome) {

        for (Atleta temp : listaAtletas) {
            if(temp.getNome() == nome) {
                listaAtletas.remove(temp);
                return true;
            }
        }

        return false;
    }
}
