package java.nio.channels;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.io.IOException;

public interface MulticastChannel extends NetworkChannel {
  @Override void close( ) throws IOException ;
  MembershipKey join(InetAddress group, NetworkInterface interf) throws IOException ;
  MembershipKey join(InetAddress group,NetworkInterface interf, InetAddress source) throws IOException ;
}