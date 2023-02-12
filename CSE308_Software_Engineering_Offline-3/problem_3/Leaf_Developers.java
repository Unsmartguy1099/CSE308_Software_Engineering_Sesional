import java.util.ArrayList;
public class Leaf_Developers implements Component {

    private String name;
    public Leaf_Developers(String name)  {
        this.name=name;
    }

    @Override
    public ArrayList<Component> GetChildrnList() {
        return null;
    }

    @Override
    public void CLearChildren() {
        System.out.println("Leaf node, so no children exists");
    }

    @Override
    public void AddChild(Component component) {
        System.out.println("Leaf node, so no child can be added");
    }

    @Override
    public void PrintDetails() {
        System.out.println("Name: "+name);
        System.out.println("Role: Developer");
    }

    @Override
    public void Hierarchy() {
        System.out.println("    - "+name);
    }
}
