package lesson101.lambda.consumer;

@FunctionalInterface
public interface Consumer<T> {

  void accept(T t);

}






