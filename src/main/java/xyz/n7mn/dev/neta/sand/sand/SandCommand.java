package xyz.n7mn.dev.neta.sand.sand;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class SandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;

            int i = new Random().nextInt(18);
            if (i == 8 || i == 11){
                ItemStack itemStack = new ItemStack(Material.GRAVEL);
                player.getInventory().addItem(itemStack);
            } else {
                ItemStack itemStack = new ItemStack(Material.SAND);
                player.getInventory().addItem(itemStack);
            }
        }

        return true;
    }
}
