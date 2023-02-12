public class Main {
    public static void main(String[] args) {
        CrewMates crewMates=new CrewMatesClass();
        System.out.println(crewMates.Suspicion("comms sabotage"));
        System.out.println(crewMates.Suspicion("oxygen sabotage"));
        System.out.println(crewMates.Suspicion("reactor sabotage"));
    }
}