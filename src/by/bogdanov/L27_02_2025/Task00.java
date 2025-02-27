package by.bogdanov.L27_02_2025;

public class Task00 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Dima", 32);
        User user2 = new User("Dima", 32);
        System.out.println("user2.equals(user1): " + user2.equals(user1));
        System.out.println("user2 ==user1): " + (user2 == user1));
        /*Object user3 = new User("Катя", 35);
        Object user = new User[3];
        User user4 = (User) user3;*/
        System.out.println("user2 hashcode: " + user2.hashCode());
        System.out.println("user1 hashcode: " + user1.hashCode());

        User user5 = user1.clone();
        System.out.println("user5 == user1 " +(user5 == user1));
        System.out.println(user1);
        System.out.println(user5);
    }
}
