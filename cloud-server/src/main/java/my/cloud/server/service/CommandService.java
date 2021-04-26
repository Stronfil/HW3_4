package my.cloud.server.service;

import io.netty.channel.Channel;

public interface CommandService {
    String processCommand(String command, Channel channel);

    String getCommand();
}
