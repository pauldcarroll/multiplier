package com.pauliecarroll.multiplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplierApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplierApplication.class, args);
	}

}

package com.leszko.calculator;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
     int sum(int a, int b) {
          return a + b;
     }
}
