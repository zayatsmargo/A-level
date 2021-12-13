package com.company.zayats.hw15.homeworkSlide33;

import java.util.Comparator;

public class BoxVolumeComparator implements Comparator<Box> {
    @Override
    public int compare(Box a, Box b) {
        if (a.volume == 0 || b.volume == 0) {
            if (a.volume == 0) {
                return -1;
            }
            return 1;
        }
        return Integer.compare(b.volume, a.volume);
    }
}
