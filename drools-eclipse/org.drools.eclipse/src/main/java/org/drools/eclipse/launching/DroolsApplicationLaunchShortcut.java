/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.launching;

import org.drools.eclipse.debug.core.IDroolsDebugConstants;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaApplicationLaunchShortcut;

public class DroolsApplicationLaunchShortcut extends JavaApplicationLaunchShortcut {

    protected ILaunchConfigurationType getConfigurationType() {
        return DebugPlugin.getDefault().getLaunchManager()
            .getLaunchConfigurationType(IDroolsDebugConstants.LAUNCH_CONFIGURATION_TYPE);
    }

    protected String getTypeSelectionTitle() {
        return "Select Drools Application";
    }

}
