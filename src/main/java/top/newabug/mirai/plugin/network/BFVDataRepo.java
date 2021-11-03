package top.newabug.mirai.plugin.network;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import top.newabug.mirai.plugin.JavaPluginMain;
import static top.newabug.mirai.plugin.common.GloalConsts.*;

/**
 * @author yyt
 * @date 2021年11月03日 18:12
 */
public class BFVDataRepo {
    // 单例设计模式
    private static class SingletonHolder {
        public static final BFVDataRepo INSTANCE = new BFVDataRepo();
    }

    private BFVDataRepo(){}

    public static final BFVDataRepo getInstance() {
        return BFVDataRepo.SingletonHolder.INSTANCE;
    }

    public JSONObject getJSONObject(String userName) {
        try {
            // https://api.gametools.network/bfv/stats/?format_values=true&name=Dannis017&platform=pc&lang=zh-CN
            String url = BFV_API_STATS + FORMAT_DEFAULT + PARAM_NAME + userName + PLATFORM_DEFAULT + COUNTRY_DEFAULT;
            String body = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .header("Content-Type", "application/json")
                    .execute()
                    .body();
            return JSON.parseObject(body);
        } catch (Exception e) {
            JavaPluginMain.INSTANCE.getLogger().error("第三方接口调用异常");
            throw new RuntimeException();
        }
    }

    public JSONObject getJSONObject2(String userName) {
        try {
            // https://api.gametools.network/bfv/weapons/?format_values=true&name=Dannis017&platform=pc&lang=zh-CN
            String url = BFV_API_WEAPONS + FORMAT_DEFAULT + PARAM_NAME + userName + PLATFORM_DEFAULT + COUNTRY_DEFAULT;
            String body = Jsoup.connect(url)
                    .ignoreContentType(true)
                    .header("Content-Type", "application/json")
                    .execute()
                    .body();
            return JSON.parseObject(body);
        } catch (Exception e) {
            JavaPluginMain.INSTANCE.getLogger().error("第三方接口调用异常");
            throw new RuntimeException();
        }
    }



}
