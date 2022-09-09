package guru_qa_homework_5;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Homework_5 {
    @Test
    void shouldHaveJUnit5(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").shouldHave(text("Soft assertions"));
        $(byText("Show 2 more pages…")).click();
        $(byText("SoftAssertions")).click();
        // $(byLinkText("Soft assertions")).click(); не уверен,
        // что используя данную функцию кликаю на SoftAssertions в нужном месте
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
