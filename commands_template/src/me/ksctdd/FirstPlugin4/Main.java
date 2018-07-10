package me.ksctdd.FirstPlugin4;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin{
	@Override
	public void onEnable()
	{
		this.getLogger().info("[OPENING]3");
	}
	@Override
	public void onDisable()
	{
		int a = 30;
		byte b = (byte) a;
		this.getLogger().info("[CLOSING DOWN]3" + b);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args)
	{
		
		if (cmd.getName().equalsIgnoreCase("lobby"))
		{
			if (sender instanceof Player)
			{
				Player player = (Player) sender;
				
				if (player.hasPermission("Plugin.Lobby"))
				{
					int x = 110;
					int y = 64;
					int z = -173;
					World world = Bukkit.getWorlds().get(0);
					
					Location loc = new Location(world, x, y, z);
					player.teleport(loc);
					int dur = 529000;
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "welcome to the lobby"));
					
					player.addPotionEffect(new PotionEffect (PotionEffectType.SPEED,dur,4));
					player.addPotionEffect(new PotionEffect (PotionEffectType.JUMP,dur,4));
					
					
					return true;
				}else {
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "wrong permission level"));
					return true;
				}
				
				
			} else {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "console cannot"));
				return true;
			}
		}
		return false;
	}
}
