import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


@Listeners({ExtentITestListenerClassAdapter.class})
public class Tests {

    @Test(groups = { "tagName", "t:another-tagName", "a:Madhu", "d:deviceName" })
    public void test1(String user, String password) {
        Assert.assertTrue(true);
    }

    @Test()
    public void test2() {
        Assert.assertTrue(true);
    }
}
