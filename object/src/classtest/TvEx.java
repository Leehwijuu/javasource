package classtest;

public class TvEx {
    public static void main(String[] args) {
        TV tv = new TV();

        // private 키워드가 붙은 경우에 외부에서 직접 호출 불가
        // System.out.println("현재 채널 : " + tv.channel);
        // System.out.println("현재 전원상태 : " + tv.power);
        // System.out.println("제조사 : " + tv.company);
        // System.out.println("현재 사운드 : " + tv.saond);

        TV tv2 = new TV(7, true, "LG", 65);

        int channel = tv2.getChannel();
        System.out.println("현재 채널 : " + channel);

        // 메소드 호출
        tv2.channelUP();
        System.out.println("현재 채널 : " + tv2.getChannel());

        // tv 전원 종료
        tv2.power();
        System.out.println("전원상태 : " + tv2.isPower());

    }
}
