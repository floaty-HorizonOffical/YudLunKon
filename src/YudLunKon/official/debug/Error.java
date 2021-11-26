package YudLunKon.official.debug;
import YudLunKon.official.util.Print;

public class Error {
    public static void SendManualInstruction(){
        Print.printNewLn("Check the manual for the official or the mod.\n\tFound in Libraries/LIB-THAT-SENT-BUG/manual.txt");
    }
    public static void UnknownError(String lib) throws Exception {
        throw new Exception(lib + ": There was a problem somewhere in the code!");
    }
    public static void InvalidNumber(String lib, int num1, int num2) {
        throw new IllegalStateException(lib + ": Oops! You inputted an invalid number!\nYou can only input between "+num1+"-"+num2);
    }
}
