package mc.alk.ChannelAPI.API;

import com.google.common.io.*;
import mc.alk.ChannelAPI.API.*;
import mc.alk.ChannelAPI.Objects.*;
import org.bukkit.plugin.*;

/**
 * This class is dedicated to sending commands on a channel of your choice. This is a
 * constructor, so you need to create a new instance each time you send a message.
 * Created by Ben Byers on 7/17/2014.
 */
public class ChannelSender {
    private static Plugin plugin = PluginRegister.getPlugin();
    private static String server = BungeeControls.getServer();

    public ChannelSender(BAout packet) {
        plugin.getServer().sendPluginMessage(plugin, packet.getChannel(), packet.getPacket().toByteArray());
    }

    @Deprecated
    public ChannelSender(ByteArrayDataOutput out) {
        plugin.getServer().sendPluginMessage(plugin, "BungeeCord", out.toByteArray());
    }
}

