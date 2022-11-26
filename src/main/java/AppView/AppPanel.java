package AppView;

import javax.swing.JPanel;

public class AppPanel {

    private JPanel panel;

    public AppPanel(JPanel panel) {
        this.panel = panel;
    }


    public void openPanel() {
        this.panel.setVisible(true);
    }

    public void closePanel() {
        this.panel.setVisible(false);
    }

    public JPanel getPanel() {return panel;}

    public void setPanel(JPanel panel) {this.panel = panel;}

}
