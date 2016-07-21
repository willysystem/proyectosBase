package com.sinergia.touch.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Test implements EntryPoint {
	
	private Label label = new Label("No hay nada");;
	
	TreeEx tree = new TreeEx(label);
	
	public void onModuleLoad() {
		
		TreeItem treeItem1 = new TreeItem();
		treeItem1.setText("Item 1");
		
		
		TreeItem treeItem11 = new TreeItem();
		treeItem11.setText("Item 1.1");
		treeItem1.addItem(treeItem11);
		
		TreeItem treeItem12 = new TreeItem();
		treeItem12.setText("Item 1.2");
		treeItem1.addItem(treeItem12);
		
		tree.addItem(treeItem1);
		
		Button btn = new Button("One button 1123456789 ");
		btn.setSize("100px", "100px");
		btn.addTouchStartHandler(new TouchStartHandler() {
			@Override
			public void onTouchStart(TouchStartEvent event) {
				label.setText("TouchStart");
			}
		});
		btn.addTouchCancelHandler(new TouchCancelHandler() {
			@Override
			public void onTouchCancel(TouchCancelEvent event) {
				label.setText("TouchCancel");
			}
		});
		btn.addTouchMoveHandler(new TouchMoveHandler() {
			@Override
			public void onTouchMove(TouchMoveEvent event) {
				label.setText("TouchMove");
			}
		});
		btn.addTouchEndHandler(new TouchEndHandler() {
			
			@Override
			public void onTouchEnd(TouchEndEvent event) {
				label.setText("TouchEnd");
				Timer t = new Timer() {
					@Override
					public void run() {
						btnRight();
					}
				};
				t.schedule(1000);
			}
		});
		
		VerticalPanel vp = new VerticalPanel();
		vp.add(btn);
		vp.add(label);
		vp.add(tree);
		
		RootPanel.get().add(vp);
		
	}
	
	public void btnRight(){
		label.setText("BUTTON_RIGHT");
	}
	
	public void btnDblClick(){
		label.setText("ONDBLCLICK");
	}
	
	
}
