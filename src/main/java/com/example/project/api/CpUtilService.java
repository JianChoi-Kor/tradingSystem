package com.example.project.api;

import com.example.project.dashin.cputil.*;

public class CpUtilService {

    public static void main(String[] args) {

    }

    // CYBOS의 각종 상태를 확인할 수 있음.
    public void cpCybos() {
        ClassFactory.createCpCybos();
    }

    // CYBOS에서 사용되는 주식코드 조회 작업을 함.
    public void cpStockCode() {
        ClassFactory.createCpStockCode();
    }

    // 각종  코드정보 및 코드 리스트를 얻을 수 있습니다.
    public void cpCodeMgr() {
        ClassFactory.createCpCodeMgr();
    }


}
