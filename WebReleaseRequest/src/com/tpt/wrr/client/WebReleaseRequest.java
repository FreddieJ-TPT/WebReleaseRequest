package com.tpt.wrr.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.TextItem;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WebReleaseRequest implements EntryPoint {

	DynamicForm dForm;
	TextItem tItem;
	IButton iButton;

	public void onModuleLoad() {
		dForm = new DynamicForm();
		tItem = new TextItem();
		iButton = new IButton();

		iButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				SC.say("Hello: " + tItem.getValueAsString());
			}
		});

		dForm.setFields(tItem);
		RootPanel.get().add(dForm);
		RootPanel.get().add(iButton);
	}
}
