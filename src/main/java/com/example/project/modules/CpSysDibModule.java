package com.example.project.api;

import com.example.project.dashin.cpsysdib.*;

public class CpSysDibModule {

    public static void main(String[] args) {

    }

    // 특정 주식 종목이나 주식 전 종목에 대한 특징주 포착 데이터
    public void cpMarketWatch() {
        ClassFactory.createCpMarketWatch();
    }

    // 특정 주식 종목이나 주식 전 종목에 대한 특징주 포착 데이터
    public void cpMarketWatchS() {
        ClassFactory.createCpMarketWatchS();
    }


}
