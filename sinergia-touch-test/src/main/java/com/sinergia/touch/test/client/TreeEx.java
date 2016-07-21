package com.sinergia.touch.test.client;


import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Tree;

public class TreeEx extends Tree {
	
	private Label label;
	
	public TreeEx(Label label){
		this.label = label;
		this.sinkEvents(Event.BUTTON_RIGHT);
		this.sinkEvents(Event.ONTOUCHSTART);
		this.sinkEvents(Event.ONTOUCHMOVE);
		this.sinkEvents(Event.ONTOUCHCANCEL);
		this.sinkEvents(Event.ONTOUCHEND);
	}
	
	public void onBrowserEvent(Event event) {
		super.onBrowserEvent(event);
		switch (DOM.eventGetType(event)) {
			case Event.ONMOUSEDOWN: {
				switch (DOM.eventGetButton(event)) {
					case Event.BUTTON_RIGHT: {
						label.setText("-> BUTTON_RIGHT");
						break;
					}
				}
				break;
			}
			case Event.ONDBLCLICK: {
				label.setText("-> ONDBLCLICK");
				break;
			}
			case Event.ONTOUCHSTART: {
				label.setText("--> ONTOUCHSTART");
				break;
			}
			case Event.ONTOUCHMOVE: {
				label.setText("--> ONTOUCHMOVE");
				break;
			}
			case Event.ONTOUCHEND: {
				label.setText("--> ONTOUCHEND");
				break;
			}
			case Event.ONTOUCHCANCEL: {
				label.setText("--> ONTOUCHCANCEL");
				break;
			}
			default: {
				break;
			}
		}
	}

}
