package Controller;

import AppView.AppView;
import Main.EscapeFromKoc;


public class AppController {

    private EscapeFromKoc app;
    private AppView initView;


    public AppController(AppView appView, EscapeFromKoc app) {
        this.app = app;
        initView = appView;
    }


    public EscapeFromKoc getApp() {
        return app;
    }

    public void setApp(EscapeFromKoc app) {
        this.app = app;
    }

    public AppView getInitView() {
        return initView;
    }

    public void setInitView(AppView initView) {
        this.initView = initView;
    }



}
