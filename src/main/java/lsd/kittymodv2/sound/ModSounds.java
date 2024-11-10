package lsd.kittymodv2.sound;

import lsd.kittymodv2.KittyModV2;
import net.minecraft.client.sound.Sound;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent BELL_JINGLE = registerSoundEvent("bell_jingle");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(KittyModV2.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        KittyModV2.LOGGER.info("Registering Mod Sounds for " + KittyModV2.MOD_ID);
    }
}
