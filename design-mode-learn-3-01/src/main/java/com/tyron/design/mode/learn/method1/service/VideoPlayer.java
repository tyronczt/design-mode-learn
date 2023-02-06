package com.tyron.design.mode.learn.method1.service;

/**
 * @description: 播放视频
 * @author: tyron
 * @create: 2023-02-06
 */
public class VideoPlayer {

    public void play(CommonUser commonUser) {
        System.out.println("普通用户播放视频");
    }

    public void play(VIPUser vipUser) {
        System.out.println("vip用户播放视频");
    }
}
