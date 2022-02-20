package structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoundHole {

    private double radius;

    public boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }

}
