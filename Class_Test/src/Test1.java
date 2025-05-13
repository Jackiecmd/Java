public class Test1 {
        public static String replaceDigitsWithNumber(String s) {
            // 把输入的字符串转换为字符数组，方便逐字符处理
            char[] charArray = s.toCharArray();
            StringBuilder result = new StringBuilder();

            // 遍历字符数组中的每个字符
            for (int i = 0; i < charArray.length; i++) {
                // 判断当前字符是否为数字
                if (charArray[i] >= '0' && charArray[i] <= '9') {
                    // 若为数字，将 "number" 添加到结果 StringBuilder 中
                    result.append("number");
                } else {
                    // 若不是数字，将该字符添加到结果 StringBuilder 中
                    result.append(charArray[i]);
                }
            }

            // 把 StringBuilder 转换为字符串并返回
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "a1b2c3";
            String output = replaceDigitsWithNumber(input);
            System.out.println(output);
        }
}
