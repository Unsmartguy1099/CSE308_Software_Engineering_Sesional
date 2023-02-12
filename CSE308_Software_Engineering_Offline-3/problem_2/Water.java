public class Water extends Cup_Decorator{

    public Water(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +" With water  ";
    }
    public double itemPrice()   {
        return super.itemPrice()+0;
    }
}