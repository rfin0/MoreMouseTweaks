/*
 * Copyright 2024 TerminalMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.terminalmc.moremousetweaks.compat.itemlocks;

import net.minecraft.world.inventory.Slot;

public class ItemLocksWrapper {
    private static boolean hasFailed = false;

    public static boolean isLocked(Slot slot) {
        if (hasFailed) return false;
        try {
            return ItemLocks.isLocked(slot);
        } catch (NoClassDefFoundError | NoSuchMethodError ignored) {
            hasFailed = true;
            return false;
        }
    }
}