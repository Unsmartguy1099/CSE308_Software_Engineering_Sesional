import java.util.ArrayList;

public interface Component {
        public ArrayList<Component> GetChildrnList();
        public void CLearChildren();
        public void AddChild(Component component);
        public void PrintDetails();
        public void Hierarchy();
    // End of the Employee interface.

}
