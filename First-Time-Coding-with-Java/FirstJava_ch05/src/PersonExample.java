class PersonExample
{
    private static final String DEFAULT_DESTINATION = "집";
    
    private String destination = DEFAULT_DESTINATION;

    // 자바는 인자를 상수로 지정할 수도 있다.
    public void goToOffice(final String destination)
    {
        this.destination = destination;
        System.out.println(destination + "로 출근합니다.");
    }

    public static void main(String[] args) 
    {
        PersonExample p = new PersonExample();
        p.goToOffice("회사");
    }
}