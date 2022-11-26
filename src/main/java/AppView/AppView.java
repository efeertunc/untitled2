package AppView;


public class AppView {

    private AppFrame frame;
    private AppPanel panel;


    public AppView(AppFrame frame, AppPanel appPanel) {
        this.frame = frame;
        this.panel = appPanel;
    }


    public void changeFrame(AppFrame frame) {
        if (this.frame == null) {
            setAppFrame(frame);
            frame.openFrame();
            return;
        }

        if (frame == null) {
            this.frame.closeFrame();
            this.frame.getFrame().dispose();
            return;
        }

        setAppFrame(frame);
        this.frame.closeFrame();
        frame.openFrame();
    }


    public void changePanel(AppPanel panel) {
        if (this.panel == null) {
            setAppPanel(panel);
            panel.openPanel();
            return;
        }

        if (panel == null) {
            this.panel.closePanel();
            return;
        }

        setAppPanel(panel);
        this.panel.closePanel();
        panel.openPanel();
    }

//	public void changeView(AppView appView) {
//		if (frame != null) {
//			changeFrame(this.frame, appView.getAppFrame());
//		}
//
//		if (panel != null) {
//			changePanel(this.panel, appView.getAppPanel());
//		}
//	}


    public AppFrame getAppFrame() {
        return frame;
    }


    public void setAppFrame(AppFrame frame) {
        this.frame = frame;
    }


    public AppPanel getAppPanel() {
        return panel;
    }


    public void setAppPanel(AppPanel panel) {
        this.panel = panel;
    }

}
