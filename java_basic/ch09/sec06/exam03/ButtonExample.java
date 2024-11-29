package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        button.setClickListener(new OkListener());

        button.click();

        Button buttonCancel = new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        buttonCancel.setClickListener(new CancelListener());

        buttonCancel.click();
    }
}
