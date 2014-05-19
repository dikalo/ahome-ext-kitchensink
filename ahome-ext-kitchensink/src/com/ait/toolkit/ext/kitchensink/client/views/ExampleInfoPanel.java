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
package com.ait.toolkit.ext.kitchensink.client.views;

import com.ait.toolkit.sencha.ext.client.layout.BorderRegion;
import com.ait.toolkit.sencha.ext.client.layout.Layout;
import com.ait.toolkit.sencha.ext.client.ui.Panel;

public class ExampleInfoPanel extends Panel {

	public ExampleInfoPanel() {

		this.setLayout(Layout.BORDER);
		this.setTitle("Example Info");
		this.setRegion(BorderRegion.EAST);

		this.setWidth(250);
		this.setMinWidth(100);
		this.setHeight(200);
		this.setCollapsible(true);
		this.setSplit(true);
		this.setStateful(true);
		this.setStateId("mainnav.east");

		this.add(new DescriptionPanel());
		this.add(new CodePanel());

	}
}
