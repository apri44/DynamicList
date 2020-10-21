package DynamicList;

public class DynamicList {

    private String[] array;
    private int index = 0;

    public DynamicList(int range) {
        this.array = new String[range];
    }

    public DynamicList() {
        this.array = new String[2];
    }

    public void Add(String param) {

        try {
            if (Find(param) == -1) {
                this.array[index] = param;
                this.index++; 
                System.out.println(param + " was added.");
                String[] temp = new String[this.array.length + 1];
                
                if (this.index + 1 == this.array.length) {
                    int i;
                    for(i = 0; i < this.array.length; i++) {
                        temp[i] = this.array[i];
                    }

                    this.array = temp;
                }
            }
        }

        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void Remove(String param) {
        try {
            int i;
            for (i = 0; i < this.index; i++) {
                if (this.array[i] == param) {
                    this.array[i] = "##";

                    this.Update();

                    System.out.println(param + " was removed");
                    return;
                }
            }
        }
        catch(Exception e) {
            //e.printStackTrace();
            System.out.println("Given parameter was not found");
            return;
        }
    }

    public int Find(String param) {
        if (this.index != 0) {
            int i;
            for (i=0; i <= this.index; i++) {
                if (this.array[i] == param) {
                    System.out.println("Given paramater was found at index " + i + ".");
                    return i;
                } 
            }

            return -1;
        }
        return -1;
    }

    public void Print() {
        int i;
        boolean gotInLoop = false;

        System.out.print("[");

        for(i = 0; i < this.index; i++) {
            if(gotInLoop == true) {
                System.out.print(", ");
            }

            gotInLoop = true;
            System.out.print(this.array[i]);
        }
        System.out.print("]\n");
    }

    private void Update() {
        int i;
        int j = 0;
        String[] temp = new String[this.array.length - 1];

        for(i = 0; i < this.array.length; i++) {
            if (this.array[i] != "##") {
                temp[j] = this.array[i];
                j++;
            }
        }
        this.array = temp;
        this.index--;
    }
}