package xyz.n7mn.dev.neta.sand.sand;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;
import java.util.UUID;

public class SandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            ItemStack itemStack = new ItemStack(Material.SAND);

            if (player.getUniqueId().equals(UUID.fromString("1865ab8c-700b-478b-9b52-a8c58739df1a"))){
                itemStack = new ItemStack(Material.SAND, 64);
                for (int i = 0; i < player.getInventory().getSize(); i++){
                    player.getInventory().addItem(itemStack);
                }
            } else {
                player.getInventory().addItem(itemStack);
            }

        }

        return true;
    }
}
