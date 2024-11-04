/*
 * Copyright 2020-2022 Siphalor
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

package dev.terminalmc.moremousetweaks.util;

public enum ScrollAction {
    PASS(false, false),
    SUCCESS(true, true),
    FAILURE(false, true),
    ABORT(true, false);

    private final boolean cancelCustomActions;
    private final boolean cancelAllActions;

    ScrollAction(boolean cancelCustomActions, boolean cancelAllActions) {
        this.cancelCustomActions = cancelCustomActions;
        this.cancelAllActions = cancelAllActions;
    }

    public boolean cancelsAllActions() {
        return cancelAllActions;
    }

    public boolean cancelsCustomActions() {
        return cancelCustomActions;
    }
}
