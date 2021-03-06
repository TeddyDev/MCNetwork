package me.lukebingham.gta.vehicles.attributes;

import java.lang.annotation.*;

/**
 * Created by LukeBingham on 28/04/2017.
 */
@Documented
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Handling {
    /**
     * @return Handling floating point
     */
    float value();
}
