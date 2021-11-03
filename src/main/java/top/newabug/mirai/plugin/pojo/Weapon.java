package top.newabug.mirai.plugin.pojo;

/**
 * @author yyt
 * @date 2021年11月03日 17:49
 * 战地五玩家的武器类
 */
public class Weapon {

    /**
     * 武器的名称
     */
    private String name;

    public Weapon(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "武器名:" + name + "\n";
    }
}
