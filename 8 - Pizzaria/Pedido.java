
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedido {
    Scanner input = new Scanner(System.in);

    // Variáveis
    private int pedidoID;
    private String nomeCliente;
    private String address;
    private int pizzaID;
    private int quantidade;
    private double valorTotal;
    private String sabor;

    public int getID() { return pedidoID; }

    // Armazenar os sabores de pizza
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    // Armazenar os pedidos
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    Pedido () {

        // Calabresa
        pizzas.add(new Pizza(1, "Calabresa", "Pequena", 30.0, Arrays.asList("Calabresa", "Queijo")));
        pizzas.add(new Pizza(2, "Calabresa", "Média", 45.0, Arrays.asList("Calabresa", "Queijo")));
        pizzas.add(new Pizza(3, "Calabresa", "Grande", 60.0, Arrays.asList("Calabresa", "Queijo")));
        
        // Frango com Catupiry
        pizzas.add(new Pizza(4, "Frango com Catupiry", "Pequena", 30.0, Arrays.asList("Frango", "Catupiry", "Milho")));
        pizzas.add(new Pizza(5, "Frango com Catupiry", "Média", 45.0, Arrays.asList("Frango", "Catupiry", "Milho")));
        pizzas.add(new Pizza(6, "Frango com Catupiry", "Grande", 60.0, Arrays.asList("Frango", "Catupiry", "Milho")));
        
        // Margherita
        pizzas.add(new Pizza(7, "Margherita", "Pequena", 35.0, Arrays.asList("Molho de Tomate", "Mussarela", "Manjericão", "Tomate")));
        pizzas.add(new Pizza(8, "Margherita", "Média", 50.0, Arrays.asList("Molho de Tomate", "Mussarela", "Manjericão", "Tomate")));
        pizzas.add(new Pizza(9, "Margherita", "Grande", 65.0, Arrays.asList("Molho de Tomate", "Mussarela", "Manjericão", "Tomate")));
        
        // Quatro Queijos
        pizzas.add(new Pizza(10, "Quatro Queijos", "Pequena", 32.0, Arrays.asList("Mussarela", "Gorgonzola", "Parmesão", "Catupiry")));
        pizzas.add(new Pizza(11, "Quatro Queijos", "Média", 47.0, Arrays.asList("Mussarela", "Gorgonzola", "Parmesão", "Catupiry")));
        pizzas.add(new Pizza(12, "Quatro Queijos", "Grande", 62.0, Arrays.asList("Mussarela", "Gorgonzola", "Parmesão", "Catupiry")));
        
        // Pepperoni
        pizzas.add(new Pizza(13, "Pepperoni", "Pequena", 32.0, Arrays.asList("Pepperoni", "Queijo")));
        pizzas.add(new Pizza(14, "Pepperoni", "Média", 47.0, Arrays.asList("Pepperoni", "Queijo")));
        pizzas.add(new Pizza(15, "Pepperoni", "Grande", 62.0, Arrays.asList("Pepperoni", "Queijo")));
    }

    public void exibirPizzas() {
        System.out.println("======================================");
        System.out.println("PIZZAS");
        for(Pizza pizza : pizzas) {
            System.out.println("------------------------------------");
            System.out.print(pizza.getID() + " | " + pizza.getSabor() + " | " + pizza.getTamanho() + " | ");
            System.out.printf("R$%.2f\n", pizza.getPrice());
            System.out.println("Ingredientes: " + pizza.getIngreList());
            System.out.println("------------------------------------");
        }
        System.out.println("======================================");
    }

    public void exibirPedidos() {
        System.out.println("======================================");
        if(pedidos.size() == 0) {
            System.out.println("Nenhum pedido!");
        }
        else {
            double arrecadado = 0.0;
            for(Pedido pedido : pedidos) {
                arrecadado += pedido.valorTotal;
            }
            double media = arrecadado / pedidos.size();
            System.out.println("PEDIDOS: " + pedidos.size());
            System.out.printf("MÉDIA DE PREÇO: R$%.2f\n", media);
            for(Pedido pedido : pedidos) {
                System.out.println("------------------------------------");
                System.out.println("ID: " + pedido.pedidoID + " | Cliente: " + pedido.nomeCliente + " | ID Pizza: " + pedido.pizzaID + " | Sabor: " + pedido.sabor + " | Qtd.: " + pedido.quantidade);
                System.out.printf("Valor p/unidade: R$%.2f\n", pedido.pizzas.get(pedido.pizzaID-1).getPrice());
                System.out.printf("Valor total: R$%.2f\n", pedido.valorTotal);
                System.out.println("------------------------------------");
            }
        }
        System.out.println("======================================");
        input.nextLine();
    }

    public void novoPedido() {
        // Gera novo código de pedido
        int codeID = 1;
        if(pedidos.size() > 0) {
            for(int i = 0; i < pedidos.size(); i++) {
                if(pedidos.get(i).getID() == codeID) {
                    codeID++;
                    continue;
                }
            }
        }

        double valor = 0;
        boolean validID = false;
        // Informações da Pizza
        this.pedidoID = codeID;
        System.out.println("ID Pedido: " + pedidoID);

        System.out.print("Nome do Cliente: ");
        this.nomeCliente = input.nextLine();

        exibirPizzas();
        do {
            System.out.print("Pizza [ID]: ");
            this.pizzaID = input.nextInt();
            for(Pizza pizza : pizzas) {
                if(pizza.getID() == this.pizzaID) {
                    validID = true;
                    valor = pizza.getPrice();
                    this.sabor = pizza.getSabor();
                    break;
                }
            }
            if(!validID) {
                System.out.println("ID inválido!");
            }
        } while(!validID);

        do {
            System.out.print("Quantidade: ");
            this.quantidade = input.nextInt();
        } while(quantidade <= 0);
        input.nextLine();
        
        System.out.print("Endereço: ");
        this.address = input.nextLine();

        Pedido newPedido = new Pedido();
        newPedido.pedidoID = this.pedidoID;
        newPedido.nomeCliente = this.nomeCliente;
        newPedido.pizzaID = this.pizzaID;
        newPedido.sabor = this.sabor;
        newPedido.address = this.address;
        newPedido.quantidade = this.quantidade;
        newPedido.valorTotal = valor * quantidade;
        pedidos.add(newPedido);
    }

    public void cancelarPedido() {

        System.out.println("======================================");
        if(pedidos.size() == 0) {
            System.out.println("Nenhum pedido!");
            System.out.println("======================================");
        }

        int removeID;
        int removeIndex = 0;
        boolean validID = false;

        exibirPedidos();
        do {
            System.out.print("ID do Pedido para cancelar: ");
            removeID = input.nextInt();
            for(int i = 0; i < pedidos.size(); i++) {
                if(pedidos.get(i).pedidoID == removeID) {
                    validID = true;
                    removeIndex = i;
                }
            }
            if(!validID) {
                System.out.println("ID inválido!");
            }
        } while(!validID);

        pedidos.remove(removeIndex);

        System.out.println("Pedido cancelado com sucesso!");
        System.out.println("======================================");
        input.nextLine();

    }

}
