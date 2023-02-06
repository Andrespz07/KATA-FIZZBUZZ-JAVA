package com.fizzbuzz;

public class FizzBuzz  {
    
    public String Fizzbuzz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        }
         else if (numero % 3 == 0) {
            return "Fizz";
        }
         else if (numero % 5 == 0) {
            return "Buzz"; 
        }
         else { 
            String Temporal = String.format("%s", numero);
            return Temporal;
        }
      
      
    }
    
}
 
 