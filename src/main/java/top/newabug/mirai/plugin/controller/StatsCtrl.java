package top.newabug.mirai.plugin.controller;

import top.newabug.mirai.plugin.pojo.Gamer;
import top.newabug.mirai.plugin.pojo.WeaponsDepot;
import top.newabug.mirai.plugin.service.BFVService;

/**
 * @author yyt
 * @date 2021年11月03日 16:20
 */
public class StatsCtrl {

    private final BFVService bfvService = BFVService.getInstance();

    public Gamer getGamerDataByInput(String input){
        String inputName = input.replace(".查询玩家 ", "");
        return bfvService.getGamerByInput(inputName);
    }

    public WeaponsDepot getWeaponByInput(String input){
        String inputName = input.replace(".查询武器 ", "");
        return bfvService.getWeaponByInput(inputName);
    }
}
