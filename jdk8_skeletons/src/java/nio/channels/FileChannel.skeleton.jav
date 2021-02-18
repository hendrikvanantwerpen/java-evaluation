package java.nio.channels;

import java.io.*;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.nio.file.*;
//import java.nio.file.spi.*;

public abstract class FileChannel extends AbstractInterruptibleChannel implements SeekableByteChannel, GatheringByteChannel, ScatteringByteChannel {
  public static class MapMode {
  }
}