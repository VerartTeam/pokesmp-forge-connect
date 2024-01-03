package dev.rishon.pokesmpforgeconnect.mixin;

import dev.rishon.pokesmpforgeconnect.PokeSMPConnect;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MainScreenMixin {

    @Inject(at = @At("TAIL"), method = "init")
    private void init(CallbackInfo info) {
        PokeSMPConnect.logger.info("MainScreen Callback");
        // PokeSMPConnect.connectToPokeSMP(); - let players play singleplayer as well xd
    }
}