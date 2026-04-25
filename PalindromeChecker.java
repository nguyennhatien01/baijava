public class PalindromeChecker {

    public static void main(String[] args) {
        // Thử nghiệm với các ví dụ trong hình
        System.out.println("madam: " + Panlyndrome("madam")); // true
        System.out.println("radar: " + Panlyndrome("radar")); // true
        System.out.println("hello: " + Panlyndrome("hello")); // false
    }

    /**
     * Phương thức kiểm tra chuỗi đối xứng
     * Tên phương thức đặt theo yêu cầu trong ảnh: Panlyndrome
     */
    public static boolean Panlyndrome(String s) {
        // Nếu chuỗi rỗng hoặc có 1 ký tự thì mặc định là đối xứng
        if (s == null) return false;
        
        int n = s.length();
        
        // Chạy vòng lặp từ đầu đến giữa chuỗi
        for (int i = 0; i <= n / 2; i++) {
            // So sánh ký tự ở vị trí i với ký tự đối diện ở cuối chuỗi
            // Công thức: n - 1 - i (giống như logic M[5-1-i] trong ảnh)
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false; // Nếu thấy một cặp không khớp thì không phải Palindrome
            }
        }
        
        return true; // Nếu kiểm tra hết mà không sai thì là Palindrome
    }
}
