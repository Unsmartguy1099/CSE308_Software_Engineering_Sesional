public class Milk extends Cup_Decorator{

    public Milk(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +"+ Milk ";
    }
    public double itemPrice()   {
        return super.itemPrice()+50;
    }
}