package top.newabug.mirai.plugin.common;

/**
 * @author yyt
 * @date 2021年11月03日 17:20
 * 定义一些全局变量
 */
public class GloalConsts {
    /**
     * API 查询战地五玩家的基本信息
     */
    public static final String BFV_API_STATS = "https://api.gametools.network/bfv/stats/";

    /**
     * API 查询战地五玩家的武器
     */
    public static final String BFV_API_WEAPONS = "https://api.gametools.network/bfv/weapons/";

    /**
     * API 查询战地五玩家的载具
     */
    public static final String BFV_API_VEHICLES = "https://api.gametools.network/bfv/vehicles/";

    /**
     * API 查询战地五玩家的兵种
     */
    public static final String BFV_API_CLASSES = "https://api.gametools.network/bfv/classes/";

    /**
     * format_values 默认是 true
     * 只有在查询 stats 和 weapons 需要附加
     */
    public static final String FORMAT_DEFAULT = "?format_values=true";

    public static final String PARAM_NAME = "&name=";

    /**
     * 游戏平台可选值：pc, ps4, xboxone
     * 默认选择为 pc
     */
    public static final String PLATFORM_DEFAULT = "&platform=pc";

    /**
     * 国家地区默认选择为 中国
     */
    public static final String COUNTRY_DEFAULT = "&lang=zh-CN";

}
