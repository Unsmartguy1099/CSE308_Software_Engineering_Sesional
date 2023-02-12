public class ChocolateSauce extends Cup_Decorator{

    public ChocolateSauce(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +"+ Chocolate Sauce ";
    }
    public double itemPrice()   {
        return super.itemPrice()+60;
    }
}