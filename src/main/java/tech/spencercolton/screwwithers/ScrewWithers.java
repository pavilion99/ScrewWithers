package tech.spencercolton.screwwithers;

import org.bukkit.plugin.java.JavaPlugin;
import tech.spencercolton.screwwithers.Commands.WitherBlockDamageCmd;
import tech.spencercolton.screwwithers.Listeners.WitherChangeBlockListener;

/**
 * @author Spencer Colton
 */
public class ScrewWithers extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WitherChangeBlockListener(this), this);

        this.getCommand("withers").setExecutor(new WitherBlockDamageCmd(this));

        saveDefaultConfig();

        this.reloadConfig();
    }

    @Override
    public void onDisable() {

    }

    public boolean enabled() {
        return this.getConfig().getBoolean("enabled");
    }

    public boolean toggle() {
        this.getConfig().set("enabled", !this.getConfig().getBoolean("enabled"));
        return enabled();
    }

}
