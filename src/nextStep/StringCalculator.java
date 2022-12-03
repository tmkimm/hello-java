package nextStep;

/**
 * 쉼표, 콜론으로 된 구분자를 더한다.
 * \\와 \n 사이에 있는 문자는 구분자로 구분자가 있는 경우 더한다.
 * 음수가 나오면 exception
 Calculator cal = new Calculator();
 try {
 System.out.println(cal.add("1,2,3"));
 System.out.println(cal.add("4:6:8"));
 System.out.println(cal.add("\\;\n1;2;4"));
 */

public class StringCalculator {
    int add(String text) throws Exception {
        if(isBlack((text))) {
            return 0;
        }
        String[] values = text.split(",|:");
       return sum(values);
    }
    private boolean isBlack(String text) {
        return text == null || text.isEmpty();
    }

    private int sum(String[] values) {
        int sum = 0;
        for(String value : values) {
            sum += toPositive(value);
        }
        return sum;
    }

    private int toPositive(String value) {
        int num = Integer.parseInt(value);
        if( num < 0) {
            throw new RuntimeException();
        }
        return num;
    }
}