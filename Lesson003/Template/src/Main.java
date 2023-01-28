
public class Main {
    public static void main(String[] args) {

        System.out.println("Рисуем флаг России:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
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
abstract class AbstractThreeRowsFlag {

    abstract void drawUpperLevel();
    abstract void drawMiddleLevel();
    abstract void drawBottomLevel();

    final void drawFlag() {
        drawFlagpole();
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
}

class RussianFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintBlueColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintRedColor();
    }
}

class NetherlandsFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintRedColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintBlueColor();
    }
}


