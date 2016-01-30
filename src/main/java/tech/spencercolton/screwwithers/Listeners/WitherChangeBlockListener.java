package tech.spencercolton.screwwithers.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

/**
 * @author Spencer Colton
 */
public class WitherChangeBlockListener implements Listener {

    @EventHandler
    @SuppressWarnings("unused")
    public void onEvent(EntityChangeBlockEvent e) {
        if(e.getEntityType() != EntityType.WITHER)
            return;

        if(e.getTo() == Material.AIR)
            e.setCancelled(true);
    }

}
