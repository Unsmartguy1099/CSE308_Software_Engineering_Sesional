public class CinnamonPowder extends Cup_Decorator{

    public CinnamonPowder(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +"+ Cinnamon Powder ";
    }
    public double itemPrice()   {
        return super.itemPrice()+50;
    }
}
