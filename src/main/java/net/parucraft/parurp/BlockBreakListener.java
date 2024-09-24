package net.parucraft.parurp;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.Sound;


/**
 * <h1>BlockBreakListener</h1>
 * Listens for when the player breaks a block
 * @author ParuPatch
 */
public class BlockBreakListener implements Listener{
    /**
     * <h1>onWoolBreak</h1>
     * Plays a meow sound every time wool is broken
     */
    @EventHandler
    public void onWoolBreak(BlockBreakEvent event){
        if (event.getBlock().getType() == Material.WHITE_WOOL ||
            event.getBlock().getType() == Material.ORANGE_WOOL ||
            event.getBlock().getType() == Material.MAGENTA_WOOL ||
            event.getBlock().getType() == Material.LIGHT_BLUE_WOOL ||
            event.getBlock().getType() == Material.YELLOW_WOOL ||
            event.getBlock().getType() == Material.LIME_WOOL ||
            event.getBlock().getType() == Material.PINK_WOOL ||
            event.getBlock().getType() == Material.GRAY_WOOL ||
            event.getBlock().getType() == Material.LIGHT_GRAY_WOOL ||
            event.getBlock().getType() == Material.CYAN_WOOL ||
            event.getBlock().getType() == Material.PURPLE_WOOL ||
            event.getBlock().getType() == Material.BLUE_WOOL ||
            event.getBlock().getType() == Material.BROWN_WOOL ||
            event.getBlock().getType() == Material.GREEN_WOOL ||
            event.getBlock().getType() == Material.RED_WOOL ||
            event.getBlock().getType() == Material.BLACK_WOOL)
        {
            Player player = event.getPlayer();
            player.getWorld().playSound(player.getLocation(),Sound.ENTITY_CAT_AMBIENT, 1.0f, 1.0f);
            //TODO: Disable the default wool break sound
            //TODO: Add config option to disable this feature
        }
    }
}
