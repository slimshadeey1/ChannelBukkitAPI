package io.slimshadeey1.ChannelApi.API;

/**
 * Created by Ben Byers on 7/28/2014.
 */
public @interface Receive {
    String channel() default "";

    String subchannel() default "";
}
