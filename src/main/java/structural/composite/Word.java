package structural.composite;

import java.util.List;
import java.util.stream.IntStream;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        letters.forEach(this::add);
    }

    public Word(char... letters) {
        IntStream
                .range(0, letters.length)
                .forEach(i -> {
                    char letter = letters[i];
                    this.add(new Letter(letter));
                });
    }

    @Override
    protected void printThisBefore() { System.out.print(" "); }

}
