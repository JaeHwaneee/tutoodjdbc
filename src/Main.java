public class Main {
    public static void main(String[] args) {
        checkLeapYear();
    }
    // 
    private static void checkLeapYear() {
        int year = 2020;
        // 4로 나누고, 100으로 정확히 나뉘어지며, 400으로 나뉘어 지는 숫자는 O표시 아닌 숫자는 X표시
        if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )
            System.out.println(year + " O");
        else
            System.out.println((year + " X"));
    }
}
