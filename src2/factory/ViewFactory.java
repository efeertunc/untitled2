package factory;

import main.IAppView;
import views.AuthView;
import views.GameView;

public class ViewFactory {
	
	private static ViewFactory instance;
	
	private ViewFactory() {}

	public static ViewFactory getInstance() {
		if (instance == null) {
			instance = new ViewFactory();
		}
		return instance;
	}
	
	public IAppView createView(ViewType type) {
		switch(type) {	
		case GameView:
			return new GameView();
		case AuthView:
			return new AuthView();

		default:
			throw new IllegalArgumentException("No such kind of panel type");
		}
		
	}

}
