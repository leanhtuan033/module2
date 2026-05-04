package DSA;

public class Test {
    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 99);

        System.out.println("Danh sách ban đầu:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);

        System.out.println("\nSau khi xoá:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nCó 99 không? " + list.contains(99));


        System.out.println("Index của 99: " + list.indexOf(99));


        MyList<Integer> newList = list.clone();

        System.out.println("\nList clone:");
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }


        list.clear();
        System.out.println("\nSau khi clear, size = " + list.size());
    }
}
