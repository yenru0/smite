package com.example.examplemod.creativetabs

import com.example.examplemod.MODID
import com.example.examplemod.blocks.ExampleBlock
import com.example.examplemod.items.SadObsidianMaker
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.ItemStack
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod

@Suppress("unused")
@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
object ExampleCreativeModTab {

    @SubscribeEvent
    fun buildContents(event: BuildCreativeModeTabContentsEvent) {
        if (event.tabKey == ResourceLocation(MODID, "example")) {
            event.accept(ItemStack(ExampleBlock))
            event.accept(ItemStack(SadObsidianMaker))
        }
    }
}
