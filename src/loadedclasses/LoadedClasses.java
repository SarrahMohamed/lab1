/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadedclasses;
import java.lang.reflect.Field;
import java.util.Vector;
/**
 *
 * @author sara
 */
public class LoadedClasses {

    /**
     * @param args the command line arguments
     */
    //3 ways
    //1. intialize object
    //1.invoke static method or field
    public static void main(String[] args) {
        // TODO code application logic here
           Field f;
        //    NewClass bd=new NewClass();
        //  NewClass1 b=new NewClass1();
      
     //   int s = NewClass.s;
         //1. intialize object from child class
    NewClass1  obj1=new NewClass1();
       /*2. intialize object from class Static method
    does not execute because the class is loaded before 
    as the parent of class  NewClass1*/
     NewClass  obj2=new NewClass();
/*3-invoke static method or field*/
     System.out.println(NewClass1.num);
     
    }
    
}
