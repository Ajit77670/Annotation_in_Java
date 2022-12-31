
package annotations_in_java;
import java.lang.annotation.*;


@Target({ElementType.TYPE, ElementType.METHOD}) // Specifiying our custom MyAnno is applicable where in our Program.
@Retention(RetentionPolicy.RUNTIME) // This additional info given to compiler and JVM about our custom MyAnno that availibility of these Annotaion is given at Runtime.
@interface MyAnno5{   // our Customized Annoatations
    
    int myValue() default 0;
    
    String myCity() default "Muzaffarpur";
    
    String myName() default "Ajit";
    
    
}

@MyAnno5(myValue=1,myCity="Bengaluru",myName="Sumit")
class Test{    
        
  public void Hey(){
        
   System.out.println("This is class Hey");
   
    }
}
  
 public class MyAnno2 {
    
    public static void main( String[] args) {

    Test t = new Test();
    
     Class c=t.getClass(); // Craeted  Class class object--> one of the method of Creating Object of Class class.
     
     System.out.println(c.getName());  // c.getName() --> will gives output for our customized MyAnno5 where it has been used.
     
    Annotation ann[]= c.getAnnotations();  // it will gives the values passed by us in our Customized Annoation MyAnno5.
    for(Annotation x : ann)  // using for each loop we can print all the values of Annotations from MyAnno5
    System.out.println(x);
       
    }
    
}
