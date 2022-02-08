package com.example.project.api;

import com.example.project.dashin.cpdib.*;

public class CpDibService {

    public static void main(String[] args) {

    }

    // 주식 종목의 현재가에 관련된 데이터
    public void stockMst() {
        ClassFactory.createStockMst();
    }

    // 주식 복수 종목에 대해 간단한 내용을 일괄 조회 요청하고 수신한다.
    public void stockMstM() {
        ClassFactory.createStockMstm();
    }

    // 주식 복수 종목에 대해 일괄 조회를 요청하고 수신한다.
    public void stockMst2() {
        ClassFactory.createStockMst2();
    }

    // 주식 종목에 대해 매도, 매수에 관한 1~10차 호가, 호가 잔량
    public void stockJpBid2() {
        ClassFactory.createStockJpbid2();
    }

    // 주식 시장에서 CB(circuit breaker) 상태가 되면 수신한다.
    public void stockCbChk() {
        ClassFactory.createStockCbchk();
    }
}
