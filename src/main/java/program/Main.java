package program;


import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;


public class Main
{
    public static void main(String[] arguments) throws Exception
    {
        JDABuilder.createDefault("token").enableIntents(GatewayIntent.GUILD_MESSAGES).addEventListeners(new MsgListener()).build();
    }
}