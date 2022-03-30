package com.pauliecarroll.multiplier;
import org.springframework.stereotype.Service;

@Service
public class Multiplier {
     int multiply(int a, int b) {
          return a * b;
     }
}
