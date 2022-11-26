package UI;

import AppView.AppFrame;
import AppView.AppPanel;
import AppView.AppView;
import Design.Design;

import javax.swing.*;

public class MainMenuView extends AppView implements Design {

    private JButton playGameButton;
    private JButton HelpButton;
    private JButton ExitButton;
    private JButton LogoutButton;

    public MainMenuView() {

        super(new AppFrame(new JFrame()), new AppPanel(new JPanel()));
        initialize();
        design();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        playGameButton = new JButton("Play Game");
        HelpButton = new JButton("Help");
        ExitButton = new JButton("Exit Game");
        LogoutButton = new JButton("Logout");

    }


    @Override
    public void design() {

        this.getAppFrame().getFrame().setTitle("EscapeFromKoc");
        this.getAppFrame().getFrame().setBounds(100, 100, 450, 382);
        this.getAppFrame().getFrame().setLocationRelativeTo(null);


        JLabel lblNewLabel = new JLabel("MAIN MENU");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(98, 79, 249, 100);
        this.getAppFrame().getFrame().getContentPane().add(lblNewLabel);


//		this.getAppPanel().getPanel().setBounds(6, 6, 438, 342);
//		getContentPane().add(panel);
//		panel.setLayout(null);
//
//		JButton btnNewButton = new JButton("Play Game");
//		btnNewButton.setBounds(160, 149, 117, 29);
//		panel.add(btnNewButton);
//
//		JButton btnNewButton_1 = new JButton("Help");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_1.setBounds(160, 190, 117, 29);
//		panel.add(btnNewButton_1);
//
//		JButton btnNewButton_2 = new JButton("Exit Game");
//		btnNewButton_2.setBounds(160, 232, 117, 29);
//		panel.add(btnNewButton_2);
//
//		JButton btnNewButton_3 = new JButton("Logout");
//		btnNewButton_3.setBounds(160, 273, 117, 29);
//		panel.add(btnNewButton_3);
//
//		JLabel lblNewLabel = new JLabel("ESCAPE FROM KOC");
//		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
//		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setBounds(62, 53, 313, 84);
//		panel.add(lblNewLabel);
//		setVisible(true);

    }


}
