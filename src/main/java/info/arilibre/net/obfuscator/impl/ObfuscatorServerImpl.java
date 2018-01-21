package info.arilibre.net.obfuscator.impl;

import info.arilibre.net.obfuscator.ObfuscatorServer;
import info.arilibre.net.obfuscator.ServerListener;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;

import java.io.IOException;

public class ObfuscatorServerImpl implements ObfuscatorServer {

    private Server server;
    private Handler handler;

    public ObfuscatorServerImpl(int port) {
        server = new Server(port);
        handler = new ParrotHandler("Hello World");
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { handler });
        server.setHandler(handlers);
    }

    @Override
    public void start() throws Exception {
        server.start();
        server.join();
    }

    @Override
    public void addListener(ServerListener listener) {

    }

    @Override
    public void shutdown() throws Exception {
        server.stop();
    }
}
