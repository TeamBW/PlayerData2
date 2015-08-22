package cf.chaka15205.playerdata2.util;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;

public class PermLib {
    public static void init(PluginManager pm) {

    }

    public static final Permission CMD_PD = new Permission("pd.pd");
    public static final Permission CMD_PD_INFO = new Permission("pd.pd.info");
    public static final Permission CMD_PD_LIST = new Permission("pd.pd.list");
    public static final Permission CMD_PD_SAVE = new Permission("pd.pd.save");
}
