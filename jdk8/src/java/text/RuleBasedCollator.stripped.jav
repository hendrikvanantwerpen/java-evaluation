package java.text;


public class RuleBasedCollator extends Collator {
  public RuleBasedCollator(String rules) throws ParseException{
    this(rules, Collator.CANONICAL_DECOMPOSITION);
  }
  RuleBasedCollator(String rules, int decomp) throws ParseException{
  }
  private RuleBasedCollator(RuleBasedCollator that) {
  }
  public String getRules( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CollationElementIterator getCollationElementIterator(String source) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CollationElementIterator getCollationElementIterator(CharacterIterator source) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int compare(String source, String target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized CollationKey getCollationKey(String source) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}