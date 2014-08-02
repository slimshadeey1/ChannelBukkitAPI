package io.slimshadeey1.ChannelApi.Util;


import io.slimshadeey1.ChannelApi.API.*;
import org.bukkit.plugin.messaging.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class Enable {
    private Messenger plugin = PluginRegister.getPlugin().getServer().getMessenger();

    public Enable(String channel, String subChannel, Method exec, Boolean Bungee) {
        if (!plugin.isIncomingChannelRegistered(PluginRegister.getPlugin(), channel))
            plugin.registerIncomingPluginChannel(PluginRegister.getPlugin(), channel, new Receiver());
        if (!plugin.isOutgoingChannelRegistered(PluginRegister.getPlugin(), channel))
            plugin.registerOutgoingPluginChannel(PluginRegister.getPlugin(), channel);
        ChannelExecMap.addChannel(channel.toLowerCase(), subChannel, exec);
        if (Bungee) {
            BungeeCommandMap.addChannel(channel.toLowerCase(), subChannel.toLowerCase(), exec);
        } else {
            ChannelExecMap.addChannel(channel.toLowerCase(), subChannel.toLowerCase(), exec);
        }
    }
}
