package Logics;

public enum ChoiceToGame {
    MENU("menu"),
    PLAY("play"),
    EXIT("exit");
    private String choice;
    ChoiceToGame(String choice) {
        this.choice = choice;
    }
}
