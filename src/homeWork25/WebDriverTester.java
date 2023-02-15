package homeWork25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver [] web={new ChromeDriver(), new FirFoxDriver()};
        for(WebDriver w: web){
            w.openBrowser();
            w.closeBrowser();
            w.maximizeWindow();
            w.findElement();
        }
    }
}
