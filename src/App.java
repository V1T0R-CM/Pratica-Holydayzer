import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Holydayzer holydayzer = new Holydayzer();

        System.out.println("Digite (1) para verificar se a data é um feriado ou digite (2) para ver todos os feriados desse ano:\n");
        Scanner entrada = new Scanner(System.in);
        String resposta = entrada.next();

        if(resposta.equals("1")){
            System.out.println("Digite a data que você deseja verificar:\n");
            Scanner entrada1 = new Scanner(System.in);
            String resposta1 = entrada1.next();
            holydayzer.checkFeriados(resposta1);
        }
        if(resposta.equals("2")){
            holydayzer.getFeriados();
        }
    }
}
