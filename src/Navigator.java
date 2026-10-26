public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String startPoint, String endPoint) {
        if (strategy == null) {
            throw new IllegalStateException("Route strategy is not set!");
        }
        strategy.calculateRoute(startPoint, endPoint);
    }
}