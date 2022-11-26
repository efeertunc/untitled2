package Main;

import AppView.AppView;
import UI.AuthorizeView;
import Utilities.DBManager.DBManager;
import Utilities.DBManager.DatabaseAdapter;

public final class EscapeFromKoc {

    private static EscapeFromKoc escapeFromKoc = new EscapeFromKoc();
    private DatabaseAdapter databaseAdapter;

    private EscapeFromKoc() {
    }

    public static EscapeFromKoc getInstance() {
        if (escapeFromKoc == null) {
            escapeFromKoc = new EscapeFromKoc();
        }
        return escapeFromKoc;
    }

    public static void main(String[] args) {
        getInstance().startApp();
    }

    public void startApp() {
        databaseAdapter = new DatabaseAdapter(DBManager.getInstance());
        databaseAdapter.connect();
        new AuthorizeView().getAppFrame().openFrame();
    }


    public void changeView(AppView from, AppView to) {
        from.changeFrame(to.getAppFrame());
        from.changePanel(to.getAppPanel());

    }

    public DatabaseAdapter getDatabaseAdapter() {
        return databaseAdapter;
    }

    public void setDatabaseAdapter(DatabaseAdapter databaseAdapter) {
        this.databaseAdapter = databaseAdapter;
    }
}
