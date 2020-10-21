/* Ahmet Faruk KOCA
    021902010005
    17:45 21/10/2020
*/

package DynamicList;

public class Main {
    public static void main(String[] args) {
        DynamicList list = new DynamicList();
        list.Add("haha");
        list.Add("hoho");
        list.Add("hihi");
        list.Add("oho");
        list.Add("aha");
        list.Add("e");
        list.Add("o");
        list.Add("a");
        list.Add("hihe");
        list.Print();

        list.Remove("hoho");
        list.Print();

        list.Remove("e");
        list.Print();
        list.Find("hihe");
    }
}
