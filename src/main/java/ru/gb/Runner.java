package ru.gb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner {

  private final ClassExampl1 classExampl1;
  private final ClassExampl2 classExampl2;

  @EventListener(ApplicationReadyEvent.class)
  public void onApplicationReady() {
      try {
        classExampl1.method1();
        classExampl1.method2();
        classExampl2.method3();
      } catch (Throwable e) {
        log.error("was exc");
      }
    }


}
