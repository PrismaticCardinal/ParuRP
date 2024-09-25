package net.parucraft.parurp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

/**
 * <h1>America Yah</h1>
 * Replies with "HALLO :D"
 * @author ParuPatch
 */
public class AmericaYahCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("americayah")){
            if(sender instanceof Player player){
                player.sendMessage(ChatColor.LIGHT_PURPLE + "HALLO :D");
            }else if (sender instanceof ConsoleCommandSender){
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "HALLO :D");
            }
        }
        return true;
    }
}
