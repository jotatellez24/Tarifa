package com.co.screenplay.utils;
import com.google.common.base.Function;
import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public final class Waits {

    private static Wait<Integer> wait;
    private static final String MILISECONDS = "millisegundos";
    private static final String SECONDS = "segundos";

    private Waits() {}

    public static void TimeDefine(int waitTime, String unitMeasure) {

        Integer i = 0;

        if (unitMeasure.equalsIgnoreCase(MILISECONDS)) {
            wait =
                    new FluentWait<>(i)
                            .withTimeout(Duration.ofMillis(waitTime))
                            .pollingEvery(Duration.ofMillis(waitTime));
        } else if (unitMeasure.equalsIgnoreCase(SECONDS)) {
            wait =
                    new FluentWait<>(i)
                            .withTimeout(Duration.ofSeconds(waitTime))
                            .pollingEvery(Duration.ofSeconds(waitTime));
        }
    }

    public static void WaitsUntils(int waitTime, String unitMeasure) {
        try {
            TimeDefine(waitTime, unitMeasure);
            wait.until(new IntegerBooleanFunction());
        } catch (TimeoutException e) {

        }

    }

    private static class IntegerBooleanFunction implements Function<Integer, Boolean> {

        public Boolean apply(Integer i) {
            return false;
        }
    }
}
