package java.util;

import java.io.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Random implements java. io. Serializable {
  public Random( ) {
    this(seedUniquifier( ) ^ System. nanoTime( ));
  }
  public Random(long seed) {
  }
  synchronized public void setSeed(long seed) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void nextBytes(byte [] bytes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextInt(int bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long nextLong( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean nextBoolean( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float nextFloat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double nextDouble( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  synchronized public double nextGaussian( ) {
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