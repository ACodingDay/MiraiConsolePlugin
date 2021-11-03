import org.junit.Test;
import top.newabug.mirai.plugin.service.BFVService;

/**
 * @author yyt
 * @date 2021年11月03日 23:13
 */
public class JavaPluginTest {

    private BFVService bfvService = BFVService.getInstance();

    @Test
    public void test1(){
        try{
            System.out.println(bfvService.getGamerByInput("Dannis017"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
