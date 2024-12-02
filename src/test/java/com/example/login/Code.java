package com.example.login;

import org.testng.annotations.Test;

public class Code {
    @Test
    public static void men(){
        String first="sairam";

        String second="Bavathu";

        first=first+second;//sairamBavathu

        second=first.substring(0,first.length()-second.length());
        first=first.substring(second.length());
        System.out.print(first);

    }
}
