package com.pauliecarroll.multiplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CalculatorController {
     @Autowired
     private Multiplier multiplier;

     @RequestMapping("/sum")
     String multiply(@RequestParam("a") Integer a, 
                @RequestParam("b") Integer b) {
          return String.valueOf(multiplier.multiply(a, b));
     }
}
