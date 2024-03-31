import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Objetos  
        Scanner input = new Scanner(System.in);
        Pedido pedido = new Pedido();

        // Variables
        int menuOption = -1;

        // Menu
        do {

            System.out.println("[1] Novo Pedido");
            System.out.println("[2] Cancelar Pedidos");
            System.out.println("[3] Ver Pedidos");
            System.out.println("[4] Cardápio de Pizzas");
            System.out.println("[0] Sair");
            System.out.println("------------------------------------");
            System.out.print("= Input: ");
            menuOption = input.nextInt();
            System.out.println("------------------------------------");

            switch(menuOption) {
                case 1:
                    pedido.novoPedido();
                    break;
                case 2:
                    pedido.cancelarPedido();
                    break;
                case 3:
                    pedido.exibirPedidos();
                    break;
                case 4:
                    pedido.exibirPizzas();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        } while(menuOption != 0);

    }
}