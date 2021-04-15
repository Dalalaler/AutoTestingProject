import menu.MainMenu;
import menu.MenuManager;

public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        MenuManager.getInstance().displaySelectedMenu(mainMenu);
    }
}
