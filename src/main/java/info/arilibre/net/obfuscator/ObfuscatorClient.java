package info.arilibre.net.obfuscator;

import java.net.InetSocketAddress;
import java.util.stream.Stream;

public interface ObfuscatorClient {
    void connect(InetSocketAddress socketAddress);
    void send(byte[] data);
    Stream<byte[]> getReceiveStream();
    void disconnect();
    long getBytesSent();
    long getBytesReceived();
}
