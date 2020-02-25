package com.oa;

import java.util.Arrays;
import java.util.Collection;

public class PizzaShop {

    //No solution found
    //https://leetcode.com/discuss/interview-question/356935/

        public int closestPrice(int[] pizzas, int[] toppings, int x){

            int lengthOfPizzas = pizzas.length;
            int lengthOftopings = toppings.length;

            Arrays.sort(pizzas);
            Arrays.sort(toppings);


         return 1;
        }



    /*
    def closestPrice(pizzas, toppings, x):
    import bisect
    closest = float('inf')
    new_toppings = [0]
# Generate combinations for 0, 1, and 2 toppings
    for i in range(len(toppings)):
        new_toppings.append(toppings[i])
        for j in range(i+1, len(toppings)):
            new_toppings.append(toppings[i] + toppings[j])
    new_toppings.sort()
    for pizza in pizzas:
        idx = bisect.bisect_left(new_toppings, x - pizza)
        for j in range(idx-1, idx+2):
            if 0 <= j < len(new_toppings):
                diff = abs(pizza + new_toppings[j] - x)
                if diff == abs(closest - x):
                    closest = min(closest, pizza + new_toppings[j]) # When two are equal, take the lowest one according to example 3
                elif diff < abs(closest - x):
                    closest = pizza + new_toppings[j]
    return closest
     */
}
