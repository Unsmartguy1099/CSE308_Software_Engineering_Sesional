public abstract class Cup_Decorator implements Coffee_Shop{

    private Coffee_Shop newCoffee;
    public Cup_Decorator(Coffee_Shop newCoffee){
        this.newCoffee=newCoffee;
    }

    public String prepareCoffee(){
        return newCoffee.prepareCoffee();
    }
    public double itemPrice(){
        return newCoffee.itemPrice();
    }

}
