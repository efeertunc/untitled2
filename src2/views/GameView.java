package views;

import javax.swing.JFrame;

import controllers.GameController;
import factory.PanelFactory;
import factory.PanelType;
import main.IAppView;
import main.IPanel;

public class GameView implements IAppView {
	
	private JFrame frame;
	
	private IPanel menuPanel;
	private IPanel buildPanel;
	private IPanel runPanel;
	private IPanel helpPanel;
	private IPanel pausePanel;
	
	private GameController gameController;
	
	public GameView() {
		
		putFrametoGame();
		
		menuPanel = PanelFactory.getInstance().createPanel(PanelType.Menu, this);
		buildPanel = PanelFactory.getInstance().createPanel(PanelType.Build, this);
		runPanel = PanelFactory.getInstance().createPanel(PanelType.Run, this);
		helpPanel = PanelFactory.getInstance().createPanel(PanelType.Help, this);
		pausePanel = PanelFactory.getInstance().createPanel(PanelType.Pause, this);
		
		//gameController = new GameController(EscapeFromKoc.getInstance(), this);
		
	}

	@Override
	public void showView(Boolean show) {
		frame.setVisible(show);	
	}

	@Override
	public void putFrametoGame() {
		this.frame = new JFrame();
		this.frame.setResizable(false);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(null);
		this.frame.setVisible(false);
		this.frame.setBounds(100, 100, 450, 382);
		this.frame.setLocationRelativeTo(null);
		
	}

	@Override
	public IPanel getPanel(PanelType panel) {
		switch(panel) {
		case Menu:
			return menuPanel;
		case Run:
			return runPanel;
		case Build:
			return buildPanel;
		case Help:
			return helpPanel;
		case Pause:
			return pausePanel;
		default:
			throw new IllegalArgumentException("No such kind of panel type");
		}
	}

	public JFrame getFrame() {
		return frame;
	}



}
