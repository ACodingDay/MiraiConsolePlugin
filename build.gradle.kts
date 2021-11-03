plugins {
    val kotlinVersion = "1.5.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.7.1"
}

dependencies {
    api("net.mamoe", "mirai-core", "2.7.1")
    implementation("junit:junit:4.13.2")
    implementation("org.jsoup:jsoup:1.14.3")
    implementation("com.fasterxml.jackson.core:jackson-core:2.13.0")
    implementation("com.alibaba:fastjson:1.2.78")
    implementation("cn.hutool:hutool-all:5.7.15")
}

group = "top.newabug"
version = "0.1.0"

repositories {
    mavenLocal()
    maven("https://maven.aliyun.com/repository/public") // 阿里云国内代理仓库
    mavenCentral()
}
