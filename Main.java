/*  Apri44
    17:45 21/10/2020
*/

package DynamicList;

public class Main {
    public static void main(String[] args) {
        DynamicList list = new DynamicList();

        int i;
        for (i=0; i<101; i++) {
            list.Add(Integer.toString(i));
        }

        for (i=25; i<76; i++) {
            list.Remove(Integer.toString(i));
        }

        list.Print();
        list.Find("76");
        list.Find("100");
        list.Find("0");
        list.Find("a");
    }
}
