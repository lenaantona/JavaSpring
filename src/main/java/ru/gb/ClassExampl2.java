package ru.gb;

import org.slf4j.event.Level;
import org.springframework.stereotype.Component;
import ru.gb.aspect.Logtime;
@Logtime(level = Level.WARN)
@Component
public class ClassExampl2 {


    public int method3(){
        int result = 1;
        for (int i = 1; i <= 100; i++) {
            result = result * i;
        }
       return result;
    }
}
