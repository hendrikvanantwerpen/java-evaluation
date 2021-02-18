package java.util;

import java.io.Closeable;
import java.io.Flushable;

public final class Formatter implements Closeable, Flushable {
  private interface FormatString {
  }
  private class FixedString implements FormatString {
  }
  public enum BigDecimalLayoutForm {
  }
  private class FormatSpecifier implements FormatString {
    private class BigDecimalLayout {
    }
  }
  private static class Flags {
  }
  private static class Conversion {
  }
  private static class DateTime {
  }
}