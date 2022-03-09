# OPEN CLOSE PRINCIPLE - OCP

"Software Entities like classes, modules and functions should be open for extension, but closed for modification."

When a single change to a program results in a cascade of changes to dependent modules, that program exhibits the undesirable
attributes of a design. The program becomes fragile, rigid, unpredictable and un-reusable. 

The open-closed principle attacks this in a very straightforward way. It says that you should design modules that never change. 

When requirements change, you extend the behavior of such modules by adding new code, not by changing old code that already works.