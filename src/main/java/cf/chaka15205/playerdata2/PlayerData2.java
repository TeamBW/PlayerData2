package cf.chaka15205.playerdata2;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class PlayerData2 extends JavaPlugin {

    @Override
    public void onDisable() {

        this.getLogger().log(Level.INFO, "Disabled");
    }

    @Override
    public void onEnable() {

        this.getLogger().log(Level.INFO, "Enabled");
    }
}
