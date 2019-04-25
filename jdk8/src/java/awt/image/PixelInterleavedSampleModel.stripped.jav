package java.awt.image;


public class PixelInterleavedSampleModel extends ComponentSampleModel {
  public PixelInterleavedSampleModel(int dataType,int w,int h,int pixelStride,int scanlineStride, int bandOffsets[]) {
    super(dataType, w, h, pixelStride, scanlineStride, bandOffsets);
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createSubsetSampleModel(int bands[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}