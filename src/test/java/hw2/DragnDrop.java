package hw2;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class DragnDrop {
    @Test
    void DnDTest(){
        Configuration.holdBrowserOpen = true;
        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенесите прямоугольник А на место В
        $("[id=column-a]").dragAndDropTo("[id=column-b]");;
        //Проверьте, что прямоугольники действительно поменялись
        $("[id=column-a]").shouldHave(text("B"));
        //В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()

    }

}
