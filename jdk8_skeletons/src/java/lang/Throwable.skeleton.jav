package java.lang;

import java.io.*;
import java.util.*;

public class Throwable implements Serializable {
  private static class SentinelHolder {
  }
  private abstract static class PrintStreamOrWriter {
  }
  private static class WrappedPrintStream extends PrintStreamOrWriter {
  }
  private static class WrappedPrintWriter extends PrintStreamOrWriter {
  }
}