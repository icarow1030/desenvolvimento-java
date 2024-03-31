<<<<<<< HEAD

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // ArrayList
        ArrayList<Product> mercado = new ArrayList<>();

        // Variables
        int menuOption = -1;
        int productSelection = -1;
        int productChangeOption = -1;

        // Menu Principal
        // 1 - Adiciona um produto
        // 2 - Abre sub-menu com a lista de produtos
        // 2 -- Vai poder escolher uma opção entre: Mudar informações do produto, remover produto e voltar

        // Determinação do CodeID:
        // Programa vai percorrer a ArrayList mercado, checando cada produto.
        // O primeiro número que estiver disponível, ele irá atribuir e dar um break.

        do {

            System.out.println("---------------------------");
            System.out.println("[1] Adicionar Produto");
            System.out.println("[2] Listar Produtos");
            System.out.println("[0] Sair do Programa");
            System.out.println("---------------------------");
            System.out.print("= Input: ");
            menuOption = input.nextInt();
            System.out.println("---------------------------");

            switch(menuOption) {
                case 1:

                    // Determina automaticamente o ID do novo produto
                    int codeID = 1;
                    if(mercado.size() > 0) {
                        for(int i = 0; i < mercado.size(); i++) {
                            if(mercado.get(i).getID() == codeID) {
                                codeID++;
                                continue;
                            }
                        }
                    }
                    // Criando o novo produto com o CodeID determinado
                    Product newProduct = new Product(codeID);

                    // Determinar as informações
                    System.out.println("ID Produto: " + newProduct.getID());
                    input.nextLine();

                    // Nome do Produto
                    System.out.print("Nome do Produto: ");
                    String name = input.nextLine();

                    // Preço
                    double price;
                    do {
                        System.out.print("Preço (R$): ");
                        price = Double.parseDouble(input.nextLine());
                    } while(!newProduct.changePrice(price));

                    // Determinar estoque
                    int inventory;
                    do {
                        System.out.print("Estoque: ");
                        inventory = Integer.parseInt(input.nextLine());
                    } while(inventory < 0);

                    // Determinando de fato as variáveis nome e produto no objeto
                    newProduct.setInfo(name, inventory);

                    // Adicionando o produto ao mercado
                    mercado.add(newProduct);

                    // Mensagem de sucesso
                    System.out.println("---------------------------");
                    System.out.println("Produto adicionado com sucesso!");

                    // No final, printa as informações inseridas, incluindo o valor total em estoque
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Code ID |    Nome    | Preço Unitário (R$) | Estoque | Valor Total (R$)");
                    System.out.println("--------------------------------------------------------------------------");
                    newProduct.showInfo();

                    System.out.println("--------------------------------------------------------------------------");
                    
                    break;

                case 2:
                    if(mercado.size() == 0) {
                        System.out.println("Nenhum produto registrado!");
                        break;
                    }
                    // Listagem de todos os produtos
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Code ID |    Nome    | Preço Unitário (R$) | Estoque | Valor Total (R$)");
                    System.out.println("--------------------------------------------------------------------------");
                    for(Product product : mercado) {
                        product.showInfo();
                    }
                    System.out.println("--------------------------------------------------------------------------");

                    // Sub-menu com as opções
                    do {

                        System.out.println("[1] Mudar informações de produto");
                        System.out.println("[2] Remover Produto");
                        System.out.println("[0] Voltar para o Menu Principal");
                        System.out.println("---------------------------");
                        System.out.print("= Input: ");
                        productSelection = input.nextInt();
                        System.out.println("---------------------------");

                        switch(productSelection) {

                            case 1:

                                int productIndex = 0;
                                boolean validCode = false;
                                do {
                                    System.out.print("Digite o ID do produto: ");
                                    codeID = input.nextInt();
                                    for(Product product : mercado) {
                                        if(product.getID() == codeID) {
                                            validCode = true;
                                            break;
                                        }
                                        productIndex++;
                                    }
                                    if(!validCode) {
                                        System.out.println("ID inexistente! Tente novamente!");
                                    }
                                } while(!validCode);
                                
                                // Printa as informações do produto escolhido
                                mercado.get(productIndex).showInfo();
                                System.out.println("--------------------------");
                                System.out.println("[1] Mudar preço");
                                System.out.println("[2] Adicionar estoque");
                                System.out.println("[3] Remover estoque");
                                System.out.println("[0] Voltar");
                                System.out.println("--------------------------");
                                System.out.print("= Input: ");
                                productChangeOption = input.nextInt();
                                System.out.println("--------------------------");

                                switch(productChangeOption) {

                                    case 1:
                                        do {
                                            System.out.print("Novo Preço (R$): ");
                                            price = input.nextDouble();
                                        } while(!mercado.get(productIndex).changePrice(price));
                                        break;
                                    case 2:
                                        do {
                                            System.out.print("Quantidade de Estoque para adicionar: ");
                                            inventory = input.nextInt();
                                        } while(inventory <= 0);
                                        mercado.get(productIndex).addInventory(inventory);
                                        break;
                                    case 3:
                                        do {
                                            System.out.print("Quantidade de Estoque para remover: ");
                                            inventory = input.nextInt();
                                        } while(inventory <= 0 || !mercado.get(productIndex).removeInventory(inventory));
                                }
                                break;
                            case 2:

                                int productIndexRemove = 0;
                                boolean validCodeRemove = false;
                                do {
                                    System.out.print("Digite o ID do produto: ");
                                    codeID = input.nextInt();
                                    for(Product product : mercado) {
                                        if(product.getID() == codeID) {
                                            validCodeRemove = true;
                                            break;
                                        }
                                        productIndexRemove++;
                                    }
                                    if(!validCodeRemove) {
                                        System.out.println("ID inexistente! Tente novamente!");
                                    }
                                } while(!validCodeRemove);

                                // Remover produto escolhido
                                mercado.remove(productIndexRemove);

                                System.out.println("Produto removido!");

                                break;
                            case 0:
                                break;
                            default:
                                break;

                        }

                    } while(productSelection != 0);

                    break;
                case 0:
                    break;
                default:
                    break;

            }
            

        } while(menuOption != 0);

    }

