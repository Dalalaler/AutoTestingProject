package menu;

import enums.BrowserName;
import inpututils.InputUtil;
import tests.TestStarter;

public class MainMenu implements MenuItem {
    @Override
    public void displayMenu() {
        int menuNumber;
        boolean exit = false;
        do {
            System.out.println(
                    "Select a browser to test: \n1. Chrome\n2. Edge\n3. FireFox\n4. Opera\n5. Exit\n");
            menuNumber = InputUtil.getIntFromConsole();

            switch (menuNumber) {
                case 1:
                    TestStarter.startChosenTest(BrowserName.CHROME);
                    break;
                case 2:
                    TestStarter.startChosenTest(BrowserName.EDGE);
                    break;
                case 3:
                    TestStarter.startChosenTest(BrowserName.FIREFOX);
                    break;
                case 4:
                    TestStarter.startChosenTest(BrowserName.OPERA);
                    break;
                case 5:
                    System.out.println("Buy! See you later, Space Tester!");
                    exit = true;
                    break;

            }
        } while (!exit);
    }
}
