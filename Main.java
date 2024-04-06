import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner __ = new Scanner(System.in);
        String ___ = __.nextLine();
        String ____ = encoder(___);
        System.out.println(____);
        __.close();
    }
    public static String _____(String ___) {
        String __ = "";
        for (int ____ = ___.length() - 1; ____ >= 0; ____--) {
            __ += ___.charAt(____);
        }
        return __;
    }
    public static String toLowerCase(String __) {
        String ___ = "";
        for (int ____ = 0; ____ < __.length(); ____++) {
            char _____ = __.charAt(____);
            if ('A' <= _____ && _____ <= 'Z')
                ___ += (char) (_____ + 32);
            else
                ___ += _____;
        }
        return ___;
    }
    public static String encoder(String __________________________) {
        String __ = _____(__________________________);
        String ___ = toLowerCase(__);
        String ____ = "";
        int _____ = Math.min(5, ___.length());
        for (int ________ = 0; ________ < _____; ________++) {
            ____ += ___.charAt(________);
        }
        ____ += ___;
        return ____;
    }
}