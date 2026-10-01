import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Programa para calcular a média de 5 alunos.");
        System.out.println("O programa receberá as notas, calculará as médias");
        System.out.println("e informará se cada aluno foi aprovado, reprovado ou está de recuperação.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa para calcular a média de alunos.");
        System.out.println("Digite as notas do aluno:");

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = sc.nextDouble();

        System.out.close();

    }
}
