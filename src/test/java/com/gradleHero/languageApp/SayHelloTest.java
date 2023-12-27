package com.gradleHero.languageApp;

import org.junit.jupiter.api.Test;

import main.java.com.gradleHero.languageApp.SayHello;

import java.io.IOException;

public class SayHelloTest {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }

}
