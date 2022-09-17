package homeworkSix;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWorkSix {
    @Test
    void chooseSecurity(){
        open("https://github.com");
        $("header").$(byText("Product")).hover();
        $(byText("Security")).click();
        $(".font-mktg").shouldHave(Condition.text("Security"));
        sleep(300);

    }
    // 1. На главной странице GitHub выберите меню Pricing  (т.к. изменилась верстка страницы выбираю Product) ->

    // Compare Plans с помощью команды hover для Pricing.
    // Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."



    //2. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
    // - Откройте https://the-internet.herokuapp.com/drag_and_drop
    // - Перенесите прямоугольник А на место В
    // - Проверьте, что прямоугольники действительно поменялись
    // - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
    //Раньше такой тест не работал из-за ошибки в ChromeDriver, но, может быть, уже починили?
}
