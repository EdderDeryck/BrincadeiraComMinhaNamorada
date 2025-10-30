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
