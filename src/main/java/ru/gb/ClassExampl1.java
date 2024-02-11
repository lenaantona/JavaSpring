package ru.gb;

import org.springframework.stereotype.Component;
import ru.gb.aspect.Logtime;
import org.slf4j.event.Level;

@Component
public class ClassExampl1 {

    @Logtime(level = Level.INFO)
    public Integer method1(){
        return 1+1;
    }

    @Logtime(level = Level.INFO)
    public Integer method2(){
        int result = 0;
        for (int i = 0; i < 1000; i++) {
            result = result + 1;
        }
        result = result + 1;
        return result;
    }
}
