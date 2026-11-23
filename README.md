# Laundry Order Manager (Java)

Object-oriented **Java** application (`com.mycompany.lavadorasapp`) for managing laundry service orders, designed around **Software Architecture** principles.

## Features & Domain Model
- **Order Domain (`Pedido.java`):** Encapsulates order business logic linking `Cliente`, `ProgramaLavado`, `TipoRopa` list, delivery address, comments, and order state (`EstadoPedido.PENDIENTE`, etc.).
- **Business Rules & Validation:** Enforces runtime constraints (e.g., strict laundry load validation between **0 kg and 10 kg** throwing `IllegalArgumentException`) and auto-incrementing order IDs.
- **Packaged Source:** Includes `Lavanderia2.zip` with the full project structure.