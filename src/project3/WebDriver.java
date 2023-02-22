package project3;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
class SafariDriver implements WebDriver{
    public void open(){
        System.out.println("Open Safari website");
    }

    @Override
    public void close() {
        System.out.println("Close Safari now");
    }

    @Override
    public String getTitle() {
        return null;
    }
}

class FirefoxDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Firefox now");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox now");
    }

    @Override
    public String getTitle() {
        return null;

    }
}
class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }
    public static void main(String[] args) {
        WebDriver[] webs={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (WebDriver w:webs){
            w.open();
            w.close();
            w.getTitle();

        }
    }
}
