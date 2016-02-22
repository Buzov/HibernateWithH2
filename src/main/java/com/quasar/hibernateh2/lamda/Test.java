package com.quasar.hibernateh2.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author artur
 */
public class Test {
    
    static int pole = 0;
    
    public static void main(String[] args) {
        List<Pl> list = new ArrayList<>();
        list.add(new Pl("sdfs", "wer"));
        list.add(new Pl("sdfs", "wer"));
        list.add(new Pl("sdfsd", "wer"));
        list.add(new Pl("sdfsdf", "werwer"));
        list.stream().forEach(p -> {
            System.out.println(p.getName());
            lamdaMethod();
        });
        System.out.println(pole);
        
    }
    
    public static void lamdaMethod() {
        pole++;
    }
}

class Pl {
    private String name;
    private String param;

    public Pl(String name, String param) {
        this.name = name;
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
    
    
}
