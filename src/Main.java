/*
 * Author: Anos Voldigoad
 * Last modified: March 29, 2021
 * Description: Link gen for AnimeEarth episode uploader
 */

import java.text.DecimalFormat;
import java.util.Scanner;

@SuppressWarnings({"SpellCheckingInspection", "InfiniteLoopStatement"})
// Suppress warning for typo and While infinite loop

public class Main {

    public static void GenLinkEpisode(String domain, String anime, int episode, String extension) {
        DecimalFormat df = new DecimalFormat("00");
        for (int i = 1; i <= episode; i++) {
            String finalOutput = "https://" + domain.toLowerCase() + "/" + "Menia" + "/"
                    + anime.replaceAll("\\s", "") + "/" + anime.replaceAll("\\s", "") + "-"
                    + df.format(i) + "." + extension;
            System.out.println(finalOutput.replaceAll("\\s", ""));
        }
    }

    public static void main (String[] args) {

        while (true) {

            // Define variable
            String domain, anime, extension;
            int episode;

            // Header
            System.out.println("AnimeEarth Episode Link Generator");
            System.out.println("By Anos Voldigoad");
            System.out.println("Version 1.1");
            System.out.println();

            // Handle input
            Scanner input = new Scanner(System.in);
            System.out.println("Please input your domain (EXAMPLE: gg.skid.cyou):");
            domain = input.nextLine();
            System.out.println("Please input anime name in the correct case (EXAMPLE: Maou Gakuin no Futekigousha):");
            anime = input.nextLine();
            System.out.println("Input total episode of the anime (EXAMPLE: 12):");
            episode = Integer.parseInt(input.nextLine());
            System.out.println("Please input video name extension (EXAMPLE: mp4)");
            extension = input.nextLine();
            System.out.println();
            System.out.println("Output:");
            System.out.println("Folder name: " + anime.replaceAll("\\s", ""));
            GenLinkEpisode(domain, anime, episode, extension);
            System.out.println();

        } // End while loop

    } // End main method

} // End Main class
