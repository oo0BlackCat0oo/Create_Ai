package net.flame.createai.items;

import net.flame.createai.CreateAi;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAi.MODID);
    public static final RegistryObject<Item> RAW_PCB_BOARD = ITEMS.register("raw_pcb_board", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BASIC_PCB_BOARD = ITEMS.register("raw_basic_pcb_board", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_PCB_BOARD = ITEMS.register("basic_pcb_board", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCOMPLETE_BASIC_AI_BOARD = ITEMS.register("incomplete_basic_ai_board", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PROCESSOR_CHIP = ITEMS.register("processor_chip",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEMORY_CHIP = ITEMS.register("memory_chip",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAPACITOR = ITEMS.register("capacitor",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIC_AI_BOARD = ITEMS.register("basic_ai_board", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILLYCONE = ITEMS.register("sillycone", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
