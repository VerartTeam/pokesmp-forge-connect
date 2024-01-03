package dev.rishon.pokesmpforgeconnect.mixin;

import dev.rishon.pokesmpforgeconnect.PokeSMPConnect;
import net.minecraft.client.gui.screens.DisconnectedScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DisconnectedScreen.class)
public class DisconnectScreenMixin {

    @Inject(at = @At("RETURN"), method = "shouldCloseOnEsc")
    private void shouldCloseOnEsc(CallbackInfoReturnable<Boolean> info) {
        PokeSMPConnect.logger.info("Disconnect Callback");
    }
}