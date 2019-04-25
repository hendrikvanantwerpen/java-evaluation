package java.awt.image;

import java.awt.Rectangle;
import java.awt.Point;

public class Raster {
  public static WritableRaster createInterleavedRaster(int dataType,int w,int h,int bands, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createInterleavedRaster(int dataType,int w,int h,int scanlineStride,int pixelStride,int bandOffsets[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createBandedRaster(int dataType,int w,int h,int bands, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createBandedRaster(int dataType,int w,int h,int scanlineStride,int bankIndices[],int bandOffsets[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createPackedRaster(int dataType,int w,int h,int bandMasks[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createPackedRaster(int dataType,int w,int h,int bands,int bitsPerBand, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createInterleavedRaster(DataBuffer dataBuffer,int w,int h,int scanlineStride,int pixelStride,int bandOffsets[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createBandedRaster(DataBuffer dataBuffer,int w,int h,int scanlineStride,int bankIndices[],int bandOffsets[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createPackedRaster(DataBuffer dataBuffer,int w,int h,int scanlineStride,int bandMasks[], Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createPackedRaster(DataBuffer dataBuffer,int w,int h,int bitsPerPixel, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Raster createRaster(SampleModel sm,DataBuffer db, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createWritableRaster(SampleModel sm, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static WritableRaster createWritableRaster(SampleModel sm,DataBuffer db, Point location) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected Raster(SampleModel sampleModel, Point origin) {
    this(sampleModel, sampleModel. createDataBuffer( ), new Rectangle (origin.x,origin.y,sampleModel. getWidth( ),sampleModel. getHeight( )), origin, null);
  }
  protected Raster(SampleModel sampleModel,DataBuffer dataBuffer, Point origin) {
    this(sampleModel, dataBuffer, new Rectangle (origin.x,origin.y,sampleModel. getWidth( ),sampleModel. getHeight( )), origin, null);
  }
  protected Raster(SampleModel sampleModel,DataBuffer dataBuffer,Rectangle aRegion,Point sampleModelTranslate, Raster parent) {
  }
  public Raster getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getSampleModelTranslateX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getSampleModelTranslateY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster(Rectangle rect) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster(int x,int y,int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Raster createTranslatedChild(int childMinX, int childMinY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Raster createChild(int parentX,int parentY,int width,int height,int childMinX,int childMinY, int bandList[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getMinX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getMinY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getNumBands( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getNumDataElements( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getTransferType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataBuffer getDataBuffer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel getSampleModel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int x,int y, Object outData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int x,int y,int w,int h, Object outData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixel(int x,int y, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getPixel(int x,int y, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getPixel(int x,int y, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixels(int x,int y,int w,int h, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getPixels(int x,int y,int w,int h, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getPixels(int x,int y,int w,int h, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSample(int x,int y, int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getSampleFloat(int x,int y, int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getSampleDouble(int x,int y, int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getSamples(int x,int y,int w,int h,int b, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getSamples(int x,int y,int w,int h,int b, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getSamples(int x,int y,int w,int h,int b, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}