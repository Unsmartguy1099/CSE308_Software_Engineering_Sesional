public class Adapter implements CrewMates{
    Imposter imposter=new ImposterClass();
    @Override
    public String Suspicion(String suspicion) {
        if(suspicion.equals("comms sabotage")){
            String visualFeed=imposter.CommsSabotage();
            String[] modifiedVisualFeed=visualFeed.split(" ");
            return  "Repairing "+modifiedVisualFeed[1];
        }
        if(suspicion.equals("oxygen sabotage")){
            String visualFeed=imposter.OxygenSabotage();
            String[] modifiedVisualFeed=visualFeed.split(" ");
            return  "Repairing "+modifiedVisualFeed[1];
        }
        if(suspicion.equals("reactor sabotage")){
            String visualFeed=imposter.ReactorSabotage();
            String[] modifiedVisualFeed=visualFeed.split(" ");
            return  "Repairing "+modifiedVisualFeed[1];
        }
        else return "Nothing is happening";
    }

}
