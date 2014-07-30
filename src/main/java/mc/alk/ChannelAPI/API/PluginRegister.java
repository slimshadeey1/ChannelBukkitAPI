package mc.alk.ChannelAPI.API;

import mc.alk.ChannelAPI.API.*;
import mc.alk.ChannelAPI.Bungeecord.*;
import mc.alk.ChannelAPI.Util.*;
import org.bukkit.plugin.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class PluginRegister {
    private static Plugin plugin;
    public PluginRegister(Plugin plug){
        plugin = plug;
        new BungeeChannel(new BungeeListeners());
    }
    public static Plugin getPlugin() {
        return plugin;
    }
}
