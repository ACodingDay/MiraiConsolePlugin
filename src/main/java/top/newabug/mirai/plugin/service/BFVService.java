package top.newabug.mirai.plugin.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import top.newabug.mirai.plugin.network.BFVDataRepo;
import top.newabug.mirai.plugin.pojo.Gamer;
import top.newabug.mirai.plugin.pojo.Weapon;
import top.newabug.mirai.plugin.pojo.WeaponsDepot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yyt
 * @date 2021年11月03日 17:11
 */
public class BFVService {
    // 单例设计模式
    private static class SingletonHolder {
        public static final BFVService INSTANCE = new BFVService();
    }

    private BFVService(){}

    public static final BFVService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private final BFVDataRepo bfvDataRepo = BFVDataRepo.getInstance();

    public Gamer getGamerByInput(String inputName){
        Gamer gamer = new Gamer();
        // 得到 Response body
        JSONObject obj = bfvDataRepo.getJSONObject(inputName);
        gamer.setUserName(obj.getString("userName"));
        gamer.setId(obj.getLongValue("id"));
        gamer.setRank(obj.getIntValue("rank"));
        gamer.setScorePerMinute(obj.getDoubleValue("scorePerMinute"));
        gamer.setKillsPerMinute(obj.getDoubleValue("killsPerMinute"));
        gamer.setAccuracy(obj.getString("accuracy"));
        gamer.setHeadshots(obj.getString("headshots"));
        gamer.setWinPercent(obj.getString("winPercent"));
        gamer.setBestClass(obj.getString("bestClass"));
        gamer.setTimePlayed(obj.getString("timePlayed"));
        gamer.setKillDeath(obj.getDoubleValue("killDeath"));
        gamer.setInfantryKillDeath(obj.getDoubleValue("infantryKillDeath"));
        gamer.setInfantryKillsPerMinute(obj.getDoubleValue("infantryKillsPerMinute"));
        gamer.setKills(obj.getIntValue("kills"));
        gamer.setLongestHeadShot(obj.getIntValue("longestHeadShot"));
        gamer.setHighestKillStreak(obj.getIntValue("highestKillStreak"));
        gamer.setRevives(obj.getIntValue("revives"));
        gamer.setDogtagsTaken(obj.getIntValue("dogtagsTaken"));
        gamer.setRoundsPlayed(obj.getIntValue("roundsPlayed"));
        return gamer;
    }

    public WeaponsDepot getWeaponByInput(String inputName){
        WeaponsDepot wd = new WeaponsDepot();
        List<Weapon> weaponList = new ArrayList<>();
        // 得到 Response body
        JSONObject obj = bfvDataRepo.getJSONObject2(inputName);
        // 设置武器库的名字以及 id
        wd.setUserName(obj.getString("userName"));
        wd.setId(obj.getLongValue("id"));
        // 得到武器列表
        JSONArray list = obj.getJSONArray("weapons");
        for (int i = 0; i < list.size(); i++) {
            JSONObject weaponData = list.getJSONObject(i);
            Weapon weapon = new Weapon();
            // 设置每一把武器的名字
            weapon.setName(weaponData.getString("weaponName"));
            weaponList.add(weapon);
        }
        // 设置武器库的武器列表
        wd.setWeaponList(weaponList);
        return wd;
    }

}
