import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static String solution(String str){
        Set<String> musicExtns = new HashSet<String>(Arrays.asList(".mp3",".aac",".flac"));
        Set<String> imageExtns = new HashSet<String>(Arrays.asList(".jpg",".bmp",".gif"));
        Set<String> movieExtns = new HashSet<String>(Arrays.asList(".mp4",".avi",".mkv"));
        Set<String> otherExtns = new HashSet<String>();
        Long musicBytes = 0l;
        Long imageBytes = 0l;
        Long movieBytes = 0l;
        Long otherBytes = 0l;
        StringBuilder output = new StringBuilder();

        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){

            if(i % 2 == 0) {

                if (musicExtns.contains(arr[i].substring(arr[i].lastIndexOf('.')))) {
                    musicBytes = musicBytes + Long.parseLong(arr[i+1].substring(0, str.length() - 1));
                }

                if (imageExtns.contains(arr[i].substring(arr[i].lastIndexOf('.')))) {
                    imageBytes = imageBytes + Long.parseLong(arr[i+1].substring(0, str.length() - 1));
                }

                if (movieExtns.contains(arr[i].substring(arr[i].lastIndexOf('.')))) {
                    movieBytes = movieBytes + Long.parseLong(arr[i+1].substring(0, str.length() - 1));
                }

                if (otherExtns.contains(arr[i].substring(arr[i].lastIndexOf('.')))) {
                    otherBytes = otherBytes + Long.parseLong(arr[i+1].substring(0, str.length() - 1));
                }
            }
        }

        output.append("music ");
        output.append(musicBytes);
        output.append("b ");
        output.append("images ");
        output.append(imageBytes);
        output.append("b ");
        output.append("movies ");
        output.append(movieBytes);
        output.append("b ");
        output.append("other");
        output.append(otherBytes);
        output.append("b ");
        return output.toString();

    }
    public static void main(String[] args){

        String str = "my.song.mp3 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 10000b";

        System.out.println(solution(str));


    }
}
