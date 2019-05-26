# suparuay-cafe

Supalruay-Cafe is a simple simulation program of coffee shops that uses 3 main designs pattern to a design program.


**3 Design Pattern**


      1. Strategy
      The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
      
      In the program, defined Order class is implemented as interface so that we can change behavior without affecting our context. The getName() and getPrice() methods can overwrite by different orders in have different values. The coffee shop has 2 selling products, namely coffee, and dessert. So, Coffee class and Dessert class implements Order class. 
      
      
------   
  
      2. Composite
      Composite pattern is a partitioning design pattern and describes a group of objects that are treated the same way as a single instance of the same type of object. The Composite Pattern has three participants. Component, Leaf, and Composite.
  
      In the program,
        - Order class is a Component class that declares the interface for objects in the composition and for accessing and managing its child components.
        - Coffee and Dessert class are a Leaf class that defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
        - OrderList class is a Composite class that stores child components and implements child related operations in the component interface.
              
------     
      
      3. Null Object
      The Null object pattern is a design pattern that simplifies the use of dependencies that can be undefined. This is achieved by using instances of a concrete class that implements a known interface, instead of null references.
      
      In the program, created an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where need to check null value.
      
        - Dessert class is a abstract class is the base class for the various available dependencies that the Client may use.
        - Brookie, Cake, Muffin, and Waffle class are a functional dependency that may be used by the Client.
        - NullDessert class is the null object class that can be used as a dependency by the Client. It contains no functionality but implements all of the members defined by the Dessert abstract class.
        - Defined the DessertFactory by Factory Design Pattern to create various types of desserts.
      
------  

**How to use the program**

