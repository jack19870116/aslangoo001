import net.aslangoo.test.TestBean;
import net.aslangoo.test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)//加载配置
@ActiveProfiles("prod")
public class DemoBeanIntegrationTest {
    @Autowired
    private TestBean testBean;

    @Test
    public void devshouldBeanInject() {
        String e = "from development profiles";
        String context = testBean.getContext();
        Assert.assertEquals(e, context);
    }

}
