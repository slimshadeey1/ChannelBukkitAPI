package io.slimshadeey1.ChannelApi.Bungeecord;

import com.google.common.io.*;
import io.slimshadeey1.ChannelApi.API.*;
import org.bukkit.plugin.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeSender {
    public Plugin plugin = PluginRegister.getPlugin();

    public BungeeSender(String subChannel, String... args) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        //Define Sub Channel
        out.writeUTF(subChannel);
        for (String arg : args) {
            out.writeUTF(arg);
        }
        new ChannelSender(out);
    }
}
