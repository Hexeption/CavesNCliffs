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
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

/**
 * ModItems
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 05/10/2020 - 08:58 pm
 */
public class ModItems {

    static Item.Settings newSettings() {
        return new Item.Settings().group(CavesNCliffs.GROUP);
    }

    public static void init() {

    }

    protected static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, CavesNCliffs.id(name), item);
    }
}
