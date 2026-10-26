public class WalkStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("[Walk] Calculating shortest pedestrian path from " + startPoint + " to " + endPoint + " (via parks, ~45 mins).");
    }
}