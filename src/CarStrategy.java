public class CarStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("[Car] Calculating fastest route from " + startPoint + " to " + endPoint + " (via highways, ~15 mins).");
    }
}