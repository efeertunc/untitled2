package Controller;

import AppView.AppView;
import Main.EscapeFromKoc;
import Models.Account;
import Utilities.DBManager.DBObserver;

public class AuthorizeController extends AppController implements DBObserver {

    public AuthorizeController(AppView appView, EscapeFromKoc app) {
        super(appView,app);
        app.getDatabaseAdapter().subscribeAuthObserver(this);
    }

    public void loginClick(String username, String password) {
        getApp().getDatabaseAdapter()
                .loginUser(username, password);
    }

    public void registerClick(String username, String password, String hint) {
        getApp().getDatabaseAdapter()
                .registerUser(username, password, hint);
    }

    @Override
    public void loginAccepted(Account user, String response) {
        //Main menuye gidilecek
        System.out.println("Login başarılı go to main menu");

    }

    @Override
    public void loginRejected(String response) {
        //Login hata mesajı gösterilecek
        System.out.println("login başarısızz");
    }

    @Override
    public void registerAccepted(Account user, String response) {
        //Register başarılı, kullanıcıdan giriş  yapması istenecek
        System.out.println("register başarılıı");
    }

    @Override
    public void registerRejected(String response) {
        //Register hata mesajı gösterilecek
        System.out.println("register başarısızz");
    }
}
