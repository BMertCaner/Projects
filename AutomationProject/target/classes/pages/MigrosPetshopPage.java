package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class MigrosPetshopPage {

    public String petShopScreen;

    public WebElement lowPriceSort;


    public MigrosPetshopPage(WebDriver driver) {

        petShopScreen = driver.findElement(By.xpath("/html/body/sm-root/div/main/sm-product/article/sm-list/div/div[4]/div[1]/sm-product-filters-desktop/div/div[1]/h2")).getText();

        //lowPriceSort = driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));

    }

    public WebElement lowPriceSort(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]/span/span"));
    }

    public WebElement lowPriceSortSort(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"dropdown-option\"]/span[contains(text(), ' Önce En Düşük Fiyat ')]"));
    }

    public boolean isSortedMethod(WebDriver driver){

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"new-amount\"]"));

        List<Integer> priceValues = elements.stream()
                .map(a->Integer.parseInt(a.getText().replaceAll(",", "").replaceAll(" TL","")))
                .collect(Collectors.toList());

        boolean isSorted = priceValues.equals(priceValues.stream().sorted().collect(Collectors.toList()));

        return isSorted;

    }

}