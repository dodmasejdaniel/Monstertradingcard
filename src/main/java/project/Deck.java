package project;

import java.util.ArrayList;
import java.util.List;

//klase me getters qe perkon me tabelen deck ne database
public class Deck {
//lista e letrave qe mban deku
    private List<Card> cards = new ArrayList<>();
    //constructor i klases deck q ve re nqs deck ka m 4 letra nuk shton me letra sipas rregullave te lojes
    public Deck (List<Card> deck) {
        if (deck != null) {
            for (int i = 0; deck.size() > i && i < 4; i++) {
                this.cards.add(deck.get(i));
            }
        }
    }

    // heq 1 leter nga deku
    public void removeCard (Card card){
        if (cards != null){
            cards.remove(card);
        }
    }
//shton 1 leter ne dek
    public void addCard (Card card){
        if (!cards.contains(card)){
            cards.add(card);
        }
    }
// merr nje leter te rastit nga deku
    public Card getRandomCard(){
        if (cards != null && cards.size() > 0){
            return cards.get((int)(Math.random() * cards.size()));
        }
        return null;
    }
//shef nqs deku nuk ka asnje leter
    public boolean isEmpty(){
        return cards.isEmpty();
    }

    //kthen mbrasht sasine e ltrave ne dek
    public int getSize(){
        if (!isEmpty()){
            return cards.size();
        }
        return 0;
    }
}


