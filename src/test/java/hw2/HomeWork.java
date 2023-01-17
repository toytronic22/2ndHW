package hw2;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomeWork {
    @Test
    void hoverSolutions (){
        Configuration.holdBrowserOpen = true;
        //На главной странице GitHub
        open("https://github.com");
        //выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        //Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."
        $(byClassName("h1-mktg")).shouldHave(text("Build like the best"));
    }
}