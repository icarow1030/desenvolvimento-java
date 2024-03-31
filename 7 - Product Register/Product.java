<<<<<<< HEAD
public class Product {
    
    private int codeID;
    private String name;
    private int inventory;
    private double price;

    public int getID() { return codeID; }
    public String getName() { return name; }
    public int inventory() { return inventory; }
    public double price() { return price; }

    Product(int codeID) {
        this.codeID = codeID;
        this.inventory = 0;
    }

    public void setInfo(String name, int inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    public void showInfo() {
        //System.out.println("--------------------------------------------------------------------------");
        //System.out.println("Code ID |  Nome  | Preço Unitário (R$) | Estoque | Total (R$)");
        //System.out.println("--------------------------------------------------------------------------");
        System.out.printf("[%d]     || %s || R$%.2f || %d || R$%.2f\n", codeID, name, price, inventory, price * inventory);
        
    }

    public void addInventory(int inventory) {
        this.inventory += inventory;
    }

    public boolean removeInventory(int inventory) {
        if(this.inventory - inventory < 0) {
            System.out.println("Quantidade indisponível para retirar! " + this.inventory + " disponível!");
            return false;
        }
        else if(this.inventory - inventory == 0) {
            this.inventory -= inventory;
            System.out.println("Estoque zerado!");
            return true;
        }
        else {
            this.inventory -= inventory;
            System.out.println("Novo Estoque: " + this.inventory);
            return true;
        }
    }

    public boolean changePrice(double price) {
        if(price <= 0) {
            System.out.println("Preço inválido!");
            return false;
        }
        else {
            this.price = price;
            System.out.printf("Novo Preço: R$%.2f\n", this.price);
            return true;
        }
    }
}
=======
public class Product {
    
    private int codeID;
    private String name;
    private int inventory;
    private double price;

    public int getID() { return codeID; }
    public String getName() { return name; }
    public int inventory() { return inventory; }
    public double price() { return price; }

    Product(int codeID) {
        this.codeID = codeID;
        this.inventory = 0;
    }

    public void setInfo(String name, int inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    public void showInfo() {
        //System.out.println("--------------------------------------------------------------------------");
        //System.out.println("Code ID |  Nome  | Preço Unitário (R$) | Estoque | Total (R$)");
        //System.out.println("--------------------------------------------------------------------------");
        System.out.printf("[%d]     || %s || R$%.2f || %d || R$%.2f\n", codeID, name, price, inventory, price * inventory);
        
    }

    public void addInventory(int inventory) {
        this.inventory += inventory;
    }

    public boolean removeInventory(int inventory) {
        if(this.inventory - inventory < 0) {
            System.out.println("Quantidade indisponível para retirar! " + this.inventory + " disponível!");
            return false;
        }
        else if(this.inventory - inventory == 0) {
            this.inventory -= inventory;
            System.out.println("Estoque zerado!");
            return true;
        }
        else {
            this.inventory -= inventory;
            System.out.println("Novo Estoque: " + this.inventory);
            return true;
        }
    }

    public boolean changePrice(double price) {
        if(price <= 0) {
            System.out.println("Preço inválido!");
            return false;
        }
        else {
            this.price = price;
            System.out.printf("Novo Preço: R$%.2f\n", this.price);
            return true;
        }
    }
}
>>>>>>> 9ddf1804665718c759acde12b88d80fc117862f6
