package Test;

import Classes.Cat;
import Classes.Color;
import Classes.Config;
import Classes.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CatAndDogTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
        /* CAT AND IT'S COLOR OBJECTS */
        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("White");
        color.setTexture_color("White");
        c1.setCat_name("Banny");
        c1.setBreed_name("PersianCat");
        c1.setOwner_name("Venkata Jaswanth Potnuru");
        c1.setColor(color);
        c1.catDisplay();


        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("Brown");
        color1.setTexture_color("Brown");
        d1.setDog_name("Puppy");
        d1.setBreed_name("husky");
        d1.setOwner_name("Venkata Jaswanth Potnuru");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
