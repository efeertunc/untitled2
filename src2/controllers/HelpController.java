package controllers;

import factory.PanelType;
import main.EscapeFromKoc;

public class HelpController {

	public void back() {
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getGameView().getPanel(PanelType.Help), EscapeFromKoc.getInstance().getOldPanel());			
	}

}
