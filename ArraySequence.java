import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
  }
  public void reset(){  }
  public int length(){  }

//When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){  }

//@throws NoSuchElementException when hasNext() is false.
//This will return the current value, it will also increase current value by 1.
//e.g.  if current is 5. This will make current 6, and return 5.
  public int next(){    }

}
