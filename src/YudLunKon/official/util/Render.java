package YudLunKon.official.util;

public class Render {
    public static void box(Integer width, Integer height){
        String renderWidth = switch (width) {
            case 1 -> "#";
            case 2 -> "##";
            case 3 -> "###";
            case 4 -> "####";
            case 5 -> "#####";
            case 6 -> "######";
            case 7 -> "#######";
            case 8 -> "########";
            case 9 -> "#########";
            case 10 -> "##########";
            case 11 -> "###########";
            case 12 -> "############";
            case 13 -> "#############";
            case 14 -> "##############";
            case 15 -> "###############";
            case 16 -> "################";
            default -> throw new IllegalStateException("YudLunKon: You can only have a width of 1-16!");
        };
            if (height <= 30 && height > 0) {
                for (int i = height; i > 0; i--)
                    {
                        Print.printNewLn(renderWidth);
            }
        }
    }
    public static void circle(int radius) {
        String circle = switch (radius) {
            case 2 -> " ##\n####\n ##";
            default -> throw new IllegalStateException("YudLunKon: Invalid number! You can only have between 2-2");
        };
        Print.printNewLn(circle);
    }
}

/*
 *  ##
 * ####
 *  ##*/
