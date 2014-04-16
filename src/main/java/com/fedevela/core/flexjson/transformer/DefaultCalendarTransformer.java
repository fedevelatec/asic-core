package com.fedevela.core.flexjson.transformer;

/**
 * Created by Federico on 16/04/14.
 */
import java.util.Calendar;

public class DefaultCalendarTransformer extends AbstractTransformer {

    public void transform(Object object) {
        getContext().write(String.valueOf(((Calendar)object).getTimeInMillis()));
    }
}
