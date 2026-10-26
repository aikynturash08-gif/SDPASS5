# Assignment #5 Report: Strategy Pattern
**Course:** ShP-2216 - Software Design Patterns  
**Student:** Aikyn Turash  

---

## 1. Introduction
For this assignment, the Navigation domain was chosen. The algorithm family consists of interchangeable route calculation strategies for different transportation modes (`CarStrategy`, `WalkStrategy`, `CycleStrategy`), selected dynamically at runtime.

## 2. UML Class Diagram
- **Context:** `Navigator` (holds reference to `RouteStrategy`, executes and switches strategies dynamically).
- **Strategy Interface:** `RouteStrategy` (declares `calculateRoute(String startPoint, String endPoint)`).
- **Concrete Strategies:** `CarStrategy`, `WalkStrategy`, `CycleStrategy`.
- **Client:** `Main` (configures and runs the application).

## 3. Clean Code Section
1. **Elimination of conditionals:** Replaced complex `if/switch` branching with polymorphism.
2. **Intention-revealing names:** Clear class and method naming (`CarStrategy`, `calculateRoute`).
3. **Single Responsibility:** Each strategy encapsulates a single specific calculation algorithm.
4. **Algorithm-agnostic Context:** `Navigator` delegates execution without knowing concrete details.
5. **Open/Closed Principle (Extensibility):** New routing strategies can be added seamlessly without altering existing classes.

## 4. Strategy vs. State
The **Strategy** pattern focuses on *how* a task is performed, allowing interchangeable algorithms chosen by the client at runtime. In contrast, the **State** pattern focuses on *what* state an object is in, where states can transition from one to another internally based on object events. Our navigation problem calls for Strategy because the travel mode is an algorithm variant chosen externally, not an internal state machine transition.

## 5. Conclusion
Implementing the Strategy pattern significantly improved code maintainability and eliminated branching logic. While it increases the total number of classes, the gain in flexibility, testability, and clean architecture far outweighs this overhead.

## 6. GitHub Repository Link
(https://github.com/aikynturash08-gif/SDPASS5/blob/main/report.md)
