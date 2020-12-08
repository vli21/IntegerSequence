public class Tester{
public static void main(String args[]){
    IntegerSequence a = new Range(10,15);
    IntegerSequence b = new Range(1,15);
    IntegerSequence c = new Range(-30,15);
    System.out.println(a.length());
    System.out.println(b.length());
    System.out.println(c.length());

    while(a.hasNext()){
     System.out.print(a.next());
      if( a.hasNext())
         System.out.print( ", " );
   }
   System.out.println();


    }
}
