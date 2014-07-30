package mc.alk.ChannelAPI.Bungeecord;

import mc.alk.ChannelAPI.API.*;

import java.io.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeListeners implements ChannelExec{
    public static Integer playerCount;
    public static String[] servers;
    public static String[] players;
    public static String server;



    @ChannelInt(channel = "BungeeCord",subchannel = "GetServer")
    public static void GetServer(DataInputStream in) {
        try {
            String servername = in.readUTF();
            BungeeInfo.setServer(servername);
            server=servername;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @ChannelInt(channel = "BungeeCord",subchannel = "PlayerList")
    public static void PlayerListin(DataInputStream in){
        try {
            String server = in.readUTF(); // The name of the server you got the player list of, as given in args.
            String[] playerList = in.readUTF().split(", ");
            players=playerList;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @ChannelInt(channel = "BungeeCord",subchannel = "PlayerCount")
    public static void PlayerCountin(DataInputStream in){
        try {
            String server = in.readUTF(); // Name of server, as given in the arguments
            int playercount = in.readInt();
            playerCount=playercount;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @ChannelInt(channel = "BungeeCord",subchannel = "GetServers")
    public static void Serversin(DataInputStream in){
        try {
            String[] serverList = in.readUTF().split(", ");
            servers=serverList;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String getServer() {
        return server;
    }
    public static Integer getPlayerCount() {
        return playerCount;
    }
    public static String[] getPlayers() {
        return players;
    }
    public static String[] getServers() {
        return servers;
    }
}
