public class Sistema {
    
    private static void menu() {
        System.out.println("\n---Menu de atletas ---\n");
        System.out.println("1) Cadastrar atleta de Futebol");
        System.out.println("2) Cadastrar atleta de Vôlei");
        System.out.println("3) Cadastrar atleta de Basquete");
        System.out.println("4) Listar atleta de Futebol");
        System.out.println("5) Listar atleta de Vôlei");
        System.out.println("6) Listar atleta de Basquete");
        System.out.println("7) Listar todos os atletas");
        System.out.println("8) Excluir atleta");
        System.out.println("9) Excluir todos os atletas");
        System.out.println("0) Sair");
        System.out.print("Selecione uma opção: ");
    }

    private static void verificarOpcao(int op) {

        switch (op) {
            case 1:
                cadatrarFutebol();
                break;

            case 2:
                cadastrarVolei();
                break;

            case 3:
                cadastrarBasquete();
                break;

            case 4:
                listarFutebol();
                break;

            case 5:
                listarVolei();
                break;

            case 6:
                listarBasquete();
                break;

            case 7:
                listarAtletas();
                break;

            case 8:
                excluirAtleta();
                break;

            case 9:
                excluirTodosAtletas();
                break;

            case 0:
                System.out.println("Sistema finalizado.");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente");
                break;
        }
    }

    private static void cadatrarFutebol() {

        String nome;
        int idade;
        String time;
        int gols;
        int assists;

        System.out.print("Nome: ");
        nome = Console.lerString();

        System.out.print("Idade: ");
        idade = Console.lerInt();

        System.out.print("Time: ");
        time = Console.lerString();

        System.out.print("Número de gols: ");
        gols = Console.lerInt();

        System.out.print("Número de assistências: ");
        assists = Console.lerInt();

        Atleta temp = new AtletaFutebol(nome, idade, time, gols, assists);

        CadastrarAtleta.cadastrar(temp);

    }

    private static void cadastrarVolei() {

        String nome;
        int idade;
        String time;
        int pontos;
        int bloqueios;

        System.out.print("Nome: ");
        nome = Console.lerString();

        System.out.print("Idade: ");
        idade = Console.lerInt();

        System.out.print("Time: ");
        time = Console.lerString();

        System.out.print("Pontos: ");
        pontos = Console.lerInt();

        System.out.print("Número de bloqueios: ");
        bloqueios = Console.lerInt();

        Atleta temp = new AtletaVolei(nome, idade, time, pontos, bloqueios);

        CadastrarAtleta.cadastrar(temp);

    }

    private static void cadastrarBasquete() {

        String nome;
        int idade;
        String time;
        int ptDois;
        int ptTres;

        System.out.print("Nome: ");
        nome = Console.lerString();

        System.out.print("Idade: ");
        idade = Console.lerInt();

        System.out.print("Time: ");
        time = Console.lerString();

        System.out.print("Cestas de Dois Pontos: ");
        ptDois = Console.lerInt();

        System.out.print("Cestas de Três Pontos: ");
        ptTres = Console.lerInt();

        Atleta temp = new AtletaBasquete(nome, idade, time, ptDois, ptTres);

        CadastrarAtleta.cadastrar(temp);

    }

    private static void listarFutebol() {
        System.out.println("\nAtletas de futebol:");
        if (CadastrarAtleta.getFutebol().isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (Atleta temp: CadastrarAtleta.getFutebol()) {
            System.out.println("");
            System.out.println(temp);
        }
    }

    private static void listarVolei() {
        System.out.println("\nAtletas volei:");

        if (CadastrarAtleta.getVolei().isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (Atleta temp: CadastrarAtleta.getVolei()) {
            System.out.println("");
            System.out.println(temp);
        }
    }

    private static void listarBasquete() {
        System.out.println("\nAtletas de basquete:");

        if (CadastrarAtleta.getBasquete().isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (Atleta temp: CadastrarAtleta.getBasquete()) {
            System.out.println("");
            System.out.println(temp);
        }
    }

    private static void listarAtletas() {
        System.out.println("\nAtletas:");

        if (CadastrarAtleta.getListaAtletas().isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (Atleta temp: CadastrarAtleta.getListaAtletas()) {
            System.out.println();
            System.out.println(temp);
        }
    }

    private static void excluirAtleta() {
        //O ideal seria exluir atleta por ID
        String nome;

        System.out.print("Nome do atleta a excluir: ");
        nome = Console.lerString();

        for (Atleta atleta: CadastrarAtleta.getListaAtletas()) {

            if (CadastrarAtleta.excluir(nome)) {
                System.out.println("Atleta excluído com sucesso!");
                return;
            }

            System.out.println("Atleta não encontrado");

        }
    }

    private static void excluirTodosAtletas() {


        System.out.println("\nExcluir todos os atletas\n");

        if (CadastrarAtleta.excluirTodos()) {
            System.out.println("Todos os atletas foram excluídos.");
            return;
        }
        System.out.println("Não foram encontrados atletas para excluir.");
    }

    public static void executar() {

        int op;
        do {
            Sistema.menu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);

    }
}
