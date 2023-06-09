package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target
            .the("Selecciona la universidad choucair")
            .located(By.xpath("//*[@id='universidad']/a/img"));

    public static final Target INPUT_COURSE = Target
            .the("Buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target
            .the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target
            .the("Da click para buscar el curso")
            .located(By.xpath("//a[@href='https://operacion.choucairtesting.com/academy/course/view.php?id=484']"));
                    //("//H4[text()='Cucumber - SerenityBDD + Screenplay (WEB)']"));

    //public static final Target SELECT_COURSE = Target
      //      .the("Da click para buscar el curso")
        //    .located(By.xpath("//H4[text()='Cucumber - SerenityBDD + Screenplay (WEB)']"));

    public static final Target NAME_COURSE = Target
            .the("Extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Cucumber - SerenityBDD + Screenplay (WEB)')]"));
}
