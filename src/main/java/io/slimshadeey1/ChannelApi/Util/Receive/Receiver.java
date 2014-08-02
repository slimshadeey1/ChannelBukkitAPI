package io.slimshadeey1.ChannelApi.Util.Receive;

import io.slimshadeey1.ChannelApi.Objects.*;
import io.slimshadeey1.ChannelApi.Util.Other.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.messaging.*;

import java.io.*;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public class Receiver implements PluginMessageListener {
    public Receiver() {

    }

    @Override
    public void onPluginMessageReceived(String s, Player player, byte[] bytes) {
        DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes));
        if (ChannelExecMap.ChannelExecMap.containsKey(s)) {
            try {
                String sub = in.readUTF();
                ChannelExecMap.getExec(s, sub).invoke(new BAin(in));//This returns to the plugin a BAin packet format
            } catch (Exception e) {
            }
        } else if (BungeeCommandMap.BungeeExecMap.containsKey(s)) {
            try {
                String sub = in.readUTF();
                BungeeCommandMap.getExec(s, sub).invoke(in);
            } catch (Exception e) {
            }
        }
    }
}
