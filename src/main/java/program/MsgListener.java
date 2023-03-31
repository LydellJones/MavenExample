package program;


import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MsgListener extends ListenerAdapter 
{
    @Override
     public void onReady(ReadyEvent event)
     {
         System.out.println("I am ready to go!");
     }

    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        else
        {
            String incomingMessage = event.getMessage().getContentRaw();
            if(incomingMessage.equals("say something"))
            {
                MessageChannel channel = event.getChannel();
                channel.sendMessage("Hello World").queue();
            }

            if(incomingMessage.toLowerCase().equals("!copypasta"))
            {
                MessageChannel channel = event.getChannel();
                String louisMessage = LouisClass.pickRandomCopypasta();
                channel.sendMessage(louisMessage).queue();
            }
        }
    }
}
