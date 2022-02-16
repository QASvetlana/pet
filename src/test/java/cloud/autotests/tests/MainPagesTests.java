package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPagesTests extends TestBase {
    /* @Test
     @Description("works only for web version, does not work for mobile version of  site")
     @DisplayName("Common page elements for PS")
     void cityHintTest() {
         step("Open url", () ->
                 open(""));
         step("check city hint", () -> {
             $(".cityHint_hint__city__SI4-r").shouldBe(visible);
         });
     }
 */
    @Test
    @Description("works only for web version, does not work for mobile version of  site")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url", () ->
                open(""));

        step("Page title should have text 'Товары для животных, зоотовары онлайн, корма для домашних животных купить в интернет-магазине Petshop.ru'", () -> {
            String expectedTitle = "Товары для животных, зоотовары онлайн, корма для домашних животных купить в интернет-магазине Petshop.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }


}
