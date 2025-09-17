import java.util.Scanner;

public class Brincadeira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("❤️ Oi meu amor! Vamos responder algumas perguntas sérias... fica séria amor ❤️\n");

        perguntar(scanner,
                "💍 Você quer casar no futuro, meu amor? (só pode ser comigo): ",
                "sim",
                "\nEu sei minha linda! Eu também quero!\n",
                "\nVai nessa, VOCÊ VAI CASAR COMIGO SIM 😡, responda novamente\n"
        );

        perguntar(scanner,
                "Você acha que podemos terminar ou se divorciar?😢: ",
                "não",
                "Ainda bem que você sabe que somos um só 🤝\n",
                "\nVai nessa, NUNCA QUE ISSO VAI ACONTECER 😡, responda novamente\n"
        );

        perguntar(scanner,
                "Você é feliz comigo né meu amor?😢: ",
                "sim",
                "Sua felicidade é a minha felicidade minha vida 🤝\n",
                "\nVai nessa ILUDIDA, responda novamente\n"
        );

        perguntar(scanner,
                "Você ficaria comigo na alegria e na tristeza, na saúde e na doença, na riqueza e na pobreza, amando-te, respeitando-te e sendo-te fiel em todos os dias de minha vida, até que a morte nos separe?: ",
                "sim",
                "Meu amor, eu te amo muitíssimo minha linda ❤\n",
                "VOCÊ ME QUERIA, VOCÊ CONSEGUIU 😡, responda de novo minha docinho\n"
        );

        perguntarOpcaoUnica(scanner);

        perguntarBonus(scanner);

        scanner.close();
    }

    private static void perguntar(Scanner scanner, String pergunta, String respostaCerta, String msgCerta, String msgErrada) {
        String resposta = "";
        while (!resposta.equalsIgnoreCase(respostaCerta)) {
            System.out.print(pergunta);
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase(respostaCerta)) {
                System.out.println(msgCerta);
            } else {
                System.out.println(msgErrada);
            }
        }
    }

    private static void perguntarOpcaoUnica(Scanner scanner) {
        System.out.println("Agora, uma pergunta MUITO séria:\n");
        System.out.println("💘 Quem você escolheria para viver ao seu lado?");
        System.out.println("1 - Meu namorado maravilhoso (você não tem outra opção)\n");

        int escolha = 0;
        while (escolha != 1) {
            System.out.print("Digite o número da sua escolha: ");
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                escolha = 0;
            }

            if (escolha == 1) {
                System.out.println("\n🎉 Sabia que você ia me escolher! Te amo! ❤️\n");
            } else {
                System.out.println("\n🤨 Não tem outra opção, você me escolheu porque quis 😡. Responda de novo!\n");
            }
        }

        System.out.println("Ainda bem que você nem foi forçada 😏\nFim da brincadeira saudável, mas o amor é para sempre! 💑\n");
    }

    private static void perguntarBonus(Scanner scanner) {
        System.out.println("\nAgora, escolha uma pergunta bônus para responder:\n");
        System.out.println("1 - Em qual local você preferiria morar comigo?");
        System.out.println("2 - Você largaria a mão de um lanche por mim? (Seja sincera kkkk)");
        System.out.println("3 - O que eu posso fazer para ser o melhor namorado para ti?");
        System.out.println("Caso não queira escolher, aperte qualquer tecla");

        boolean respostaValida = false;

        while (!respostaValida) {
            System.out.print("Digite sua escolha: ");
            if (scanner.hasNextInt()) {
                int perguntaBonus = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
                switch (perguntaBonus) {
                    case 1:
                        System.out.print("\n🏡 Em qual local você preferiria morar comigo? Responde aí, amor: ");
                        String resposta1 = scanner.nextLine();
                        System.out.println("Ai que delícia! Vamos pra " + resposta1 + " então! 😍");
                        respostaValida = true;
                        break;

                    case 2:
                        System.out.print("\n🍔 Você dividiria a última batata frita comigo? (sinceridade kkkk): ");
                        String resposta2 = scanner.nextLine();
                        System.out.println("Resposta registrada: " + resposta2 + " — Tá anotado hein 😏");
                        respostaValida = true;
                        break;

                    case 3:
                        System.out.print("\n💖 O que eu posso fazer para ser o melhor namorado para ti?: ");
                        String resposta3 = scanner.nextLine();
                        System.out.println("Anotado baby, te amo ❤️");
                        respostaValida = true;
                        break;

                    default:
                        System.out.println("\nApertou na opção errada meu bem, tenta de novo");
                }
            } else {
                scanner.nextLine();
                System.out.println("\nEu te amo meu amor, me dê um beijo agora 😘");
                respostaValida = true;
            }
        }
    }
}
