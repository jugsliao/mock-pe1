interface BooleanCondition<T> {
  boolean test(T t); 
}

interface Transformer<T, U> {
  public U transform(T t);
}

public class GreaterThanTwo implements BooleanCondition<Integer> {
  @Override
  public boolean test(Integer t) {
    return t > 2;
  }
}

public class IntegerToString implements Transformer<Integer,String> {

  @Override
  public String transform(Integer t) {
    return "\"" + t.toString() + "\"";
  }
}

class LastDigitsOfHashCode implements Transformer<Object, Integer> {
  private int lastDigits;

  public LastDigitsOfHashCode(int lastDigits) {
    this.lastDigits = lastDigits;
  }

  @Override
  public Integer transform(Object obj) {
    int hashCode = obj.hashCode();
    String strHashCode = String.valueOf(hashCode);
    String strLastDigits = strHashCode.substring(strHashCode.length() - this.lastDigits);
    return Integer.parseInt(strLastDigits);
  } 
}
