package top.newabug.mirai.plugin.pojo;

import java.util.List;

/**
 * @author yyt
 * @date 2021年11月03日 21:58
 */
public class WeaponsDepot {

    /**
     * 武器拥有者的 昵称
     */
    private String userName;

    /**
     * 武器拥有者的 id
     */
    private long id;

    /**
     * 武器列表
     */
    private List<Weapon> weaponList;

    public WeaponsDepot(){}

    public WeaponsDepot(String userName, long id, List<Weapon> weaponList) {
        this.userName = userName;
        this.id = id;
        this.weaponList = weaponList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    @Override
    public String toString() {
        return "玩家昵称:" + userName + "\n" +
                "id:" + id + "\n" +
                "武器:" + weaponList.toString();
    }
}
