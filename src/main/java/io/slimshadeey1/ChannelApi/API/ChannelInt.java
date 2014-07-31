package mc.alk.ChannelApi.API;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public @interface ChannelInt {
    String channel() default "";

    String subchannel() default "";
}
