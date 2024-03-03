```mermaid
---
title: Order States
---
stateDiagram-v2
    Draft --> Confirmed
    Draft --> Cancelled
    Confirmed --> Shipped
    Confirmed --> Cancelled
    Shipped --> Delivered
    Shipped --> Lost
    Lost --> Refunded
```