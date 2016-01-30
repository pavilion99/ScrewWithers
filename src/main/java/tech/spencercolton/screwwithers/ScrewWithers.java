package tech.spencercolton.screwwithers;

import org.bukkit.plugin.java.JavaPlugin;
import tech.spencercolton.screwwithers.Listeners.WitherChangeBlockListener;

/**
 * @author Spencer Colton
 */
public class ScrewWithers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WitherChangeBlockListener(), this);
    }

    @Override
    public void onDisable() {

    }

}
