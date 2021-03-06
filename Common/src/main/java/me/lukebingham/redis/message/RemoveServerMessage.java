package me.lukebingham.redis.message;

import me.lukebingham.redis.JMessage;
import me.lukebingham.util.ServerType;

/**
 * Created by LukeBingham on 17/03/2017.
 */
public final class RemoveServerMessage implements JMessage {

    private final ServerType serverType;
    private final int serverId;

    private final int port;

    public RemoveServerMessage(ServerType serverType, int serverId, int port) {
        this.serverType = serverType;
        this.serverId = serverId;
        this.port = port;
    }

    public final ServerType getServerType() {
        return serverType;
    }

    public final int getServerId() {
        return serverId;
    }

    public final int getPort() {
        return port;
    }
}
