package ru.valiullin;

import java.util.Map;

public class Unique {
    private boolean result;
    private int counter;

    public boolean isUnique(Map<String, String> map) {
        if(map.isEmpty()) {
            return result=true; // явный выход из метода, без проверки остальных строк кода
        }
        for (String value : map.values()){
            for (String str : map.values()) {
                if(str.equalsIgnoreCase(value)){
                    counter++;
                }
                if (counter >= 2) {
                    result = true;
                }
            }
            counter = 0;
        }



        return result;
    }
}
