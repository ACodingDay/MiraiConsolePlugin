package top.newabug.mirai.plugin;

import net.mamoe.mirai.event.EventHandler;
import net.mamoe.mirai.event.ListeningStatus;
import net.mamoe.mirai.event.SimpleListenerHost;
import net.mamoe.mirai.event.events.*;
import top.newabug.mirai.plugin.controller.StatsCtrl;
import top.newabug.mirai.plugin.pojo.Gamer;
import top.newabug.mirai.plugin.pojo.WeaponsDepot;

/**
 * @author yyt
 * @date 2021年11月03日 15:30
 */
public class BFVEventHandler extends SimpleListenerHost {

    @EventHandler
    public ListeningStatus onBotGroupRequest(BotInvitedJoinGroupRequestEvent event) {
        // 收到邀请自动加入
        event.accept();
        return ListeningStatus.LISTENING;
    }

    @EventHandler
    public ListeningStatus onFriendRequest(NewFriendRequestEvent event) {
        event.accept();
        return ListeningStatus.LISTENING;
    }

    /**
     * 监听群临时会话消息
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus OnGroupTempMessageEvent(GroupTempMessageEvent event) {
        replyGamerInfo(event.getMessage().contentToString(), event);
        return ListeningStatus.LISTENING;
    }

    /**
     * 监听好友
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus OnFriendMessageEvent(FriendMessageEvent event) {
        replyGamerInfo(event.getMessage().contentToString(), event);
        return ListeningStatus.LISTENING;
    }

    /**
     * 监听群
     * @param event
     * @return
     */
    @EventHandler
    public ListeningStatus OnGroupMessageEvent(GroupMessageEvent event) {
        replyGamerInfo(event.getMessage().contentToString(), event);
        return ListeningStatus.LISTENING;
    }

    private void replyGamerInfo(String input, MessageEvent messageEvent){
        // 替换句号为点号
        input = input.toLowerCase().replaceAll("。", ".");
        if(!input.startsWith(".查询")) {
            return;
        }else {
            StatsCtrl sc = new StatsCtrl();
            if(input.startsWith(".查询玩家 ")){
                try{
                    Gamer gamer = sc.getGamerDataByInput(input);
                    messageEvent.getSubject().sendMessage(gamer.toString());
                } catch (Exception e){
                    messageEvent.getSubject().sendMessage("找不到该玩家");
                }
            }else if(input.startsWith(".查询武器 ")){
                try{
                    WeaponsDepot wd = sc.getWeaponByInput(input);
                    messageEvent.getSubject().sendMessage(wd.toString());
                } catch (Exception e){
                    messageEvent.getSubject().sendMessage("找不到该玩家");
                }
            }
        }
    }
}
