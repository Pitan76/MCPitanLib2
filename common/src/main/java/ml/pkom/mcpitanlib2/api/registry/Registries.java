package ml.pkom.mcpitanlib2.api.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import ml.pkom.mcpitanlib2.api.block.v0.ExtendedBlock;
import ml.pkom.mcpitanlib2.api.event.RegistryEvent;
import ml.pkom.mcpitanlib2.api.item.v0.ExtendedItem;
import ml.pkom.mcpitanlib2.api.util.ExtendIdentifier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static ml.pkom.mcpitanlib2.MCPitanLib2.MOD_ID;

public class Registries {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_KEY);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);
    public static final DeferredRegister<ScreenHandlerType<?>> SCREEN_HANDLERS = DeferredRegister.create(MOD_ID, Registry.MENU_KEY);

    public static void init() {
        BLOCKS.register();
        ITEMS.register();
        SCREEN_HANDLERS.register();
    }

    public static RegistryEvent<Item> registerItem(ExtendIdentifier identifier, ml.pkom.mcpitanlib2.api.item.v0.Item item) {
        return registerItem(identifier.getIdentifier(), ExtendedItem.of(item));
    }

    public static RegistryEvent<Block> registerBlock(ExtendIdentifier identifier, ml.pkom.mcpitanlib2.api.block.v0.Block block) {
        return registerBlock(identifier.getIdentifier(), ExtendedBlock.of(block));
    }

    // ***
    public static RegistryEvent<ScreenHandlerType<?>> registerScreenHandler(ExtendIdentifier identifier, ScreenHandlerType<?> screenHandlerType) {
        return registerScreenHandler(identifier.getIdentifier(), screenHandlerType);
    }

    public static RegistryEvent<Item> registerItem(Identifier identifier, Item item) {
        RegistrySupplier<Item> supplier = ITEMS.register(identifier, () -> item);
        return new RegistryEvent<>(supplier);
    }

    public static RegistryEvent<Block> registerBlock(Identifier identifier, Block block) {
        RegistrySupplier<Block> supplier = BLOCKS.register(identifier, () -> block);
        return new RegistryEvent<>(supplier);
    }

    public static RegistryEvent<ScreenHandlerType<?>> registerScreenHandler(Identifier identifier, ScreenHandlerType<?> screenHandlerType) {
        RegistrySupplier<ScreenHandlerType<?>> supplier = SCREEN_HANDLERS.register(identifier, () -> screenHandlerType);
        return new RegistryEvent<>(supplier);
    }
}
