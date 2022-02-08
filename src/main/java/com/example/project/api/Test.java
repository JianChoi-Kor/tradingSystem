package com.example.project.api;

import com.example.project.dashin.cputil.*;

public class Test {

    public static void main(String[] args) {
        // 종목 코드 확인
        ICpStockCode iCpStockCode = ClassFactory.createCpStockCode();
        String strName = iCpStockCode.codeToName("A056080");
        System.out.println("코드번호 A056080, 종목명 : " + strName);

        // 전체 종목 코드 불러오기
        ICpCodeMgr codeMgr = ClassFactory.createCpCodeMgr();
        // 리턴 형식이 object이지만 Object[]로 캐스팅하여 리스트를 받는다.
        Object[] market = (Object[]) codeMgr.getStockListByMarket(CPE_MARKET_KIND.CPC_MARKET_KOSPI);
        System.out.println("전체 종목 수 : " + market.length);

        for(int i=0; i<5; i++) {
            System.out.println(iCpStockCode.codeToName(market[i].toString()));
        }
    }
}
