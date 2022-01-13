package dev.lolcrunchy.custommobs;

import org.bukkit.ChatColor;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmd implements CommandExecutor {

    private String ColorTrans(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("mobs")) {
            player.sendMessage(ColorTrans("&c(!) Dette ser ikke ud til af fungere korrekt?"));
            player.spawnParticle(Particle.CLOUD, player.getLocation(), 1, 1);
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 1.0F, 1.0F);
            player.sendTitle(ColorTrans("&c&lDU DØDE"), ColorTrans("&7Du døde, du respawner om 5 sekunder!"), 1, 1, 1);
            return true;
        }



        return false;
    }
}
