import java.util.Scanner;

public class Tela {
    private Scanner scanner;

    public Tela() {
        this.scanner = new Scanner(System.in);
    }

    public double pedirAceleracao() {
        System.out.print("Informe a aceleracao: ");
        double a = scanner.nextDouble();
        return a;
    }

    public int pedirTempo() {
        System.out.print("Informe o tempo: ");
        int a = scanner.nextInt();
        return a;
    }
}