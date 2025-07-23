package hw.array;

public class Hw8 {

    public static void main(String[] args) {
        String[] menu = {"Burger", "Pizza", "Pasta"};
        String[] add = {"Salad", "Soup"};

        String[] todayMenu = new String[menu.length + add.length];

        for (int i = 0; i < menu.length; i++) {
            todayMenu[i] = menu[i];
        }

        for (int i = 0; i < add.length; i++) {
            todayMenu[menu.length + i] = add[i];
        }

        System.out.print("어제 메뉴판: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i]);
            if (i != menu.length - 1) System.out.print(", ");
        }

        System.out.println();

        System.out.print("오늘 메뉴판: ");
        for (int i = 0; i < todayMenu.length; i++) {
            System.out.print(todayMenu[i]);
            if (i != todayMenu.length - 1) System.out.print(", ");
        }
    }
}
