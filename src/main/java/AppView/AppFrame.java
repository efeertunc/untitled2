package AppView;

import javax.swing.JFrame;

public class AppFrame {

    private JFrame frame;

    public AppFrame(JFrame frame) {
        this.frame = frame;

        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);

    }


    public void openFrame() {
        frame.setVisible(true);
    }


    public void closeFrame() {
        frame.setVisible(false);
        frame.dispose();
    }

    public JFrame getFrame() {return frame;}

    public void setFrame(JFrame frame) {this.frame = frame;}




}
