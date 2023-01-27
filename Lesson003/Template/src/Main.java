public class Main {
    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        NetherlandsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}
class Colors {
    static void paintWhiteColor(){
        System.out.println(ConsoleColors.WHITE_BACKGROUND_BRIGHT + "ПОЛОСА\tБЕЛОГО\t\tЦВЕТА" + ConsoleColors.RESET);
    }
    static void paintBlueColor(){
        System.out.println(ConsoleColors.BLUE_BACKGROUND + "ПОЛОСА\tСИНЕГО\t\tЦВЕТА" + ConsoleColors.RESET);
    }
    static void paintRedColor(){
        System.out.println(ConsoleColors.RED_BACKGROUND + "ПОЛОСА\tКРАСНОГО\tЦВЕТА" + ConsoleColors.RESET);
    }
}

class RussianFlag {

    void drawFlag() {
        drawFlagpole();
        Colors.paintWhiteColor();
        Colors.paintBlueColor();
        Colors.paintRedColor();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
}

class NetherlandsFlag {

    void drawFlag() {
        drawFlagpole();
        Colors.paintRedColor();
        Colors.paintWhiteColor();
        Colors.paintBlueColor();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
}