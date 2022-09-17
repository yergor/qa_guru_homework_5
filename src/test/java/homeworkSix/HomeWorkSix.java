package homeworkSix;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkSix {
    @Test
    void chooseSecurity(){
        // 1. На главной странице GitHub выберите меню Pricing  (т.к. изменилась верстка страницы выбираю Product) ->

        // Compare Plans с помощью команды hover для Pricing.
        // Убедитесь что загрузилась нужная страница
        // (например что заголовок - "Choose the plan that’s right for you." - Проверяю на наличие
        // локатора с текстом "Security" на  странице

        open("https://github.com");
        $("header").$(byText("Product")).hover();
        $(byText("Security")).click();
        $(".font-mktg").shouldHave(Condition.text("Security"));
    }
}
