import java.util.Scanner;

public class Brincadeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("❤️ Oi meu amor! Vamos responder algumas perguntas sérias... fica séria amor ❤️\n");
        String respostaCasamento = "";

        while(!respostaCasamento.equalsIgnoreCase("sim")) {
            System.out.print("\ud83d\udc8d Você quer casar no futuro, meu amor? (só pode ser comigo): ");
            respostaCasamento = scanner.nextLine();
            if (respostaCasamento.equalsIgnoreCase("sim")) {
                System.out.println("Eu sei minha linda! Eu também quero!\n");
            } else {
                System.out.println("\nVai nessa, você vai casar comigo sim, responda novamente\n");
            }
        }

        System.out.println("Agora, uma pergunta MUITO séria:\n");
        System.out.println("\ud83d\udc98 Quem você escolheria para viver ao seu lado?");
        System.out.println("1 - Meu namorado maravilhoso (você não tem outra opção )\n");
        int escolha = 0;

        while(escolha != 1) {
            System.out.print("Digite o número da sua escolha: ");
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                escolha = 0;
            }

            if (escolha == 1) {
                System.out.println("\n\ud83c\udf89 Sabia que você ia me escolher! Te amo! ❤️\n");
            } else {
                System.out.println("\n\ud83e\udd28 Não tem outra opção, você me escolheu porque quis. Responda de novo!\n");
            }
        }

        System.out.println("Ainda bem que você nem foi forçada \n fim da brincadeira saudável, mas o amor é para sempre! \ud83d\udc91\n");
        System.out.println("\nAgora, escolha uma pergunta bônus para responder:\n");
        System.out.println("1 - Em qual local você preferiria morar comigo?");
        System.out.println("2 - Você largaria a mão de um lanche por mim? (Seja sincera kkkk)");
        System.out.println("3 - O que eu posso fazer para ser o melhor namorado para ti?");
        System.out.println("Caso não queira escolher, aperte qualquer tecla");
        System.out.println("Digite sua escolha: ");
        int perguntaBonus = 0;
        String respostaBonus = "";
        boolean respostaValida = false;

        while(!respostaValida) {
            if (scanner.hasNextInt()) {
                perguntaBonus = scanner.nextInt();
                scanner.nextLine();
                switch (perguntaBonus) {
                    case 1:
                        System.out.print("\n\ud83c\udfe1 Em qual local você preferiria morar comigo? Responde aí, amor: ");
                        respostaBonus = scanner.nextLine();
                        System.out.println("Ai que delícia! Vamos pra " + respostaBonus + " então! \ud83d\ude0d");
                        respostaValida = true;
                        break;
                    case 2:
                        System.out.print("\n\ud83c\udf54 Você dividiria a última batata frita comigo? (sinceridade kkkk): ");
                        respostaBonus = scanner.nextLine();
                        System.out.println("Resposta registrada: " + respostaBonus + " — Tá anotado hein \ud83d\ude0f");
                        respostaValida = true;
                        break;
                    case 3:
                        System.out.print("\n\ud83d\udc96 O que eu posso fazer para ser o melhor namorado para ti?: ");
                        respostaBonus = scanner.nextLine();
                        System.out.println("Anotado baby, te amo ❤️");
                        respostaValida = true;
                        break;
                    default:
                        System.out.println("\nApertou na opção errada meu bem, tenta de novo");
                }
            } else {
                scanner.nextLine();
                System.out.println("\n Eu te amo meu amor, me dê um beijo agora");
            }
        }

        scanner.close();
    }
}
