public class CycleStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("[Cycle] Calculating bike-friendly route from " + startPoint + " to " + endPoint + " (via bike lanes, ~25 mins).");
    }
}