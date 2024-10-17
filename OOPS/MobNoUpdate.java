package OOPS;
import java.util.Scanner;


public class MobNoUpdate {

    String name = "One Plus";
    private long oldphoneNo = 1234567890;

    public void setMobileNo(long oldphoneNo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the old mobile number:");
        long phoneNo = sc.nextLong();
        
        // Check if the entered phone number matches the stored old phone number
        if (phoneNo == this.oldphoneNo) {
            System.out.println("Generating OTP...");
            double d = Math.random();
            int otp = (int) (99999 * d) + 99999;
            System.out.println("Generated OTP is: " + otp);  // For demonstration purposes
            System.out.println("Please enter the OTP:");
            int userOTP = sc.nextInt();
            if (otp == userOTP) {
                System.out.println("OTP verified successfully. Updating mobile number.");
                this.oldphoneNo = oldphoneNo;
                System.out.println(oldphoneNo);
                // Update mobile number or perform other actions as needed
            } else {
                System.out.println("Invalid OTP.");
            }
        } else {
            System.out.println("Mobile number does not match.");
        }
    }
}