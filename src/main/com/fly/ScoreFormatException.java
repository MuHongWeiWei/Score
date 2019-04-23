package com.fly;

public class ScoreFormatException extends Exception{
    @Override
    public String getMessage() {
        return "輸入格式錯誤";
    }
}
