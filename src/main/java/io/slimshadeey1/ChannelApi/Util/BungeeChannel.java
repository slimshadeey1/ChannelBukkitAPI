package io.slimshadeey1.ChannelApi.Util;


import io.slimshadeey1.ChannelApi.API.*;
import io.slimshadeey1.ChannelApi.Util.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeChannel {
    public BungeeChannel(ChannelExec exec) {
        for (Method method : exec.getClass().getMethods()) {
            try {
                Receive channel = method.getAnnotation(Receive.class);
                new Enable(channel.channel(), channel.subchannel(), method, true);
            } catch (Exception e) {
            }
        }
    }
}
