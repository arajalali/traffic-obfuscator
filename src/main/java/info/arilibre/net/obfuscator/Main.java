package info.arilibre.net.obfuscator;

import info.arilibre.net.obfuscator.impl.ObfuscatorServerImpl;
import org.apache.log4j.Logger;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String args[]) throws Exception {
        ObfuscatorServer server = new ObfuscatorServerImpl(8080);
        try {
            server.start();
        } catch (Exception ex) {
            LOGGER.error("Failed to start server.", ex);
        } finally {
            server.shutdown();
        }
    }
}
