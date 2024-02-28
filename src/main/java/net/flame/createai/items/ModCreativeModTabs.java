package net.flame.createai.items;

import net.flame.createai.CreateAi;
import net.flame.createai.blocks.Modblocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.lwjgl.system.macosx.MacOSXLibraryDL;
import org.spongepowered.asm.mixin.injection.invoke.ModifyConstantInjector;
import org.spongepowered.asm.mixin.injection.struct.ModifyConstantInjectionInfo;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateAi.MODID);


    public static final RegistryObject<CreativeModeTab> CREATE_AI = CREATIVE_MODE_TABS.register("create_ai",
            () -> CreativeModeTab.builder().icon( ()-> new ItemStack(Moditems.SILLYCONE.get()))
                    .title(Component.translatable("creativetab.create_ai"))
                    .displayItems((p_270258_, p_259752_) ->{
                        p_259752_.accept(Moditems.SILLYCONE.get());
                        p_259752_.accept(Moditems.RAW_PCB_BOARD.get());
                        p_259752_.accept(Moditems.RAW_BASIC_PCB_BOARD.get());
                        p_259752_.accept(Moditems.BASIC_PCB_BOARD.get());
                        p_259752_.accept(Moditems.INCOMPLETE_BASIC_AI_BOARD.get());
                        p_259752_.accept(Moditems.BASIC_AI_BOARD.get());
                        p_259752_.accept(Moditems.PROCESSOR_CHIP.get());
                        p_259752_.accept(Moditems.MEMORY_CHIP.get());
                        p_259752_.accept(Moditems.CAPACITOR.get());

                        p_259752_.accept(Modblocks.SILLYCONE_BLOCK.get());
                        p_259752_.accept(Modblocks.OVERWORLD_QUARTZ_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
