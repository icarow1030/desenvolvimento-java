
import java.util.List;

public class Pizza {
    
    private int pizzaID;
    private String sabor;
    private String tamanho; // Tamanho 1 (Pequena), Tamanho 2(Média), Tamanho 3(Grande)
    private double valor;
    List<String> ingredientes;

    public int getID() { return pizzaID; }
    public String getSabor() { return sabor; }
    public String getTamanho() { return tamanho; }
    public double getPrice() { return valor; }
    public List<String> getIngreList() { return ingredientes; }

    Pizza(int pizzaID, String sabor, String tamanho, double valor, List<String> ingredientes) {
        this.pizzaID = pizzaID;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

}
