package br.com.bbatistadaniel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        TextLoader.clearConsole();
        TextLoader.showDialogue("Você acorda em uma sala escura e fria. Não há janelas, apenas a sensação opressiva de algo observando nas sombras...\n", 50);

        TextLoader.showDialogue("\nHá duas portas diante de você. Uma à esquerda, entreaberta, e outra à direita, fechada e trancada. O que você faz?\n", 50);
        TextLoader.showDialogue("1. Entrar pela porta à esquerda\n", 50);
        TextLoader.showDialogue("2. Tentar abrir a porta à direita\n", 50);
        TextLoader.showDialogue("Escolha (1 ou 2): ", 50);

        String escolha1 = scanner.nextLine();

        if (escolha1.equals("1")) {
            TextLoader.clearConsole();
            TextLoader.showDialogue("Você decide entrar pela porta à esquerda. Ela range enquanto você empurra, revelando um corredor longo e escuro...\n", 50);
            TextLoader.showDialogue("Você sente uma presença atrás de você, como se as sombras estivessem te observando.\n", 50);
        } else if (escolha1.equals("2")) {
            TextLoader.clearConsole();
            TextLoader.showDialogue("Você tenta abrir a porta à direita, mas ela está trancada. De repente, você ouve um sussurro vindo da escuridão atrás de você...\n", 50);
            TextLoader.showDialogue("As sombras ao seu redor parecem se mover, ficando mais densas e próximas. Você sente que algo está prestes a acontecer.\n", 50);
        } else {
            TextLoader.showDialogue("Escolha inválida. As sombras se aproximam, e você congela de medo...\n", 50);
            gameRunning = false;
        }

        if (gameRunning) {
            TextLoader.showDialogue("\nDiante de você, uma figura se materializa nas sombras, seus olhos brilhando em um vermelho intenso. O que você faz?\n", 50);
            TextLoader.showDialogue("1. Correr de volta para onde veio\n", 50);
            TextLoader.showDialogue("2. Enfrentar a figura sombria\n", 50);
            TextLoader.showDialogue("Escolha (1 ou 2): ", 50);

            String escolha2 = scanner.nextLine();

            if (escolha2.equals("1")) {
                TextLoader.clearConsole();
                TextLoader.showDialogue("Você tenta correr, mas as sombras à sua volta se fecham rapidamente. A figura sombria ri baixinho enquanto você sente o mundo desaparecer...\n", 50);
                TextLoader.showDialogue("Você foi consumido pelas sombras.\n", 50);
            } else if (escolha2.equals("2")) {
                TextLoader.clearConsole();
                TextLoader.showDialogue("Você decide enfrentar a figura sombria. Com coragem, você dá um passo à frente...\n", 50);
                TextLoader.showDialogue("A figura sorri, revelando fileiras de dentes afiados. Mas algo dentro de você brilha, dissipando as sombras ao seu redor. A figura grita enquanto desaparece na escuridão.\n", 50);
                TextLoader.showDialogue("Você sobreviveu... desta vez.\n", 50);
            } else {
                TextLoader.showDialogue("Escolha inválida. As sombras se apoderam de você, e a escuridão te engole.\n", 50);
            }
        }

        TextLoader.showDialogue("\nFim da história. Obrigado por jogar!\n", 50);

        System.out.println("Aperte enter para fechar o programa.\n");
        scanner.next();
        System.exit(0);
    }
}
