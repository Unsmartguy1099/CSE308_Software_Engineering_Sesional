import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give Company name:");
        String companyName=input.nextLine();
        String managerName;
        String projectName;
        String devloperName;
        int number=0;
        int number2=0;

        Component company=new Composite_Company(companyName);
        while (true){
            if(company.GetChildrnList().size()>0){

                System.out.println("Press 1 to add manager");
                System.out.println("Press 2 to see company details");
                System.out.println("Press 3 to see company Hierarchy");
                System.out.println("Press 4 to clear managers");

                for (int i=0;i<company.GetChildrnList().size();i++){
                      System.out.println("Press "+(i+5)+" to access manager: "+(i+1));
                }

                try {
                    number=input.nextInt();
                }
                catch(Exception e) {
                    System.out.println(e);
                    number2=0;
                }
                input.nextLine();//buffer

                if(number==1){
                    System.out.println("Name: ");

                    managerName=input.nextLine();
                    System.out.println("Project Name: ");
                    projectName=input.nextLine();
                    company.AddChild(new Composite_Managers(managerName,projectName));
                }else if(number==2){
                    company.PrintDetails();
                }else if(number==3){
                    company.Hierarchy();
                }else if(number==4){
                    for (int i=0;i<company.GetChildrnList().size();i++){
                           company.GetChildrnList().get(i).CLearChildren();
                    }
                    company.CLearChildren();
                }else if(number-5<company.GetChildrnList().size()){
                    while(true) {
                        System.out.println("    Press 1 to add developer to manager: " + number);
                        System.out.println("    Press 2 to see manager details: " + number);
                        System.out.println("    Press 3 to see manager Hierarchy: " + number);
                        System.out.println("    Press 4 to clear children from manager: " + number);
                        System.out.println("    Press 5 to exit");
                        try {
                            number2=input.nextInt();
                        }
                        catch(Exception e) {
                            System.out.println(e);
                            number2=0;
                        }
                        input.nextLine();//buffer

                        if (number2 == 1) {
                            System.out.println("Developer Name: ");
                            devloperName = input.nextLine();
                            company.GetChildrnList().get(number - 5).AddChild(new Leaf_Developers(devloperName));
                        } else if (number2 == 2) {
                            company.GetChildrnList().get(number - 5).PrintDetails();
                        } else if (number2 == 3) {
                            company.GetChildrnList().get(number - 5).Hierarchy();
                        } else if (number2 == 4) {
                            company.GetChildrnList().get(number - 5).CLearChildren();
                        } else if (number2 == 5) {
                            break;
                        }else{
                            System.out.println("Give proper input");
                        }
                    }
                }
                else{
                    System.out.println("Give proper input");
                }
            }
            else{
                System.out.println("Press 1 to add manager");
                System.out.println("Press 2 to see company details");
                System.out.println("Press 3 to see company Hierarchy");
                System.out.println("Press 4 to clear managers");
                //System.out.println("Press 5 to exit");
                try {
                    number=input.nextInt();
                }
                catch(Exception e) {
                    System.out.println(e);
                    number2=0;
                }
                input.nextLine();//buffer
                if(number==1){
                    System.out.println("Name: ");
                    managerName=input.nextLine();
                    System.out.println("Project Name: ");
                    projectName=input.nextLine();
                    company.AddChild(new Composite_Managers(managerName,projectName));
                }else if(number==2){
                    company.PrintDetails();
                }else if(number==3){
                    company.Hierarchy();
                }else if(number==4){
                    //clear company
                }
                else{
                    System.out.println("Give proper input");
                }
               // else if(number)
            }
        }
    }
}