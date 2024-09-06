package API;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("firnaaa5", "이휘주"));
        list.add(new Member("firnaaa4", "이희주"));
        list.add(new Member("firnaaa3", "이휘즈"));
        list.add(new Member("firnaaa2", "이히지"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));
}
