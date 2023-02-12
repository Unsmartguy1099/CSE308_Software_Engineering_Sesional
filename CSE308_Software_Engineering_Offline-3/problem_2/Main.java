import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count=1;
        int input=0;
        double price=0;

        LinkedList<Order> order=new LinkedList<Order>();
        System.out.println("Welcome to কফির টং");
        System.out.println("-----------------");

        loop1: while(true) {

            System.out.println("Order No: "+count);
            System.out.println("    Press 1 to order an Americano");
            System.out.println("    Press 2 to order an Espresso");
            System.out.println("    Press 3 to order a Cappuccino");
            System.out.println("    Press 4 to order a Mocha");
            System.out.println("    Press 5 to order end order");
            System.out.println("    Press 6 exit");
            System.out.println("");
            loop2: while(true) {

                input = scan.nextInt();

                switch (input) {
                    case 1: {
                        Coffee_Shop c1=new Cup();
                        Coffee_Shop c2=new Water(c1);
                        Coffee_Shop c3=new CoffeePowder(c2);
                        Coffee_Shop c4=new CoffeePowder(c3);
                        System.out.println("        Americano Coffee:");
                        System.out.println("        Items: "+c4.prepareCoffee());
                        System.out.println("        Price: "+c4.itemPrice());
                        order.addLast(new Order("Americano",c4.itemPrice()));
                    }
                    break;
                    case 2: {
                        Coffee_Shop c1=new Cup();
                        Coffee_Shop c2=new Water(c1);
                        Coffee_Shop c3=new CoffeePowder(c2);
                        Coffee_Shop c4=new DairyCream(c3);
                        System.out.println("        Espresso Coffee:");
                        System.out.println("        Items: "+c4.prepareCoffee());
                        System.out.println("        Price: "+c4.itemPrice());
                        order.addLast(new Order("Espresso",c4.itemPrice()));
                    }
                    break;
                    case 3: {
                        Coffee_Shop c1=new Cup();
                        Coffee_Shop c2=new Milk(c1);
                        Coffee_Shop c3=new CoffeePowder(c2);
                        Coffee_Shop c4=new CinnamonPowder(c3);
                        System.out.println("        Cappuccino Coffee:");
                        System.out.println("        Items: "+c4.prepareCoffee());
                        System.out.println("        Price: "+c4.itemPrice());
                        order.addLast(new Order("Cappuccino",c4.itemPrice()));
                    }
                    break;
                    case 4: {
                        Coffee_Shop c1=new Cup();
                        Coffee_Shop c2=new Milk(c1);
                        Coffee_Shop c3=new CoffeePowder(c2);
                        Coffee_Shop c4=new ChocolateSauce(c3);
                        System.out.println("        Mocha Coffee:");
                        System.out.println("        Items: "+c4.prepareCoffee());
                        System.out.println("        Price: "+c4.itemPrice());
                        order.addLast(new Order("Mocha",c4.itemPrice()));
                    }
                    break;
                    case 5: {
                        System.out.println("      Order No: "+count);
                        price=0;
                        for (Order value : order) {
                            System.out.println("      "+value.name + ": " + value.price + "Tk");
                            price=price+value.price;
                        }
                        System.out.println("      ---------------------");
                        System.out.println("      Total: "+price+"Tk");
                        System.out.println("\n");
                        order.clear();
                    }
                        break loop2;
                    case 6:
                        break loop1;

                    default:
                        System.out.println("Wrong input");
                }

            }

            count++;
        }

    }
}