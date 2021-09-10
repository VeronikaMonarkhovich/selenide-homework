package com.taory.selenide_test;


import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragDropTest {

    @Test
    void ActionsIsWorked() {
            open("https://the-internet.herokuapp.com/drag_and_drop");
            actions().moveToElement( $("#column-a")).clickAndHold().moveByOffset(301,119).release().perform();
            $("#column-a").shouldHave(text("B"));
            $("#column-b").shouldHave(text("A"));
    }

    @Test
    void DragDropIsWorked() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }

}

