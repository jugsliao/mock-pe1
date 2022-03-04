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
