import java.awt.*;
import java.util.ArrayList;
public class Composite_Managers implements Component{

    private String name;
    private String projectName;

    public Composite_Managers(String name, String projectName) {
        this.name=name;
        this.projectName=projectName;
    }
    ArrayList<Component> developers = new ArrayList<Component>();


    @Override
    public ArrayList<Component> GetChildrnList() {
        return developers;
    }

    @Override
    public void CLearChildren() {
        developers.clear();
    }

    @Override
    public void AddChild(Component component) {
         developers.add(component) ;
    }

    @Override
    public void PrintDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: Project Manager");
        System.out.println("Current Project: "+projectName);
        System.out.println("Number of Supervises: "+developers.size());
    }

    @Override
    public void Hierarchy() {
        System.out.println("- "+name+" ("+projectName+")");
        for (Component data:developers){
            System.out.print("    ");
            data.Hierarchy();
        }
    }
}
