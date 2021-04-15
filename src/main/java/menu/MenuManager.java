package menu;
import java.io.IOException;

public class MenuManager {
    private static MenuManager instance;

    private MenuManager() {}

    public static MenuManager getInstance() {
        if (instance == null) {
            instance = new MenuManager();
        }
        return instance;
    }

    public void displaySelectedMenu(MenuItem menuItem) {
        menuItem.displayMenu();
    }
}
