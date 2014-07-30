package mc.alk.ChannelAPI.Util;

import java.lang.reflect.*;
import java.util.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class BungeeCommandMap {
    protected static HashMap<String, TreeMap<String, Method>> BungeeExecMap = new HashMap<String, TreeMap<String, Method>>();

    public static void addChannel(String Channel, String subChannel, Method executor) {
        if (BungeeExecMap.containsKey(Channel.toLowerCase())) {
            TreeMap<String, Method> subExec = BungeeExecMap.remove(Channel.toLowerCase());
            subExec.put(subChannel.toLowerCase(), executor);
            BungeeExecMap.put(Channel.toLowerCase(), subExec);
        } else {
            TreeMap<String, Method> subExec = new TreeMap<String, Method>();
            subExec.put(subChannel.toLowerCase(), executor);
            BungeeExecMap.put(Channel.toLowerCase(), subExec);
        }
    }


    public static Method getExec(String Channel, String SubChannel) {
        TreeMap<String, Method> SubExec = BungeeExecMap.get(Channel.toLowerCase());
        return SubExec.get(SubChannel.toLowerCase());
    }
}
