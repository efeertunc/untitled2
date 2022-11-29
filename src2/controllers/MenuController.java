package controllers;

import factory.PanelType;
import main.EscapeFromKoc;

public class MenuController {

	public void exit() {
		EscapeFromKoc.getInstance().changeView(EscapeFromKoc.getInstance().getGameView(),
												null);		
	}

	public void openHelp() {
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getCurPanel(), 
												EscapeFromKoc.getInstance().getGameView().getPanel(PanelType.Help));
	}


}
