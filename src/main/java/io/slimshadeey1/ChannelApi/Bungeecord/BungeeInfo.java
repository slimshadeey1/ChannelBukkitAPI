package mc.alk.ChannelApi.Bungeecord;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeInfo {
    public static void onEnable() {
        Server();
    }

    public static void PlayerCount(String Server) {
        new BungeeSender("PlayerCount", Server);
    }

    public static void PlayerList(String Server) {
        new BungeeSender("PlayerList", Server);
    }

    public static void getServers() {
        new BungeeSender("getServers");
    }

    public static void connectPlayer(String player, String Server) {
        new BungeeSender("ConnectOther", player, Server);
    }

    public static void Message(String player, String Message) {
        new BungeeSender("Message", player, Message);
    }

    public static void Server() {
        new BungeeSender("GetServer");
    }
}
