package com.infoTech.tests;

import org.testng.annotations.Test;

public class FileDownload {

    @Test
    public void dosyaVarmiYokmu(){
        //bir dosyanin var olup olmadigini konr=trol etmek icin

        //bulunan klasorun yolunu(path)verir
        System.out.println(System.getProperty("user.dir"));
    }
}
