package java.util.regex;


public final class Pattern implements java. io. Serializable {
  static final class TreeInfo {
  }
  private static final class BitClass extends BmpCharProperty {
  }
  static class Node extends Object {
  }
  static class LastNode extends Node {
  }
  static class Start extends Node {
  }
  static final class StartS extends Start {
  }
  static final class Begin extends Node {
  }
  static final class End extends Node {
  }
  static final class Caret extends Node {
  }
  static final class UnixCaret extends Node {
  }
  static final class LastMatch extends Node {
  }
  static final class Dollar extends Node {
  }
  static final class UnixDollar extends Node {
  }
  static final class LineEnding extends Node {
  }
  private static abstract class CharProperty extends Node {
  }
  private static abstract class BmpCharProperty extends CharProperty {
  }
  static final class SingleS extends CharProperty {
  }
  static final class Single extends BmpCharProperty {
  }
  static final class SingleI extends BmpCharProperty {
  }
  static final class SingleU extends CharProperty {
  }
  static final class Block extends CharProperty {
  }
  static final class Script extends CharProperty {
  }
  static final class Category extends CharProperty {
  }
  static final class Utype extends CharProperty {
  }
  static final class Ctype extends BmpCharProperty {
  }
  static final class VertWS extends BmpCharProperty {
  }
  static final class HorizWS extends BmpCharProperty {
  }
  static class SliceNode extends Node {
  }
  static final class Slice extends SliceNode {
  }
  static class SliceI extends SliceNode {
  }
  static final class SliceU extends SliceNode {
  }
  static final class SliceS extends SliceNode {
  }
  static class SliceIS extends SliceNode {
  }
  static final class SliceUS extends SliceIS {
  }
  static final class All extends CharProperty {
  }
  static final class Dot extends CharProperty {
  }
  static final class UnixDot extends CharProperty {
  }
  static final class Ques extends Node {
  }
  static final class Curly extends Node {
  }
  static final class GroupCurly extends Node {
  }
  static final class BranchConn extends Node {
  }
  static final class Branch extends Node {
  }
  static final class GroupHead extends Node {
  }
  static final class GroupRef extends Node {
  }
  static final class GroupTail extends Node {
  }
  static final class Prolog extends Node {
  }
  static class Loop extends Node {
  }
  static final class LazyLoop extends Loop {
  }
  static class BackRef extends Node {
  }
  static class CIBackRef extends Node {
  }
  static final class First extends Node {
  }
  static final class Conditional extends Node {
  }
  static final class Pos extends Node {
  }
  static final class Neg extends Node {
  }
  static class Behind extends Node {
  }
  static final class BehindS extends Behind {
  }
  static class NotBehind extends Node {
  }
  static final class NotBehindS extends NotBehind {
  }
  static final class Bound extends Node {
  }
  static class BnM extends Node {
  }
  static final class BnMS extends BnM {
  }
  private static class CharPropertyNames {
    private static abstract class CharPropertyFactory {
    }
    private static abstract class CloneableProperty extends CharProperty implements Cloneable {
    }
  }
}