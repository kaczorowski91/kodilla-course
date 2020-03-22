package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class ApiWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) " +
            "&& args(orderDto, userId) &&target(object)")
    public void logEvent(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Logging the event. Class: " + object.getClass().getName() + ", OrderDto: "
                + orderDto+ ", UserID "+userId);
    }
}
