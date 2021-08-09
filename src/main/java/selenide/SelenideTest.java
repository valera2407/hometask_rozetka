package selenide;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;


public class SelenideTest {

    @Test
    public void rozetkaTest1() {
        open("https://rozetka.com.ua/");
        FindAndComprasion findAndComprasion = new FindAndComprasion();
        Laptops laptops = new Laptops();
        findAndComprasion.findProducts("acer swift");
        laptops.openFirst();
        findAndComprasion.addProductToList();
        laptops.openSecond();
        findAndComprasion.addProductToList();
        findAndComprasion.compareProducts();
    }

    @Test
    public void rozetkaTest2() {
        open("https://rozetka.com.ua/");
        FindPhone findPhone = new FindPhone();
        BuyPage buy = new BuyPage();
        findPhone.findSamsung();
        buy.buyProduct();
    }

    @Test
    public void rozetkaTest3() {
        open("https://rozetka.com.ua/");
        FindPhone findPhone = new FindPhone();
        AddWarranty warranty = new AddWarranty();
        BuyPage buy = new BuyPage();
        findPhone.findPhoneWithFilters();
        warranty.add();
        buy.buyAndCopy();
    }

    @Test
    public void rozetkaTest4() {
        open("https://rozetka.com.ua/");
        CloseCross cross = new CloseCross();
        Promotions promotions = new Promotions();
        BuyPage buy = new BuyPage();
        cross.close();
        promotions.findProposition();
        buy.buyProduct();
    }

    @Test
    public void rozetkaTest5() {
        open("https://rozetka.com.ua/");
        LanguageUA languageUA = new LanguageUA();
        languageUA.change();
        CreateAccount create = new CreateAccount();
        create.createUser("Имя",
                "Фамилия",
                "661234567",
                "email@gmail.com",
                "password");

    }
}
