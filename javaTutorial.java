
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class javaTutorial{
  
  
 public static void main (String[] args) {
   
   
   // takes 1 input
   
   Consumer<String> c=(str)->{
     System.out.println(str.toUpperCase());
     
   };
   c.accept("hercules");
   
   // takes 2 input
   
   BiConsumer<String,String> bi=(str1,str2)->{
     System.out.println(str1.concat(str2));
   };
   
   bi.accept("hello"," world");
   
   // chaining
   
   // first convert to uppercase and then calculate length
   
   
  // bi.accept("sai","krishna");
   
   Consumer<String> c2=(str)->{
     System.out.println(str.length());
     
   };
   
   c.andThen(c2).accept("sai");
   
   
   
 }
}