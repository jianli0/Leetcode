class Deck{
    private Card[] deck;
    public Deck(){
        deck = new Card[54];
        int cardnum = 0;
        for(CardType c : CardType.values()){
            if (c != "JOKER"){
                for(int value = 1;  value <= 13; value++){
                    deck[cardnum] = new Card(value,c);
                    cardnum++;
                }
            }else{
                deck[cardnum] = new Card(1,"JOKER");
                cardnum++;
                deck[cardnum] = new Card(2,"JOKER");
                cardnum++;
            }
        }
    };


    public void shuffle(){
        int newI;
        Card temp;
        Random randIndex = new Random();

        for(int i =  0; i < deck.length; i++){
            newI = randIndex.nextInt(deck.length);
            temp = cards[i];
            cards[i] = cards[newI];
            cards[newI] = temp;
        }
    }
}

enum CardType{SPADE, HEART, DIAMOND, CLUB, JOKER};

class Card{
    int face;
    CardType cardtype;
    Card(int face, CardType cardtype){
        this.face = face;
        this.cardtype = cardtype;
    };

    public int getface(){
        return face;
    };

    public CardType gettype(){
        return cardtype;
    };

    public string toString(){
    };
}

class Hand{
}



/*design for a parking lot*/
class parkingLot{
    int total;

    HashMap<Integer,Type> availble = new HashMap<Integer, Type>();
    HashMap<Integer,Type> unavailble = new HashMap<Integer, Type>();

    parkingLot(ArrayList<parkingSpace> spaces){
        total = spaces.length();
        for(int i = 0; i < spaces.length(); i++){
            if (spaces.get(i).isAvailble == true){

            }
        }
    }

    isfull(){
        return unavaible.length() == total;
    }
    isempty();







}

enum parking Type{regular,handicapped,compact};

class parkingSpace{
    boolean isAvailble;
    int num;
    Type type;
    parkingSpace(boolean isAvailble ,int num, Type type){
        this.isAvailble = isAvailble;
        this.num = num;
        this.type = type;
    }

    get();
    toString();

}

















