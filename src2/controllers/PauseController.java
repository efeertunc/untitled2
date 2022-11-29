package controllers;

import factory.PanelType;
import main.EscapeFromKoc;

public class PauseController {

	public void openHelp() {
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getCurPanel(),
												EscapeFromKoc.getInstance().getGameView().getPanel(PanelType.Help));
	}

	public void resumeGame() {
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getCurPanel(),
												EscapeFromKoc.getInstance().getOldPanel());	
	}

	public void openMenu() {
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getCurPanel(),
												EscapeFromKoc.getInstance().getGameView().getPanel(PanelType.Menu));			
	}
	
	

}
