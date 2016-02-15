package tech.spencercolton.screwwithers.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import tech.spencercolton.screwwithers.ScrewWithers;

/**
 * @author Spencer Colton
 */
public class WitherChangeBlockListener implements Listener {

    final ScrewWithers plugin;

    public WitherChangeBlockListener(ScrewWithers s) {
        this.plugin = s;
    }

    @EventHandler
    @SuppressWarnings("unused")
    public void onEvent(EntityChangeBlockEvent e) {
        Bukkit.getLogger().info(e.getEntityType().toString());
        if(!plugin.enabled())
            return;

        if(e.getEntityType() != EntityType.WITHER)
            return;

        if(e.getTo() == Material.AIR)
            e.setCancelled(true);
    }

}
