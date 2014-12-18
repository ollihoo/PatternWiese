package pattern.decorator.domain;

import goblin.donottouch.Item;
import pattern.decorator.domain.Quality;

public class DecoratedItem extends Item {

    protected Quality quality = new Quality();


    public void updateQuality() {
        // any implementation that handles quality
    }

}
