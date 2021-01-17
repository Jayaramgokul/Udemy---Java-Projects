public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(260, 90));
        System.out.println(getDurationString(450));


    }


    public static String getDurationString(int min, int sec) {
        if (min >= 0 && sec >= 0) {
            int hours = (int) min / 60;
            int minutes = (int) sec / 60 + (int) min % 60;
            int seconds = (int) sec % 60;
            if (hours / 10 < 1 && minutes / 10 < 1) {
                return min + " minutes & " + sec + " seconds is 0" + hours + "h"+ " 0" + minutes + "m " + seconds+"s";
            }
            else if (hours / 10 < 1 || minutes / 10 < 1) {
                if (hours / 10 < 1)
                    return min + " minutes & " + sec + " seconds is 0" + hours +"h"+ " " + minutes + "m " + seconds+"s";
                else if (minutes / 10 < 1)
                    return min + " minutes & " + sec + " seconds is " + hours +"h"+ " 0" + minutes + "m " + seconds+"s";

            }
            else{
                return min + " minutes & " + sec + " seconds is " + hours +"h"+ " " + minutes + "m " + seconds+"s";
            }
        }

            return "Invalid Value !";
    }
    public static String getDurationString(int sec){
        if (sec >= 0) {
            int minutes= (int) sec / 60;
            int seconds= (int) sec % 60;
            return getDurationString(minutes, seconds);
        }
        else{
            return "Invalid Value !";
        }

    }
}
