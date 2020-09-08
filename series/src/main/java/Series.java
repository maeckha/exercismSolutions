/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.ArrayList;
import java.util.List;

public class Series {

    String series;

    public Series(String series) {
        this.series = series;
    }

    public List<String> slices(int sliceLength) throws IllegalArgumentException {

        final int seriesLength = this.series.length();

        if (sliceLength > seriesLength) {
            throw new IllegalArgumentException("Slice size is too big.");
        } else if (sliceLength <= 0) {
            throw new IllegalArgumentException("Slice size is too small.");
        } else {
            List<String> slicesList = new ArrayList<>();
            for (int i = 0; i + sliceLength <= seriesLength; i++) {
                slicesList.add(series.substring(i, i + sliceLength));
            }
            return slicesList;
        }
    }
}
