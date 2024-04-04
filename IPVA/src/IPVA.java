import javax.swing.JOptionPane;

public class IPVA {

    public static void main(String[] args) {
        int placa;  //variável que lê final das placas
        String convert; //variável que converte o número da placa

            JOptionPane.showMessageDialog(null, "DESPACHANTE VALE CARD - IPTU");
            convert = JOptionPane.showInputDialog(null, "Digite o final da sua placa: "); //entrada

            try { 
                placa = Integer.parseInt(convert); //lê se a entrada é do tipo inteiro
                switch (placa) { //inicia a leitura
                    case 1:
                        convert = "30/04";
                        break;
                    case 2:
                        convert = "31/05";
                        break;
                    case 3:
                        convert = "30/06";
                        break;
                    case 4:
                        convert = "31/07";
                        break;
                    case 5:
                        convert = "31/08";
                        break;
                    case 6:
                        convert = "30/09";
                        break;
                    case 7:
                        convert = "31/10";
                        break;
                    case 8:
                        convert = "30/11";
                        break;
                    case 9, 0:
                        convert = "31/12";
                        break;
                    default:
                        convert = "Opção Inválida!"; 
                        break;

            }
            if ((placa >=0) && (placa <=9)) { //analisa se a entrada está entre as opções 
                JOptionPane.showMessageDialog(null, "Pagamento até o dia "+ convert);
            } else {
                JOptionPane.showMessageDialog(null, "" + convert); // mostra que a entrada é inválida por não estar entre as opções
            }
        } catch (NumberFormatException e) { //analisa se a entrada for do tipo String
            JOptionPane.showMessageDialog(null, "Digite um número inteiro como final da placa.",
            "E R R O", JOptionPane.ERROR_MESSAGE); //exibe caixa de erro
        }

    }
}