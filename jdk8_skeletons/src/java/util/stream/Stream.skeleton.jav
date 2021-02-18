package java.util.stream;

import java.util.function.Consumer;

public interface Stream<T> extends BaseStream<T, Stream<T>> {
  public interface Builder<T> extends Consumer<T> {
  }
}