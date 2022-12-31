/*
#We have following built-in Annotations 
1)Retaintion 2)Documented 3)Target 4)Inherited 5)Repeatable
-----------------------------------------------------------
1)Retention Annotation --> some Annotations is used for another Annotation are known as Meta Annotattion. Retention is a meta Annotation.
-->There are three types of retention policies: SOURCE, CLASS, and RUNTIME.
Example :
@Retention(RetentionPolicy.SOURCE)
@interface SourceRetention
{
    String value() default "Source Retention";
}
------------------------------------------------
2)Document Annotations  -- > These are helpful while creating JavaDoc , thes can be used as description for Annoatation.

3)Target Annotation are the one which help Annotaions elements to be declared over the  paricular filed(like class, method, variables..etc)
--> With the help of Target Annotation,We can Target more than one field by seperating with the comma(,).
exapmle: @Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD})

4)Inherited --> Inheritted Annoation means if the Annaotation is used upon over any class then its sub-class(child class) have also the same Annotations.

5)Repeatble--> If any Annotation is repeated multiple times we can write it as Repeatable Annotations.
*/


package annotations_in_java;
import java.lang.annotation.*;
import java.lang.annotation.Retention;


@Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD})
@interface MyAnno2{
    
    String name();
    String date();
    String version() default "13.0";
    String Project();
}

public class InBuilt_Annotations {
    
}
