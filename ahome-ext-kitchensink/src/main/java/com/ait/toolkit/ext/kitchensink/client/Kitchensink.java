/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.ext.kitchensink.client;

import com.ait.toolkit.ext.kitchensink.client.views.AppHeader;
import com.ait.toolkit.ext.kitchensink.client.views.ContentPanel;
import com.ait.toolkit.ext.kitchensink.client.views.ExampleInfoPanel;
import com.ait.toolkit.ext.kitchensink.client.views.NavigationPanel;
import com.ait.toolkit.sencha.ext.client.core.Ext;
import com.ait.toolkit.sencha.ext.client.core.ExtEntryPoint;
import com.ait.toolkit.sencha.ext.client.layout.Layout;
import com.ait.toolkit.sencha.ext.client.tip.QuickTipManager;
import com.ait.toolkit.sencha.ext.client.ui.Viewport;

/**
 * Entry point class. Defines the starting point of the application.
 */
public class Kitchensink extends ExtEntryPoint {
	@Override
	public void onLoad() {
		QuickTipManager.init();
		Ext.setGlyphFontFamily("Pictos");

		Viewport vp = Viewport.get(Layout.BORDER);
		vp.add(new AppHeader());
		vp.add(new ContentPanel());
		vp.add(new NavigationPanel());
		vp.add(new ExampleInfoPanel());
	}
}
