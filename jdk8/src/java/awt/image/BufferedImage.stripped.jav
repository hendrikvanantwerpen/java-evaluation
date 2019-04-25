package java.awt.image;

import java.awt.Transparency;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Hashtable;
import java.util.Vector;

public class BufferedImage extends java. awt. Image implements WritableRenderedImage, Transparency {
  public static final int TYPE_CUSTOM;
  public static final int TYPE_INT_RGB;
  public static final int TYPE_INT_ARGB;
  public static final int TYPE_INT_ARGB_PRE;
  public static final int TYPE_INT_BGR;
  public static final int TYPE_3BYTE_BGR;
  public static final int TYPE_4BYTE_ABGR;
  public static final int TYPE_4BYTE_ABGR_PRE;
  public static final int TYPE_USHORT_565_RGB;
  public static final int TYPE_USHORT_555_RGB;
  public static final int TYPE_BYTE_GRAY;
  public static final int TYPE_USHORT_GRAY;
  public static final int TYPE_BYTE_BINARY;
  public static final int TYPE_BYTE_INDEXED;
  public BufferedImage(int width,int height, int imageType) {
  }
  public BufferedImage(int width,int height,int imageType, IndexColorModel cm) {
  }
  public BufferedImage(ColorModel cm,WritableRaster raster,boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
  }
  public int getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorModel getColorModel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster getRaster( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster getAlphaRaster( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRGB(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getRGB(int startX,int startY,int w,int h,int [] rgbArray,int offset, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setRGB(int x,int y, int rgb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRGB(int startX,int startY,int w,int h,int [] rgbArray,int offset, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWidth(ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHeight(ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ImageProducer getSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getProperty(String name, ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getProperty(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. awt. Graphics getGraphics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Graphics2D createGraphics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferedImage getSubimage(int x,int y,int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAlphaPremultiplied( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void coerceData(boolean isAlphaPremultiplied) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Vector<RenderedImage> getSources( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] getPropertyNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel getSampleModel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumXTiles( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumYTiles( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinTileX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinTileY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTileWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTileHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTileGridXOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTileGridYOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Raster getTile(int tileX, int tileY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Raster getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Raster getData(Rectangle rect) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster copyData(WritableRaster outRaster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setData(Raster r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addTileObserver(TileObserver to) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeTileObserver(TileObserver to) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTileWritable(int tileX, int tileY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point [] getWritableTileIndices( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasTileWriters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster getWritableTile(int tileX, int tileY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void releaseWritableTile(int tileX, int tileY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}