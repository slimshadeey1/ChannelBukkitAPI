package mc.alk.ChannelAPI.Util;

import mc.alk.ChannelAPI.API.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class Enable {
    public Enable(String channel, String subChannel, Method exec, Boolean Bungee){
        PluginRegister.getPlugin().getServer().getMessenger().registerIncomingPluginChannel(PluginRegister.getPlugin(),channel,new Receiver());
        PluginRegister.getPlugin().getServer().getMessenger().registerOutgoingPluginChannel(PluginRegister.getPlugin(),channel);
        ChannelExecMap.addChannel(channel.toLowerCase(), subChannel, exec);
        if(Bungee){
            BungeeCommandMap.addChannel(channel.toLowerCase(),subChannel.toLowerCase(),exec);
        }else {
            ChannelExecMap.addChannel(channel.toLowerCase(), subChannel.toLowerCase(), exec);
        }
    }
}
