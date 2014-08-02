package io.slimshadeey1.ChannelApi.API;


import io.slimshadeey1.ChannelApi.Bungeecord.*;

/**
 * Created by Ben Byers on 7/30/2014.
 */
public class BungeeControls {
    public static String getServer() {
        BungeeInfo.Server();
        return BungeeListeners.getServer();
    }

    public static String[] getServers() {
        BungeeInfo.getServers();
        return BungeeListeners.getServers();
    }

    public static Integer getPlayerCount(String Server) {
        BungeeInfo.PlayerCount(Server);
        return BungeeListeners.getPlayerCount();
    }

    public static String[] getPlayerList(String server) {
        BungeeInfo.PlayerList(server);
        return BungeeListeners.getPlayers();
    }

    public static void SendPlayer(String player, String server) {
        BungeeInfo.connectPlayer(player, server);
    }

    public static void Message(String player, String message) {
        BungeeInfo.Message(player, message);
    }
}
