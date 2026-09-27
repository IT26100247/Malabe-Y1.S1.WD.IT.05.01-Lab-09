public class IT26100247Lab9Q3 {

    
    public static void main(String[] args) {
        // Expression i: (3 * 4 + 5 * 7)^2
        int step1 = multiply(3, 4);       
        int step2 = multiply(5, 7);       
        int step3 = add(step1, step2);    
        int result1 = square(step3);      

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int step4 = add(4, 7);            
        int step5 = square(step4);        
        int step6 = add(8, 3);            
        int step7 = square(step6);        
        int result2 = add(step5, step7);  

        // Printing results to match display format
        System.out.println("Result of (3 * 4 + 5 * 7)^2    : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }

    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int number) {
        return number * number;
    }
}