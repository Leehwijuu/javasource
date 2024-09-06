package API;

public class StringEx3 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Jerry", "Choi", "Kim", "Park" };

        String result = findkim(names);
        System.out.println(result);
    }

    static String findkim(String[] names) {
        // Kim 찾기
        int pos = -1;

        for (int i = 0; i < names.length; i++) {
            if ("Kim".equals(names[i])) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            return "Kim 은 " + (pos + 1) + "에 있다";
        }
        return null;
    }
}
