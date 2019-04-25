package java.lang;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class ProcessBuilder {
  public ProcessBuilder(List<String> command) {
  }
  public ProcessBuilder(String ... command) {
  }
  public ProcessBuilder command(List<String> command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder command(String ... command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<String> command( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, String> environment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public File directory( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder directory(File directory) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static abstract class Redirect {
    public enum Type {
      PIPE, INHERIT, READ, WRITE, APPEND
    }
    ;
    public abstract Type type( ) ;
    public static final Redirect PIPE;
    public static final Redirect INHERIT;
    public File file( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static Redirect from(final File file) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static Redirect to(final File file) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static Redirect appendTo(final File file) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object obj) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    private Redirect( ) {
    }
  }
  public ProcessBuilder redirectInput(Redirect source) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectOutput(Redirect destination) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectError(Redirect destination) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectInput(File file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectOutput(File file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectError(File file) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Redirect redirectInput( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Redirect redirectOutput( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Redirect redirectError( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder inheritIO( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean redirectErrorStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ProcessBuilder redirectErrorStream(boolean redirectErrorStream) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Process start( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}