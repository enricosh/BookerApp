import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;
import java.net.MalformedURLException;
public class Booking {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        //dc.setCapability(MobileCapabilityType.APP,"C:\\Proyectos\\booking-com-32-9.apk");
        //dc.setCapability("appPackage","com.android.calculator2");
        //dc.setCapability("appActivity",".Calculator");
        dc.setCapability("appPackage","com.booking");
        dc.setCapability("appActivity",".startup.HomeActivity");

        URL url=new URL("http://localhost:4723/");
        AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,dc);

        Thread.sleep(10000);
        driver.findElementById("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content").click();
        driver.findElementById("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content").sendKeys("cusco");

        driver.quit();
    }
}
