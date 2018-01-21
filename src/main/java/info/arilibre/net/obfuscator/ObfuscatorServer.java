package info.arilibre.net.obfuscator;

import java.io.IOException;

public interface ObfuscatorServer {
    void start() throws Exception;
    void addListener(ServerListener listener);
    void shutdown() throws Exception;
}
