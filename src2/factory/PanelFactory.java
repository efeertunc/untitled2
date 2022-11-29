package factory;

import main.IAppView;
import main.IPanel;
import panels.*;

public class PanelFactory {
	
	private static PanelFactory instance;
	
	private PanelFactory() {}

	public static PanelFactory getInstance() {
		if (instance == null) {
			instance = new PanelFactory();
		}
		return instance;
	}
	
	public IPanel createPanel(PanelType type, IAppView appView) {
		switch(type) {
		
		case Menu:
			return new MenuPanel(appView);
		case Run:
			return new RunPanel(appView);
		case Build:
			return new BuildPanel(appView);
		case Help:
			return new HelpPanel(appView);
		case Pause:
			return new PausePanel(appView);
		case Auth:
			return new AuthPanel(appView);
		default:
			throw new IllegalArgumentException("No such kind of panel type");
		}
		
	}
	
	

}
