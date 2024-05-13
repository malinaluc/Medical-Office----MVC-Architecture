package org.example.utils;

import com.google.gson.JsonObject;
import netscape.javascript.JSObject;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;

public class LanguageManager {
    private static JSONObject currentLanguage;

    public static Locale stirngToLanguage(String language)
    {
        return switch(language){
            case "English" -> Locale.ENGLISH;
            case "Deutsch" -> Locale.GERMAN;
            case "Romana" -> Locale.ROMANIAN;
            default -> null;
        };
    }

    public static void loadLanguage(Locale locale) {
        try {
            InputStream is = LanguageManager.class.getResourceAsStream("/language/" + locale.getLanguage() + ".json");
            if (is == null) {
                is = LanguageManager.class.getResourceAsStream("/language/en.json");
            }
            JSONTokener token;
            if (is != null) {
                token = new JSONTokener(is);
                currentLanguage = new JSONObject(token);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            currentLanguage = new JSONObject();
        }
    }

    public static String getString(String key) {
        return currentLanguage.optString(key, "Key not found: " + key);
    }

}
