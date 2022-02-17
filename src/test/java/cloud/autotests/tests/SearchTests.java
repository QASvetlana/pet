package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class SearchTests extends TestBase {
    @Test
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Common page elements for PS")
    void searchTest() {
        step("Open url", () ->
                open(""));
        step("search with value", () -> {
            $(".MuiInputBase-input").setValue("корм для кошек").pressEnter();
            $(".product-list:nth-child(1)").shouldHave(text("кошек"));

        });
    }

    @Test
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Common page elements for PS")
    void searchEmptyTest() {
        step("Open url", () ->
                open(""));
        step("search with empty value", () -> {
            $(".MuiInputBase-input").setValue(" ").pressEnter();
            $(".errortext").shouldHave(text("Пустой поисковый запрос"));

        });
    }


}