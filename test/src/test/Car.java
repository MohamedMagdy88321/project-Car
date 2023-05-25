package test;
import java.util.*;
import java.io.*;
public  class Car implements Comparable<Car>{
    private String unique;
    private String brand;
    private double rate;

    public Car() {
    }

    public Car(String unique, String brand, double rate) {
        this.unique = unique;
        this.brand = brand;
        this.rate = rate;
    }

    public String getBrand() {
        return brand;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "employee{" + "unique=" + unique + ", brand=" + brand + ", rate=" + rate + '}';
    }
    @Override
public boolean equals(Object c){
    if(!(c instanceof Car)){
        return false;
    }
    Car em=((Car)c);
    if( (this.unique.equals(em.unique) && this.brand.equals(em.brand)) && this.rate == em.rate) {
        return false;
    }
    else {
        return true;
    }
}


    @Override
    public int compareTo(Car o) {
       return this.unique.compareTo(o.unique);
    }



}
