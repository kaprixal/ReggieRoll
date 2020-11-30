package kaprixal.reggieroll;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	
	String[] messages = {
			"Reggie's Classic Mutton Roll",
			"Reggie's Sri Lankan Chicken Roll",
			"Reggie's Sri Lankan Vegan (Soy) Roll",
			"Reggie's Butter Chicken Roll",
			"Reggie's Butter Paneer Roll",
			"Reggie's Maple Bacon Cheeseburger Roll",
			"Reggie's Spicy Ketchup",
			"Reggie's Burger Sauce",
			"Reggie's Tea",
			"Reggie's Secret Anime Roll"
};
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "roll")) {	
			
			Random rand = new Random();
			int number = rand.nextInt(messages.length);
			
			
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Reggie's Rolls");
			info.setDescription(messages[number]);
			info.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			
			}
	}
}
