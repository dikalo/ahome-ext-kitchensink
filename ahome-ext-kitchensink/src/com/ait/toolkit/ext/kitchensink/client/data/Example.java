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
package com.ait.toolkit.ext.kitchensink.client.data;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.data.client.BaseTreeModel;

public class Example extends BaseTreeModel {

	public Example(String name) {
		this.setText(name);
		this.setLeaf(true);
	}

	public static List<Example> getExamples() {
		List<Example> examples = new ArrayList<Example>();

		Example about = new Example("About Ahomé-Ext");
		examples.add(about);

		examples.add(getButtonExamples());
		examples.add(getPanelExamples());
		examples.add(getGridExamples());
		examples.add(getTreeExamples());
		examples.add(getTabsExamples());
		examples.add(getWindowExamples());
		examples.add(getDataViewExamples());
		examples.add(getFormExamples());
		examples.add(getToolbarExamples());
		examples.add(getLayoutExamples());
		examples.add(getSliderExamples());
		examples.add(getDnDExamples());
		examples.add(getChartsExamples());
		examples.add(getMiscExamples());

		return examples;
	}

	// Buttons
	private static Example getButtonExamples() {
		Example button = new Example("Buttons");
		button.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Buttons"));
		children.add(new Example("Toggle Buttons"));
		children.add(new Example("Menu Buttons"));
		children.add(new Example("Menu Bottom Buttons"));
		children.add(new Example("Split Buttons"));
		children.add(new Example("Split Button Buttons"));
		children.add(new Example("Left Text Buttons"));
		children.add(new Example("Right Text Buttons"));
		children.add(new Example("Right Text Buttons"));

		button.setChildren(children);
		return button;
	}

	// Panels
	private static Example getPanelExamples() {
		Example panels = new Example("Panels");
		panels.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Panels"));
		children.add(new Example("Framed Panels"));

		panels.setChildren(children);
		return panels;
	}

	// Grids
	private static Example getGridExamples() {
		Example example = new Example("Grids");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Array Grid"));
		children.add(new Example("Grouped Grid"));
		children.add(new Example("Locking Grid"));
		children.add(new Example("Grouped Header Grid"));
		children.add(new Example("Multiple Sort Grid"));
		children.add(new Example("Progress Bar Pager"));
		children.add(new Example("Sliding Pager"));
		children.add(new Example("Reconfigure Grid"));
		children.add(new Example("Property Grid"));
		children.add(new Example("Cell Editing"));
		children.add(new Example("Row Expander"));
		children.add(new Example("Big Data"));

		example.setChildren(children);

		return example;
	}

	// Trees
	private static Example getTreeExamples() {
		Example example = new Example("Trees");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Tree"));
		children.add(new Example("Tree Reorder"));
		children.add(new Example("Tree Grid"));
		children.add(new Example("Two Trees"));
		children.add(new Example("Check Tree"));
		children.add(new Example("XML Tree"));

		example.setChildren(children);

		return example;
	}

	// Tabs
	private static Example getTabsExamples() {
		Example example = new Example("Tabs");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Tabs"));
		children.add(new Example("Plain Tabs"));
		children.add(new Example("Framed Tabs"));
		children.add(new Example("Icon Tabs"));

		example.setChildren(children);

		return example;
	}

	// Window
	private static Example getWindowExamples() {
		Example example = new Example("Tabs");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Window"));

		example.setChildren(children);

		return example;
	}

	// DataView
	private static Example getDataViewExamples() {
		Example example = new Example("DataView");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("MultiSort DataView"));

		example.setChildren(children);

		return example;
	}

	// Forms
	private static Example getFormExamples() {
		Example example = new Example("Form");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Login Form"));
		children.add(new Example("Contact Form"));
		children.add(new Example("Register Form"));
		children.add(new Example("Number Field"));
		children.add(new Example("Checkout Form"));
		children.add(new Example("Form with Grid"));

		example.setChildren(children);

		return example;
	}

	// Toolbar
	private static Example getToolbarExamples() {
		Example example = new Example("Toolbars");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Basic Toolbar"));
		children.add(new Example("Docked Toolbar"));

		example.setChildren(children);

		return example;
	}

	// Layout
	private static Example getLayoutExamples() {
		Example example = new Example("Layout");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Accordion Layout"));

		example.setChildren(children);

		return example;
	}

	// Slider
	private static Example getSliderExamples() {
		Example example = new Example("Slider");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Slider Field"));

		example.setChildren(children);

		return example;
	}

	// Drag and Drop
	private static Example getDnDExamples() {
		Example example = new Example("Drag and Drop");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Field to Grid"));
		children.add(new Example("Grid to Form"));
		children.add(new Example("Grid to Grid"));

		example.setChildren(children);

		return example;
	}

	// Charts
	private static Example getChartsExamples() {
		Example example = new Example("Charts");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Line Chart"));
		children.add(new Example("Pie Chart"));
		children.add(new Example("Bar Chart"));

		example.setChildren(children);

		return example;
	}

	// Misc
	private static Example getMiscExamples() {
		Example example = new Example("Misc");
		example.setLeaf(false);

		List<Example> children = new ArrayList<Example>();
		children.add(new Example("Google Maps"));
		children.add(new Example("Chart to PDF"));
		children.add(new Example("Grid to PDF"));

		example.setChildren(children);

		return example;
	}

}
