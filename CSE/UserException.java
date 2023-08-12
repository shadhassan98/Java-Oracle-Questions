package CSE;

class UserException extends Exception { }

class AgeOutOfLimitException extends UserException { }

class App2 {
    public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
        if (name.length () < 6) {
            throw new UserException ();
        } 
        else if (age >= 60) {
            throw new AgeOutOfLimitException ();
        } 
        else {
            System.out.println("User is registered.");
        }
    }
    public static void main(String[ ] args) throws UserException {
        App2 t = new App2();
            t.doRegister("Mathew", 60);
      
        }
        
    }

