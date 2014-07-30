package mc.alk.ChannelAPI.Util;

import mc.alk.ChannelAPI.API.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeChannel {
    public BungeeChannel(ChannelExec exec) {
        for (Method method : exec.getClass().getMethods()) {
            try {
                ChannelInt channel = method.getAnnotation(ChannelInt.class);
                new Enable(channel.channel(), channel.subchannel(), method, true);
            } catch (Exception e) {
            }
        }
    }
}
