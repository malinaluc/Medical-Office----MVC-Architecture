package org.example.utils;

public record Locale(String language) {
    public static final Locale ROMANIAN = new Locale("romanian");
    public static final Locale ENGLISH = new Locale("english");
    public static final Locale GERMAN = new Locale("german");

    public static String[] values(){
        return new String[]{ROMANIAN.getLanguage(), ENGLISH.getLanguage(), GERMAN.getLanguage()};
    }

    public String getLanguage(){
        return this.language;
    }



}
