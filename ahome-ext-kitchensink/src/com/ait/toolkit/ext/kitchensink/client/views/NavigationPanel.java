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

import com.ait.toolkit.data.client.BaseTreeModel;
import com.ait.toolkit.ext.kitchensink.client.data.Example;
import com.ait.toolkit.sencha.ext.client.events.view.ItemClickEvent;
import com.ait.toolkit.sencha.ext.client.events.view.ItemClickHandler;
import com.ait.toolkit.sencha.ext.client.layout.BorderRegion;
import com.ait.toolkit.sencha.ext.client.layout.Layout;
import com.ait.toolkit.sencha.ext.client.ui.MessageBox;
import com.ait.toolkit.sencha.ext.client.ui.Panel;
import com.ait.toolkit.sencha.ext.client.ui.TreePanel;
import com.google.gwt.user.client.History;

public class NavigationPanel extends Panel {

	public NavigationPanel() {
		this.setTitle("Examples");
		this.setLayout(Layout.FIT);
		this.setRegion(BorderRegion.WEST);
		this.setWidth(250);
		this.setMinWidth(100);
		this.setHeight(200);
		this.setCollapsible(true);
		this.setSplit(true);
		// this.setStateful(true);
		// this.setStateId("mainnav.west");

		TreePanel panel = new TreePanel();
		panel.setLines(false);
		panel.setUseArrows(true);
		panel.setRootVisible(false);

		BaseTreeModel m = new BaseTreeModel();
		m.setChildren(Example.getExamples());
		panel.setRootNode(m);

		panel.addItemClickHandler(new ItemClickHandler() {
			@Override
			public void onItemClick(ItemClickEvent event) {
				String text = event.getRecord().get("text");
				text = text.replace(" ", "-");
				if (text.indexOf("About") >= 0) {
					MessageBox.alert("Ext JS for Java", "Powered by <a href='http://ahome-it.com' target='_blank'>Ahomé Innovations Technologies</a>");
				} else {
					History.newItem(text);
				}
			}
		});
		this.add(panel);

	}
}
