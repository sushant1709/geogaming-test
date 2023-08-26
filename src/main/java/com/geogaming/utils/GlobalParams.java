package com.geogaming.utils;

public class GlobalParams {

    private static ThreadLocal<String> browserName = new ThreadLocal<String>();

    public void setBrowserName(String platformName1) {
        browserName.set(platformName1);
    }

    public String getBrowserName() {
        return browserName.get();
    }


    public void initializeGlobalParams(){

        GlobalParams params = new GlobalParams();
        params.setBrowserName(System.getProperty("BrowserName","Chrome"));

    }



}
