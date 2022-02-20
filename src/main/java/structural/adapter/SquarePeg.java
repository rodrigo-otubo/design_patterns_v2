package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class SquarePeg {

    private double width;

    public double getSquare() {
        return Math.pow(this.width, 2);
    }

}
