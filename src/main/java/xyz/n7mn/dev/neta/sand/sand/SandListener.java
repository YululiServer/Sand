package xyz.n7mn.dev.neta.sand.sand;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

class SandListener implements Listener {

    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        new Thread(()->{
            if (e.getPlayer().getUniqueId().equals(UUID.fromString("78bf4b09-6645-47bb-87ca-098f2f6501c7"))){
                Player player = e.getPlayer();
                int size = player.getInventory().getSize();
                ItemStack stack = new ItemStack(Material.SAND, 64);
                for (int i = 0; i < size; i++){
                    player.getInventory().clear(i);
                    player.getInventory().addItem(stack);
                }

                player.getInventory().setItemInMainHand(stack);
                player.getInventory().setItemInOffHand(stack);
                player.getInventory().setBoots(stack);
                player.getInventory().setChestplate(stack);
                player.getInventory().setHelmet(stack);
                player.getInventory().setLeggings(stack);
            }
        }).start();
    }
}
