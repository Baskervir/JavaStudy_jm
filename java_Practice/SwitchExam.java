import java.util.Calendar;

public class SwitchExam {
    public static void main(String[] args) {
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        // switch 문을 이용 -> season에 봄/여름/가을/겨울 중 하나의 값을 가지도록 하기
        switch (month) {
            case 1:
            case 11:
            case 12:
                season = "겨울";
                break;
            case 2:
            case 3:
            case 4:
                season = "봄";
                break;
            case 5:
            case 6:
            case 7:
                season = "여름";
                break;
            case 8:
            case 9:
            case 10:
                season = "가을";
                break;
            default:
                System.out.println("잘못된 월 입니다.");
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
}
