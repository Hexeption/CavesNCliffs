/*******************************************************************************
 * CavesNCliffs
 * Copyright (C) 2020  Hexeption (Keir Davis)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package dev.hexeption.cavesncliffs.registry;

import dev.hexeption.cavesncliffs.CavesNCliffs;
import java.util.function.Function;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

/**
 * ModBlocks
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 05/10/2020 - 09:00 pm
 */
public class ModBlocks {

    public static final Block AZALEA_LEAVES = register("azalea_leaves", new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block BLOOMING_AZALEA_LEAVES = register("blooming_azalea_leaves", new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));

    public static final Block AZALEA_SHRUB = register("azalea_shrub", new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block BLOOMING_AZALEA_SHRUB = register("blooming_azalea_shrub", new Block(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));

    public static final Block AZALEA_ROOTS = register("azalea_roots", new Block(FabricBlockSettings.copy(Blocks.DIRT)));

    public static final Block AMETHYST_GEODE = register("amethyst_geode", new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block AMETHYST_CRYSTALS = register("amethyst_crystals", new Block(FabricBlockSettings.copy(Blocks.STONE)));

    public static final Block COPPER_ORE = register("copper_ore", new Block(FabricBlockSettings.copy(Blocks.IRON_ORE)));
    public static final Block COPPER_BLOCK = register("copper_block", new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)));
    public static final Block COPPER_STAIRS = register("copper_stairs", new Block(FabricBlockSettings.copy(Blocks.QUARTZ_STAIRS)));
    public static final Block COPPER_SLAB = register("copper_slab", new Block(FabricBlockSettings.copy(Blocks.QUARTZ_SLAB)));

    public static final Block CLAY_POT = register("clay_pot", new Block(FabricBlockSettings.copy(Blocks.CLAY)));

    public static final Block GLOW_BERRY_VINE = register("glow_berry_vine", new Block(FabricBlockSettings.copy(Blocks.TWISTING_VINES)));

    public static final Block SPORE_BLOSSOM = register("spore_blossom", new Block(FabricBlockSettings.copy(Blocks.SUNFLOWER)));

    public static final Block LARGE_DRIP_LEAF = register("large_drip_leaf", new Block(FabricBlockSettings.copy(Blocks.SUNFLOWER)));
    public static final Block SMALL_DRIP_LEAF = register("small_drip_leaf", new Block(FabricBlockSettings.copy(Blocks.SUNFLOWER)));

    public static final Block MOSS_BLOCK = register("moss_block", new Block(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)));
    public static final Block MOSS_BLANKET = register("moss_blanket", new Block(FabricBlockSettings.copy(Blocks.GREEN_CARPET)));

    public static final Block SCULK_BLOCK = register("sculk_block", new Block(FabricBlockSettings.copy(Blocks.END_STONE)));
    public static final Block SCULK_CHUTE = register("sculk_chute", new Block(FabricBlockSettings.copy(Blocks.END_STONE)));
    public static final Block SCULK_GROWTH = register("sculk_growth", new Block(FabricBlockSettings.copy(Blocks.GREEN_CARPET)));
    public static final Block SCULK_SENSOR = register("sculk_sensor", new Block(FabricBlockSettings.copy(Blocks.END_STONE)));

    public static final Block STALAGMITE = register("stalagmite", new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block STALACTITE = register("stalactite", new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block DRIPSTONE = register("dripstone", new Block(FabricBlockSettings.copy(Blocks.STONE)));

    public static final Block LIGHTNING_ROD = register("lightning_rod", new Block(FabricBlockSettings.copy(Blocks.IRON_BARS)));

    public static final Block CANDLES = register("candles", new Block(FabricBlockSettings.copy(Blocks.TORCH)));

    public static final Block LIMESTONE = register("limestone", new Block(FabricBlockSettings.copy(Blocks.STONE)));
    public static final Block MARBLE = register("marble", new Block(FabricBlockSettings.copy(Blocks.STONE)));


    public static void init() {

    }

    static <T extends Block> T register(String name, T block, Item.Settings settings) {
        return register(name, block, new BlockItem(block, settings));
    }

    static <T extends Block> T register(String name, T block) {
        return register(name, block, new Item.Settings().group(CavesNCliffs.GROUP));
    }

    static <T extends Block> T register(String name, T block, Function<T, BlockItem> itemFactory) {
        return register(name, block, itemFactory.apply(block));
    }

    static <T extends Block> T register(String name, T block, BlockItem item) {
        T b = Registry.register(Registry.BLOCK, CavesNCliffs.id(name), block);
        if (item != null) {
            ModItems.register(name, item);
        }
        return b;
    }

}
