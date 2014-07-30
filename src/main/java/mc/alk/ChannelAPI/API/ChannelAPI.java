package mc.alk.ChannelAPI.API;

import mc.alk.ChannelAPI.Util.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class ChannelAPI {
    public ChannelAPI(ChannelExec exec) {
        for (Method method : exec.getClass().getMethods()) {
            try {
                ChannelInt channel = method.getAnnotation(ChannelInt.class);
                new Enable(channel.channel(), channel.subchannel(), method, false);
            } catch (Exception e) {
            }
        }
    }
}
