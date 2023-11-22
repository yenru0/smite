@file:Suppress("HasPlatformType", "unused")

package com.example.examplemod.init

import com.example.examplemod.MODID
import com.example.examplemod.blocks.ExampleBlock
import net.minecraft.world.level.block.Block
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

object BlockRegistry {

    private val BLOCKS: DeferredRegister<Block> = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID)

    fun register(bus: IEventBus) = BLOCKS.register(bus)

    // Example Block
    val EXAMPLE_BLOCK = BLOCKS.register<Block>("example_block") { ExampleBlock }

}