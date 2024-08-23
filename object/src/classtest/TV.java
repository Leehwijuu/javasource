package classtest;

public class TV {
    // 속성 => 변수
    private int channel; // 채널 : 번호
    private boolean power;// 전원상태 : tuue(온) / false(off)
    private String company; // 제조사 : 삼성, LG
    private int saond; // 사운드 : 0 ~ 100 번호

    // 생성자
    // 클래스 이름(){}
    // 생성자 오버로딩 (하나의 클래스에 생성자가 여러개 존재)
    TV() {
        // default 생성자
    }

    TV(int channel, boolean power, String company, int saond) {
        this.channel = channel;
        this.power = power;
        this.company = company;
        this.saond = saond;
    }

    // 전원을 켠다/끈다
    void power()

    {
        this.power = !this.power;
    }

    // 채널 올린다 / 내린다
    void channelUP()

    {
        this.channel++;
    }

    void channelDown()

    {
        this.channel--;
    }

    // 소리를 올린다 / 내린다
    void saondUP()

    {
        this.saond++;
    }

    void saondDown()

    {
        this.saond--;
    }

    // set로 시작하는 메소드는 setter 메소드임

    // get로 시작하는 메소드는 getter 메소드 임
    public int getChannel() {
        return channel;
    }

    public String getCompany() {
        return company;
    }

    public boolean isPower() {
        return power;
    }

    public int getSaond() {
        return saond;
    }

}
