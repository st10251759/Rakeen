
package com.mycompany.enum_demo_g1;


public class Pizza {

Size pizzaSize;

public Pizza(Size pizza)
{ 
    this.pizzaSize = pizzaSize;

}
 
public String orderPizza()
{
    switch(pizzaSize)
    {
        case SMALL:
            return "You have ordered a small pizza";
        case MEDIUM:
            return "You have ordered a meduim pizza";
        case LARGE:
            return "You have ordered a large pizza";
        case EXTRALARGE:
            return "You have ordered an extra-large pizza";
        default:
            return "Invalid pizza siaze choice";
    }
    
}

}
