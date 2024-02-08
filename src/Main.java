import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro da escola!");
        System.out.print("Digite o nome da escola: ");
        String nomeEscola = input.nextLine();
        System.out.print("Digite o endereço da escola: ");
        String endereco = input.nextLine();
        System.out.print("Digite o telefone da escola: ");
        String telefone = input.nextLine();
        System.out.print("Digite o número de alunos da escola: ");
        int numAlunos = input.nextInt();

        System.out.println("\n--- Dados da escola ---");
        System.out.println("Nome: " + nomeEscola);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Número de alunos: " + numAlunos);
    }
}
