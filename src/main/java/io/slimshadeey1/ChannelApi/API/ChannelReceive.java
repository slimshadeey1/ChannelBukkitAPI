package io.slimshadeey1.ChannelApi.API;

import io.slimshadeey1.ChannelApi.Util.*;

import java.lang.reflect.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class ChannelReceive {
    public ChannelReceive(ChannelExec exec) {
        for (Method method : exec.getClass().getMethods()) {
            try {
                Receive channel = method.getAnnotation(Receive.class);
                new Enable(channel.channel(), channel.subchannel(), method, false);
            } catch (Exception e) {
            }
        }
    }
}
