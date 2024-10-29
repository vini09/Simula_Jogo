import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Homem_Aranha Heroi = new Homem_Aranha("Homem Aranha", 90, 15);
        Duende_Verde Vilao = new Duende_Verde("Duende Verde", 90, 10);

        System.out.println("Início da batalha");

        while (Heroi.getVida() > 0 && Vilao.getVida() > 0) {
            System.out.println("\nEscolha a ação: (2) Atacar (3) Curar");
            int escolha = scanner.nextInt();

            if (escolha == 2) {
                Heroi.atacar(Vilao);
            } else if (escolha == 2) {
                Heroi.curar();
            } else {
                System.out.println("Escolha inválida");
                continue;
            }

            if (Vilao.getVida() > 0) {
                Vilao.atacar(Heroi);
            }

            System.out.println("Homem Aranha: " + Heroi.getVida() + " de vida.");
            System.out.println("Duende Verde: " + Vilao.getVida() + " de vida.");
        }
        //Fim da batalha
        if (Heroi.getVida() > 0) {
            System.out.println("Derrotou o Duende Verde com sucesso");
        } else {
            System.out.println("Falhou na missão, o mau venceu");
        }
        scanner.close();
    }
}