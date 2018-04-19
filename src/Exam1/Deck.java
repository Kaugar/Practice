package Exam1;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  ArrayList<Card> cardlist = new ArrayList<>();


  public Deck(int numberOfCards) {
    for (int i = 0; i < numberOfCards; i++) {
      Card card = new Card();
      cardlist.add(card);
    }
    System.out.println(cardlist);
  }
  public int cardCounter(String cardColor){
    int colorCounter = 0;
    for (int i = 0; i < cardlist.size(); i++) {
      if(cardlist.get(i).getColor().equals(cardColor)){
        colorCounter++;
      }
    }
    return colorCounter;
  }
  public void shuffler (){
    Random ran = new Random();
    int randNum1 = ran.nextInt(cardlist.size());
    int randNum2 = ran.nextInt(cardlist.size());
    for (int i = 0; i < cardlist.size(); i++) {
      Card tempcard = cardlist.get(randNum1);
      cardlist.set(randNum2, tempcard);
    }
    System.out.println(cardlist);
  }
  public Card draw (){
    Card drawnCard = cardlist.get(0);
    cardlist.remove(0);
    return drawnCard;
  }

  @Override
  public String toString() {
    return cardlist.size() + " cards, "
            + cardCounter("Diamond") + " Diamonds, "
            + cardCounter("Heart") + " Hearts, "
            + cardCounter("Club") + " Clubs, "
            + cardCounter("Spade") + " Spades, ";
  }
}
