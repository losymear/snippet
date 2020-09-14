package com.mearlosy;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author mearlosy
 * @since 2020-08-20 10:55
 */
public class TimeHelper {

    /**
     * 获取系统ZoneOffset
     */
    public ZoneOffset getSystemOffset() {
        ZoneOffset zoneOffset = OffsetDateTime.now().getOffset();
        return zoneOffset;

    }

    /**
     * 获取本周一零时的时间戳
     */
    public void mondayTimestamp() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime mondayStart =
                localDateTime.minusDays(localDateTime.getDayOfWeek().ordinal())
                        .minusHours(localDateTime.getHour())
                        .minusMinutes(localDateTime.getMinute())
                        .minusSeconds(localDateTime.getSecond());

    }

}
