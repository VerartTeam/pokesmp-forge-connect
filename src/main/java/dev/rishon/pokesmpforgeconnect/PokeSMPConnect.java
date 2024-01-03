package dev.rishon.pokesmpforgeconnect;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import net.minecraftforge.fml.common.Mod;

import java.util.logging.Logger;

@Mod(PokeSMPConnect.MODID)
public class PokeSMPConnect {
    public static final String MODID = "pokesmp_forge_connect";
    public static final Logger logger = Logger.getLogger(MODID);

    public PokeSMPConnect() {
        logger.info("Loaded PokeSMP Forge Connect Mod!");
    }

    public static void connectToPokeSMP() {
        logger.info("Connecting to PokeSMP...");
        ConnectScreen.startConnecting(new JoinMultiplayerScreen(new TitleScreen()), Minecraft.getInstance(), ServerAddress.parseString("pokesmp.net"), new ServerData("pokesmp", "pokesmp.net", false), false);
    }
}
