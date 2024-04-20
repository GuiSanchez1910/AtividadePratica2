public class Sistema {
    
    private static void menu() {
        System.out.println("1) Cadastrar atleta de Futebol:");
        System.out.println("2) Cadastrar atleta de Vôlei:");
        System.out.println("3) Cadastrar atleta de Basquete:");
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
                
            break;
        
            default:
            break;
        }
    }

    public static void executar() {

        int op;

        Sistema.menu();
        op = Console.lerInt();
    }
}
