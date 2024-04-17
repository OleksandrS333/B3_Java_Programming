package day07_relational_operators;

public class GiftCard {

    /*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
            buy item 1 for x price and subtract from your gift card
            buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

 */
        public static void main (String [] args) {
            double giftCardBalance = 200;
            double item1Price = 100;
            double item2Price = 70;
            System.out.println("In my gift card, I have $" + giftCardBalance + " balance.");
            System.out.println("Buy item 1 for $" + item1Price + " with you gift card.");

            // giftCardBalance = giftCardBalance - item1Price;
            giftCardBalance -= item1Price; // this one is same as above. Just using SHORTHAND operator

            System.out.println("After purchasing item 1, my gift card balance is $" + giftCardBalance);

            //giftCardBalance = giftCardBalance - item2Price; // 100 - 50;
            giftCardBalance -= item2Price;

            System.out.println("After purchasing item 2, my gift card balance is $" + giftCardBalance);


        }
    }

