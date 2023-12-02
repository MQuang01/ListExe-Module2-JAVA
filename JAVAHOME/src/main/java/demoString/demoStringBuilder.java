package demoString;

public class demoStringBuilder {
        public static void main(String[] args) {
            // Khởi tạo StringBuilder
            StringBuilder stringBuilder = new StringBuilder();

            // Thêm các chuỗi vào StringBuilder
            stringBuilder.append("Hello");
            stringBuilder.append(" ");
            stringBuilder.append("World");

            // Chuyển đổi StringBuilder thành String
            String result = stringBuilder.toString();

            // In kết quả
            System.out.println("Result StringBuilder: " + result);
        }
}
