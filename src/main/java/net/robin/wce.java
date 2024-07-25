package net.robin;

import net.fabricmc.api.ModInitializer;
import net.robin.common.registry.modBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class wce implements ModInitializer {
    public static final String MOD_ID = "wce";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Initializing White Concrete Ext");

        modBlocks.registerBlocks();
    }
}
