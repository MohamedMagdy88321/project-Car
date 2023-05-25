package test;
import java.util.*;
import java.io.*;
public class Company {
private String name;
private ArrayList <Car> Cars;

    public Company(String name) {
        this.name = name;
   Cars=new ArrayList<>();
         
    }
    
    public void addcar(Car c){
        if(!(Cars.contains (c) )){
       Cars.add(c);
        System.out.println("the car added");
            }
        else
      
    {
            System.out.println("it is alyread exists ");
}

}
    public int brandfrequency(String brand ){
        int counter=0;
        for(Car m : Cars  ){
            if(m.getBrand().equals(brand) ){
                counter ++;
            }
        }
        return counter;
    }

public void saveintoFile(String f){
   try{
    File file=new File(f);
    PrintWriter bw=new PrintWriter(file);
    bw.println(this.name);
    Collections.sort(Cars);
   for(int i=0;i<Cars.size();i++){
       bw.println(Cars.get(i).toString());
 
   }
     bw.close();
   }
   catch(FileNotFoundException e){
       System.out.println("Error:"+e);
   }
}
}
