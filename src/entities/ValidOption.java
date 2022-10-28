
package entities;

public class ValidOption {

    public String validatedOptionMenu(String optionMenu) {
        if (!optionMenu.equals("1") && !optionMenu.equals("2") && !optionMenu.equals("3")) {
            return "0";
        } else {
            return optionMenu;
        }
    }

    public String validatedOptionRegister(String optionMenu) {

        if (!optionMenu.equals("1") && !optionMenu.equals("2") && !optionMenu.equals("3")) {
            return "0";
        } else {
            return optionMenu;
        }
    }

    public String validatedOptionReport(String optionMenu) {
        if (!optionMenu.equals("1") && !optionMenu.equals("2") && !optionMenu.equals("3") && !optionMenu.equals("4")) {
            return "0";
        } else {
            return optionMenu;
        }
    }

    public String validatedOptionSearch(String optionMenu) {
        if (!optionMenu.equals("1") && !optionMenu.equals("2")) {
            return "0";
        } else {
            return optionMenu;
        }
    }

}
