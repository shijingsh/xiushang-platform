package javax.validation.constraints;

import com.xiushang.validation.validator.DateTimeCheckConstraintValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 日期格式校验
 **/
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = { DateTimeCheckConstraintValidator.class })
public @interface DateTimeCheck {
    /**
     * 是否必填 默认是必填的
     * @return
     */
    boolean required() default true;

    String message() default "{DateTimeCheck.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String format() default "yyyy-MM-dd HH:mm:ss";

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        DateTimeCheck[] value();
    }
}
