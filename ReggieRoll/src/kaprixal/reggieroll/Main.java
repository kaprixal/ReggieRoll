package kaprixal.reggieroll;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static JDA jda;
	public static String prefix = "$r";
	// Main method
	public static void main(String[] args) throws LoginException {
		jda = JDABuilder.createDefault("Nzc0NzA1MjA5MjgwMjk5MDE4.X6bqcw.JwjS03CqiWRPtidO3w_Q_xEnfac").build();
		jda.getPresence().setStatus(OnlineStatus.IDLE);
		jda.getPresence().setActivity(Activity.playing("with your rolls"));
		
		jda.addEventListener(new Info());
		jda.addEventListener(new Commands());
	}
}
