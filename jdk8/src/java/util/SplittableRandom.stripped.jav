package java.util;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public final class SplittableRandom {
  private SplittableRandom(long seed, long gamma) {
  }
  public SplittableRandom(long seed) {
    this(seed, GOLDEN_GAMMA);
  }
  public SplittableRandom( ) {
  }
  public SplittableRandom split( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt(int bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt(int origin, int bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong(long bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong(long origin, long bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double nextDouble( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double nextDouble(double bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double nextDouble(double origin, double bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean nextBoolean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IntStream ints(long streamSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IntStream ints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IntStream ints(long streamSize,int randomNumberOrigin, int randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LongStream longs(long streamSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LongStream longs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LongStream longs(long streamSize,long randomNumberOrigin, long randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DoubleStream doubles(long streamSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DoubleStream doubles( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DoubleStream doubles(long streamSize,double randomNumberOrigin, double randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}