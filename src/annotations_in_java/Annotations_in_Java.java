/* Important Notes for Annotations:
--> Just like interface creation the Annotaion created in the same way.
--> only we need to add @Interface to make it as Annotation.
--> Annotattions can be used with Intefece, class, Data Variables, Metods, Local and Instance variables.
--> The methods we are creating inside the Annotaion is not called as method , ther are elemnts of Annatations.
--> We can create n numbers of elemnets inside Annatation , but we can use it at appropriate place according to our use.
*/


package annotations_in_java;

import java.lang.annotation.Annotation;
    
@interface MyAnno{  // Created Annatations MyAnno

// Note:  We need to decalare all the elements while calling the Annatotaion .
// Note but iw we make any Annaotation element as default its not manadatory to declare.
// Annotation dont throw Exceptions    
// The below are called as an elemnt of Annatation. The elemnts of Annotations can not have parameter as well.
 String name();  
 String Project();
 String date();
 String version() default "10.02";
}


@MyAnno(name="Sumit" , Project="DBMS", date="31/08/1988", version="10.02")
public class Annotations_in_Java {
    
@MyAnno(name="Sumit" , Project="DBMS", date="31/08/1988")
    int data;

@MyAnno(name="Sumit" , Project="DBMS", date="31/08/1988")
    public static void main(String[] args) {
       
      @MyAnno(name="Sumit" , Project="DBMS", date="31/08/1988")
        int x;
    }
    
}
