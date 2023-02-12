import java.util.ArrayList;
public class Composite_Company implements Component{

    private String name;

    public Composite_Company(String name) {
        this.name=name;

    }
    ArrayList<Component> managers = new ArrayList<Component>();

    @Override
    public ArrayList<Component> GetChildrnList() {
        return managers;
    }

    @Override
    public void CLearChildren() {
        managers.clear();
    }

    @Override
    public void AddChild(Component component) {
        managers.add(component);
    }

    @Override
    public void PrintDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: Company");
        System.out.println("Number of Projects: "+managers.size());
    }

    @Override
    public void Hierarchy() {
        System.out.println("- "+name);
        for (Component data:managers){
            System.out.print("    ");
            data.Hierarchy();
        }
    }
}
