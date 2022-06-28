package com.dzhenetl;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        List<Integer> result = new ArrayList<>();
        source.forEach(x -> {
            if (x < threshold) logger.log("Элемент \"" + x + "\" не проходит");
            else {
                logger.log("Элемент \"" + x + "\" проходит");
                result.add(x);
            }
        });
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        return result;
    }
}
