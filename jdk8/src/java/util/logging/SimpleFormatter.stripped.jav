package java.util.logging;

import java.io.*;
import java.text.*;

public class SimpleFormatter extends Formatter {
  public synchronized String format(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}