package top.newabug.mirai.plugin.pojo;

/**
 * @author yyt
 * @date 2021年11月03日 15:44
 * 战地五玩家实体类
 */
public class Gamer {
    /**
     * 玩家的用户名，userName
     */
    private String userName;

    /**
     * 玩家的 id，选用 long
     */
    private long id;

    /**
     * 玩家的游戏等级数
     */
    private int rank;

    /**
     * 玩家的每分钟得分
     */
    private double scorePerMinute;

    /**
     * 玩家的每分钟击杀数
     */
    private double killsPerMinute;

    /**
     * 玩家的准度/射击准度
     */
    private String accuracy;

    /**
     * 玩家的爆头率
     */
    private String headshots;

    /**
     * 玩家的胜率
     */
    private String winPercent;

    /**
     * 玩家的最佳角色（兵种），字符串
     */
    private String bestClass;

    /**
     * 玩家最后一次的登录时间
     */
    private String timePlayed;

    /**
     * 玩家的 K/D
     */
    private double killDeath;

    /**
     * 玩家的步兵 K/D
     */
    private double infantryKillDeath;

    /**
     * 玩家的步兵每分钟击杀数
     */
    private double infantryKillsPerMinute;

    /**
     * 玩家的总击杀数
     */
    private int kills;

    /**
     * 玩家的最远爆头距离
     */
    private int longestHeadShot;

    /**
     * 玩家的最高连杀
     */
    private int highestKillStreak;

    /**
     * 玩家的复活别人次数，也就是治愈数
     */
    private int revives;

    /**
     * 玩家的狗牌取得数
     */
    private int dogtagsTaken;

    /**
     * 玩家的游玩次数
     */
    private int roundsPlayed;

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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getScorePerMinute() {
        return scorePerMinute;
    }

    public void setScorePerMinute(double scorePerMinute) {
        this.scorePerMinute = scorePerMinute;
    }

    public double getKillsPerMinute() {
        return killsPerMinute;
    }

    public void setKillsPerMinute(double killsPerMinute) {
        this.killsPerMinute = killsPerMinute;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getHeadshots() {
        return headshots;
    }

    public void setHeadshots(String headshots) {
        this.headshots = headshots;
    }

    public String getWinPercent() {
        return winPercent;
    }

    public void setWinPercent(String winPercent) {
        this.winPercent = winPercent;
    }

    public String getBestClass() {
        return bestClass;
    }

    public void setBestClass(String bestClass) {
        this.bestClass = bestClass;
    }

    public String getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(String timePlayed) {
        this.timePlayed = timePlayed;
    }

    public double getKillDeath() {
        return killDeath;
    }

    public void setKillDeath(double killDeath) {
        this.killDeath = killDeath;
    }

    public double getInfantryKillDeath() {
        return infantryKillDeath;
    }

    public void setInfantryKillDeath(double infantryKillDeath) {
        this.infantryKillDeath = infantryKillDeath;
    }

    public double getInfantryKillsPerMinute() {
        return infantryKillsPerMinute;
    }

    public void setInfantryKillsPerMinute(double infantryKillsPerMinute) {
        this.infantryKillsPerMinute = infantryKillsPerMinute;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getLongestHeadShot() {
        return longestHeadShot;
    }

    public void setLongestHeadShot(int longestHeadShot) {
        this.longestHeadShot = longestHeadShot;
    }

    public int getHighestKillStreak() {
        return highestKillStreak;
    }

    public void setHighestKillStreak(int highestKillStreak) {
        this.highestKillStreak = highestKillStreak;
    }

    public int getRevives() {
        return revives;
    }

    public void setRevives(int revives) {
        this.revives = revives;
    }

    public int getDogtagsTaken() {
        return dogtagsTaken;
    }

    public void setDogtagsTaken(int dogtagsTaken) {
        this.dogtagsTaken = dogtagsTaken;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(int roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public Gamer(){}

    @Override
    public String toString() {
        return "昵称：" + userName + "\n" +
                "id：" + id + "\n" +
                "等级：" + rank + "\n" +
                "KD：" + killDeath + "\n" +
                "SPM：" + scorePerMinute + "\n" +
                "KPM：" + killsPerMinute + "\n" +
                "步兵KD：" + infantryKillDeath + "\n" +
                "步兵KPM：" + infantryKillsPerMinute + "\n" +
                "胜率：" + winPercent + "\n" +
                "精准度：" + accuracy + "\n" +
                "爆头率：" + headshots + "\n" +
                "总击杀：" + kills + "\n" +
                "最佳兵种：" + bestClass + "\n" +
                "最近游戏时间：" + timePlayed + "\n" +
                "最远爆头距离：" + longestHeadShot + "\n" +
                "最高连杀数：" + highestKillStreak + "\n" +
                "治愈数：" + revives + "\n" +
                "狗牌取得数：" + dogtagsTaken + "\n" +
                "游戏局数：" + roundsPlayed;
    }
}
