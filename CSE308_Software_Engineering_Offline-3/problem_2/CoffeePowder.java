public class CoffeePowder extends Cup_Decorator{

    public CoffeePowder(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +"+ Coffee Powder ";
    }
    public double itemPrice(){
        return super.itemPrice()+30;
    }
}
