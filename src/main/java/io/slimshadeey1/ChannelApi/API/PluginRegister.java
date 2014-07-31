package mc.alk.ChannelApi.API;

import mc.alk.ChannelApi.Bungeecord.*;
import mc.alk.ChannelApi.Util.*;
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
