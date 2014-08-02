package io.slimshadeey1.ChannelApi.API;

import io.slimshadeey1.ChannelApi.Bungeecord.*;
import io.slimshadeey1.ChannelApi.Util.Other.*;
import org.bukkit.plugin.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class PluginRegister {
    private static Plugin plugin;

    public PluginRegister(Plugin plug) {
        plugin = plug;
        new BungeeChannel(new BungeeListeners());
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
