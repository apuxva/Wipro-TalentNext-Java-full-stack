package live;

import com.music.Playable;
import com.music.stringg.Veena;
import com.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // Create an instance of Veena and call play() method
        Veena veena = new Veena();
        veena.play();

        // Create an instance of Saxophone and call play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Place the above instances in a variable of type Playable and then call play()
        Playable playable;

        playable = veena;
        playable.play();

        playable = saxophone;
        playable.play();
    }
}


