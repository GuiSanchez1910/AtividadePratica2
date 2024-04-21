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
            if(temp instanceof AtletaFutebol) {
                tempListF.add(temp);
            }
        }

        return tempListF;
    }

    public static List<Atleta> getBasquete() {

        List<Atleta> tempListB = new ArrayList<>();

        for (Atleta temp : listaAtletas) {
            if(temp instanceof AtletaBasquete) {
                tempListB.add(temp);
            }
        }

        return tempListB;
    }

    public static List<Atleta> getVolei() {

        List<Atleta> tempListV = new ArrayList<>();

        for (Atleta temp : listaAtletas) {
            if(temp instanceof AtletaVolei) {
                tempListV.add(temp);
            }
        }

        return tempListV;
    }

    public static boolean excluirTodos() {
        if (listaAtletas.isEmpty()) {
            return false;
        }
        listaAtletas.clear();
        return true;
    }

    public static boolean excluir(String nome) {

        for (Atleta temp : listaAtletas) {
            if(temp.getNome().equals(nome)) {
                listaAtletas.remove(temp);
                return true;
            }
        }

        return false;
    }
}
