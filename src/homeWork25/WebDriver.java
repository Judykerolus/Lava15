package homeWork25;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Click on Google Chrome app to open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Click on x button to close Google Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on square button to maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Google Chrome element");
    }
}
class FirFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Click on Firefox app to open browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Click on x button to close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Click on square button to maximize window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Firefox element");
    }
}