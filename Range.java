import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  /*
*@precondition: start <= end
*@param start : the starting value (inclusive)
*@param end : the ending value which is also inclusive.*/
  public Range(int start,  int end){
    this.start=start;
    this.end=end;
    this.current=start;
  }

  public void reset(){
    this.current=start;
  }
  public int length(){
    return ((this.end-this.start)+1);
  }

}
