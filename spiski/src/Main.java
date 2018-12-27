import java.util.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> r = new ArrayList<>();
        int c = 10;
        int n = 100;
        for (int i = 0; i <= c; i++) {
            r.add((int) (Math.random() * n));
        }
        System.out.print(r);
        //выводит список из 10 элементов со случайными числами до 100
        ArrayList<Integer> r2;
        r2 = r;
        Collections.sort(r2);
        System.out.print("\nSort: " + r2 + "\n");
        String[] names = {"Rob","Tobi","Kate","Ann","Desire","Gabe"};
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i<10; i++){
            String name = names[(int)(Math.random() * names.length)];
            map.put(i,name);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        //создать коллекцию из объектов и сортировать их по id
        List<obj> OBJLists = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            OBJLists.add( new obj() );
        }
        for(int i = 0; i < 10; i++) {
            OBJLists.get(i).setId((int)(Math.random() * 10));
        }
        for(obj o: OBJLists){
            System.out.print(o.getId());
        }
        System.out.print("\nSort: ");
        Collections.sort(OBJLists);
        for(obj o: OBJLists){
            System.out.print(o.getId());

        }
    }
}