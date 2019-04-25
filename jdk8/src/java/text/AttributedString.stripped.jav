package java.text;

import java.util.*;
import java.text.AttributedCharacterIterator.Attribute;

public class AttributedString {
  AttributedString(AttributedCharacterIterator [] iterators) {
  }
  public AttributedString(String text) {
  }
  public AttributedString(String text, Map<? extends Attribute, ?> attributes) {
  }
  public AttributedString(AttributedCharacterIterator text) {
    this(text, text. getBeginIndex( ), text. getEndIndex( ), null);
  }
  public AttributedString(AttributedCharacterIterator text,int beginIndex, int endIndex) {
    this(text, beginIndex, endIndex, null);
  }
  public AttributedString(AttributedCharacterIterator text,int beginIndex,int endIndex, Attribute [] attributes) {
  }
  public void addAttribute(Attribute attribute, Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addAttribute(Attribute attribute,Object value,int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addAttributes(Map<? extends Attribute, ?> attributes,int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AttributedCharacterIterator getIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AttributedCharacterIterator getIterator(Attribute [] attributes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AttributedCharacterIterator getIterator(Attribute [] attributes,int beginIndex, int endIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}