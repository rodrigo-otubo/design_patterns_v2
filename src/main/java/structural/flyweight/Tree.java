package structural.flyweight;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public void draw(Graphics g) {
        this.type.draw(g, x, y);
    }
}
