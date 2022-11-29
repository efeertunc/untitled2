package controllers;

import factory.PanelType;
import main.EscapeFromKoc;

public class AuthController {
	
	public AuthController() {
		
	}
	
	public void login() {
		EscapeFromKoc.getInstance().changeView(EscapeFromKoc.getInstance().getAuthView(), EscapeFromKoc.getInstance().getGameView());
		EscapeFromKoc.getInstance().changePanel(EscapeFromKoc.getInstance().getAuthView().getPanel(PanelType.Auth), EscapeFromKoc.getInstance().getGameView().getPanel(PanelType.Menu));
	}


}
