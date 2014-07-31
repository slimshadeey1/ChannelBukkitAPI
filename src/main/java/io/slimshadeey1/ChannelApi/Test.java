package mc.alk.ChannelApi;

import mc.alk.ChannelApi.API.*;
import mc.alk.ChannelApi.Objects.*;

import java.util.*;


/**
 * Created by Ben Byers on 7/28/2014.
 */
public class Test implements ChannelExec {
    public static void sendMe() { //This is how you send something
        BAout message = new BAout("channel", "sub");
        ArrayList<String> mine = new ArrayList<>(); //Everything in this will be sent
        mine.add("Hello");
        message.setData(mine);
        message.setServer("apple");//Dont forget to set this or it will go to ALL!
        new ChannelSender(message);//send the message
    }
}
