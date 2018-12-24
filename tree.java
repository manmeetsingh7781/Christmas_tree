class ChristMassTree
{
public static void main(String[] args) {
        tree();
        tree_leg();
}

private static void tree(){
        ArrayList<String> l = new ArrayList<>(2);
        l.add("1");
        l.add("0");
        for(int a = 1; a <= 10; a++){
            Collections.shuffle(l);
            for(int b = 10; b >= a; b--){
                System.out.print(" ");
                Collections.shuffle(l);
            }
            for(int b = 2; b <= a; b++){
                Collections.shuffle(l);
                System.out.print(l.get(0));
            }
            for(int b = 1; b <= a; b++){
                Collections.shuffle(l);
                System.out.print(l.get(1));
            }
            System.out.println();
        }
    }
    private static void tree_leg(){
        for(int x = 4; x >= 1; x--){
                System.out.print("        ");
            for(int v = 1; v <= 2; v++){
                System.out.print("||");
            }
            System.out.println();
        }
        for(int f=1; f<= 12;f++){
            System.out.print("==");
        }
    }
}
