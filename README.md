# suparuay-cafe

Supalruay-Cafe is a simple simulation program of coffee shops that uses 3 main designs pattern to a design program.

**Diagram**

<img width="1047" alt="Screen Shot 2562-05-26 at 18 24 33" src="https://user-images.githubusercontent.com/32286346/58381505-e05ee880-7fe7-11e9-91eb-1fe69742e1e6.png">


**3 Design Pattern**


      1. Strategy
   The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from the clients that use it.
      
   In the program, defined Order class is implemented as interface so that we can change behavior without affecting our context. The getName() and getPrice() methods can overwrite by different orders in have different values. The coffee shop has 2 selling products, namely coffee, and dessert. So, Coffee class and Dessert class implements Order class. 

<img width="1149" alt="Screen Shot 2562-05-26 at 18 24 02" src="https://user-images.githubusercontent.com/32286346/58381504-dfc65200-7fe7-11e9-969e-d9c2e0bc6541.png">

<img width="341" alt="Screen Shot 2562-05-26 at 18 24 13" src="https://user-images.githubusercontent.com/32286346/58381501-dfc65200-7fe7-11e9-826c-4d948db9d7f5.png">
 
------   
  
      2. Composite
  Composite pattern is a partitioning design pattern and describes a group of objects that are treated the same way as a single instance of the same type of object. The Composite Pattern has three participants. Component, Leaf, and Composite.
  
  In the program,
    - Order class is a Component class that declares the interface for objects in the composition and for accessing and managing its child components.
    - Coffee and Dessert class are a Leaf class that defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
    - OrderList class is a Composite class that stores child components and implements child related operations in the component interface.
 
<img width="174" alt="Screen Shot 2562-05-26 at 18 57 54" src="https://user-images.githubusercontent.com/32286346/58381545-4d727e00-7fe8-11e9-829b-891d77fb382b.png">

------     
      
      3. Null Object
  The Null object pattern is a design pattern that simplifies the use of dependencies that can be undefined. This is achieved by using instances of a concrete class that implements a known interface, instead of null references.
      
  In the program, created an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where need to check null value.
      
   - Dessert class is a abstract class is the base class for the various available dependencies that the Client may use.
   - Brookie, Cake, Muffin, and Waffle class are a functional dependency that may be used by the Client.
   - NullDessert class is the null object class that can be used as a dependency by the Client. It contains no functionality but implements all of the members defined by the Dessert abstract class.
   - Defined the DessertFactory by Factory Design Pattern to create various types of desserts.

<img width="319" alt="Screen Shot 2562-05-26 at 18 56 55" src="https://user-images.githubusercontent.com/32286346/58381548-5400f580-7fe8-11e9-8d27-f6b8d0ce4159.png">

------  

**How to use the program**

First, You have to run the appplcaition in ...(Your directory).../suparuay-cafe/src/main/java/app/App.java

When starting the program, you can select an order by inputting the command.
<img width="353" alt="Screen Shot 2562-05-26 at 18 16 03" src="https://user-images.githubusercontent.com/32286346/58381162-37fb5500-7fe4-11e9-8e7a-cf2a09e9d314.png">

If input 1, the program will display the coffee items that are available in the shop for you to choose by entering the command.

<img width="400" alt="Screen Shot 2562-05-26 at 18 16 21" src="https://user-images.githubusercontent.com/32286346/58381212-8872b280-7fe4-11e9-9972-077e2520508f.png">


In some coffee items, when selected, you can choose topping more.
<img width="391" alt="Screen Shot 2562-05-26 at 18 44 22" src="https://user-images.githubusercontent.com/32286346/58381349-6aa64d00-7fe6-11e9-99d9-1f76e243a596.png">


If input 2, the program will display the dessert items that are available in the shop for you to choose by entering the command. If the item is out of stock the program will show that it is out of stock instead of displaying the dessert name.
<img width="411" alt="Screen Shot 2562-05-26 at 18 31 18" src="https://user-images.githubusercontent.com/32286346/58381213-8dcffd00-7fe4-11e9-8033-b83936ac74d4.png">


If you are in the order types. You can input the command B to end the order and show all orders for payment. or if you are in the main menu you can input B or Q(if has order).
And the program will send a list of all coffee orders with the recipe to the barista.
<img width="411" alt="Screen Shot 2562-05-26 at 18 43 32" src="https://user-images.githubusercontent.com/32286346/58381366-84479480-7fe6-11e9-9258-f8bae635cead.png">



