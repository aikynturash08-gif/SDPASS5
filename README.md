# Navigation Strategy Pattern (Java)

Assignment #5 implementation for Software Design Patterns (Astana IT University).

## Project Structure
- `src/RouteStrategy.java` - Common strategy interface
- `src/CarStrategy.java` - Concrete strategy for car routes
- `src/WalkStrategy.java` - Concrete strategy for walking routes
- `src/CycleStrategy.java` - Concrete strategy for cycling routes
- `src/Navigator.java` - Context class managing strategy execution
- `src/Main.java` - Client demonstration

## How to Build and Run
1. Ensure you have **JDK 17** installed.
2. Open the project in **IntelliJ IDEA**.
3. Run `Main.java`.

## How to Add a New Strategy
1. Create a new class implementing `RouteStrategy` (e.g., `PublicTransportStrategy`).
2. Implement the `calculateRoute` method with your custom logic.
3. Pass instances of the new strategy to the `Navigator` at runtime without modifying existing code.
