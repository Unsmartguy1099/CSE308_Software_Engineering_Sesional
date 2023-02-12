public class DairyCream extends Cup_Decorator{

    public DairyCream(Coffee_Shop newCoffee) {
        super(newCoffee);
    }
    public String prepareCoffee(){
        return super.prepareCoffee() +"+ Dairy Cream ";
    }
    public double itemPrice()   {
        return super.itemPrice()+40;
    }
}