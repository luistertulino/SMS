import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sequência de teclas do celular:");
        String sequencia = sc.nextLine();
        String mensagem = "";

        int i = 0;
        while (i < sequencia.length()) {
            int count = 1;

            while (i+1 < sequencia.length() && 
                sequencia.charAt(i) == sequencia.charAt(i+1))
            {
                i++;
                count++;
            }

            switch (sequencia.charAt(i)) {
                case '1':
                    break;
                case '2':
                    if (count == 1) mensagem += "A";
                    else if (count == 2) mensagem += "B";
                    else if (count == 3) mensagem += "C";
                    break;
                case '3':
                    if (count == 1) mensagem += "D";
                    else if (count == 2) mensagem += "E";
                    else if (count == 3) mensagem += "F";
                    break;
                case '4':
                    if (count == 1) mensagem += "G";
                    else if (count == 2) mensagem += "H";
                    else if (count == 3) mensagem += "I";
                    break;
                case '5':
                    if (count == 1) mensagem += "J";
                    else if (count == 2) mensagem += "K";
                    else if (count == 3) mensagem += "L";
                    break;
                case '6':
                    if (count == 1) mensagem += "M";
                    else if (count == 2) mensagem += "N";
                    else if (count == 3) mensagem += "O";
                    break;
                case '7':
                    if (count == 1) mensagem += "P";
                    else if (count == 2) mensagem += "Q";
                    else if (count == 3) mensagem += "R";
                    else if (count == 4) mensagem += "S";
                    break;
                case '8':
                    if (count == 1) mensagem += "T";
                    else if (count == 2) mensagem += "U";
                    else if (count == 3) mensagem += "V";
                    break;
                case '9':
                    if (count == 1) mensagem += "W";
                    else if (count == 2) mensagem += "X";
                    else if (count == 3) mensagem += "Y";
                    else if (count == 3) mensagem += "Z";
                    break;
                case '0':
                    mensagem += " ".repeat(count);
                    break;
            
                default:
                    System.out.println("Tecla " + sequencia.charAt(i) + " inválida ou não produz letra.");
                    break;
            }
            i++;
        }

        System.out.println("Mensagem: " + mensagem);
    }
}
