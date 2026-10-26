public class Main {
    public static void main(String[] args) {
        String start = "Astana IT University";
        String end   = "Baiterek Tower";

        Navigator navigator = new Navigator(new CarStrategy());
        navigator.buildRoute(start, end);

        navigator.setStrategy(new WalkStrategy());
        navigator.buildRoute(start, end);

        navigator.setStrategy(new CycleStrategy());
        navigator.buildRoute(start, end);
    }
}