package com.example.project.modules;

import com.example.project.dashin.cptrade.*;

public class CpTradeModule {

    public static void main(String[] args) {

    }

    // 장내주식 / 코스닥주식 / ELW 주문(현금 주문) 데이터를 요청하고 수신한다.
    public void cpTd0311() {
        ClassFactory.createCpTd0311();
    }

    // 장내주식 / 코스닥주식 / ELW 주문관리 (가격 정정 주문) 데이터를 요청하고 수신한다.
    public void cpTd0313() {
        ClassFactory.createCpTd0313();
    }

    // 장내주식 / 코스닥주식 / ELW 주문관리 (취소 주문) 데이터를 요청하고 수신한다.
    public void cpTd0314() {
        ClassFactory.createCpTd0314();
    }

    // 계좌별 매수 주문 가능 금액/수량 데이터를 요청하고 수신한다.
    public void cpTdNew5331A() {
        ClassFactory.createCpTdNew5331A();
    }

    // 계좌별 매도 주문 가능 수량 데이터를 요청하고 수신한다.
    public  void cpTdNew5331B() {
        ClassFactory.createCpTdNew5331B();
    }

    // 계좌별 미체결 잔량 데이터를 요청하고 수신한다.
    public void cpTd5339() {
        ClassFactory.createCpTd5339();
    }

    // 금일 계좌별 주문/체결 내역 조회 데이터를 요청하고 수신한다.
    public void cpTd5341() {
        ClassFactory.createCpTd5341();
    }

    // 종목별 금일/전일 체결 기준 내역 조회
    public void cpTd5342() {
        ClassFactory.createCpTd5342();
    }

    // 계좌별 잔고 및 주문체결 평가 현황 데이터를 요청하고 수신한다.
    public void cpTd6033() {
        ClassFactory.createCpTd6033();
    }







}
