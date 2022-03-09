# Interface Segregation Principle - ISP

"Clients Should Not Be Forced to Depend Upon Interfaces That They Do Not Use"

I take this to mean: "As a client, why should I implement nine methods of an interface when I
need only three methods?" Fewer methods make a developer’s life easier.

Large interfaces must be broken down into specific interfaces.

This way clients can concern themselves with only the interfaces they require and
not have access to other features that do not concern their functionality.