package sk.stuba.fei.uim.oop.cards;

import sk.stuba.fei.uim.oop.pack.Pack;
import sk.stuba.fei.uim.oop.player.Player;

public class Indiani extends Card {

    public Indiani() {
        this.name = "Indiani";
    }

    @Override
    public void use(Player p, Pack d, Player players[]) {
        for (Player target : players) {
            if(target.isAlive() && target != p){

                Card b = target.hasBang();
                if(b != null) {
                    target.removeCard(b, d);
                }
                else{
                    target.removeLives(1);
                }
            }
        }
            p.removeCard(this, d);
    }
}
