package java.util.regex;

import java.util.Map;
import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class Pattern implements java. io. Serializable {
  public static final int UNIX_LINES;
  public static final int CASE_INSENSITIVE;
  public static final int COMMENTS;
  public static final int MULTILINE;
  public static final int LITERAL;
  public static final int DOTALL;
  public static final int UNICODE_CASE;
  public static final int CANON_EQ;
  public static final int UNICODE_CHARACTER_CLASS;
  private static final long serialVersionUID;
  private String pattern;
  private int flags;
  private transient volatile boolean compiled;
  private transient String normalizedPattern;
  transient Node root;
  transient Node matchRoot;
  transient int [] buffer;
  transient volatile Map<String, Integer> namedGroups;
  transient GroupHead [] groupNodes;
  private transient int [] temp;
  transient int capturingGroupCount;
  transient int localCount;
  private transient int cursor;
  private transient int patternLength;
  private transient boolean hasSupplementary;
  public static Pattern compile(String regex) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public static Pattern compile(String regex, int flags) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public String pattern( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public Matcher matcher(CharSequence input) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public int flags( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public static boolean matches(String regex, CharSequence input) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public String [] split(CharSequence input, int limit) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  public String [] split(CharSequence input) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public static String quote(String s) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  private Pattern(String p, int f) {
  }
  private void normalize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private int normalizeCharClass(StringBuilder newPattern, int i) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private String produceEquivalentAlternation(String source) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private String [] producePermutations(String input) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private int getClass(int c) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private String composeOneStep(String input) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private void RemoveQEQuoting( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private void compile( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  Map<String, Integer> namedGroups( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private static void printObjectTree(Node node) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  static final class TreeInfo {
    int minLength;
    int maxLength;
    boolean maxValid;
    boolean deterministic;
    TreeInfo( ) {
    }
    void reset( ) {
                    throw new java . lang . RuntimeException ("Implementation stripped");
                  }
  }
  private boolean has(int f) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private void accept(int ch, String s) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private void mark(int c) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  private int peek( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  private int read( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  private int readEscaped( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private int next( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  private int nextEscaped( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private int peekPastWhitespace(int ch) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private int parsePastWhitespace(int ch) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private int parsePastLine( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private int peekPastLine( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private boolean isLineSeparator(int ch) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private int skip( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  private void unread( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private PatternSyntaxException error(String s) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private boolean findSupplementary(int start, int end) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static final boolean isSupplementary(int ch) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private Node expr(Node end) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private Node sequence(Node end) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private Node atom( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  private void append(int ch, int len) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private Node ref(int refNum) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private int escape(boolean inclass,boolean create, boolean isrange) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private CharProperty clazz(boolean consume) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private CharProperty bitsOrSingle(BitClass bits, int ch) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private CharProperty range(BitClass bits) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  private CharProperty family(boolean singleLetter, boolean maybeComplement) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  private CharProperty unicodeScriptPropertyFor(String name) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private CharProperty unicodeBlockPropertyFor(String name) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  private CharProperty charPropertyNodeFor(String name) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private String groupname(int ch) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  private Node group0( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private Node createGroup(boolean anonymous) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private void addFlag( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  private void subFlag( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  static final int MAX_REPS;
  static final int GREEDY;
  static final int LAZY;
  static final int POSSESSIVE;
  static final int INDEPENDENT;
  private Node closure(Node prev) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private int c( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  private int o( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  private int x( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  private int cursor( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  private void setcursor(int pos) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  private int uxxxx( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  private int u( ) {
                     throw new java . lang . RuntimeException ("Implementation stripped");
                   }
  private static final int countChars(CharSequence seq,int index, int lengthInCodePoints) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  private static final int countCodePoints(CharSequence seq) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private static final class BitClass extends BmpCharProperty {
    final boolean [] bits;
    BitClass( ) {
    }
    private BitClass(boolean [] bits) {
    }
    BitClass add(int c, int flags) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  private CharProperty newSingle(final int ch) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private Node newSlice(int [] buf,int count, boolean hasSupplementary) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  static class Node extends Object {
    Node next;
    Node( ) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static class LastNode extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static class Start extends Node {
    int minLength;
    Start(Node node) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class StartS extends Start {
    StartS(Node node) {
      super(node);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class Begin extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class End extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class Caret extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class UnixCaret extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class LastMatch extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class Dollar extends Node {
    boolean multiline;
    Dollar(boolean mul) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class UnixDollar extends Node {
    boolean multiline;
    UnixDollar(boolean mul) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class LineEnding extends Node {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  private static abstract class CharProperty extends Node {
    abstract boolean isSatisfiedBy(int ch) ;
    CharProperty complement( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  private static abstract class BmpCharProperty extends CharProperty {
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class SingleS extends CharProperty {
    final int c;
    SingleS(int c) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Single extends BmpCharProperty {
    final int c;
    Single(int c) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class SingleI extends BmpCharProperty {
    final int lower;
    final int upper;
    SingleI(int lower, int upper) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class SingleU extends CharProperty {
    final int lower;
    SingleU(int lower) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Block extends CharProperty {
    final Character. UnicodeBlock block;
    Block(Character. UnicodeBlock block) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Script extends CharProperty {
    final Character. UnicodeScript script;
    Script(Character. UnicodeScript script) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Category extends CharProperty {
    final int typeMask;
    Category(int typeMask) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Utype extends CharProperty {
    final UnicodeProp uprop;
    Utype(UnicodeProp uprop) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Ctype extends BmpCharProperty {
    final int ctype;
    Ctype(int ctype) {
    }
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class VertWS extends BmpCharProperty {
    boolean isSatisfiedBy(int cp) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class HorizWS extends BmpCharProperty {
    boolean isSatisfiedBy(int cp) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static class SliceNode extends Node {
    int [] buffer;
    SliceNode(int [] buf) {
    }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class Slice extends SliceNode {
    Slice(int [] buf) {
      super(buf);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static class SliceI extends SliceNode {
    SliceI(int [] buf) {
      super(buf);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class SliceU extends SliceNode {
    SliceU(int [] buf) {
      super(buf);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class SliceS extends SliceNode {
    SliceS(int [] buf) {
      super(buf);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static class SliceIS extends SliceNode {
    SliceIS(int [] buf) {
      super(buf);
    }
    int toLower(int c) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class SliceUS extends SliceIS {
    SliceUS(int [] buf) {
      super(buf);
    }
    int toLower(int c) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  }
  private static boolean inRange(int lower,int ch, int upper) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private static CharProperty rangeFor(final int lower, final int upper) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  private CharProperty caseInsensitiveRangeFor(final int lower, final int upper) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  static final class All extends CharProperty {
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Dot extends CharProperty {
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class UnixDot extends CharProperty {
    boolean isSatisfiedBy(int ch) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  }
  static final class Ques extends Node {
    Node atom;
    int type;
    Ques(Node node, int type) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class Curly extends Node {
    Node atom;
    int type;
    int cmin;
    int cmax;
    Curly(Node node,int cmin,int cmax, int type) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean match0(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean match1(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean match2(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class GroupCurly extends Node {
    Node atom;
    int type;
    int cmin;
    int cmax;
    int localIndex;
    int groupIndex;
    boolean capture;
    GroupCurly(Node node,int cmin,int cmax,int type,int local,int group, boolean capture) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean match0(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean match1(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean match2(Matcher matcher,int i,int j, CharSequence seq) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class BranchConn extends Node {
    BranchConn( ) {
    }
    ;
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class Branch extends Node {
    Node [] atoms;
    int size;
    Node conn;
    Branch(Node first,Node second, Node branchConn) {
    }
    void add(Node node) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class GroupHead extends Node {
    int localIndex;
    GroupHead(int localCount) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean matchRef(Matcher matcher,int i, CharSequence seq) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  }
  static final class GroupRef extends Node {
    GroupHead head;
    GroupRef(GroupHead head) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class GroupTail extends Node {
    int localIndex;
    int groupIndex;
    GroupTail(int localCount, int groupCount) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class Prolog extends Node {
    Loop loop;
    Prolog(Loop loop) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static class Loop extends Node {
    Node body;
    int countIndex;
    int beginIndex;
    int cmin, cmax;
    Loop(int countIndex, int beginIndex) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean matchInit(Matcher matcher,int i, CharSequence seq) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class LazyLoop extends Loop {
    LazyLoop(int countIndex, int beginIndex) {
      super(countIndex, beginIndex);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean matchInit(Matcher matcher,int i, CharSequence seq) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static class BackRef extends Node {
    int groupIndex;
    BackRef(int groupCount) {
      super( );
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static class CIBackRef extends Node {
    int groupIndex;
    boolean doUnicodeCase;
    CIBackRef(int groupCount, boolean doUnicodeCase) {
      super( );
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class First extends Node {
    Node atom;
    First(Node node) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class Conditional extends Node {
    Node cond, yes, not;
    Conditional(Node cond,Node yes, Node not) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class Pos extends Node {
    Node cond;
    Pos(Node cond) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class Neg extends Node {
    Node cond;
    Neg(Node cond) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static Node lookbehindEnd;
  static class Behind extends Node {
    Node cond;
    int rmax, rmin;
    Behind(Node cond,int rmax, int rmin) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class BehindS extends Behind {
    BehindS(Node cond,int rmax, int rmin) {
      super(cond, rmax, rmin);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static class NotBehind extends Node {
    Node cond;
    int rmax, rmin;
    NotBehind(Node cond,int rmax, int rmin) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static final class NotBehindS extends NotBehind {
    NotBehindS(Node cond,int rmax, int rmin) {
      super(cond, rmax, rmin);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  private static CharProperty union(final CharProperty lhs, final CharProperty rhs) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  private static CharProperty intersection(final CharProperty lhs, final CharProperty rhs) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
  private static CharProperty setDifference(final CharProperty lhs, final CharProperty rhs) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  static final class Bound extends Node {
    static int LEFT;
    static int RIGHT;
    static int BOTH;
    static int NONE;
    int type;
    boolean useUWORD;
    Bound(int n, boolean useUWORD) {
    }
    boolean isWord(int ch) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    int check(Matcher matcher,int i, CharSequence seq) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  private static boolean hasBaseCharacter(Matcher matcher,int i, CharSequence seq) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  static class BnM extends Node {
    int [] buffer;
    int [] lastOcc;
    int [] optoSft;
    static Node optimize(Node node) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
    BnM(int [] src,int [] lastOcc,int [] optoSft, Node next) {
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
    boolean study(TreeInfo info) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  }
  static final class BnMS extends BnM {
    int lengthInChars;
    BnMS(int [] src,int [] lastOcc,int [] optoSft, Node next) {
      super(src, lastOcc, optoSft, next);
    }
    boolean match(Matcher matcher,int i, CharSequence seq) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  }
  static Node accept;
  static Node lastAccept;
  private static class CharPropertyNames {
    static CharProperty charPropertyFor(String name) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    private static abstract class CharPropertyFactory {
      abstract CharProperty make( ) ;
    }
    private static void defCategory(String name, final int typeMask) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
    private static void defRange(String name,final int lower, final int upper) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
    private static void defCtype(String name, final int ctype) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
    private static abstract class CloneableProperty extends CharProperty implements Cloneable {
      public CloneableProperty clone( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    }
    private static void defClone(String name, final CloneableProperty p) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    private static final HashMap<String, CharPropertyFactory> map;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
  }
  public Predicate<String> asPredicate( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public Stream<String> splitAsStream(final CharSequence input) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
}