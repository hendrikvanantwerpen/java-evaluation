package java.lang;

import java.util.Comparator;

public final class String implements java. io. Serializable, Comparable<String>, CharSequence {
  private static class CaseInsensitiveComparator implements Comparator<String>, java. io. Serializable {
  }
}