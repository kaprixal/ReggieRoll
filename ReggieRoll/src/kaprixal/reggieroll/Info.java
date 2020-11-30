package kaprixal.reggieroll;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Info extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "info")) {	
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Reggie's Rolls Bot Information");
			info.setDescription("A bot that rolls a Reggie's Rolls food item when you type '$rroll'.\n\nThis is a basic bot and does not record your rolls because of the limited food menu and because Kaprixal is too lazy. \n\n Also there are no pictures because of the same reason listed above. \n\nUse the bot for fun or whatever.");
			info.setColor(0xf45642);
			info.setFooter("Created by KapriXal", event.getMember().getUser().getAvatarUrl());
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			
			}				
	}
	
}
