package test;
import java.util.*;
import java.io.*;
public class Test {
public static void main(String[] args) {
Company b=new  Company("Car 4 u ");      
Car n =new Car("12SDSD","BMW",20);
Car n1 =new Car("45DSDS","BMW",50);
b.addcar(n);
b.addcar(n1);
    System.out.println(b.brandfrequency("BMW"));
b.saveintoFile("");
}
    
}
