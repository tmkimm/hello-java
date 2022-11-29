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
    int add(String content) throws Exception {
        int result = 0;
        String[] separatorArr = new String[] {",", ":", "\\"};
        String separator = "";

        for(String str : separatorArr) {
            if(content.indexOf(str) != -1) {
                if(str == "\\") {
                    separator = content.substring(content.indexOf(str) + 1, content.indexOf("\n"));
                    content = content.substring(content.indexOf("\n") + 1);
                } else {
                    separator = str;
                }
                break;
            }
        }
        if(separator.isEmpty()) {
            throw new Exception("구분자를 찾을 수 없습니다.");
        }

        String[] strArr = content.split(separator);
        for(String str : strArr) {
            result += Integer.parseInt(str);
        }
       return result;
    }
}