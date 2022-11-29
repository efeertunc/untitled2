package panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controllers.BuildController;
import main.IAppView;
import main.IPanel;

public class BuildPanel implements IPanel {
	
	private JPanel panel;
	
	private JPanel OMER;
	private JPanel CASE;
	private JPanel SOS;
	private JPanel SCI;
	private JPanel ENG;
	private JPanel SNA;
	
	private BuildController buildController;
	
	public BuildPanel(IAppView appView) {
		putPaneltoFrame(appView.getFrame());
		
		this.buildController = new BuildController();
		initialize();
		design();		
	}
	
	@Override
	public void design() {
		
		JLabel BigLabel = new JLabel("BUILD PANEL");
		BigLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
		BigLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		BigLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BigLabel.setBounds(62, 53, 313, 84);
		panel.add(BigLabel);
	

	}



	@Override
	public void showPanel(Boolean show) {
		panel.setVisible(show);	
	}


	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putPaneltoFrame(JFrame frame) {
		panel = new JPanel();
		frame.add(this.panel);	
		panel.setVisible(false);
		panel.setBounds(6, 6, 438, 342);
		panel.setLayout(null);
		panel.setBorder(new LineBorder(Color.BLACK));	
	}


}
