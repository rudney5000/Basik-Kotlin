package Integersinaction

/**

            Guest list of a hotel

    There is a hotel that may accommodate 4 guests.
    Each line of the input contains the name or the names of the guests arriving at the hotel on a certain day.

    Read the names of the guests from the input and output each name in a separate line and in reverse order starting with the last arrived guest.
    Note that the order of the arriving guests and the number of days are not pre-defined.

            Sample Input 1:

            Jane Kate
            John
            Mary

            Sample Output 1:

            Mary
            John
            Kate
            Jane

            Sample Input 2:

            Joseph
            Piotr Eugene
            Jack

            Sample Output 2:

            Jack
            Eugene
            Piotr
            Joseph

            Answer

            import java.util.Scanner;

            class Main {
            public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            // start coding here
            String a = s.next();
            String b = s.next();
            String c = s.next();
            String d = s.next();

            System.out.println(d);
            System.out.println(c);
            System.out.println(b);
            System.out.print(a);

            }
            }

 **/