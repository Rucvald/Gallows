package Logics;

public enum ChoiceToGame {
    MENU("menu"),
    PLAY("play"),
    EXIT("exit");
    private final String choice;

    ChoiceToGame(String choice) {
        this.choice = choice;
    }
}
