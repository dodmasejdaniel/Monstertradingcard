package project;

import java.util.ArrayList;

//klase per 1 pako letra q useri mund te bleje per ti shtuar ne dek
public class Package {
    // lista ku do ruhen letrat qe do jene brenda pakos
    ArrayList<Card> cards = new ArrayList<Card>();

    // sasia maksimale e letrave qe mund te kete 1 pako
    final static int MAX_SIZE = 5;

    //constructor i klases Package q mbush listen me letra
    public Package(ArrayList<Card> cards){
        if(isValid()){
            this.cards=cards;
        }
        else{
            //User input doesn't have 5 cards
        }
    }

    //metode q kthen mbrasht letrat brenda pakos
    public ArrayList<Card> getCards(){
        return cards;
    }

    // metode q trg nqs pakoja ka saine e duhur te letrave
    public boolean isValid(){
        if(cards.size()==MAX_SIZE)
            return true;
        return false;
    }
}
