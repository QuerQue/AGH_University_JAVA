 
class Card{
    String color;
    String shape;
}

public class Talia{
    Card[] DeckOfCard = new Card[52];

    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

    Talia(){
        for(int j=0; j<52; j++){
            DeckOfCard[j] = new Card();
        }
        int p=0;
        for(int i=0; i<13; i++){
            for(int k=0; k<4; k++){
                DeckOfCard[p].color=suits[k];
                DeckOfCard[p].shape=ranks[i];
                p++;
            }
        }
    }

    void Display() {
        for(int i=0; i<52; i++){
            System.out.print(DeckOfCard[i].shape + " - " + DeckOfCard[i].color + "\n");
        }
    }

    public static void main(String[] args) {

        Talia taliaKart = new Talia();
        taliaKart.Display();

    }
}
