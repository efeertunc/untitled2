package main;

import java.awt.EventQueue;

import Utilities.DBManager.DBManager;
import Utilities.DBManager.DatabaseAdapter;
import factory.PanelType;
import factory.ViewFactory;
import factory.ViewType;


public class EscapeFromKoc {
	
	private static EscapeFromKoc instance;
	private DatabaseAdapter databaseAdapter;
	
	private IAppView authView;
	private IAppView gameView;
	
	private IPanel curPanel;
	private IPanel oldPanel;

	
	public static synchronized void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscapeFromKoc.getInstance().startApp();;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	private EscapeFromKoc() {}

	
	public static EscapeFromKoc getInstance() {
		if (instance == null) {
			instance = new EscapeFromKoc();
		}

		return instance;
	} 
	
	
	private void startApp() {
		databaseAdapter = new DatabaseAdapter(DBManager.getInstance());
		databaseAdapter.connect();
		authView = ViewFactory.getInstance().createView(ViewType.AuthView);
		gameView = ViewFactory.getInstance().createView(ViewType.GameView);
		authView.showView(true);
		authView.getPanel(PanelType.Auth).showPanel(true);
		setCurPanel(authView.getPanel(PanelType.Auth));
	}
	
	
	private void exitApp(IAppView view) {
		// TODO Auto-generated method stub
		view.showView(false);
		view.getFrame().dispose();
		System.exit(0);
	}
	
	
	public void changeView(IAppView from, IAppView to) {
		if (from == null) {
			startApp();
		}
		else if (to == null) {
			exitApp(from);
		}
		else {
			from.showView(false);
			to.showView(true);
		}
	}
	
	public void changePanel(IPanel from, IPanel to) {
		if (from == null) {
			to.showPanel(true);
		}
		else if (to == null) {
			from.showPanel(false);
		}
		else {
			from.showPanel(false);
			to.showPanel(true);

		}
		setCurPanel(to);
		setOldPanel(from);
	}

	
	

	public IPanel getOldPanel() {
		return oldPanel;
	}


	public void setOldPanel(IPanel oldPanel) {
		this.oldPanel = oldPanel;
	}


	public IPanel getCurPanel() {
		return curPanel;
	}


	public void setCurPanel(IPanel curPanel) {
		this.curPanel = curPanel;
	}


	public IAppView getAuthView() {
		return authView;
	}


	public void setAuthView(IAppView authView) {
		this.authView = authView;
	}


	public IAppView getGameView() {
		return gameView;
	}


	public void setGameView(IAppView gameView) {
		this.gameView = gameView;
	}

	public DatabaseAdapter getDatabaseAdapter() {
		return databaseAdapter;
	}
}
