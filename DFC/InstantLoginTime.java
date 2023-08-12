package DFC;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantLoginTime {
    public static void main(String[] args) throws Exception{
        // Login time: 2015-01-12T21:58:18.817Z 
        Instant loginTime = Instant.now(); 
        Thread.sleep(1000);
        // Logout time: 2015-01-12T21:58:19.8802 
        Instant logoutTime = Instant.now();
        loginTime =  loginTime.truncatedTo (ChronoUnit.MINUTES); 
        logoutTime = logoutTime.truncatedTo (ChronoUnit.MINUTES);
        if (logoutTime.isAfter (loginTime))
        System.out.println("Logged out at: "+logoutTime);
        else
        System.out.println("Can't logout");
    }
}