=======

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // ArrayList
        ArrayList<Product> mercado = new ArrayList<>();

        // Variables
        int menuOption = -1;
        int productSelection = -1;
        int productChangeOption = -1;

        // Menu Principal
        // 1 - Adiciona um produto
        // 2 - Abre sub-menu com a lista de produtos
        // 2 -- Vai poder escolher uma opção entre: Mudar informações do produto, remover produto e voltar

        // Determinação do CodeID:
        // Programa vai percorrer a ArrayList mercado, checando cada produto.
        // O primeiro número que estiver disponível, ele irá atribuir e dar um break.

        do {

            System.out.println("---------------------------");
            System.out.println("[1] Adicionar Produto");
            System.out.println("[2] Listar Produtos");
            System.out.println("[0] Sair do Programa");
            System.out.println("---------------------------");
            System.out.print("= Input: ");
            menuOption = input.nextInt();
            System.out.println("---------------------------");

            switch(menuOption) {
                case 1:

                    // Determina automaticamente o ID do novo produto
                    int codeID = 1;
                    if(mercado.size() > 0) {
                        for(int i = 0; i < mercado.size(); i++) {
                            if(mercado.get(i).getID() == codeID) {
                                codeID++;
                                continue;
                            }
                        }
                    }
                    // Criando o novo produto com o CodeID determinado
                    Product newProduct = new Product(codeID);

                    // Determinar as informações
                    System.out.println("ID Produto: " + newProduct.getID());
                    input.nextLine();

                    // Nome do Produto
                    System.out.print("Nome do Produto: ");
                    String name = input.nextLine();

                    // Preço
                    double price;
                    do {
                        System.out.print("Preço (R$): ");
                        price = Double.parseDouble(input.nextLine());
                    } while(!newProduct.changePrice(price));

                    // Determinar estoque
                    int inventory;
                    do {
                        System.out.print("Estoque: ");
                        inventory = Integer.parseInt(input.nextLine());
                    } while(inventory < 0);

                    // Determinando de fato as variáveis nome e produto no objeto
                    newProduct.setInfo(name, inventory);

                    // Adicionando o produto ao mercado
                    mercado.add(newProduct);

                    // Mensagem de sucesso
                    System.out.println("---------------------------");
                    System.out.println("Produto adicionado com sucesso!");

                    // No final, printa as informações inseridas, incluindo o valor total em estoque
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Code ID |    Nome    | Preço Unitário (R$) | Estoque | Valor Total (R$)");
                    System.out.println("--------------------------------------------------------------------------");
                    newProduct.showInfo();

                    System.out.println("--------------------------------------------------------------------------");
                    
                    break;

                case 2:
                    if(mercado.size() == 0) {
                        System.out.println("Nenhum produto registrado!");
                        break;
                    }
                    // Listagem de todos os produtos
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Code ID |    Nome    | Preço Unitário (R$) | Estoque | Valor Total (R$)");
                    System.out.println("--------------------------------------------------------------------------");
                    for(Product product : mercado) {
                        product.showInfo();
                    }
                    System.out.println("--------------------------------------------------------------------------");

                    // Sub-menu com as opções
                    do {

                        System.out.println("[1] Mudar informações de produto");
                        System.out.println("[2] Remover Produto");
                        System.out.println("[0] Voltar para o Menu Principal");
                        System.out.println("---------------------------");
                        System.out.print("= Input: ");
                        productSelection = input.nextInt();
                        System.out.println("---------------------------");

                        switch(productSelection) {

                            case 1:

                                int productIndex = 0;
                                boolean validCode = false;
                                do {
                                    System.out.print("Digite o ID do produto: ");
                                    codeID = input.nextInt();
                                    for(Product product : mercado) {
                                        if(product.getID() == codeID) {
                                            validCode = true;
                                            break;
                                        }
                                        productIndex++;
                                    }
                                    if(!validCode) {
                                        System.out.println("ID inexistente! Tente novamente!");
                                    }
                                } while(!validCode);
                                
                                // Printa as informações do produto escolhido
                                mercado.get(productIndex).showInfo();
                                System.out.println("--------------------------");
                                System.out.println("[1] Mudar preço");
                                System.out.println("[2] Adicionar estoque");
                                System.out.println("[3] Remover estoque");
                                System.out.println("[0] Voltar");
                                System.out.println("--------------------------");
                                System.out.print("= Input: ");
                                productChangeOption = input.nextInt();
                                System.out.println("--------------------------");

                                switch(productChangeOption) {

                                    case 1:
                                        do {
                                            System.out.print("Novo Preço (R$): ");
                                            price = input.nextDouble();
                                        } while(!mercado.get(productIndex).changePrice(price));
                                        break;
                                    case 2:
                                        do {
                                            System.out.print("Quantidade de Estoque para adicionar: ");
                                            inventory = input.nextInt();
                                        } while(inventory <= 0);
                                        mercado.get(productIndex).addInventory(inventory);
                                        break;
                                    case 3:
                                        do {
                                            System.out.print("Quantidade de Estoque para remover: ");
                                            inventory = input.nextInt();
                                        } while(inventory <= 0 || !mercado.get(productIndex).removeInventory(inventory));
                                }
                                break;
                            case 2:

                                int productIndexRemove = 0;
                                boolean validCodeRemove = false;
                                do {
                                    System.out.print("Digite o ID do produto: ");
                                    codeID = input.nextInt();
                                    for(Product product : mercado) {
                                        if(product.getID() == codeID) {
                                            validCodeRemove = true;
                                            break;
                                        }
                                        productIndexRemove++;
                                    }
                                    if(!validCodeRemove) {
                                        System.out.println("ID inexistente! Tente novamente!");
                                    }
                                } while(!validCodeRemove);

                                // Remover produto escolhido
                                mercado.remove(productIndexRemove);

                                System.out.println("Produto removido!");

                                break;
                            case 0:
                                break;
                            default:
                                break;

                        }

                    } while(productSelection != 0);

                    break;
                case 0:
                    break;
                default:
                    break;

            }
            

        } while(menuOption != 0);

    }

>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
}