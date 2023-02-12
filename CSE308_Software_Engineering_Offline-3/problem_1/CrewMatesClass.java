public class CrewMatesClass implements CrewMates{
    Adapter adapter=new Adapter();
    @Override
    public String Suspicion(String suspicion) {
        return adapter.Suspicion(suspicion);
    }
}
