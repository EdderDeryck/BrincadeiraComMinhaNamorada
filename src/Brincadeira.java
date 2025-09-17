import java.util.Scanner;

public class Brincadeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("❤️ Oi meu amor! Vamos responder algumas perguntas sérias... fica séria amor ❤️\n");

        String respostaCasamento = "";

        while (!respostaCasamento.equalsIgnoreCase("sim")) {
            System.out.print("💍 Você quer casar no futuro, meu amor? (só pode ser comigo): ");
            respostaCasamento = scanner.nextLine();

           if (respostaCasamento.equalsIgnoreCase("sim")) {
                System.out.println("\nEu sei minha linda! Eu também quero!\n");
            } else {
                System.out.println("\nVai nessa, VOCÊ VAI CASAR COMIGO SIM\uD83D\uDE21, responda novamente\n");
            }
        }

        String respostaDivorcio = "";

        while (!respostaDivorcio.equalsIgnoreCase("não")) {
            System.out.println("Você acha que podemos terminar ou se divorciar? \uD83D\uDE2D");
            respostaDivorcio = scanner.nextLine();

            if (respostaDivorcio.equalsIgnoreCase("não")) {
                System.out.println("Ainda bem que você sabe que somos um só \uD83E\uDD1E\n");
            } else {
                System.out.println("\nVai nessa, NUNCA QUE ISSO VAI ACONTECER\uD83D\uDE21, responda novamente\n");

            }
        }

        String respostaFelicidade = "";

        while (!respostaFelicidade.equalsIgnoreCase("sim")) {
            System.out.println("Você é feliz comigo né meu amor? \uD83D\uDE2D");
            respostaFelicidade = scanner.nextLine();

            if (respostaFelicidade.equalsIgnoreCase("sim")) {
                System.out.println("Sua felicidade é a minha felicidade minha vida \uD83E\uDD1E\n");
            } else {
                System.out.println("\nVai nessa ILUDIDA, responda novamente  \n");

            }
        }
        String respostaCompanheira = "";

        while (!respostaCompanheira.equalsIgnoreCase("sim")){
            System.out.println("Você ficaria comigo na alegria e na tristeza, na saúde e na doença, na riqueza e na pobreza, amando-te, respeitando-te e sendo-te fiel em todos os dias de minha vida, até que a morte nos separe?");
        respostaCompanheira = scanner.nextLine();

        if (respostaCompanheira.equalsIgnoreCase("sim")) {
            System.out.println("Meu amor, eu te amo muitíssimo minha linda❤\uFE0F \n");
        } else {
            System.out.println("VOCÊ ME QUERIA, VOCÊ CONSEGUIU\uD83D\uDE21, responda de novo minha docinho\n");
        }
        }

        System.out.println("Agora, uma pergunta MUITO séria:\n");
        System.out.println("💘 Quem você escolheria para viver ao seu lado?");
        System.out.println("1 - Meu namorado maravilhoso (você não tem outra opção )\n");

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
                System.out.println("\n🤨 Não tem outra opção, você me escolheu porque quis\uD83D\uDE21. Responda de novo!\n");
            }
        }

        System.out.println("Ainda bem que você nem foi forçada \n fim da brincadeira saudável, mas o amor é para sempre! 💑\n");

        System.out.println("\nAgora, escolha uma pergunta bônus para responder:\n");
        System.out.println("1 - Em qual local você preferiria morar comigo?");
        System.out.println("2 - Você largaria a mão de um lanche por mim? (Seja sincera kkkk)");
        System.out.println("3 - O que eu posso fazer para ser o melhor namorado para ti?");
        System.out.println("Caso não queira escolher, aperte qualquer tecla");
        System.out.println("Digite sua escolha: ");
        int perguntaBonus = 0;
        String respostaBonus = "";

        boolean respostaValida = false;

        while (!respostaValida) {
            if (scanner.hasNextInt()) {
                perguntaBonus = scanner.nextInt();
                scanner.nextLine();

                switch (perguntaBonus) {
                    case 1:
                        System.out.print("\n🏡 Em qual local você preferiria morar comigo? Responde aí, amor: ");
                        respostaBonus = scanner.nextLine();
                        System.out.println("Ai que delícia! Vamos pra " + respostaBonus + " então! 😍");
                        respostaValida = true;
                        break;

                    case 2:
                        System.out.print("\n🍔 Você dividiria a última batata frita comigo? (sinceridade kkkk): ");
                        respostaBonus = scanner.nextLine();
                        System.out.println("Resposta registrada: " + respostaBonus + " — Tá anotado hein 😏");
                        respostaValida = true;
                        break;

                    case 3:
                        System.out.print("\n💖 O que eu posso fazer para ser o melhor namorado para ti?: ");
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
