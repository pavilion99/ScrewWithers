package tech.spencercolton.screwwithers.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tech.spencercolton.screwwithers.Listeners.WitherChangeBlockListener;
import tech.spencercolton.screwwithers.ScrewWithers;

/**
 * @author Spencer Colton
 */
public class WitherBlockDamageCmd implements CommandExecutor {

    private final ScrewWithers plugin;

    public WitherBlockDamageCmd(ScrewWithers s) {
        this.plugin = s;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String... args) {
        plugin.toggle();

        sender.sendMessage("Wither damage is now " + (plugin.enabled() ? "disabled." : "enabled."));
        return true;
    }

}
