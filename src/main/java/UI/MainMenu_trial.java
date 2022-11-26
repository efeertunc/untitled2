package UI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class MainMenu_trial extends JFrame{



    public MainMenu_trial() {

        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        setResizable(false);
        setTitle("EscapeFromKoc");
        setBounds(100, 100, 450, 382);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(6, 6, 438, 342);
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnNewButton = new JButton("Play Game");
        btnNewButton.setBounds(160, 149, 117, 29);
        panel.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Help");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setBounds(160, 190, 117, 29);
        panel.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Exit Game");
        btnNewButton_2.setBounds(160, 232, 117, 29);
        panel.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Logout");
        btnNewButton_3.setBounds(160, 273, 117, 29);
        panel.add(btnNewButton_3);

        JLabel lblNewLabel = new JLabel("ESCAPE FROM KOC");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 27));
        lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(62, 53, 313, 84);
        panel.add(lblNewLabel);
        setVisible(true);
    }
}
