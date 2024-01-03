package dev.rishon.pokesmpforgeconnect.mixin;

import dev.rishon.pokesmpforgeconnect.PokeSMPConnect;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(JoinMultiplayerScreen.class)
public class MultiplayerScreenMixin {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        PokeSMPConnect.logger.info("Multiplayer Callback");
        PokeSMPConnect.connectToPokeSMP();
    }
}